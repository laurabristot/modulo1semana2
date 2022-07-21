// Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir as notas do semestre, e deve retornar a média final. O programa deve pedir 3 notas, que devem ser números reais, e retornar um número real com 2 casas depois da vírgula, com o texto “Sua média final é:” seguido do valor.

package modulo_1_semana_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio_4 {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#,##0.00");
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite sua primeira nota:");
    double nota1 = Double.parseDouble(leitor.nextLine());
    System.out.println("Digite sua segunda nota:");
    double nota2 = Double.parseDouble(leitor.nextLine());
    System.out.println("Digite sua terceira nota:");
    double nota3 = Double.parseDouble(leitor.nextLine());
   
    double media = (nota1 + nota2 + nota3)/3;
    System.out.println("Sua média final é: "+ df.format(media));
    leitor.close();
}}
