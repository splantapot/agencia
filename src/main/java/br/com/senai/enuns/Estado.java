package br.com.senai.enuns;

public enum Estado {
    AC("Acre"),
    RR("Roraima"),
    AM("Amazonas"),
    AP("Amapá"),
    PA("Pará"),
    TO("Tocantins"),
    RO("Rondônia"),
    MA("Maranhão"),
    PI("Piauí"),
    CE("Ceará"),
    RN("Rio Grande Do Norte"),
    PB("Paraíba"),
    PE("Pernambuco"),
    AL("Alagoas"),
    SE("Sergipe"),
    BA("Bahia"),
    ES("Espirítio Santo"),
    RJ("Rio de Janeiro"),
    SP("São Paulo"),
    MG("Minas Gerais"),
    MT("Mato Grosso"),
    MS("Mato Grosso do Sul"),
    GO("Goiás"),
    PR("Paraná"),
    RS("Rio Grande do Sul"),
    SC("Santa Catarina");

    private String nome;

    Estado(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}
