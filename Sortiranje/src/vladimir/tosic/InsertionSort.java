package vladimir.tosic;

public class InsertionSort {

	/*
	 * Insertion sort je algoritam koji radi po principu ubacivanja jednog po jednog
	 * elementa na odgovarajuce mesto unutar sortiranog niza. Poredi se drugi
	 * element niza sa prvim, ako je manji menjaju im se mesta. U sledecoj iteraciji
	 * poredi se treci sa drugim, ako je manji treci menjaju im se mesta, pa se
	 * poredi treci sa prvim i tako dok se ne sortira ceo niz u rastucem poretku
	 */

	public static void insertionSort(int niz[]) {

		for (int i = 1; i < niz.length; i++) {
			int temp = niz[i];

			int j = i - 1;

			while (j >= 0 && niz[j] > temp) {
				niz[j + 1] = niz[j];
				j--;
			}
			niz[j + 1] = temp;
		}

	}

	public static void ispisiNiz(int niz[]) {
		System.out.println("Elementi niza: ");
		for (int n : niz) {
			System.out.print(n + " ");
		}
	}

}
