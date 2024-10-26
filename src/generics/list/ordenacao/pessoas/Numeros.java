package generics.list.ordenacao.pessoas;

public class Numeros implements Comparable<Numeros>{

	private int numeros;
	
	public Numeros(int numeros) {
		this.numeros = numeros;
	}

	@Override
	public int compareTo(Numeros n) {
		return Integer.compare(numeros, n.getNumeros());
	}


	public int getNumeros() {
		return numeros;
	}


	@Override
	public String toString() {
		return numeros + "";
	}

}
