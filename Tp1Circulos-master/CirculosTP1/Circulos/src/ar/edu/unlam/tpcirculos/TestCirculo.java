package ar.edu.unlam.tpcirculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCirculo {



	@Test
	public void CrearCirculoConRadioDos() 
	{
		Circulos miCirculo = new Circulos(2.0);
		Double esperado=2.0;
		assertEquals(esperado,miCirculo.getRadio(),0);
		
		
	
	}
	
	@Test
	public void CrearCirculoConRadioTresPuntoSiete()
	{
		Circulos miCirculo=new Circulos(3.7);
		Double esperado = 3.7;
		assertEquals(esperado,miCirculo.getRadio(),0);
	}
	
	@Test
	public void CrearCirculoConRadioCinco()
	{
		Circulos miCirculo=new Circulos(5.0);
		Double esperado=5.0;
		assertEquals(esperado,miCirculo.getRadio(),0);
		
	}
	
	@Test
	public void CrearUnCirculoConRadioDiezPuntoNueve()
	{
	Circulos miCirculo=new Circulos (10.9);
	Double esperado=10.9;
	assertEquals(esperado,miCirculo.getRadio(),0);
	}
	
	@Test
	public void ComprobarPerimetroConRadioNuevePuntoOcho()
	{
		Circulos miCirculo= new Circulos(9.8);
		Double esperado=9.8;
		Double perimetroEsperado=61.544;
		assertEquals(esperado,miCirculo.getRadio(),0);
		
		//calcular perimetro
		miCirculo.setPerimetro(miCirculo.getRadio());
		
		//test perimetro
		assertEquals(perimetroEsperado,miCirculo.getPerimetro(),0.01);
		
		
	}
	@Test
	public void ComprobarPerimetroConRadio16Punto6()
	
	{
		Circulos miCirculo= new Circulos(16.6);
		Double esperado=16.6;
		Double perimetroEsperado=104.248;
		assertEquals(esperado,miCirculo.getRadio(),0);
		
		//calcular perimetro
		miCirculo.setPerimetro(miCirculo.getRadio());
		
		//test perimetro
		assertEquals(perimetroEsperado,miCirculo.getPerimetro(),0.01);
		
		
	}
	
	
}
