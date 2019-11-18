/*
 * Federico Coppola
 * 
 * Semplice metodo per eseguire la somma di due numeri interi
 */

import java.util.Scanner; //importo libreria per input

public class MetodoSomma {

	//metodo statico (non è necessario creare oggetto per utilizzarlo)
	//che esegue somma di due numeri interi
	public static int somma(int a,int b)
	{
		int risultato=0;
		risultato=a+b;
		return risultato;
	} //fine metodo static somma
	
	
	public static void main(String[] args) {
	
		int num1=0,num2=0;
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Somma tramite metodo!");
		
		//input dei due valori tramite Scanner
		System.out.println("Digitare primo numero: ");
		num1 = tastiera.nextInt();
		System.out.println("Digitare secondo numero: ");
		num2 = tastiera.nextInt();
				
		System.out.println("Risultato: "+somma(num1,num2)); //output risultato somma
	} //end main

} //end class
