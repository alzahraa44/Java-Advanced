package advancedJava.generic.coplexNuber;

import java.math.BigDecimal;

public class RunCom {
	
	
	public static void main(String args[]) {
		ComplexNumber<BigDecimal> Complex1 = new ComplexNumber<>(new BigDecimal(2), new BigDecimal(6));
		ComplexNumber<BigDecimal> Complex2 = new ComplexNumber<>(new BigDecimal(2), new BigDecimal(6));
		System.out.println("Complex1 + Complex2 =  " + Complex1.adding(Complex2).toString());
		System.out.println("Complex1 - Complex2 =  " + Complex1.sub(Complex2).toString());
	}
}
