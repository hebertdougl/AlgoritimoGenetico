import java.util.Arrays;
import java.util.Random;


public class Cromossomo {
	private static final int TAMANHO_DO_CROMOSSOMO = 23;
	
	private Gene[] genes;
	
	
	public Cromossomo() {
		genes = new Gene[TAMANHO_DO_CROMOSSOMO];
		inicializarCromossomo();
	}
		
	
	private void inicializarCromossomo(){
		for (int i = 0; i < genes.length; i++) {
			genes[i] = new Gene();
		}
	}
	
	
	public Cromossomo crossover(Cromossomo cromossomo1, Cromossomo cromossomo2){
		Cromossomo novoCromossomo = null;
//		TODO
		
		return novoCromossomo;
	}
	
	public Cromossomo mutation(Cromossomo cromossomo){
		int segundo_ponto = 0 ;
		
		Random gerador = new Random();
		
		int primeiro_ponto = gerador.nextInt(TAMANHO_DO_CROMOSSOMO -2);
		
		while(segundo_ponto < primeiro_ponto){
			segundo_ponto = gerador.nextInt(TAMANHO_DO_CROMOSSOMO);
		}
		System.out.println("Primeiro ponto: "+ primeiro_ponto);
		System.out.println("Segundo ponto: "+ segundo_ponto);
		
		for (int i = 1; i < genes.length; i++) {
			if(i >= primeiro_ponto && i <= segundo_ponto){
				cromossomo.getGenes()[i].inverteValor();
			}
		}
		
		return cromossomo;
		
	}


	public Gene[] getGenes() {
		return genes;
	}


	public void setGenes(Gene[] genes) {
		this.genes = genes;
	}


	@Override
	public String toString() {
		return "Cromossomo " + Arrays.toString(genes);
	}
	
	

}
