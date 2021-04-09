
package projetobaralho;

public enum NumeroCartas {
    DOIS ("C02",2), TRES ("C03",3), QUATRO ("C04",4), CINCO ("C05",5), SEIS ("C06",6), 
    SETE ("C07",7), OITO ("C08",8), NOVA ("C09",9), DEZ ("C10",10), J ("C11",11), 
    Q ("C12",12), K ("C13",13), A ("C14",14);
    
    private final String nomeCartas;
    private final int pontosCartas;

    private NumeroCartas(String nomeCartas, int pontosCartas) {
        this.nomeCartas = nomeCartas;
        this.pontosCartas = pontosCartas;
    }

    public String getNomeCartas() {
        return nomeCartas;
    }

    public int getPontosCartas() {
        return pontosCartas;
    }
        
}
