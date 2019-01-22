import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Router {
	//noeuds de la topologie, avec file d'attente, vitesse de traitement
	
	//protected Integer vitesseTraitement;
	protected static boolean congestion;
	protected Queue<Paquet> q;
	
	
	public Router() {
		// TODO Auto-generated constructor stub
		congestion=false;
		q = new ArrayBlockingQueue<Paquet>(20);
	}
	
	public static void consumeListAttenteR(Queue<Paquet> lA,Queue<Paquet>lr) { 
		long dd=0;
		long da=0;
		//while(!lA.isEmpty()) {

			//for (int i =0;i<20;i++) {
				Paquet p = lA.poll();
				dd=p.createTime;
				da=System.currentTimeMillis();
				System.out.println("ID: "+p.id+", Date de création du paquet: "+p.createTime+", Date arrivée du paquet: " +da);
				boolean r = (da-dd)<p.delay;
				System.out.println("Paquet arrivé dans les delai ? : "+ r+" ,contrainte du paquet "+p.delay+", delai réel: "+(da-dd)+", lien associé: "+Liens.cheminPaquet(p.delay).name);
				lr.add(p);
			//}
			
		//}
		

	}
}
