package orologio;



public class Orologio {
	//dichiaro variabili
    private int ore;
    private int minuti;
  //metodo
    public int getOre() {
        return this.ore;
    }
  //metodo
    public int getMinuti() {
        return this.minuti;
    }
  //ti permette di allineare
    public String toString() {
        return this.ore + ":" + this.minuti;
    }

    public boolean setOre(int ora) {
        if (ora >= 0 && ora < 24) {
            this.ore = ora;
            return true;
        }else if (ora >= 24) {
            int oreAggiuntive = ora % 24;
            this.ore =  oreAggiuntive;
            
            return true;
        }
        
        return false;
    }

    public boolean setMinuti(int minuti) {
    	/*if (minuti >= 0 && minuti <= 59):Questa condizione verifica se i minuti sono compresi tra 0 e 59, inclusi. 
    	 * Se questa condizione è vera, i minuti vengono semplicemente impostati e il metodo restituisce true. */
        if (minuti >= 0 && minuti <= 59) {
            this.minuti = minuti;
            return true;
            /*else if (minuti >= 60): Se la prima condizione non è soddisfatta, significa che i minuti superano 59.
             *  In tal caso, si passa a questa condizione. 
             * Se i minuti sono maggiori o uguali a 60, si calcolano le ore aggiuntive divise per 60 e si incrementa il valore delle ore di conseguenza. */
        } else if (minuti >= 60) {
            int oreAggiuntive = minuti / 60;
            this.setOre(this.ore + oreAggiuntive);
            this.minuti = minuti % 60;
            
            return true;
        }
        return false;
    }

}


	
	 
