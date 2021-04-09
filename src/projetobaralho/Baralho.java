
package projetobaralho;

import java.security.SecureRandom;
import javax.swing.ImageIcon;

public class Baralho {
    private NumeroCartas cartas;
    private NaipesCartas naipes;
    static private ImageIcon imagem;
    private static final SecureRandom aleatorio = new SecureRandom();

    public Baralho(NumeroCartas cartas, NaipesCartas naipes, ImageIcon imagem) {
        this.cartas = cartas;
        this.naipes = naipes;
        this.imagem = imagem;
    }

    public NumeroCartas getCartas() {
        return cartas;
    }

    public NaipesCartas getNaipes() {
        return naipes;
    }

    public static ImageIcon getImagem() {
        return imagem;
    }
    
    public static Baralho[] geraBaralho(){
        int tamanho = NaipesCartas.values().length * NumeroCartas.values().length;
        Baralho baralho[] = new Baralho[tamanho];
        int i=0;
        for(NaipesCartas naipes: NaipesCartas.values()){
            for(NumeroCartas cartas: NumeroCartas.values()){
                baralho[i++] = new Baralho (cartas,naipes,imagem);
            }
        }
        
        for (int primeiro = 0; primeiro < baralho.length; primeiro++){
            int segundo = aleatorio.nextInt(tamanho);
            Baralho temp = baralho[primeiro];
            baralho[primeiro] = baralho[segundo];
            baralho[segundo] = temp;
        }
        return baralho;
    }
            
    public static void main (String[] args){
        Baralho baralho1[] = Baralho.geraBaralho();
        for(Baralho baralho: baralho1){
            System.out.println(baralho.getCartas().getNomeCartas() + " de " + 
                    baralho.getNaipes().getNaipes());
        }
    }
}
