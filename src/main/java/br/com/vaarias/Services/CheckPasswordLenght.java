package br.com.vaarias.Services;

public class CheckPasswordLenght {
    public boolean checkLenPassword(String password) {
        if(password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
