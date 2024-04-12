package br.com.vaarias.Services;

public class CheckCPF {
    public static boolean CheckCPFPattern(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11)
            return false;

        if (cpf.matches("(\\d)\\1{10}"))
            return false;

        int sum = 0;
        for (int i = 0; i < 9; i++)
            sum += (10 - i) * Character.getNumericValue(cpf.charAt(i));
        int digit = 11 - (sum % 11);
        if (digit >= 10)
            digit = 0;

        sum = 0;
        for (int i = 0; i < 10; i++)
            sum += (11 - i) * Character.getNumericValue(cpf.charAt(i));
        int digito2 = 11 - (sum % 11);
        if (digito2 >= 10)
            digito2 = 0;

        return Character.getNumericValue(cpf.charAt(9)) == digit && Character.getNumericValue(cpf.charAt(10)) == digito2;
    }
}