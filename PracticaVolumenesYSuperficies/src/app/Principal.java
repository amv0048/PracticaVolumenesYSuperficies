package app;

import clases.Cilindro;
import clases.Cubo;

public class Principal {
	

	public static void main(String[] args) {
		
		
		Cubo cubo1 = new Cubo((int)(Math.random() * 9 + 1));
		Cubo cubo2 = new Cubo((int)(Math.random() * 9 + 1));
		
		System.out.println(cubo1.superficie());
		System.out.println(cubo2.superficie());
		
		System.out.println(cubo1.volumen());
		System.out.println(cubo2.volumen());
		
		Cilindro cili1 = new Cilindro(Math.random() * 9 + 1, Math.random() * 9 + 1);
		Cilindro cili2 = new Cilindro(Math.random() * 9 + 1, Math.random() * 9 + 1);
		
		System.out.println(cili1.superficie());
		System.out.println(cili2.superficie());
		
		System.out.println(cili1.volumen());
		System.out.println(cili2.volumen());
	}
}
