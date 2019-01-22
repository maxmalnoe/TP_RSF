import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Source.listAttente = new ArrayBlockingQueue<Paquet>(20);
		Queue<Paquet> qsource = new ArrayBlockingQueue<Paquet>(60);
		Queue<Paquet> qR1 = new ArrayBlockingQueue<Paquet>(20);
		Queue<Paquet> qR2 = new ArrayBlockingQueue<Paquet>(20);
		Queue<Paquet> qR3 = new ArrayBlockingQueue<Paquet>(20);
		List<Paquet> listp1 = Flux.createFlux("flux1");
		List<Paquet> listp2 = Flux.createFlux("flux2");
		List<Paquet> listp3 = Flux.createFlux("flux3");
		
		
		while(qsource.size()<60) {
			Source.fillListAttente(qsource,Source.chooseList(listp1, listp2, listp3));
		}
		Flux.traiterFlux(qsource);
		while(!qsource.isEmpty()) {
			Paquet p =qsource.peek();
			if(p.delay==25) {
				Router.consumeListAttenteR(qR1);
				System.out.println("youhou1");
			}
			if(p.delay==50) {
				Router.consumeListAttenteR(qR2);
				System.out.println("youhou2");
			}
			if(p.delay==100) {
				Router.consumeListAttenteR(qR3);
				System.out.println("youhou3");
			}
		}
		System.out.println(Liens.LIEN1+": "+Flux.cpt1);
		System.out.println(Liens.LIEN2+": "+Flux.cpt2);
		System.out.println(Liens.LIEN3+": "+Flux.cpt3);
		Destination.consumeListAttente(qR1,qR2,qR3);
	}

}
