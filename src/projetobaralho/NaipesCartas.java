
package projetobaralho;

public enum NaipesCartas {
    COPAS ("NC"), ESPADAS ("NE"), PAUS ("NP"), OURO ("NO");
    
    private final String naipes;

    private NaipesCartas(String naipes) {
        this.naipes = naipes;
    }

    public String getNaipes() {
        return naipes; 
    }
        
}
