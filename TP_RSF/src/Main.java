import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source.listAttente = new ArrayBlockingQueue<Paquet>(20);
		List<Paquet> listp1 = Flux.createFlux("flux3");
		List<Paquet> listp2 = Flux.createFlux("flux2");
		List<Paquet> listp3 = Flux.createFlux("flux1");
		
		
		while(Source.listAttente.size()<20) {
			Source.fillListAttente(Source.chooseList(listp1, listp2, listp3));
		}
		Flux.traiterFlux();
		System.out.println(Flux.cpt1);
		System.out.println(Flux.cpt2);
		System.out.println(Flux.cpt3);
		Destination.consumeListAttente();
	}

}
