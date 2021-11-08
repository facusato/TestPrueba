package cusato;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import avion.AvionPesado;

import Inicializadores.InicializadorJuego;

import copControl.Dificultad;
import copControl.Jugador;
import copControl.Mapa;
import copControl.Nivel;
import copControl.Posicion;

public class JugadorTest {
	
	Jugador jugador;

	@Before
	public void setUp() throws Exception {
		
		jugador = new Jugador("Facundo");
		
	}

	@Test
	public void testMoverHaciaUnaPos() {
		Nivel nivel=new Nivel(InicializadorJuego.juegoInicializado().getNiveles().get(0).getMapa(), new Dificultad(5, 50, 50));
		AvionPesado avion =new AvionPesado(new Posicion (15, 12), new Posicion (0, 0), new Mapa());
		nivel.colocarAvionEnAire(avion);
		Posicion pos=avion.getPosicionActual();
		jugador.setNivelActual(nivel);
		jugador.moverHacia(20, 13);
		
		Posicion posF=avion.getPosicionActual();
		
		
		assertTrue("Fallo-->" +
				"El metodo no realiza los movimientos indicados",pos!=posF);
		
		
	}

}
