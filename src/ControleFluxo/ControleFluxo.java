package ControleFluxo;

import java.util.Scanner;

/**
 * 
 * @author Ramiro
 * Tarefa Modulo 10 :
 * Ler 4 notas, de 0 a 10.
 * Calcular a média aritmetica.
 * Caso a média for <= imprimir "Reprovado".
 * Caso a média for > 5 e <= 7 imprimir "Recuperação".
 * Caso a média for >= 7 imprimir "Aprovado". 
 */
public class ControleFluxo {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			
			int nota1;
			do {
				System.out.println("Digite a nota 01 : ");
				nota1 = s.nextInt();
				if(nota1<0 || nota1>10)
					System.out.println("Atenção! a nota deve estar na faixa entre 0 e 10...");
			} while (nota1<0 || nota1>10);
			
			int nota2;
			do {
				System.out.println("Digite a nota 02 : ");
				nota2 = s.nextInt();
				if(nota2<0 || nota2>10)
					System.out.println("Atenção! a nota deve estar na faixa entre 0 e 10...");
			} while (nota2<0 || nota2>10);

			int nota3;
			do {
				System.out.println("Digite a nota 03 : ");
				nota3 = s.nextInt();
				if(nota3<0 || nota3>10)
					System.out.println("Atenção! a nota deve estar na faixa entre 0 e 10...");
			} while (nota3<0 || nota3>10);
			
			int nota4;
			do {
				System.out.println("Digite a nota 04 : ");
				nota4 = s.nextInt();
				if(nota4<0 || nota4>10)
					System.out.println("Atenção! a nota deve estar na faixa entre 0 e 10...");
			} while (nota4<0 || nota4>10);
			
			//calculando a nota final
			double media = (nota1+nota2+nota3+nota4)/4.0;
			
			//calculando o resultado
			String resultado;
			if(media >= 7) resultado = "Aprovado";
			else if(media >= 5) resultado = "Recuperação";
			else resultado = "Reprovado";
			
			System.out.printf("Nota final : %s, Resultado : %s",media,resultado);
			
			//novo calculo ?

			
		}

	}

}
