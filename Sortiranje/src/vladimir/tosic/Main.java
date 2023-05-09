package vladimir.tosic;

public class Main {

	public static void main(String[] args) {
		
		int bubbleNiz [] = {4, 5, 3, 1, 6, 9, 8, 7, 2};
		int selectionNiz[] = {4, 5, 3, 1, 6, 9, 8, 7, 2};
		int mergeSort[] = {4, 5, 3, 1, 6, 9, 8, 7, 2};
		int insertionNiz[] = {4, 5, 3, 1, 6, 9, 8, 7, 2};
		
		// Bubble sort
		BubbleSort.ispisiNiz(bubbleNiz, "pre");
		
		BubbleSort.sortirajNiz(bubbleNiz);
		
		System.out.println();
		BubbleSort.ispisiNiz(bubbleNiz, "posle");
		
		
		// Selection sort
		System.out.println();
		// Ispis niza pre sortiranja
		SelectionSort.ispisiNiz(selectionNiz);
		
		SelectionSort.sortirajNiz(selectionNiz);
		
		// Ispis niza posle sortiranja
		System.out.println();
		SelectionSort.ispisiNiz(selectionNiz);
		
		
		// Merge sort
		System.out.println();
		// Ispis niza pre sortiranja
		MergeSort.ispisiNiz(mergeSort);
		
		MergeSort.razdvojiNiz(mergeSort);
		
		// Ispis niza posle sortiranja
		System.out.println();
		MergeSort.ispisiNiz(mergeSort);
		
		// Insertion sort
		// Ispis niza pre sortiranja
		System.out.println();
		InsertionSort.ispisiNiz(insertionNiz);
		
		InsertionSort.insertionSort(insertionNiz);
		
		// Ispis niza posle sortiranja
		System.out.println();
		InsertionSort.ispisiNiz(insertionNiz);
		

	}

}
