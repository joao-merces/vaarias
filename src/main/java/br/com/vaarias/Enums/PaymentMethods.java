package br.com.vaarias.Enums;

public enum PaymentMethods {
    CREDIT_CARD(1),
    PIX(2);

    private final int id;

    PaymentMethods(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
