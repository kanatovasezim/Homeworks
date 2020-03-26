package com;

import com.entities.Automobile;
import com.entities.Automobile;
import com.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int max = 2020;
        int min = 1950;
        String[] brands = {"BMW", "HONDA", "TOYOTA", "MERCEDES", "AUDI", "BENTLEY", "CHEVROLET", "CADILLAC", "LADA", "LEXUS"};
        for (int i = 0; i < 10; i++) {
            createAutomobile(new Automobile(i+1, brands[i], (int) ((Math.random() * ((max - min) + 1)) + min)));
        }
    }
    public static void createAutomobile(Automobile e){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
        session.close();
        System.out.println("Automobile created");
    }
    public static void deleteAutomobile(Automobile e){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(e);
        session.getTransaction().commit();
        session.close();
        System.out.println("Automobile deleted");
    }
    public static void updateAutomobile(Automobile e){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(e);
        session.getTransaction().commit();
        session.close();
        System.out.println("Automobile updated");
    }
    public static Automobile getAutomobilebyId(Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Automobile em = (Automobile) session.get(Automobile.class, id);
        session.close();
        return em;
    }
    public static List<Automobile> getAllAutomobile(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Automobile> Automobiles = session.createQuery("FROM Automobile").list();
        session.close();
        return Automobiles;
    }
}
