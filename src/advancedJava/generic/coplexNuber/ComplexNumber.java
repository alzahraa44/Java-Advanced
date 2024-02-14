package advancedJava.generic.coplexNuber;

import java.math.BigDecimal;




public class ComplexNumber<T extends BigDecimal> {
private T real;
private T imagine;

public T getReal() {
	return real;
}

public void setReal(T real) {
	this.real = real;
}

public T getImagine() {
	return imagine;
}

public void setImagine(T imagine) {
	this.imagine = imagine;
}

public ComplexNumber(T real , T imagine) {
	this.real = real;
	this.imagine = imagine;
}

public ComplexNumber() {
	super();
	
}
public ComplexNumber(int i, int j) {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "ComplexNumber [real=" + real + ", imagine=" + imagine +" ]";
}
public ComplexNumber<T>  adding(ComplexNumber<T> tt){
	
	T res1 = (T)  getReal().add(tt.getReal());
	T  res2 = (T) getImagine().add(tt.getImagine());
return new ComplexNumber(res1,res2);
}

public ComplexNumber<T>  sub(ComplexNumber<T> tt){
	
	T res1 = (T)  getReal().subtract(tt.getReal());
	T  res2 = (T) getImagine().subtract(tt.getImagine());
return new ComplexNumber(res1,res2);
}
}

	

