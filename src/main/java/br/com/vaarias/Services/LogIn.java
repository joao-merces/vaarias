package br.com.vaarias.Services;

import br.com.vaarias.Model.DAO.Implementations.UserDAOImpl;
import br.com.vaarias.Model.VO.User;

public class LogIn {

    UserDAOImpl userDAO = new UserDAOImpl();
    EncryptDecrypt encryptDecrypt = new EncryptDecrypt();

    public boolean isUserValid(String email, String password) throws Exception {
        User user = userDAO.getUserByEmail(email);
        String pass = encryptDecrypt.decrypt(user.getPassword());

        if(user.getEmail().equals(email) && pass.equals(password)) {
            return true;
        }
        return false;
    }
}
