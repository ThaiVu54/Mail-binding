package com.codegym.model;

public class Mail {
    private int id;
    private String language;
    private int size;
    private boolean spam;
    private String signature;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSpam() {
        return spam;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Mail() {
    }

    public Mail(int id, String language, int size, boolean spam, String signature) {
        this.id = id;
        this.language = language;
        this.size = size;
        this.spam = spam;
        this.signature = signature;
    }
}
