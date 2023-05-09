package vladimir.tosic;

/*
 * Selection Sort je algoritam za sortiranje vrednosti iz nekog niza i zasniva se na tome 
 * da se trazi najmanja vrednost unutar niza koja se zatim smesta na nulti indeks u nizu 
 * dok se vrednost sa nultog indeksa smesta na indeks gde se nalazila minimalna vrednost u nizu. 
 * Ponovo se trazi sledeca minimalna vrednost (sad iteracija ide od indeksa 1) koja se menja mesto u nizu
 * sa vrednoscu na ideksu 1 i tako sve dok sve vrednosti elemenata niza ne budu sortirane rastuce u nizu. 
 */

public class SelectionSort {

	public static void sortirajNiz(int niz[]) {
		for (int i = 0; i < niz.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[min] > niz[j]) {
					min = j;
				}
			}
			int temp = niz[min];
			niz[min] = niz[i];
			niz[i] = temp;
		}
	}

	public static void ispisiNiz(int niz[]) {
		System.out.println("Elementi niza: ");
		for (int n : niz) {
			System.out.print(n + " ");
		}
	}

}
