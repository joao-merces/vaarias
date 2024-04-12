package br.com.vaarias.Model.DAO.Implementations;

import br.com.vaarias.Model.VO.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class UserDAOImpl {
    EntityManager manager;

    public UserDAOImpl() {
        manager = ConnectDBImpl.getInstance();
    }

    public void save(User user) {
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();
    }
}
