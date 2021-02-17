package filtro.desafio;

import java.util.function.Function;
import java.util.function.Predicate;

public class Utility {
	
	/*O primeiro filtro irá apenas pegar monstros que spawnam em florestas e o segundo pegará os que
	 * não atacam o player (hostile = false).
	 * Já o .map() mostrará uma mensagem dizendo quais monstros spawnaram perto do jogador.*/
	
	public static final Predicate<Monstro> getBiome =
			(m) -> (m.biome).contentEquals("Floresta");
	
	public static final Predicate<Monstro> isHostile = 
			(m) -> !m.hostile;
			
	public static final Function<Monstro, String> spawns =
			(m) -> "O monstro " + m.name + " spawnou!!";
	
	
}
