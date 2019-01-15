import java.util.ArrayList;
import java.util.List;

public class Flux {
	//flux audio ou video ou autres contenant un certain nombre de paquets avec des délai et des priorité
	//exemple: flux audio de 5 paquets de taille 10 avec un délai de 25ms
	public Flux() {
		// TODO Auto-generated constructor stub
	}

	public static void createFlux() {
		Paquet p = new Paquet();
		p = Paquet.createPacket("flux1");
		List <Paquet> packetList = new ArrayList<>();
		packetList.add(p);
		for(int j=0; j<packetList.size();j++) {

			System.out.println(packetList.get(j));
		}
		/*//Affichage paquet
		for(int i =0; i<p.taillepacket;i++) {
			System.out.println("le paquet à l'indice "+ i + " : " +p.data[i]);
		}*/
	}

	public static void traiterFlux() {
		if(!Source.listAttente.isEmpty()) {
			Paquet copiePaquet = Source.listAttente.poll();
			if(copiePaquet.delay <= 25) {
				//go lien 1

			}
			else if(copiePaquet.delay >25 && copiePaquet.delay <= 50) {//TODO à revoir pour améliorer les conditions
					//go lien 2
			}

			else if(copiePaquet.delay >50 && copiePaquet.delay <= 100) {
					//go lien 3
			}
			
			else {
				//pas possible
			}
		}
	}

	public static void main(String[] args) {
		createFlux();
	}
}
