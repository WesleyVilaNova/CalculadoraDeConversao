package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conversion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conversion conversion = new Conversion();

		System.out.println("Qual o pre�o do D�lar? ");
		conversion.valorDoDolar = sc.nextDouble();
		System.out.println("D�lar: " + conversion.valor());
		
		System.out.print("Quantos D�lares quer converte? ");
		conversion.quantidadeDeDolares = sc.nextDouble();
		System.out.println();
		System.out.print("D�lares convertidos: " + conversion.dolar());
		System.out.println();
		System.out.println("Quantidade em Reais = " + conversion.total());
		System.out.printf("Valor de IOF cobrado : %.1f%n", conversion.iof());
		
		System.out.println("Obrigado por usar nossos servi�os.");

		sc.close();

	}

}
