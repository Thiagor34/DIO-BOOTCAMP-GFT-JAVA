package dio.gft.bootcamp.springboottest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dio.gft.bootcamp.springboottest.controller.TestController;

public class TesteUnitController {
	
	@Test
	public void testUnit() {
		TestController controller = new TestController();
		String resultado = controller.saudacao("DIO");
		assertEquals("Bem-vindo, DIO", resultado);
	}

}
