package beta;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	void merge(int arr[], int com, int med, int end) {

		int l = med - com + 1;
		int r = end - med;

		int LeftArray[] = new int[l];
		int RightArray[] = new int[r];

		for (int i = 0; i < l; i++)
			LeftArray[i] = arr[com + i];

		for (int j = 0; j < r; j++)
			RightArray[j] = arr[med + 1 + j];

		int i = 0, j = 0;
		int k = com;
		while (i < l && j < r) {
			if (LeftArray[i] <= RightArray[j]) {
				arr[k] = LeftArray[i];
				i++;
			} else {
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			arr[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < r) {
			arr[k] = RightArray[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int com, int fin) {
		if (com < fin) {
			int mid = (com + fin) / 2;
			sort(arr, com, mid);
			sort(arr, mid + 1, fin);
			merge(arr, com, mid, fin);
		}
	}

	public static void main(String args[]) {
		System.out.print("De que dimension desea el Vector?: ");
		Scanner teclado = new Scanner(System.in);
		int Z = teclado.nextInt();
		int datos[] = new int[Z];
		prueba2 ob = new prueba2();
		for (int i = 0; i < Z; i++) {
			System.out.print("Ingrese un valor para la posicion " + i + ": ");
			int N = teclado.nextInt();
			datos[i] = N;
		}
//		ob.sort(datos, 0, datos.length - 1);
//		System.out.println(" ");
//		System.out.println("EL ORDEN ES: ");
//		for (int i = 0; i < datos.length; i++) {
//			System.out.println(datos[i] + "");
//		}
		System.out.println("El vector Original es: " + Arrays.toString(datos));
		Arrays.sort(datos);
		System.out.println("El vector Ordenado es: " + Arrays.toString(datos));

	}

}
