import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testTopla() {
	int Gerceksonuc = 	Hesaplama.topla(25, 14);
	
	assertEquals(39, Gerceksonuc);
	}
	@Test
	public void testToplaNegatif() {
		int gercekSonuc = 	Hesaplama.topla(25, 14);
		
		assertEquals(39, gercekSonuc);
	}

}
