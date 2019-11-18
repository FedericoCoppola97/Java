//Federico Coppola


//Librerie per gestione della lettura dei file
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeggereFile {

	public static void main(String[] args)
	{
		BufferedReader br=null;
		
		try
		{
			//dichiaro oggetto che dipende da FileReader
			br = new BufferedReader(new FileReader("doc.txt"));
			String linea; //stringa per contenere output del file
			
			//ciclo per leggere tutte le righe del file di testo
			while((linea = br.readLine())!=null)
			{
				System.out.println(linea); //stampo la riga letta
			} //end while loop
		} //end try
		catch(IOException e)
		{
			System.out.println("Errore!");
		} //end catch
		finally
		{
			try {
				br.close(); //chiusura del file di testo aperto per effettuare la lettura
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //chiusura del file di testo
		}//end finally
		
	} //end main

} //end class LeggereFile
