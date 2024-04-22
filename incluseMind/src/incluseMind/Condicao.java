package incluseMind;

import java.util.Scanner;

public class Condicao {	
	
	Usuario usuario = new Usuario();
	static Scanner teclado = new Scanner(System.in);
	TipoCondicao condicao = new TipoCondicao();
	
	void telaLogin() {
		char genero;
		
		System.out.println("|--------------------|      USUARIO      |--------------------|");
		System.out.print("Idade: ");
		usuario.setIdade(teclado.nextInt());teclado.nextLine();
		do {
			System.out.print("Genero -- [M]masculino [F]feminino [O]outros:  ");
			genero = teclado.next().charAt(0);
			if (genero == 'M' || genero == 'm' || genero == 'F' || genero == 'f' || genero == 'O' || genero == 'o') {
				usuario.setGenero(genero);
				break;
			}else {
				System.out.println(" Insira um opção válida ");
			}
		} while (genero != 'M' || genero != 'm' || genero != 'F' || genero != 'f' || genero != 'O' || genero != 'o');	
	}
	
	
	public void telaTipoCondicao() {
		System.out.println("|--------------------|  TIPO DE CONDIÇÃO |--------------------|");
		int opcaoCondicao;
		do {
			System.out.print("Condição -- [1]TEA [2]TDAH [3]TEA e TDAH:  ");
			opcaoCondicao = teclado.nextInt();
			if (opcaoCondicao == 1) {
				condicao.setTEA(true);
				condicao.setTDAH(false);
			}else if (opcaoCondicao == 2) {
				condicao.setTEA(false);
				condicao.setTDAH(true);
			}else if (opcaoCondicao == 3) {
				condicao.setTEA(true);
				condicao.setTDAH(true);
			}else {
				System.out.println(" Insira um opção válida ");
			}
			
		} while (opcaoCondicao != 1 | opcaoCondicao != 2 | opcaoCondicao != 3);
	}
	
	
	public void telaNivelCondicao() {
		System.out.println("|--------------------| NÍVEL DA CONDIÇÃO |--------------------|");
	}
	
	public static void main(String [] args) {
		Condicao p = new Condicao();
		
		System.out.println("_____| BEM VINDO |_____");
		
		System.out.print(" Deseja fazer um Login? [S]Sim [n]não: ");
		char _desicion_ = teclado.next().charAt(0);
		if (_desicion_ == 'S' | _desicion_ == 's' | _desicion_ == 'N' | _desicion_ == 'n') {
			p.telaLogin();
		}else {
			System.out.println("Valor inadequado");
		}
		
		
		teclado.close();
	}
}
