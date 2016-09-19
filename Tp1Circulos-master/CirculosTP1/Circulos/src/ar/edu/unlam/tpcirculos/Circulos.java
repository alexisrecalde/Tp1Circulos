package ar.edu.unlam.tpcirculos;

public class Circulos {
	
	private Double radio;
	private Double perimetro;
	
	
	public Circulos(Double radio)
	{
		
		this.radio=radio;
		this.perimetro=0.0;
		
		
	}

	public Double getRadio() {
		return radio;
	}

	public Double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(Double radio) {
		this.perimetro =2*3.14*radio;
	}



}
