

import java.util.Scanner;

public class Pilha {
	
	private static class PILHA{
		public int num;
		public PILHA prox;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		PILHA topo = null;
		PILHA aux;
		
		int op;
		
		do{
			System.out.println("\nMenu de opcoes\n");
			System.out.println("1 - inserir na pilha");
			System.out.println("2 - consulta toda  lista");
			System.out.println("3 - remover da pilha");
			System.out.println("4 - esvaziar a pilha");
			System.out.println("5 - remover da lista");
	
			System.out.println("digite sua opcao: ");
			op = entrada.nextInt();
			
			if(op < 1  || op> 5){
				System.out.println("opcao invalida!");
			}
			
			if(op == 1){
				System.out.println("Novo numero a ser inserido na pilha:");
				PILHA novo =  new PILHA();
					novo.num = entrada.nextInt();
					novo.prox = topo;
					topo = novo;
				System.out.println("Numero inserido na pilha ");
			}
			
			if(op == 2){
			if (topo == null) {

				System.out.println("Pilha vazia");

			} else {
				System.out.println("\nConsultando a pilha\n");
				aux = topo;
				while (aux != null) {
					System.out.print(aux.num );
					aux = aux.prox;
				}

			}
			}
			
			if(op == 3){
				if (topo == null) {

					System.out.println("Pilha vazia");

				} else {
					System.out.println("\nConsultando a pilha\n");
					
						System.out.println("Numero " + topo.num + "removido");
						topo = topo.prox;
					

				}
			}
			
			if(op == 4){
				if (topo == null) {

					System.out.println("Pilha vazia!!!");

				} else {
					
						topo = null;
						System.out.println("Pilha Esvaziada");
					

				}
			}
		
		}while(op != 5);
	}
}
