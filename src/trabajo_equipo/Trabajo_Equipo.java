/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_equipo;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Trabajo_Equipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este es el cambio de Daniel");
        System.out.println("Este es el cambio de Luis");
        System.out.println("Este es el cambio de Nelson");
        
         // Esta Sección es un código simple por Luis Penagos.
        
        for(int i = 0; i <= 12; i++){
	System.out.print("12 * "+ i + " = " + 12 * i + "\n");
	}
        
         // Codigo por Nelson Montañez
         
        int numero, exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);

        do{  
            System.out.print("Introduce un numero entero >= 0: ");
            numero = sc.nextInt();
        }while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }
    
}
