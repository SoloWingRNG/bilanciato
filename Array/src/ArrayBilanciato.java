
import java.util.Scanner;

public class ArrayBilanciato {

	public int dimensione;
	int[] array;
	Scanner sc = new Scanner(System.in);
	boolean flag = false;
	
	
	public void dimensioneArray() {	
		System.out.println("Dichiara la dimensione dell'array:");
		try {
			dimensione = sc.nextInt();
			array = new int[dimensione];
			flag = false;
		} catch (Exception e) {
			System.out.println("Non hai inserito nessun numero riprova");
			flag = true;
		}

	}

	public void numeriArray() {
		System.out.println("Inserisci " + array.length + " numeri:");
		for (int i = 0; i < array.length; i++) {
			try {
				System.out.println("Inserisci il numero " + (i + 1));
				array[i] = sc.nextInt();
				flag = false;
			} catch (Exception e) {
				System.out.println("Non hai inserito nessun numero riprova");
				flag = true;
			}
		}
	}

	public void bilanciato() {
		int cont1 = 0;
		int cont2 = 0;
		
		for (int i = 0; i < array.length; i++) {
			cont1 = cont1 + array[i];
			
			for (int j = i + 1; j < array.length; j++) {
				cont2 = cont2 + array[j];
			}
			if (cont1 == cont2) {
				System.out.println("L'array è bilanciato");
				flag = true;
			} else {
				cont2 = 0;
			}
		}
		if (flag == false) {
			System.out.println("L'array non è bilanciato");
		}
	}

	/*
	 * Ho creato un metodo a parte per la chiusura dello scanner in quanto può
	 * dare eccezzione se viene usato nei primi due metodi
	 */
	public void closeScanner() {
		sc.close();
	}

	public static void main(String[] args) {
		ArrayBilanciato arr = new ArrayBilanciato();
		
		arr.dimensioneArray();
		arr.numeriArray();
		arr.bilanciato();
		arr.closeScanner();
	}
}
