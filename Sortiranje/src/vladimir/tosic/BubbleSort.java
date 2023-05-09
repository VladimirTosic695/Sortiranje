package vladimir.tosic;

/*Bubble sort je najjednostavniji algoritam za sortiranje nizova. Algoritam radi po principu uporedjivanja 
 * dva susedna clana niza gde dolazi do zamenjivanja njihovih pozicija u nizu 
 * ukoliko se element sa vecom vrednoscu nalazi ispred elementa sa manjom. 
 * Operacija se vrsi sve dok niz ne bude sortiran u rastucem poretku (najveca vrednost je na kraju niza).
 * */

public class BubbleSort {

	// metoda sa sortiranje elemenata rastucim redosledom
	public static void sortirajNiz(int niz[]) {
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = 0; j < niz.length - i - 1; j++) {
				if (niz[j] > niz[j + 1]) {
					int temp = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = temp;
				}
			}
		}
	}

	// metoda za ispisivanje niza elemenata
	public static void ispisiNiz(int niz[], String kad) {
		System.out.println("Niz " + kad + " sortiranja:");
		for (int n : niz) {
			System.out.print(n + " ");
		}
	}

}
