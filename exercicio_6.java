// Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário a seguinte frase: “Adivinhe qual número de 1 a 5 eu estou pensando”. Na sequência, o usuário deve inserir um número entre 1 e 5, e o seu programa deve gerar aleatoriamente outro número, também de 1 a 5. Se o número gerado for o mesmo que o usuário inseriu, o programa deve escrever na tela “Você acertou!”, mas se for diferente, o programa deve escrever “Você errou, o número correto era X”, onde X é o número gerado aleatoriamente pelo programa.

package modulo_1_semana_2;

import java.util.Scanner;

public class exercicio_6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Random = (int)(Math.random()*5);
    
    System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando");
    int chute = Integer.parseInt(scanner.nextLine());
    
    if (Random == chute) {
      System.out.println("Você acertou!");
    } else {
      System.out.println("Você errou, o número correto era " + Random);
    }

    scanner.close();
  }
}
