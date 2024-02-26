package ende;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ariketaEndeTestDeEquivalencia {

	@ParameterizedTest
	@ValueSource(ints = { 1500 })
	void testMain(int numero) {
		 assertTrue(ariketaEnde.esNumeroValido(numero));
		
	}
	@ParameterizedTest
	@ValueSource(ints = { 200, 3000, 1501 })
	void testMain2(int numero) {
		 assertFalse(ariketaEnde.esNumeroValido(numero));
		
	}
}
