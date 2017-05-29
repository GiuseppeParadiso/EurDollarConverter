package it.paradisogiuseppe.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="eurDollarConverter")
public class EurDollarConverter {
	private static final double CAMBIO= 1.118105;
	private double euro=10;
	private double result=euro*CAMBIO;
	
	private double dollaro=20;
	private double resultD=dollaro/CAMBIO;
	
	public EurDollarConverter(){
	}
	
	public String convertToDollar(){
		result=euro*CAMBIO;
		return String.valueOf(result);
	}
	
	public String convertToEur(){
		resultD=dollaro/CAMBIO;
		return String.valueOf(resultD);
	}

	
	
	
	public double getDollaro() {
		return dollaro;
	}

	public void setDollaro(double dollaro) {
		this.dollaro = dollaro;
	}

	public double getResultD() {
		return resultD;
	}

	public void setResultD(double resultD) {
		this.resultD = resultD;
	}
	
	public static double getCambio() {
		return CAMBIO;
	}

	public double getEuro() {
		return euro;
	}

	public void setEuro(double euro) {
		this.euro = euro;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
