
public class AG {
	
	private double[] cromossomo;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		startNewPopulation();
		
		int i = 0;
		while (i < 2) {
			calculateFitness();
			stopCondition("Após Fitness");
			selection();
			crossover();
			mutation();
			i++;
		}
		
		Cromossomo cromossomo = new Cromossomo();
		System.out.println("O crossomo");
		System.out.println(cromossomo.toString());
		cromossomo.crossover(cromossomo, cromossomo);
		System.out.println(cromossomo.toString());
		
	}
	
	public static void startNewPopulation(){
		System.out.println("Start a New Population");
	}
	
	public static void calculateFitness(){
		System.out.println("Calculate Fitness");	
	}
	public static void selection(){
		System.out.println("Crossover");
	}
	public static void crossover(){
		System.out.println("Crossover");
	}
	
	public static void mutation(){
		System.out.println("Mutação");
	}
	
	public static boolean stopCondition(String codition){
		boolean retorno = true;
		
		if(codition.equals("Após Fitness")){
			retorno = false;
		}
		
		return retorno;
	}
	

	
}

