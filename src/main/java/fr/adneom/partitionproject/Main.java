package fr.adneom.partitionproject;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try {
			List<Integer> partitionList = Arrays.asList(1, 2, 3, 4, 5);
			// Example 1
			Integer taille1 = 2;
			List<List<Integer>> result1 = PartitionListService.partition(partitionList, taille1);
			result1.forEach(System.out::print);
			System.out.println("");
			// Example 2
			Integer taille2 = 3;
			List<List<Integer>> result2 = PartitionListService.partition(partitionList, taille2);
			result2.forEach(System.out::print);
			System.out.println("");
			// Example 3
			Integer taille3 = 1;
			List<List<Integer>> result3 = PartitionListService.partition(partitionList, taille3);
			result3.forEach(System.out::print);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
