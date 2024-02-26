package ende;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ariketaEndeTestValoresLimite {

	@ParameterizedTest
	@ValueSource(ints = { 1000, 2000 })
	void testMain(int numero) {
		 assertTrue(ariketaEnde.esNumeroValido(numero));
		
	}
	@ParameterizedTest
	@ValueSource(ints = { 999, 2001})
	void testMain2(int numero) {
		 assertFalse(ariketaEnde.esNumeroValido(numero));
		
	}

}
