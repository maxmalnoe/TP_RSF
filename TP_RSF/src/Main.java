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
		Queue<Paquet> qsource = new ArrayBlockingQueue<Paquet>(20);
		//Queue<Paquet> qR1 = new ArrayBlockingQueue<Paquet>(20);
		//Queue<Paquet> qR2 = new ArrayBlockingQueue<Paquet>(20);
		//Queue<Paquet> qR3 = new ArrayBlockingQueue<Paquet>(20);
		Router r1 = new Router();
		Router r2 = new Router();
		Router r3 = new Router();
		List<Paquet> listp1 = Flux.createFlux("flux1");
		List<Paquet> listp2 = Flux.createFlux("flux2");
		List<Paquet> listp3 = Flux.createFlux("flux3");
		
		
		while(qsource.size()<20) {
			Source.fillListAttente(qsource,Source.chooseList(listp1, listp2, listp3));
		}
		Flux.traiterFlux(qsource);
		while(!qsource.isEmpty()) {
			Paquet p =qsource.peek();
			if(p.delay==25 ) {
				Router.consumeListAttenteR(qsource,r1.q);
				System.out.println("Paquet traitee routeur 1");
			}
			else if(p.delay==50) {
				Router.consumeListAttenteR(qsource,r2.q);
				System.out.println("Paquet traitee routeur 2");
			}
			else if(p.delay==100) {
				Router.consumeListAttenteR(qsource,r3.q);
				System.out.println("Paquet traitee routeur 3");
			}
		}
		System.out.println(Liens.LIEN1+": "+Flux.cpt1);
		System.out.println(Liens.LIEN2+": "+Flux.cpt2);
		System.out.println(Liens.LIEN3+": "+Flux.cpt3);
		Destination.consumeListAttente(r1.q,r2.q,r3.q);
	}

}
