package com.mycompany;


import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class App 
{
    public static void main( String[] args )
    {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);
        userDetails.setUserName("Zishan");

        Configuration configuration = new Configuration().configure().addAnnotatedClass(UserDetails.class);
        SessionFactory sf = configuration.buildSessionFactory();
        Session session= sf.openSession();

        Transaction tx = session.beginTransaction();
        session.save(userDetails);
        tx.commit();
    }
}
