package datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
	public static void main(String[] args) {
		final int Matrix = 3;
		Scanner userIn = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> store = new ArrayList<>();
		for (int i = 0; i < Matrix; i++) {
			store.add(new ArrayList<>());
		}
		for (int i = 0; i < Matrix; i++) {
			for (int j = 0; j < Matrix; j++) {
				store.get(i).add(userIn.nextInt());
			}
		}
		System.out.println(store + " ");
		userIn.close();
	}
}
