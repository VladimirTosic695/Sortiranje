package vladimir.tosic;

public class MergeSort {

	public static void razdvojiNiz(int niz[]) {
		int duzinaNiza = niz.length;

		if (duzinaNiza < 2) {
			return;
		}

		// Deklarisemo dva podniza na koje cemo da podelimo pocetni niz
		int polaNiza = duzinaNiza / 2;

		int leviNiz[] = new int[polaNiza];
		int desniNiz[] = new int[duzinaNiza - polaNiza];

		// smestanje vrednosti iz pocetnog niza u levi i desni podniz
		for (int i = 0; i < polaNiza; i++) {
			leviNiz[i] = niz[i];
		}
		for (int j = polaNiza; j < duzinaNiza; j++) {
			desniNiz[j - polaNiza] = niz[j];
		}

		// koristimo rekurziju kako bismo rasclanili niz na onaj broj podnizova koliko
		// je potrebno
		// da ostane samo jedan element unutar niza
		razdvojiNiz(leviNiz);
		razdvojiNiz(desniNiz);

		spojiNiz(leviNiz, desniNiz, niz);

	}

	public static void spojiNiz(int leviNiz[], int desniNiz[], int niz[]) {
		int levaDuzina = leviNiz.length;
		int desnaDuzina = desniNiz.length;

		int i = 0, j = 0, k = 0;

		// poredjenje vrednosti elemenata dva podniza i smestanje istih u niz od
		// najmanje do najvece vrednosti
		while (i < levaDuzina && j < desnaDuzina) {
			if (leviNiz[i] <= desniNiz[j]) {
				niz[k] = leviNiz[i];
				i++;
			} else {
				niz[k] = desniNiz[j];
				j++;
			}
			k++;
		}

		while (i < levaDuzina) {
			niz[k] = leviNiz[i];
			i++;
			k++;
		}

		while (j < desnaDuzina) {
			niz[k] = desniNiz[j];
			j++;
			k++;
		}
	}

	public static void ispisiNiz(int niz[]) {
		System.out.println("Elementi niza: ");
		for (int n : niz) {
			System.out.print(n + " ");
		}
	}

}
