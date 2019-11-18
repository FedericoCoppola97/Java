/*
 * Federico Coppola
 * Overriding
 */

//classe Cars
class Cars
{
	public void accellerazione()
	{
		System.out.println("L'auto accellera!");
	} //end metodo accellerazione
} //end class Cars

//classe Bike che eredità da Cars
class Bike extends Cars
{
	//override del metodo accellerazione
	public void accellerazione()
	{
		System.out.println("La bici accellera!");
	} //end metodo accellerazione (overriding)
} //end class Bike



public class Overriding {

	public static void main(String[] args)
	{
		//creazione oggetti
		Cars auto = new Cars();
		Bike bicicletta = new Bike();
		
		
		//eseguo metodi
		auto.accellerazione();
		bicicletta.accellerazione(); //overriding
				
	} //end main

} //end class Overriding
