package br.com.vaarias.Model.DAO.Implementations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.HibernateError;

public class ConnectDBImpl {
    private static EntityManagerFactory factory;
    private static EntityManager manager;

    public static EntityManager getInstance() {
        if (manager == null) {
            try {
                factory = Persistence.createEntityManagerFactory("Biblioteca");
                manager = factory.createEntityManager();
            } catch (HibernateError e) {
                System.out.println(e.getMessage());
            }
        }
        return manager;
    }

    public static void closeConnection() {
        manager.close();
        factory.close();
    }
}
