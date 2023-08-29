package br.com.senai;

import br.com.senai.enuns.Genero;

import java.util.Arrays;
import java.util.List;
import java.sql.Array;
import java.time.LocalDate;
import br.com.senai.enuns.Estado;
import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Endereco;
import br.com.senai.models.Escolaridade;

public class App {
    public static void main( String[] args ) {
        Endereco endereco = new Endereco();
        endereco.cep = "64000000";
        endereco.logradouro = "Rua Porto, 3555";
        endereco.cidade = "Teresina";
        endereco.estado = Estado.PI;

        Candidato jv = new Candidato();
        jv.nomeCompleto = "João Victor Carvalho Rocha";
        jv.dataNascimento = LocalDate.of(2007,03,21);
        jv.email = "jvcr1007@gmail.com";
        jv.genero = Genero.M;
        jv.naturalidade = Estado.PI.toString();
        jv.nacionalidade = "Brasil";
        jv.endereco = endereco;

        Escolaridade e1 = new Escolaridade();
        e1.nomeCurso = "Ensino Médio";
        e1.nomeInstituicao = "SESI";
        e1.dataInicio = LocalDate.of(2011, 02, 30);
        e1.dataFim = LocalDate.of(2024,12,31);
        e1.concluido = false;

        Escolaridade e2 = new Escolaridade();
        e2.nomeCurso = "Desenvolvimento de Sistemas";
        e2.nomeInstituicao = "SENAI";
        e2.dataInicio = LocalDate.of(2022, 01, 27);
        e2.dataFim = LocalDate.of(2024,12,31);
        e2.concluido = false;

        jv.escolaridades = Arrays.asList(e1,e2);

    }
}
