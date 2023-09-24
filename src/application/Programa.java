package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.TaxPayer;

public class Programa {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
	
		List<TaxPayer>list = new ArrayList<TaxPayer>();
		System.out.println("Enter com o número de contribuinte: ");
		int nContribuinte = sc.nextInt();
		
		for(int i = 1; i<= nContribuinte; i++) {
			System.out.println("Dados * "+ i +" Cotribuinte: ");
			System.out.println("Pessoa Fisica ou Juridica (i/c)? ");
			char tipo = sc.next().charAt(0);
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(tipo == 'i') {
				System.out.println("Despesas com SAÚDE: ");
				double despesasSaude = sc.nextDouble();
				PessoaFisica fisica = new PessoaFisica(nome, rendaAnual, despesasSaude);
				list.add(fisica);
			}
			
			else {
				System.out.println("Numero de Funcionários : ");
				int nFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, nFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		for(TaxPayer x : list) {
			System.out.println(x.getNome()+": $ "+ String.format("%.2f", x.tax()));
		}
		System.out.println();
		double soma = 0;
		for(TaxPayer x : list) {
			soma += x.tax();
			
		}
		System.out.println("TOTAL DE IMPOSTOS: $ "+ String.format("%.2f", soma));
		
		
		sc.close();


	}

}
