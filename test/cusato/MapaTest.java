package cusato;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import copControl.Mapa;
import copControl.Posicion;

public class MapaTest {
	
	Mapa mapa;
	
	@Before
	public void setUp() throws Exception {
		
		mapa = new Mapa();
		
	}

	@Test
	public void testPosicionAleatoria() {
		Posicion pos1=mapa.getPosicionAleatoria();
		Posicion pos2=mapa.getPosicionAleatoria();
		assertTrue("Fallo-->" +
				"El metodo que crea posiciones aleatorias",pos1!=pos2);
	}
	
	@Test
	public void testesPosicionExtremo(){
		Posicion pos1=new Posicion(10,5);
		assertTrue("Fallo-->" +
				"El metodo de verificacion de posicion extremo",mapa.esPosicionExtremo(pos1));
		
	}

	
	
	
	
}
