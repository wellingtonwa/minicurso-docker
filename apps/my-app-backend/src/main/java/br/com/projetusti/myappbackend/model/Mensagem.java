package br.com.projetusti.myappbackend.model;

public class Mensagem {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public Mensagem value(final String value) {
        this.value = value;
        return this;
    }

}
