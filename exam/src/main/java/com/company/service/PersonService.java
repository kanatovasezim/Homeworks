package com.company.service;

import com.company.dao.PersonDao;
import com.company.model.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("people")
public class PersonService {
    PersonDao personDao = new PersonDao();
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Person> getHistory() {
        return personDao.getAllPeople();
    }

    @GET
    @Path("/{PersonId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Person search(@PathParam("PersonId") Integer PersonId, @PathParam("PersonName") String PersonName, @PathParam("Year_Birth") Integer PersonYear) {
        if (PersonId != null && PersonName != null && PersonYear != null){
            return personDao.getPersonAllParam(PersonId, PersonName, PersonYear);
        } else if (PersonId == null && PersonName != null && PersonYear != null){
            return personDao.getPersonByIDByName(PersonYear, PersonName);
        } else if (PersonId != null && PersonName == null && PersonYear != null){
            return personDao.getPersonByIdByYear(PersonId, PersonYear);
        } else if (PersonId != null && PersonName != null && PersonYear== null){
            return personDao.getPersonByIDByName(PersonId, PersonName);
        }....
    }

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public String Register(Person Person) throws Exception {
        String s1 = "", s2;
        if (Person.getYear_birth() < 2000){
            throw new Exception("Вы должны быть старше 20 лет");
        } else {
            if (Person.getGender() == 0){
                s1 = "Уважаемый ";
            } else if (Person.getGender() == 1){
                s1 = "Уважаемая ";
            }
            s2 = Person.getName() + ", Ваш год рождения " + Person.getYear_birth() +
                    ", вам " + (2020 - Person.getYear_birth());

        }
        personDao.addPerson(Person);
        return s1 + s2;
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteHistoryByID(@PathParam("PersonId") Integer PersonId) {
        personDao.deletePerson(PersonId);
    }
}
