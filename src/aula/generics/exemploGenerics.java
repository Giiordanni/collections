package aula.generics;

public class exemploGenerics<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}

}
