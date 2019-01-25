import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections.*;

public class Source {
	//recout des flux que la source achemine sur la topologie jusqu'a la destination
	protected static Queue<Paquet> listAttente;


	public Source() {
		// TODO Auto-generated constructor stub

	}

	public static void fillListAttente(Queue<Paquet> q, List<Paquet> lp) {
		for (Paquet p : lp) {
			try {if(q.size()<40) {
				q.add(p);
			}
			}catch (NullPointerException e) {
				System.out.print("NullPointerException caught");
			}

			System.out.println(q);
		}


	}

	public static List<Paquet> chooseList(List<Paquet> lp1,List<Paquet> lp2,List<Paquet> lp3,List<Paquet> lp4,List<Paquet> lp5){
		List<Paquet>lp= new ArrayList<>();
		/*for(int i=0; i<lp1.size()+lp2.size()+lp3.size();i++) {
			if(Math.random()< 0.33) {
				lp.add(lp1.get(i));
=======
	public static void consumeListAttente() {
		while(!listAttente.isEmpty()) {

			for (int i =0;i<20;i++) {
				Paquet p = listAttente.poll();
				System.out.println("ID: "+p.id+", Date de création du paquet: "+p.createTime+"; Taille du paquet: "+p.taillepacket);
>>>>>>> branch 'master' of https://github.com/maxmalnoe/TP_RSF.git
			}
			else if(Math.random()<0.66&&Math.random()>0.33){
				lp=lp2;
			}
			else {
				lp=lp3;
			}
		}*/
		for(int i=0; i<lp1.size();i++) {
			lp.add(lp1.get(i));
		}
		for(int i=0; i<lp2.size();i++) {
			lp.add(lp2.get(i));
		}
		for(int i=0; i<lp3.size();i++) {
			lp.add(lp3.get(i));
		}
		for(int i=0; i<lp4.size();i++) {
			lp.add(lp4.get(i));
		}
		for(int i=0; i<lp5.size();i++) {
			lp.add(lp5.get(i));
		}
		Collections.shuffle(lp);
		return lp;
		
	}


//		public static void main(String[] args) {
//			List<Paquet> lp1 = Flux.createFlux("flux1");
//			List<Paquet> lp2 = Flux.createFlux("flux2");
//			List<Paquet> lp3 = Flux.createFlux("flux3");
//			
//			List<Paquet> lp= chooseList(lp1, lp2, lp3);
//			for(int i=0; i<lp.size();i++) {
//				System.out.println(lp.get(i).id);
//			}
//
//		}

}
