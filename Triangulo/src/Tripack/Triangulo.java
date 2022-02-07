package Tripack;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		float ladoUno = 0;
		float ladoDos = 0;
		float ladoTres = 0;
		int ladosIguales = 0;
		
		System.out.print("Ingresa primer lado: ");
		ladoUno = lector.nextFloat();
		System.out.print("Ingresa segundo lado: ");
		ladoDos = lector.nextFloat();
		System.out.print("Ingresa Tercer lado: ");
		ladoTres = lector.nextFloat();
		
		
		if(ladoUno == ladoDos) {
			ladosIguales ++;
		}
		
		if(ladoDos == ladoTres) {
			ladosIguales ++;
		}
		
		
		if(ladoTres == ladoUno) {
			ladosIguales ++;
		}
		
		switch(ladosIguales) {
		case 0:
			System.out.print("El triángulo es Escaleno");
			break;
		case 1:
			System.out.print("El triángulo es Isósceles");
			break;
		case 2:
			System.out.print("El triángulo es Equilátero");
			break;
		case 3:
			System.out.print("El triángulo es Equilátero");
			break;	
		}
	
	}

}
