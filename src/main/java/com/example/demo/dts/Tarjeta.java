package com.example.demo.dts;


public class Tarjeta {
    private String cardId;
    private String cardNumber;
    private boolean isActive;
    private double balance;



    public Tarjeta(String cardId, String cardNumber, boolean isActive, double balance) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.isActive = isActive;
        this.balance = balance;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
