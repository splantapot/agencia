package br.com.senai;

import br.com.senai.tipos.Funcionario;
import java.time.LocalDate;

public class App {
    public static void main( String[] args ) {
        Funcionario jv = new Funcionario("João Victor", LocalDate.of(2007,3,21));
        System.out.println(jv.nome);

    
    }
}
