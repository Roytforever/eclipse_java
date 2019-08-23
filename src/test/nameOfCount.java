package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class nameOfCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		while (input.hasNext()) {
			set.add(input.nextLine());
			int num = Integer.parseInt(input.nextLine());
			for (int i = 0; i < num; i++) {
				String[] name = input.nextLine().split(",");
				for (int j = 0; j < name.length; j++) {
					if (!set.contains(name[j])) {
						set.add(name[j]);
					}
				}
			}
			System.out.println(set.size());
		}
		input.close();
	}
}
