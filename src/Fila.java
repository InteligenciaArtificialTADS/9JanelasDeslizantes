

import java.util.Scanner;



public class Fila {

	 class FILA {
		public int num;
		public No no;
		public FILA prox;
	}
	 
	 //public int num;
		private No no;
		private FILA prox;
	
		
		
	private FILA inicio = null;
	private FILA fim = null;
	
	
	
	public No getNo() {
		return no;
	}

	public void setNo(No no) {
		this.no = no;
	}

	public FILA getProx() {
		return prox;
	}

	public void setProx(FILA prox) {
		this.prox = prox;
	}

	public FILA getInicio() {
		return inicio;
	}

	public void setInicio(FILA inicio) {
		this.inicio = inicio;
	}

	public FILA getFim() {
		return fim;
	}

	public void setFim(FILA fim) {
		this.fim = fim;
	}

	void push(No no){
		FILA novo = new FILA();
		novo.prox = null;
		novo.no = no;
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			fim.prox = novo;
			fim = novo;
		}

		//System.out.println("Numero inserido na FILA ");

	}
	
	No pop(){
		if (inicio == null) {

			return null;
		} else {

			No no = inicio.no;
			inicio = inicio.prox;
			return no;

		}
		
	}
	
	public Fila(Fila fila){
		this.setInicio(fila.getInicio());
		this.setFim(fila.getFim());
	}
	
	public Fila(){

	}
}
