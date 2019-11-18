import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ScrivereFile {

	public static void main(String[] args) {
		
		File doc = new File("document.txt"); //oggetto file
		
		//verifico se file esiste
		if(!doc.exists())
		{
			try
			{
				doc.createNewFile();
				System.out.println("Documento creato");
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			} 
		} //end if
		
		
		//scrittura su file controllata da try-catch
		try
		{
			PrintWriter pw = new PrintWriter(doc);
			pw.println("Questa frase è scritta sul file!");
			pw.println("100 grammi di spaghetti");
			pw.close(); //chiudo il file
			System.out.println("Scrittura completata");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //dichiaro oggetto per scrivere nel file, dipende da oggetto della classe File
		
		
	} //end main

}
