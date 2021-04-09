
package projetobaralho;

public class Jogador {
    private final int jogosCartas = 5;
    private final String nomeJogador;
    private int[] cartasMao = new int[jogosCartas];
    private int pontosJogador = 0;

    public Jogador(String nomeJogador, int[] cartasMao, int pontosJogador) {
        this.nomeJogador = nomeJogador;
        this.cartasMao = cartasMao;
        this.pontosJogador = pontosJogador;
    }

    public int getJogosCartas() {
        return jogosCartas;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public int[] getCartasMao() {
        return cartasMao;
    }

    public int getPontosJogador() {
        return pontosJogador;
    }
    
    public static int somatorio(int casa, int jogador){
        return(casa+jogador);
    }
}
