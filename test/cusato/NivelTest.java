package cusato;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Inicializadores.InicializadorJuego;
import avion.AvionPesado;
import avion.AvionSimple;
import copControl.Dificultad;
import copControl.Mapa;
import copControl.Nivel;
import copControl.Posicion;

public class NivelTest {
	
	Nivel nivel;

	@Before
	public void setUp() throws Exception {
		nivel = new Nivel(InicializadorJuego.juegoInicializado().getNiveles().get(0).getMapa(), new Dificultad(5, 50, 50));
		nivel.colocarAvionEnAire(new AvionPesado(new Posicion (15, 12), new Posicion (0, 0), new Mapa()));
		nivel.colocarAvionEnAire(new AvionSimple(new Posicion (15, 12), new Posicion (0, 0), new Mapa()));
	}

	@Test
	public void testAvionesVolando() {
		assertTrue("Fallo-->" +
				"El metodo booleano hay aviones volando aun",nivel.tieneAvionesVolando());
		
	}
	
	
	@Test
	public void testChocoConOtroAvion() {
		assertTrue("Fallo--> No hubo choque y ambos estan en la misma posicion",nivel.huboChoque());
	}
	

	
	
	
	

}
