package filtro.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FiltroDesafio {

	public static void main(String[] args) {
		
		//Criar dois .filter() e utilizar um .map()
		
		/* Escolhi criar baseado em Minecraft, j� que um dos objetivos que fa�o o curso � poder,
		 * um dia, criar um mod para o jogo.*/
		
		
		Monstro m1 = new Monstro("Formiga Gigante", "Floresta", true);
		Monstro m2 = new Monstro("Fada", "Floresta", false);
		Monstro m3 = new Monstro("Tubar�o zumbi", "Oceano", true);
		Monstro m4 = new Monstro("Golem", "Montanha", true);
		Monstro m5 = new Monstro("Cobra Pe�onheta", "Floresta", true);
		Monstro m6 = new Monstro("Drag�o de gelo", "Glacial", true);
		Monstro m7 = new Monstro("Alce An�o", "Floresta", false);
		Monstro m8 = new Monstro("Escorpi�o Gigante de 8 Caudas", "Deserto", true);
		
		List<Monstro> monstros = Arrays.asList(m1, m2, m3, m4, m5, m6, m7, m8);
		
		monstros.stream()
		.filter(Utility.getBiome)
		.filter(Utility.isHostile)
		.map(Utility.spawns)
		.forEach(System.out::println);

	}

}
