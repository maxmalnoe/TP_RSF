
public class Destination {
	//traite les paquets recu de la topologie et les traites/supprimes
	public Destination() {
		// TODO Auto-generated constructor stub
	}
	
	public static void consumeListAttente() {
		long dd=0;
		long da=0;
		while(!Source.listAttente.isEmpty()) {

			for (int i =0;i<20;i++) {
				Paquet p = Source.listAttente.poll();
				dd=p.createTime;
				da=System.currentTimeMillis();
				System.out.println("ID: "+p.id+", Date de création du paquet: "+p.createTime+", Date arrivée du paquet: " +da);
				boolean r = (da-dd)<p.delay;
				System.out.println("Paquet arrivé dans les delai ? : "+ r+" ,contrainte du paquet "+p.delay+", delai réel: "+(da-dd)+", lien associé: "+Liens.cheminPaquet(p.delay).name);
			}
			
		}
		

	}

}
