import java.util.Random;


public class Gene{

	private byte valor;

	public Gene() {  
		Random r = new Random();  
		this.valor = (byte) r.nextInt(2);  
	}  

	public Gene(byte valor) {  
		setValor(valor);  
	} 

	public byte inverteValor(){
		if(this.valor == 1){
			this.valor = 0;
		}else{
			this.valor = 1;
		}
		return this.valor;
	}


	public byte getValor() {
		return valor;
	}

	public void setValor(byte valor) {
		if (valor > 1) {  
			this.valor = 1;  
		} else {  
			if (valor < 0) {  
				this.valor = 0;  
			}  
		}  
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "" + valor;
	}
	
	

}
