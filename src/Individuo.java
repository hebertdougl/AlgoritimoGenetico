
public class Individuo {

	private static final int TAMANHO_DO_DNA = 1;
	
	private Cromossomo[] dna;
	
	public Individuo() {
		this.dna = new Cromossomo[TAMANHO_DO_DNA];  

		for (int i = 0; i < dna.length; i++) {  
			this.dna[i] = new Cromossomo();  
		}
	}

	public Cromossomo[] getDna() {
		return dna;
	}


	public void setDna(Cromossomo[] dna) {
		this.dna = dna;
	}

}
