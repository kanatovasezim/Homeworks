package com;

import com.entities.Championship;
import com.entities.Country;
import com.entities.SportType;
import com.entities.Team;
import com.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Country c1 = new Country("KG");
        SportType sportType1 = new SportType("Football");
        Team t1 = new Team("Ak-Shumkar", "Chuy", "ffkr.kg", sportType1);
        Team t2 = new Team("Milan", "add", "milan.com", sportType1);
        Team t3 = new Team("Napoli", "add2", "napoli.com", sportType1);
        Team t4 = new Team("Barcelona", "add3", "barca.com", sportType1);
        Team t5 = new Team("Real", "add4", "real.com", sportType1);
        Team t6 = new Team("Liverpool", "add5", "live.com", sportType1);
        Team t7 = new Team("Bayern Munchen", "add6", "bm.com", sportType1);
        create(sportType1);
        create(c1);
        List<Team> teamList = Arrays.asList(t1,t2,t3,t4,t5,t6,t7);
        List<Championship> champItaly = new ArrayList<>();
        List<Championship> champSpain = new ArrayList<>();
        List<Championship> champEngland = new ArrayList<>();
        List<Championship> champGermany = new ArrayList<>();
        List<Championship> champKG = new ArrayList<>();
        Championship championship1 = new Championship(c1, "Italy Champ");
        Championship championship2 = new Championship(c1, "Spain Champ");
        Championship championship3 = new Championship(c1, "KG Champ");
        Championship championship4 = new Championship(c1, "England Champ");
        Championship championship5 = new Championship(c1, "Germany Champ");
        champItaly.add(championship1);
        champSpain.add(championship2);
        champKG.add(championship3);
        champEngland.add(championship4);
        champGermany.add(championship5);
        t1.setChampionships(champKG);
        t2.setChampionships(champItaly);
        t3.setChampionships(champItaly);
        t4.setChampionships(champSpain);
        t5.setChampionships(champSpain);
        t6.setChampionships(champEngland);
        t7.setChampionships(champGermany);
        create(championship1);
        create(championship2);
        create(championship3);
        create(championship4);
        create(championship5);
        create(t1);
        create(t2);
        create(t3);
        create(t4);
        create(t5);
        create(t6);
        create(t7);
        System.out.println(getAllTeams(c1));
    }

    public static <T> void create(T e) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(e);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created");
    }

    public static List<Team> getAllTeams(Country country) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Team> teams = session.createQuery("Select t.name, t.sport_type FROM Team t  " +
                "  where t.championships.country.name = :p_country_name")
                .setParameter(":p_country_name", country.getName())
                .list();
        session.close();
        return teams;
    }


}