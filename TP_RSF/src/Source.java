import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Source {
	//recout des flux que la source achemine sur la topologie jusqu'a la destination
	protected static Queue<Paquet> listAttente;
	protected static int id;

	public Source() {
		// TODO Auto-generated constructor stub

	}

	public static void fillListAttente() {
		
		Paquet p = new Paquet();
		p = Paquet.createPacket("flux1");
		p.id=id+1;
		p.createTime=System.currentTimeMillis();
		try {
			listAttente.add(p);
		}catch (NullPointerException e) {
			System.out.print("NullPointerException caught");
		}

		System.out.println(listAttente);

	}

	public static void consumeListAttente() {
		if(!listAttente.isEmpty()) {

			for (int i =0;i<20;i++) {
				Paquet p = listAttente.poll();
				System.out.println("ID: "+p.id+", Date de création du paquet: "+p.createTime+"; Taille du paquet: "+p.taillepacket);
			}
		}

	}

	public static void main(String[] args) {
		listAttente = new ArrayBlockingQueue<Paquet>(20);
		id=0;
		while(listAttente.size()<20) {
			fillListAttente();
			id++;
		}
		consumeListAttente();
	}

}
