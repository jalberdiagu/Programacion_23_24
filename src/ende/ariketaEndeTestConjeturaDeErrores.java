package ende;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ariketaEndeTestConjeturaDeErrores {

	@ParameterizedTest
	@ValueSource(ints = { 0, -100})
	void testMain2(int numero) {
		 assertFalse(ariketaEnde.esNumeroValido(numero));
		
	}

}
