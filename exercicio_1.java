// Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir um número inteiro. O programa deve verificar se o número é par ou ímpar, e exibir essa informação de volta ao usuário.

package modulo_1_semana_2;

import java.util.Scanner;

public class exercicio_1 {
  public static void main(String[] args) {
   Scanner leitor = new Scanner(System.in);
   int numero;
   System.out.println("Digite um número inteiro:");
   numero = Integer.parseInt(leitor.nextLine());

   if (numero % 2 == 0) {
    System.out.println("O número que você escolheu, é par!");
   }
   else {
    System.out.println("O número que você escolheu é impar!");
  }
  leitor.close();
  }
}
