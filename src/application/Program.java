package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> listaContribuinte = new ArrayList<>();
		
		System.out.print("Entre com o n�mero de contribuintes: ");
		int numContribuintes = sc.nextInt();
		
		for (int i = 0; i < numContribuintes; i++) {
			System.out.println();
			System.out.println("Contribuinte n�mero #" + (i+1) + ": ");
			
			System.out.print("Pessoa f�sica ou jur�dica (f/j)? ");
			sc.nextLine();
			char opcao = sc.nextLine().charAt(0);
		
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if (opcao == 'f') {
				System.out.print("Gasto com sa�de: ");
				Double gastoSaude = sc.nextDouble();
			
				listaContribuinte.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("N�mero de funcion�rios: ");
				int numFuncionarios = sc.nextInt();
				
				listaContribuinte.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("CONTRIBUINTES: ");
		
		for (Contribuinte obj : listaContribuinte) {
			System.out.println(obj);
		}
		
		double somaImposto = 0.0;
		for (Contribuinte soma : listaContribuinte) {
			somaImposto +=  soma.impostoPago();
		}
		
		System.out.println();
		System.out.println("IMPOSTO TOTAL: $ " + String.format("%.2f", somaImposto));
		
		sc.close();
	}
}
