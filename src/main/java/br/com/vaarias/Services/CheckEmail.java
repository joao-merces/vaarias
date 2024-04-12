package br.com.vaarias.Services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static Boolean CheckEmailPattern(String email) {
        String padrao = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        return email.matches(padrao);
    }
}
