/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhojava;

/**
 *
 * @author ulisses
 */
import java.util.Scanner;
public class TrabalhoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculaMedia Aluno = new CalculaMedia();
        Scanner ler = new Scanner(System.in);
        String op;

        System.out.println("Escolha a opção de média");
        System.out.println("1 - Média de disciplina Prática");
        System.out.println("2 - Média de Disciplina Teórica");
        System.out.println("3 - Média de Disciplina Regular");
        System.out.println("4 - Média de Disciplina Regular 3° Ano");
        op = ler.nextLine();

            switch(op){
                case "1":
                    Aluno.recebeDados(op);
                    Aluno.media(op);
                    Aluno.exibirDadosPratica();;
                break;
                case "2":
                    Aluno.recebeDados(op);
                    Aluno.media(op);
                    Aluno.exibirDadosTeorica();;
                break;
                case "3":
                    Aluno.recebeDados(op);
                    Aluno.media(op);
                    Aluno.exibirDadosRegular();;
                break;
                case "4":
                    Aluno.recebeDados(op);
                    Aluno.media(op);
                    Aluno.exibirDadosTerceiro();;
                break;
        }
    }
}
        
