package br.com.vaarias.Model.RN;

import br.com.vaarias.Model.DAO.Implementations.UserDAOImpl;
import br.com.vaarias.Model.DAO.Interfaces.UserDAO;
import br.com.vaarias.Model.VO.User;

public class SignUpRN {
    /*
    private final UserDAO userDAO;

    public SignUpRN() {
        userDAO = (UserDAO) new UserDAOImpl();
    }
    */
    public static boolean checkEmailEmpty(String email) {
        if (email.isEmpty()) {
            return false;
        } else return true;
    }

    public static boolean checkPasswordEmpty(String password) {
        if (password.isEmpty()) {
            return false;
        } else return true;
    }

    public static boolean checkNameEmpty(String name) {
        if (name.isEmpty()) {
            return false;
        } else return true;
    }

    public static boolean checkCPFEmpty(String cpf) {
        if (cpf.isEmpty()) {
            return false;
        } else return true;
    }
}
