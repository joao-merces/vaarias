package br.com.vaarias.Model.DAO.Interfaces;

import br.com.vaarias.Model.VO.User;

public interface UserDAO {
    void saveUser(User user);
    User getUserByEmail(String email);
}
