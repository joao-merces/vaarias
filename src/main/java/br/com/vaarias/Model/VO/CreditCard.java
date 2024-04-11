package br.com.vaarias.Model.VO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table (name = "tb_credit_card")
public class CreditCard {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String verificationCode;
    private String clientName;
    private String cpf;
}
