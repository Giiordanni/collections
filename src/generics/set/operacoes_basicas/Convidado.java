package generics.set.operacoes_basicas;

import java.util.Objects;

public class Convidado {
	private String nome;
	private int codConvite;
	
	public Convidado(String nome, int codConvite) {
		this.nome = nome;
		this.codConvite = codConvite;
	}

	public String getNome() {
		return nome;
	}

	public int getCodConvite() {
		return codConvite;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(codConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codConvite == other.codConvite;
	}

	@Override
	public String toString() {
		return "Convidado {Nome: " + nome + "\\ Código Convite: " + codConvite + "}";
	}
	
	
	
	

}
