package br.com.vaarias.Services;

import br.com.vaarias.Model.RN.SignUpRN;

public class Checker {
    public static boolean checkAllEmpty(String cpf, String name, String email, String password) {
        SignUpRN signUpRN = new SignUpRN();
        CheckCPF checkCPF = new CheckCPF();
        CheckEmail checkEmail = new CheckEmail();
        CheckPasswordLenght checkPasswordLenght = new CheckPasswordLenght();

        if(signUpRN.checkEmailEmpty(email) && signUpRN.checkPasswordEmpty(password) &&
           signUpRN.checkNameEmpty(name) && signUpRN.checkCPFEmpty(cpf)) {
                return true;
        } else { return false; }
    }

    public static boolean checkPatternAll(String cpf, String email, String password) {
        SignUpRN signUpRN = new SignUpRN();
        CheckCPF checkCPF = new CheckCPF();
        CheckEmail checkEmail = new CheckEmail();
        CheckPasswordLenght checkLenPassword = new CheckPasswordLenght();
        if(checkCPF.CheckCPFPattern(cpf) && checkEmail.CheckEmailPattern(email) && checkLenPassword.checkLenPassword(password)) {
            return true;
        } else { return false; }
    }
}
