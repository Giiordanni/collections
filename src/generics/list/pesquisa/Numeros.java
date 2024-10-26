package generics.list.pesquisa;

public class Numeros {

	private int numeros;
	
	Numeros(int num){
		this.numeros = num;
	}
	
	public int getNumeros(){
		return numeros;
	}

	@Override
	public String toString() {
		return numeros + "";
	}
	
	
}
