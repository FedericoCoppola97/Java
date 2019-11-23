//Federico Coppola
//Esempio semplice per dichiarare una classe con costruttore

class Automobile
	{
		String casa_produttrice;
		String colore_auto;
		int vel_max;
		
		//costruttore oggetto Automobile
		public Automobile(String produttore, String colore,int velocita_massima)
		{
			casa_produttrice = produttore;
			colore_auto=colore;
			vel_max=velocita_massima;
		} //end
			
	}
	
public class CostruttoreEasy {
	
	public static void main(String[] args) {
	
		//creazione oggetto
		Automobile auto = new Automobile("Fiat","Rossa",200);

		//output
		System.out.println("Produttore: "+auto.casa_produttrice+" Colore: "+auto.colore_auto+" Velocità massima: "+auto.vel_max);	
	}
}
