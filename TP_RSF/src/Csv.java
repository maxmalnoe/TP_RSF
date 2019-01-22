import java.io.FileWriter;
import java.io.IOException;

public class Csv {
	
	
	public static FileWriter remplissagecsv() throws IOException {
		FileWriter fileWriter = new FileWriter("Resultats.csv");
		fileWriter.append("blabla");
		fileWriter.close();
		return fileWriter;
	}
	
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = remplissagecsv();
		System.out.println(fileWriter);
		
		
	}

}
