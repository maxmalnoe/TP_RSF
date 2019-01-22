
public class Liens {
	//les liens de la topologie, dans un premier temps un délai différent pour un même débit et dans un second temps juste un débit différent
	protected static int LIEN1 = 25;// débit 25MB/s
	protected static int LIEN2 = 50;
	protected static int LIEN3 = 100;
	protected static String name;
	protected static int value;
	
	public Liens() {
		// TODO Auto-generated constructor stub
		 name="";
		 value =0;
		
	}
	
	public static Liens cheminPaquet(int delay) {
		Liens l = new Liens();
		if(delay <= 25) {
			l.name = "LIEN1";
			l.value = LIEN1;
		}
		if(delay > 25 && delay <=50) {
			l.name = "LIEN2";
			l.value = LIEN2;
		}
		if(delay > 50 && delay <=100) {
			l.name = "LIEN3";
			l.value = LIEN3;
		}
		
		return l;
	}

}
