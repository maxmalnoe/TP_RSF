import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source.listAttente = new ArrayBlockingQueue<Paquet>(20);
		List<Paquet> listp = Flux.createFlux();
		
		
		while(Source.listAttente.size()<20) {
			Source.fillListAttente(listp);
		}
		Flux.traiterFlux();
		Source.consumeListAttente();
	}

}
