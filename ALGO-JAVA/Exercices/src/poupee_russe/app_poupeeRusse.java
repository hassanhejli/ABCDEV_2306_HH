package poupee_russe;

public class app_poupeeRusse {

	public static void main(String[] args) {
		
		PoupeeRusse poupeeRusse = new PoupeeRusse (3, true, true, false, false, false, true, true, true);
		
		PoupeeRusse p = new PoupeeRusse(5, true, true, false, false, false, true, true, true);
		
		boolean test1 = poupeeRusse.ouvrir();
		boolean test2 = poupeeRusse.fermer();
		boolean test3 = poupeeRusse.placerDans(poupeeRusse, p);
		boolean test4 = poupeeRusse.sortirDe(poupeeRusse, p);
		boolean test5 = p.ouvrir();
		boolean test6 = p.fermer();
		boolean test7 = p.placerDans(poupeeRusse, p);
		boolean test8 = p.sortirDe(poupeeRusse, p);
		
		

	}

}
