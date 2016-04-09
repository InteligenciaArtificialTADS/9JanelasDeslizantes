public class Solver9Sudoku {

	public static void main(String[] args) {

		Fila lista_estados = new Fila();
		Fila lista_verificados = new Fila();
		No inicio = iniciarTabuleiro();
		No no_objetivo = iniciarNoObjetivo();
		
		long time = System.currentTimeMillis();
		
		
		lista_estados.push(inicio);
		No no = null;
		do {

			no = lista_estados.pop();
			if (verificarNoObjetivo(no, no_objetivo) == false
					&& contemNaListaEstados(lista_verificados, no) == false) {
				lista_verificados.push(no);
				gerarfilhos(lista_estados, no);
			}

		} while ((verificarNoObjetivo(no, no_objetivo) == false)
				&& (lista_estados.getInicio() != null));

		time = System.currentTimeMillis() -time;

		double timeDouble = time/1000.0;
		System.out.println("TEMPO TOTAL DE BUSCA: "+timeDouble+" segundos.");
		
		
		if (verificarNoObjetivo(no, no_objetivo)) {
			System.out.println("Encontrou o caminho");
			caminharNoObjetivoAteInicio(no);
		} else {
			System.out.println("Nao Encontrou o caminho");
		}
	}

	private static No iniciarNoObjetivo() {
		No test = new No();
		// test.no.pai = null;
		test.getTabuleiro().posicoes_janela_tabuleiro.add(0, -1);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(1, 1);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(2, 2);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(3, 3);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(4, 4);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(5, 5);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(6, 6);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(7, 7);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(8, 8);

		return test;
	}

	static boolean contemNaListaEstados(Fila lista_estados, No no) {

		if (lista_estados.getInicio() == null) {

			return false;

		} else {

			Fila aux = new Fila(lista_estados); 
	
	
 			while (aux.getInicio() != null) {

				if (verificarNoObjetivo(aux.getInicio().no, no)) {
					return true;
				}
				aux.setInicio(aux.getInicio().prox);

			}
			return false;
		}

	}

	private static boolean verificarNoObjetivo(No inicial, No objetivo) {
		// TODO Auto-generated method stub
		if (inicial.getTabuleiro().posicoes_janela_tabuleiro.get(0) == objetivo
				.getTabuleiro().posicoes_janela_tabuleiro.get(0)
				&& inicial.getTabuleiro().posicoes_janela_tabuleiro.get(1) == objetivo
						.getTabuleiro().posicoes_janela_tabuleiro.get(1)
				&& inicial.getTabuleiro().posicoes_janela_tabuleiro.get(2) == objetivo
						.getTabuleiro().posicoes_janela_tabuleiro.get(2)
				&& inicial.getTabuleiro().posicoes_janela_tabuleiro.get(3) == objetivo
						.getTabuleiro().posicoes_janela_tabuleiro.get(3)
				&& inicial.getTabuleiro().posicoes_janela_tabuleiro.get(4) == objetivo
						.getTabuleiro().posicoes_janela_tabuleiro.get(4)
				&& inicial.getTabuleiro().posicoes_janela_tabuleiro.get(5) == objetivo
						.getTabuleiro().posicoes_janela_tabuleiro.get(5)
				&& inicial.getTabuleiro().posicoes_janela_tabuleiro.get(6) == objetivo
						.getTabuleiro().posicoes_janela_tabuleiro.get(6)
				&& inicial.getTabuleiro().posicoes_janela_tabuleiro.get(7) == objetivo
						.getTabuleiro().posicoes_janela_tabuleiro.get(7)
				&& inicial.getTabuleiro().posicoes_janela_tabuleiro.get(8) == objetivo
						.getTabuleiro().posicoes_janela_tabuleiro.get(8))
			return true;
		else
			return false;
	}

	static int verificarEstadoAtualTabuleiroNo(Tabuleiro tabuleiro) {
		return tabuleiro.posicoes_janela_tabuleiro.indexOf(-1);
	}

	static No iniciarTabuleiro() {
		No test = new No();
		// test..pai = null;
//		test.getTabuleiro().posicoes_janela_tabuleiro.add(0, 4);
//		test.getTabuleiro().posicoes_janela_tabuleiro.add(1, 6);
//		test.getTabuleiro().posicoes_janela_tabuleiro.add(2, 2);
//		test.getTabuleiro().posicoes_janela_tabuleiro.add(3, 8);
//		test.getTabuleiro().posicoes_janela_tabuleiro.add(4, 1);
//		test.getTabuleiro().posicoes_janela_tabuleiro.add(5, 3);
//		test.getTabuleiro().posicoes_janela_tabuleiro.add(6, 7);
//		test.getTabuleiro().posicoes_janela_tabuleiro.add(7, 5);
//		test.getTabuleiro().posicoes_janela_tabuleiro.add(8, -1);
		
		test.getTabuleiro().posicoes_janela_tabuleiro.add(0, 1);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(1, 2);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(2, 3);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(3, 4);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(4, 5);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(5, 6);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(6, 7);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(7, 8);
		test.getTabuleiro().posicoes_janela_tabuleiro.add(8, -1);

		return test;
	}

	static void gerarfilhos(Fila espacoEstados, No no) {

		No novo;
		switch (verificarEstadoAtualTabuleiroNo(no.getTabuleiro())) {
		case 0:

			novo = new No(no, 0, 1);

			espacoEstados.push(novo);

			novo = new No(no, 0, 3);

			espacoEstados.push(novo);

			break;

		case 1:

			novo = new No(no, 1, 0);

			espacoEstados.push(novo);

			novo = new No(no, 1, 2);

			espacoEstados.push(novo);
			
			novo = new No(no, 1, 4);

			espacoEstados.push(novo);

			break;

		case 2:

			novo = new No(no, 2, 1);

			espacoEstados.push(novo);

			novo = new No(no, 2, 5);

			espacoEstados.push(novo);
	

			break;
		case 3:

			novo = new No(no, 3, 0);

			espacoEstados.push(novo);

			novo = new No(no, 3, 4);

			espacoEstados.push(novo);
			
			novo = new No(no, 3, 6);

			espacoEstados.push(novo);

			break;

		case 4:

			novo = new No(no, 4, 1);

			espacoEstados.push(novo);

			novo = new No(no, 4, 3);

			espacoEstados.push(novo);
			
			novo = new No(no, 4, 5);

			espacoEstados.push(novo);
			
			novo = new No(no, 4, 7);

			espacoEstados.push(novo);

			break;

		case 5:

			novo = new No(no, 5, 2);

			espacoEstados.push(novo);
			
			novo = new No(no, 5,4);

			espacoEstados.push(novo);
			
			novo = new No(no, 5, 8);

			espacoEstados.push(novo);

			break;
		case 6:

			novo = new No(no, 6, 3);

			espacoEstados.push(novo);
			novo = new No(no, 6, 7);

			espacoEstados.push(novo);

			break;

		case 7:

			novo = new No(no, 7, 4);

			espacoEstados.push(novo);
			
			novo = new No(no, 7, 6);

			espacoEstados.push(novo);
			
			novo = new No(no, 7, 8);

			espacoEstados.push(novo);

			break;

		case 8:

			novo = new No(no, 8, 5);

			espacoEstados.push(novo);
			
			novo = new No(no, 8, 7);

			espacoEstados.push(novo);
			

			break;
		default:
			break;
		}
	
	}


	public static void caminharNoObjetivoAteInicio(No objetivo) {
		int movimentos = 0;
		if (objetivo.getPai() == null) {
			System.out.println("No raiz e objetivo");
		} else {
			while (objetivo.getPai() != null) {

				objetivo.getTabuleiro().info();

				objetivo = objetivo.getPai();
				movimentos++;
			}

			System.out.println("===== CUSTO DO CAMINHO =====");
			System.out.println("Numero de passos do caminho: "  + movimentos);
			System.out.println("=============///============" );
		}

	}
}
