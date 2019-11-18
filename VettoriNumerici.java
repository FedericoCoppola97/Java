import java.util.Scanner;

public class VettoriNumerici {

	public static void main(String[] args) {
	
		int numeri[] = new int[5];
		Scanner leggi = new Scanner(System.in);
		int temp=0;
		
		System.out.println("Digitare 5 numeri interi fra 1-10: ");
		
		for(int i=0; i < 5; i++)
		{
			do{
				System.out.print("Digitare numero: ");
				temp = leggi.nextInt();
			}while(temp < 1 || temp > 10); //loop si ripete se il numero è fuori il range da 1 a 10
			
			numeri[i]=temp; //scrivo nell'array
			temp=0; //reset temp			
		} //end ciclo for
		
		//stampo array
		for(int j=0; j < 5; j++)
		{
			System.out.println(numeri[j]);
		}

		System.out.println("Fine!");
		
	} //end main
}
