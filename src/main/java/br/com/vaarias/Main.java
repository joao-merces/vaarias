<<<<<<< HEAD
package br.com.vaarias;

import br.com.vaarias.Model.DAO.Implementations.ConnectDBImpl;
import br.com.vaarias.View.Login;
import jakarta.persistence.EntityManager;
import javafx.application.Application;

public class Main {

    public static void startConnectionDb() {
        EntityManager manager;
        manager =  ConnectDBImpl.getInstance();
    }

    public static void main(String[] args) {
        //startConnectionDb();
        Application.launch(Login.class);
    }
=======
package br.com.vaarias;

import br.com.vaarias.Model.DAO.Implementations.ConnectDBImpl;
import br.com.vaarias.View.Login;
import jakarta.persistence.EntityManager;
import javafx.application.Application;

public class Main {

    public static void startConnectionDb() {
        EntityManager manager;
        manager =  ConnectDBImpl.getInstance();
    }

    public static void main(String[] args) {
        startConnectionDb();
        Application.launch(Login.class);
    }
>>>>>>> 44d8c04f4c493ac296c9aaa21285b63e1f048fc2
}