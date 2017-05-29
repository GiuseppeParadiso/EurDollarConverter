package it.paradisogiuseppe.model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="converter", eager = true)
public class ConverterModel {
	private static final double CAMBIO=	1.1185;
	private double euro;
	private double dollaro;
	
	
	public static double getCambio() {
		return CAMBIO;
	}

	
	public double getEuro() {
		return euro;
	}


	public void setEuro(double euro) {
		this.euro = euro;
	}


	public double getDollaro() {
		return dollaro;
	}


	public void setDollaro(double dollaro) {
		this.dollaro = dollaro;
	}
	

}
