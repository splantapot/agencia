package br.com.senai.models;

import br.com.senai.enuns.Genero;
import br.com.senai.models.Endereco;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Candidato {
    public String nomeCompleto;
    public LocalDate dataNascimento;
    public String cpf;
    public String email;
    public Genero genero;
    public String naturalidade;
    public String nacionalidade;
    public Endereco endereco;
    public List<Escolaridade> escolaridades = new ArrayList<>();
}

