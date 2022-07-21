// Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário sua data de nascimento e calcule a sua idade. Se o usuário tiver 18 anos ou mais, escreva na tela “você é maior de idade”, mas caso tenha menos de 18 anos, escreva “você é menor de idade”.

package modulo_1_semana_2;

import java.util.Scanner;

public class exercicio_3 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
       
      System.out.println("Qual ano você nasceu?");
      int anoNascimento = leitor.nextInt();
    
      System.out.println("Qual ano atual?");
      int anoAtual = leitor.nextInt();
      
      int idade = anoAtual - anoNascimento;

      if (idade>=18) {
        System.out.println("voce é maior de idade");
      } else {
        System.out.println("voce é menor de idade");
      }
   
    leitor.close();
  }
}
