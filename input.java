package input;

import java.util.Scanner; //importo istruzioni per permettere input di dati nel programma

public class input {

	public static void main(String[] args) {
	
		Scanner x = new Scanner(System.in); //creazione oggetto Scanner
		int numero=0; //variabile integer
		
		System.out.print("Digitare numero: "); //output per richiedere valore
		numero = x.nextInt(); //in numero verrà salvato il primo valore intero che riceve in input
		
		System.out.println("Numero digitato: " + numero); //output
	}

}
