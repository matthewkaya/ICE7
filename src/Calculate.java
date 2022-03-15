
public class Calculate {
	
	private Double var1;
	private Double var2;
	
	public Calculate(Double var1, Double var2) {
		super();
		
		setVar1(var1);
		setVar2(var2);
	}
	
	public Double getVar1() {
		return var1;
	}
	
	public void setVar1(Double var1) throws ArithmeticException {
		
 		if (var1 < 0 ) {
 			throw new ArithmeticException("error: Negative values"); 
 		}
 		
 		else if (var1 > 100 ) {
 			throw new ArithmeticException("error: Higher value"); 
 		}
 		
 		 
		
		this.var1 = var1;
	}
	
	public Double getVar2() {
		return var2;
	}
	
	public void setVar2(Double var2) throws ArithmeticException {
 		if (var2 < 0 ) {
 			throw new ArithmeticException("error: Negative values"); 
 		}
 		
 		else if (var2 > 100 ) {
 			throw new ArithmeticException("error: Higher value"); 
 		}
		
		this.var2 = var2;
	}

	
	/* This Method added by Muharrem Kaya */
	public Double sumVariables() {
		return (double) Math.round(getVar1() + getVar2());
	}

	/*This method added by Gurwinder Kaur */
	public Double minusVariables() {
		return (double) Math.round(getVar1() - getVar2());
	}
	
	
	/*This method added by Derya Kaya */
	public Double mulVariables() {
		return (double) Math.round(getVar1() * getVar2());
	}
	
	
	/*This method added by Jimmy Owusu Kessie  */
	public Double divVariables() {
		return (double) Math.round(getVar1() / getVar2());
	}
	
	/*This method added by Ningfan Chen  */
	public Double modVariables() {
		return (double) Math.round(getVar1() % getVar2());
	}
	
	
	
	
	
	

}
