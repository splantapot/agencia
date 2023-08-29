package br.com.senai.enuns;

public enum Genero {
    M("Masculino"), F("Feminino"), O("Outros");

    String tipo;
    Genero(String tipo) {
        this.tipo = tipo;
    }
}
