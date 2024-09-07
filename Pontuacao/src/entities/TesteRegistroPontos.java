package entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	public void pontosCriarTopicos() {
		Usuario u = new Usuario();
		u.nome = "Wallace";
		
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		
		rp.criarUmTopico(u);
		assertEquals(u.pontos,5);
	}

}
