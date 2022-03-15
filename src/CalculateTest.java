import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*ICE 7 Project 
Group Members
Muharrem Kaya
Gurwinder Kaur
Jimmy Owusu Kessie
Deya Kaya
Ningfan Chan */




class CalculateTest {

	/*This test added by Muharrem Kaya*/
	/*March 15 2022*/
	@Test
	void goodSumTest() {
		Double var1 = 10.0;
		Double var2 = 20.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.sumVariables() == 30);
	}
	

	/*This test added by Muharrem Kaya*/
	@Test
	void badSumTest() {
		Double var1 = 10.0;
		Double var2 = 20.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertFalse(calc.sumVariables() == 40);
	}
	
	/*This test added by Muharrem Kaya*/
	@Test
	void boundaryMaxSumTest() {
		Double var1 = 100.0;
		Double var2 = 100.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.sumVariables() == 200);
	}	
	
	/*This test added by Muharrem Kaya*/
	@Test
	void boundaryMinSumTest() {
		Double var1 = 0.0;
		Double var2 = 0.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.sumVariables() == 0);
	}		
		

	
	/*This test added by Gurwinder Kaur*/
	@Test
	void goodMinusTest() {
		Double var1 = 10.0;
		Double var2 = 5.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.minusVariables() == 5);
	}
	

	/*This test added by Gurwinder Kaur*/
	@Test
	void badMinusTest() {
		Double var1 = 20.0;
		Double var2 = 10.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertFalse(calc.minusVariables() == 15);
	}
	
	/*This test added by Gurwinder Kaur*/
	@Test
	void boundaryMinusMaxTest() {
		Double var1 = 100.0;
		Double var2 = 100.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.minusVariables() == 0);
	}	
	
	/*This test added by Gurwinder Kaur*/
	@Test
	void boundaryMinusMinTest() {
		Double var1 = 0.0;
		Double var2 = 0.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.minusVariables() == 0);
	}		
	

	/*This test added by Jimmy Owusu Kessie*/
	@Test
	void goodMulTest() {
		Double var1 = 10.0;
		Double var2 = 5.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.mulVariables() == 50);
	}
	

	/*This test added by Jimmy Owusu Kessie*/
	@Test
	void badMulTest() {
		Double var1 = 10.0;
		Double var2 = 20.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertFalse(calc.mulVariables() == 40);
	}
	
	/*This test added by Jimmy Owusu Kessie*/
	@Test
	void boundaryMulMaxTest() {
		Double var1 = 100.0;
		Double var2 = 100.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.mulVariables() == 10000);
	}	
	
	/*This test added by Jimmy Owusu Kessie*/
	@Test
	void boundaryMulMinTest() {
		Double var1 = 0.0;
		Double var2 = 0.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.mulVariables() == 0);
	}		
	

	/*This test added by Derya Kaya*/
	@Test
	void goodDivTest() {
		Double var1 = 10.0;
		Double var2 = 5.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.divVariables() == 2);
	}
	

	/*This test added by Derya Kaya*/
	@Test
	void badDivTest() {
		Double var1 = 10.0;
		Double var2 = 20.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertFalse(calc.divVariables() == 40);
	}
	
	/*This test added by Derya Kaya*/
	@Test
	void boundaryDivMaxTest() {
		Double var1 = 100.0;
		Double var2 = 100.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.divVariables() == 1);
	}	

	
	/*This test added by Ningfan Chen*/
	@Test
	void goodModTest() {
		Double var1 = 10.0;
		Double var2 = 5.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.modVariables() == 0);
	}
	

	/*This test added by Ningfan Chen*/
	@Test
	void badModTest() {
		Double var1 = 10.0;
		Double var2 = 5.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertFalse(calc.modVariables() == 2);
	}
	
	/*This test added by Ningfan Chen*/
	@Test
	void boundaryModMaxTest() {
		Double var1 = 100.0;
		Double var2 = 10.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.modVariables() == 0);
	}	
	
	/*This test added by Ningfan Chen*/
	@Test
	void boundaryModMinTest() {
		Double var1 = 0.0;
		Double var2 = 0.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.modVariables() == 0);
	}
	
	
	/*This test added by Gurwinder Kaur*/
	@Test
	void goodMinTest() {
		
		Double var1 = 20.0;
		Double var2 = 10.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertTrue(calc.minusVariables() == 10);
	}
		
	/*This test added by Gurwinder Kaur*/
	@Test
	void badMinTest() {
		
		Double var1 = 20.0;
		Double var2 = 10.0;
		
		Calculate calc = new Calculate(var1, var2);
		assertFalse(calc.minusVariables() == 5);
	}	
	
	
	/*This test added by Gurwinder Kaur*/
	@Test
	void exceptionBadTest() {
		Double var1 = -10.0;
		Double var2 = 20.0;
		
		Assertions.assertThrows(ArithmeticException.class, () -> {
 	       Calculate calc = new Calculate(var1, var2);
		});
	}
	
	/*This test added by Gurwinder Kaur*/
	@Test
	void exceptionBadTest2() {
		Double var1 = 102.0;
		Double var2 = 20.0;
		
		Assertions.assertThrows(ArithmeticException.class, () -> {
			Calculate calc = new Calculate(var1, var2);
		});
	}	
	
	/*This test added by Jimmy Owusu Kessie*/
	@Test
	void exceptionGoodTest() {
		Double var1 = 10.0;
		Double var2 = 20.0;
		
		assertDoesNotThrow(() -> {
			Calculate calc = new Calculate(var1, var2);
	    });
	}	
	

}
