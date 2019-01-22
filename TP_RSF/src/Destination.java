import java.util.Queue;

public class Destination {
	//traite les paquets recu de la topologie et les traites/supprimes
	public Destination() {
		// TODO Auto-generated constructor stub
	}
	
	public static void consumeListAttente(Queue<Paquet> q1,Queue<Paquet> q2,Queue<Paquet>q3) {
		long dd=0;
		long da=0;
		while(!q1.isEmpty()) {

			for (int i =0;i<q1.size();i++) {
				Paquet p = q1.poll();
				dd=p.createTime;
				da=System.currentTimeMillis();
				System.out.println("ROUTEUR1 :.....ID: "+p.id+", Date de création du paquet: "+p.createTime+", Date arrivée du paquet: " +da);
				boolean r = (da-dd)<p.delay;
				System.out.println("Paquet arrivé dans les delai ? : "+ r+" ,contrainte du paquet"+p.delay+", delai réel: "+(da-dd)+", lien associé: "+Liens.cheminPaquet(p.delay).name);
			}
			
		}
		while(!q2.isEmpty()) {

			for (int i =0;i<q2.size();i++) {
				Paquet p = q2.poll();
				dd=p.createTime;
				da=System.currentTimeMillis();
				System.out.println("ROUTEUR2 :.....ID: "+p.id+", Date de création du paquet: "+p.createTime+", Date arrivée du paquet: " +da);
				boolean r = (da-dd)<p.delay;
				System.out.println("Paquet arrivé dans les delai ? : "+ r+" ,contrainte du paquet"+p.delay+", delai réel: "+(da-dd)+", lien associé: "+Liens.cheminPaquet(p.delay).name);
			}
			
		}
		while(!q3.isEmpty()) {

			for (int i =0;i<q3.size();i++) {
				Paquet p = q3.poll();
				dd=p.createTime;
				da=System.currentTimeMillis();
				System.out.println("ROUTEUR3 :.....ID: "+p.id+", Date de création du paquet: "+p.createTime+", Date arrivée du paquet: " +da);
				boolean r = (da-dd)<p.delay;
				System.out.println("Paquet arrivé dans les delai ? : "+ r+" ,contrainte du paquet"+p.delay+", delai réel: "+(da-dd)+", lien associé: "+Liens.cheminPaquet(p.delay).name);
			}
			
		}
		

	}

}
