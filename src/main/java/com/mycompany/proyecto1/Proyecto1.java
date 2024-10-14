package com.mycompany.proyecto1;

import java.util.Scanner;

public class Proyecto1{
    public static void main(String[] args) {
        // crea escaner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: "); 
        int numero = scanner.nextInt(); // leer un número entero

        // muestra numero introducido
        System.out.println("El número introducido es: " + numero);
 
        // cierra escaner
        scanner.close();
		
		int resultado = 1;
			
		if (numero < 0){
		System.out.println("No se puede hacer un factorial de numeros negativos");
		}else if (numero == 0){ // El factorial de 0 es 1
			resultado = 1;
			System.out.println("El resultado es " + resultado);
			}else{	
				for (int i = 1; i <= numero; i++) {
					resultado *= i;  // multiplicar resultado por i
						}
						System.out.println("El resultado es " + resultado);
			}
	}
}

