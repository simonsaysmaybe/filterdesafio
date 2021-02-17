package filtro.desafio;

public class Monstro {
	
	public final String name; //O nome do mob
	public final String biome; //O bioma que ele spawna
	public final boolean hostile; //Se ele ataca o player ou não
	
	
	public Monstro(String name, String biome, boolean hostile) {
		super();
		this.name = name;
		this.biome = biome;
		this.hostile = hostile;
	}


	@Override
	public String toString() {
		return "Monstro [name=" + name + ", biome=" + biome + ", hostile=" + hostile + "]";
	}
	
	
}
