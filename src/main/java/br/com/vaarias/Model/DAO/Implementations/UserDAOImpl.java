package br.com.vaarias.Model.DAO.Implementations;

import br.com.vaarias.Model.VO.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class UserDAOImpl {
    EntityManager manager;

    public UserDAOImpl() {
        manager = ConnectDBImpl.getInstance();
    }

    public void saveUser(User user) {
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();
    }

    public User getUserByEmail(String email) {
        Query query = manager.createQuery("SELECT u FROM User u WHERE u.email = :email");
        query.setParameter("email", email);
        List<User> users = query.getResultList();
        if (!users.isEmpty()) {
            return users.get(0);
        } else {
            return null;
        }
    }
}
