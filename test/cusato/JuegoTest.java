package cusato;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Inicializadores.InicializadorJuego;
import avion.AvionPesado;

import copControl.Dificultad;
import copControl.Juego;
import copControl.Jugador;
import copControl.Mapa;
import copControl.Nivel;
import copControl.Posicion;

public class JuegoTest {

	
	Juego juego;
	Jugador jugador;
	
	@Before
	public void setUp() throws Exception {
		
		jugador=new Jugador("Facundo");
		Nivel nivel=new Nivel(InicializadorJuego.juegoInicializado().getNiveles().get(0).getMapa(), new Dificultad(5, 50, 50));
		AvionPesado avion =new AvionPesado(new Posicion (15, 12), new Posicion (0, 0), new Mapa());
		nivel.colocarAvionEnAire(avion);
		jugador.setNivelActual(nivel);
		List<Nivel> niveles= new ArrayList<Nivel>();
		niveles.add(nivel);
		juego= new Juego(jugador,niveles);
		
	}

	@Test
	public void testEsJuegoGanado() {
		assertTrue("Fallo-->" +
				"El metodo de verificacion de juego terminado",juego.esJuegoGanado()==false);
		
	}
	
	
	@Test
	public void testEstaJugandose(){
		assertTrue("Fallo-->" +
				"El metodo de verificacion de juego activo",juego.estaJugandose());
		
	}
}
