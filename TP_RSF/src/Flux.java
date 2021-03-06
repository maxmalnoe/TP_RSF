import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Flux {
	//flux audio ou video ou autres contenant un certain nombre de paquets avec des délai et des priorité
	//exemple: flux audio de 5 paquets de taille 10 avec un délai de 25ms
	//exemple: flux audio de 5 paquets de taille 10 avec un délai de 25ms

	protected static int cpt1=0, cpt2=0, cpt3=0;
	protected static int id=0;

	public Flux() {
		// TODO Auto-generated constructor stub
	}

	public static List<Paquet> createFlux(String flux) {
		
		List <Paquet> packetList = new ArrayList<>();
		for (int i=0; i<20;i++) {
			Paquet p = new Paquet();
			 p = Paquet.createPacket(flux);
			packetList.add(p);
//			for(int j=0; j<packetList.size();j++) {
//
//				System.out.println(packetList.get(j));
//			}
			/*//Affichage paquet
			for(int i =0; i<p.taillepacket;i++) {
				System.out.println("le paquet à l'indice "+ i + " : " +p.data[i]);
			}*/
		}

		return packetList;
	}
	public static void traiterFlux(Queue<Paquet>q) {

		if(!q.isEmpty()) {
			for(int i =0; i<q.size();i++) {
			Paquet copiePaquet = q.poll();
			Liens l;

			l=Liens.cheminPaquet(copiePaquet.delay);
			if(l.name == "LIEN1") {
				cpt1++;
			}
			if(l.name == "LIEN2") {
				cpt2++;
			}
			if(l.name == "LIEN3") {
				cpt3++;
			}
			q.add(copiePaquet);
			}
		}
	}
	public static void main(String[] args) {
		createFlux("flux1");
		System.out.println("liens: " + Liens.LIEN1);
	}
}
