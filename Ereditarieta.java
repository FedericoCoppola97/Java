class Saluto
{
	public void buongiorno()
	{
		System.out.println("Buongiorno..");
	}
} //end class Saluto


class Esclamazioni extends Saluto
{
	public void euforia()
	{
		System.out.println("Evviva!");
	}
} //end class Esclamazioni



public class Ereditarieta {

	public static void main(String[] args) {

			Esclamazioni e = new Esclamazioni(); //creazione oggetto classe Esclamazioni
			
			e.euforia(); //richiamo metodo della funzione Esclamazioni
			
			e.buongiorno(); //richiamo metodo ereditato dalla funzione Saluto
	}
} //end class Ereditarieta
