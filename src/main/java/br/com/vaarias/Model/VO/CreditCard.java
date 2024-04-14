package br.com.vaarias.Model.VO;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table (name = "tb_credit_card")
public class CreditCard {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "credit_card_number", nullable = false)
    private String number;
    @Column(name = "credit_card_verification_code", nullable = false)
    private String verificationCode;
    @Column(name = "credit_card_client_name", nullable = false)
    private String clientName;
    @Column(name = "credit_card_expiration", nullable = false)
    private LocalDate cardExpiration;
    public CreditCard() {

    }

    public CreditCard(Long id, String number, String verificationCode, String clientName, LocalDate cardExpiration) {
        this.id = id;
        this.number = number;
        this.verificationCode = verificationCode;
        this.clientName = clientName;
        this.cardExpiration = cardExpiration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDate getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(LocalDate cardExpiration) {
        this.cardExpiration = cardExpiration;
    }
}