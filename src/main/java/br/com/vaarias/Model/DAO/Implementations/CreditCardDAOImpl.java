package br.com.vaarias.Model.DAO.Implementations;

import br.com.vaarias.Model.VO.CreditCard;
import jakarta.persistence.EntityManager;

public class CreditCardDAOImpl {
    EntityManager manager;

    public CreditCardDAOImpl() {
        manager = ConnectDBImpl.getInstance();
    }
    public void saveCard(CreditCard creditCard) {
        manager.getTransaction().begin();
        manager.persist(creditCard);
        manager.getTransaction().commit();
    }
}
