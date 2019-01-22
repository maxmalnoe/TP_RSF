import java.io.FileWriter;
import java.io.IOException;

public class Csv {


	public static FileWriter remplissagecsv() throws IOException {
		FileWriter fileWriter = new FileWriter("Resultats.csv");
		for(int i=0; i<10;i++) {
			fileWriter.write("blabla");
			for(int j=0; j<10;j++) {
				fileWriter.write(',');
				fileWriter.write("test" + j);
			}
			fileWriter.write('\n');
		}
		fileWriter.close();
		return fileWriter;
	}

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = remplissagecsv();
		System.out.println(fileWriter);


	}

}
