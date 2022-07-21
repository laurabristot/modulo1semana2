// Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário que digite sua altura (2 ou mais casas depois da vírgula), depois peça que o usuário digite seu peso, e então calcule o IMC e exiba essa informação ao usuário. Fórmula IMC = peso / (altura x altura).

package modulo_1_semana_2;

import java.util.Scanner;

public class exercicio_2 {
 public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in);
  System.out.println("Digite sua altura em metros:");
  double altura = Double.parseDouble(leitor.nextLine());
  
  System.out.println("Digite seu peso em kg");
  double peso = Double.parseDouble(leitor.nextLine());
  
  double imc = peso / (altura * altura);
  
  System.out.println("seu IMC é: " + imc);
  
  leitor.close();
} 
}
