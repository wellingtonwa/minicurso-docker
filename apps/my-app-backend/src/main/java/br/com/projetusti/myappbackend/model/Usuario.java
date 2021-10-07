package br.com.projetusti.myappbackend.model;

public class Usuario {

    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(final Integer idade) {
        this.idade = idade;
    }

    public Usuario nome(final String nome) {
        this.nome = nome;
        return this;
    }

    public Usuario idade(final Integer idade) {
        this.idade = idade;
        return this;
    }

}
