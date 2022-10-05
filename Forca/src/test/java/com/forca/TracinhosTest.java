package com.forca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test.None;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TracinhosTest {

	
	@Mock
	private Tracinhos tracinhos;
	
	@Before
    public void setup() throws Exception{
        MockitoAnnotations.initMocks(this);  
        tracinhos = new Tracinhos(5);
    }
	
	@Test(expected = Exception.class) // Verifica se lançou a exception
	public void tracinhosQntNegativaTest() throws Exception {
		new Tracinhos(-1);
	}
	
	@Test(expected = None.class) // Verifica se não lançou nenhum tipo de exception
	public void tracinhosQntPositivaTest() throws Exception {
		new Tracinhos(1);
		new Tracinhos(0);
	}
	
	@Test(expected = Exception.class) // Verifica se lançou a exception
	public void revelePosicaoNegativaTest() throws Exception {
		tracinhos.revele(-1, 'a');
	}
	
	@Test(expected = Exception.class) // Verifica se lançou a exception
	public void revelePosicaoMaiorTest() throws Exception {
		tracinhos.revele(10, 'a');
	}
	
	@Test(expected = Exception.class) // Verifica se lançou a exception
	public void revelePosicaoIgualTest() throws Exception {
		tracinhos.revele(5, 'a');
	}
	
	@Test(expected = None.class)  // Verifica se não lançou nenhum tipo de exception
	public void reveleTest() throws Exception {
		tracinhos.revele(3, 'a');
	}
	
	@Test
	public void isAindaComTracinhosTestTrue() {
		Assert.assertTrue(tracinhos.isAindaComTracinhos());  // Verifica se o valor returnado é True
	}
	
	@Test
	public void isAindaComTracinhosTestFalse() throws Exception {
		tracinhos.revele(0, 't');
		tracinhos.revele(1, 'e');
		tracinhos.revele(2, 's');
		tracinhos.revele(3, 't');
		tracinhos.revele(4, 'e');
		Assert.assertFalse(tracinhos.isAindaComTracinhos()); // Verifica se o valor retornado é False
	}
	
	@Test
	public void toStringTest() throws Exception {
		tracinhos.revele(0, 't');
		tracinhos.revele(1, 'e');
		tracinhos.revele(2, 's');
		tracinhos.revele(3, 't');
		tracinhos.revele(4, 'e');
		Assert.assertEquals("t e s t e ", tracinhos.toString()); // Verifica se o valor 't e s t e ' é o mesmo retornado
	}                                                            // pelo método toString()
	
	
}
