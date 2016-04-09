public class No {

	private No pai;
	private String acao;
	private int profundidade;
	private int custoNo;
	
	
	private Tabuleiro tabuleiro;

	public No getPai() {
		return pai;
	}

	public void setPai(No pai) {
		this.pai = pai;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		
		this.tabuleiro.getPosicoes_janela_tabuleiro().add(0, tabuleiro.getPosicoes_janela_tabuleiro().get(0));
		this.tabuleiro.getPosicoes_janela_tabuleiro().add(1, tabuleiro.getPosicoes_janela_tabuleiro().get(1));
		this.tabuleiro.getPosicoes_janela_tabuleiro().add(2, tabuleiro.getPosicoes_janela_tabuleiro().get(2));
		this.tabuleiro.getPosicoes_janela_tabuleiro().add(3, tabuleiro.getPosicoes_janela_tabuleiro().get(3));
		this.tabuleiro.getPosicoes_janela_tabuleiro().add(4, tabuleiro.getPosicoes_janela_tabuleiro().get(4));
		this.tabuleiro.getPosicoes_janela_tabuleiro().add(5, tabuleiro.getPosicoes_janela_tabuleiro().get(5));
		this.tabuleiro.getPosicoes_janela_tabuleiro().add(6, tabuleiro.getPosicoes_janela_tabuleiro().get(6));
		this.tabuleiro.getPosicoes_janela_tabuleiro().add(7, tabuleiro.getPosicoes_janela_tabuleiro().get(7));
		this.tabuleiro.getPosicoes_janela_tabuleiro().add(8, tabuleiro.getPosicoes_janela_tabuleiro().get(8));
		
		
	}

	public No() {
		// no = new NO();
		this.pai = null;
		this.tabuleiro = new Tabuleiro();
		this.profundidade = 0;
		this.acao="";
		this.custoNo= 0;
		// TODO Auto-generated constructor stub
	}
	
	public No(No no,int posicaoLivre, int posicaoTabuleiro) {
		// no = new NO();
		this.pai = no;
		this.tabuleiro = new Tabuleiro();
		this.setTabuleiro(no.tabuleiro);
		
		this.acao= no.tabuleiro.movimentarPosicaoTabuleiro(posicaoTabuleiro);
		
		int num = no.tabuleiro.posicoes_janela_tabuleiro.get(posicaoTabuleiro);
		this.tabuleiro.posicoes_janela_tabuleiro.set(posicaoTabuleiro, -1);
		this.tabuleiro.posicoes_janela_tabuleiro.set(posicaoLivre, num);
		
		
		this.custoNo= no.custoNo+1;
		this.profundidade = no.profundidade+1;
		this.getTabuleiro().info();
		// TODO Auto-generated constructor stub
	}


}
