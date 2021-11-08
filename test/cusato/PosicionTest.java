package cusato;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;




import copControl.Posicion;

public class PosicionTest {

	Posicion pos1,pos2,pos3,pos4;
	
	@Before
	public void setUp() throws Exception {
		pos1 = new Posicion(20, 10);
		pos2 = new Posicion(20, 10);
		pos3 = new Posicion(14,6);
	}
	
	@Test
	public void testPosicionIgualAotraPosicion(){
		 
		assertTrue("Fallo-->" +
				"El metodo comparativo de coordenadas de la posicion",pos1.igualA(pos2));
	}
	
	@Test
	public void testCalculoDeDistanciaEntrePosiciones(){
		
		assertTrue("Fallo-->" +
				"El metodo de calculo de distancia entre posiciones",pos1.distanciaHasta(pos2)==0);
	}
		
	

	@Test
	public void testVecinoDeDistanciaMinima(){
		
		pos4=pos3.getVecinoDeDistanciaMinima(pos1);
		assertTrue("Fallo-->" +
				"El metodo retorna vecino erroneo",pos4.igualA(new Posicion(15,7)));
		
		
	}
	
}
