import java.util.ArrayList;
import java.util.List;


public class Tabuleiro {
	
	
	List<Integer> posicoes_janela_tabuleiro = new ArrayList<Integer>();

	public List<Integer> getPosicoes_janela_tabuleiro() {
		return posicoes_janela_tabuleiro;
	}

	public void setPosicoes_janela_tabuleiro(List<Integer> posicoes_janela_tabuleiro) {
		this.posicoes_janela_tabuleiro = posicoes_janela_tabuleiro;
	}
		
	public void info(){
		int cont = 0 ;
		for (int integer : posicoes_janela_tabuleiro) {
			
			System.out.print (integer + " ");
		
			if(cont  == 2 ){
				System.out.println();
				cont =0;
			}else{
			cont++;
			}
			
		}
	}
	
	int verificarEstadoAtualTabuleiroNo(Tabuleiro tabuleiro) {
		return tabuleiro.posicoes_janela_tabuleiro.indexOf(-1);
	}
	int verificarEstadoAtualTabuleiroNo() {
		return this.posicoes_janela_tabuleiro.indexOf(-1);
	}
	
	public String movimentarPosicaoTabuleiro(int posicaoTabuleiro){
		switch (verificarEstadoAtualTabuleiroNo()) {
		case 0:
			switch (posicaoTabuleiro) {
			case 1:				
				return "DIREITA";
			case 3:				
				return "BAIXO";
			default:
				return "";
			}
			
		case 1:
			
			switch (posicaoTabuleiro) {
			case 0:				
				return "ESQUERDA";
			case 2:				
				return "DIREITA";
			case 4:				
				return "BAIXO";
		
			default:
				return "";
			}
			
		case 2:
			
			switch (posicaoTabuleiro) {
			case 1:				
				return "ESQUERDA";
			case 5:				
				return "BAIXO";
		
			default:
				return "";
			}
		case 3:
			
			switch (posicaoTabuleiro) {
			case 0:				
				return "CIMA";
			case 4:				
				return "DIREITA";
			case 6:				
				return "BAIXO";
		
			default:
				return "";
			}
		case 4:
			
			switch (posicaoTabuleiro) {
			case 1:				
				return "CIMA";
			case 3:				
				return "ESQUERDA";
			case 5:				
				return "DIREITA";
			case 7:				
				return "BAIXO";
		
			default:
				return "";
			}
		case 5:
			
			switch (posicaoTabuleiro) {
			case 2:				
				return "CIMA";
			case 4:				
				return "ESQUERDA";
			case 8:							
				return "BAIXO";
		
			default:
				return "";
			}
		case 6:
			
			switch (posicaoTabuleiro) {
			case 3:				
				return "CIMA";
			case 7:				
				return "DIREITA";
	
			default:
				return "";
			}
		case 7:
			
			switch (posicaoTabuleiro) {
			case 4:				
				return "CIMA";
			case 6:		
				return "ESQUERDA";
			case 8:		
				return "DIREITA";
	
			default:
				return "";
			}
	case 8:
			
			switch (posicaoTabuleiro) {
			case 5:				
				return "CIMA";
			case 7:		
				return "ESQUERDA";
			default:
				return "";
			}
			
		default:
			return "";
		
		}
	}

}
