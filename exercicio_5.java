// Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora. O programa deve pedir um número, depois outro, e por último uma operação. O sistema deve aceitar como operação qualquer uma dessas 4 opções: “somar”, “subtrair”, “multiplicar” ou "dividir", e realizar a operação correspondente entre os 2 números inseridos, para então escrever na tela do usuário o resultado.

package modulo_1_semana_2;

import java.util.Scanner;

public class exercicio_5 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o primeiro número:");
    double n1 = Double.parseDouble(leitor.nextLine());

    System.out.println("Insira o segundo número:");
    double n2 = Double.parseDouble(leitor.nextLine());

    System.out.println("Qual operação gostaria de fazer? somar, subtrair, multiplicar ou dividir?");
    String operação = leitor.nextLine();

    double result;
    
    switch (operação) {
      case "somar":
        result = n1 + n2;
        System.out.println(result);
        break;
      case "subtrair":
        result = n1 - n2;
        System.out.println(result);
        break;
      case "multiplicar":
        result = n1 * n2;
        System.out.println(result);
        break;
      case "dividir":
        result = n1 / n2;
        System.out.println(result);
        break;
      default:
        System.out.println("operador inválido");
        break;
    }

    leitor.close();
  }
}
