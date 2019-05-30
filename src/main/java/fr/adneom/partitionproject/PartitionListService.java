package fr.adneom.partitionproject;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public final class PartitionListService {
	
	private PartitionListService() {
		super();
	}

	public static List<List<Integer>> partition(List<Integer> liste, Integer taille) throws Exception {
		if(liste == null || taille == null || taille < 1) {
			throw new Exception("Illegal parameter value");
		}
		List<List<Integer>> resultList =  new ArrayList<>();
		int index = 0;
		List<Integer> subList = new ArrayList<>();
		for (Integer ele : liste) {
			subList.add(ele);
			index++;
			if(index == taille) {
				resultList.add(subList);
				index = 0;
				subList = new ArrayList<>();
			}
		}
		if(CollectionUtils.isNotEmpty(subList)) {
			resultList.add(subList);
		}
		return resultList;
	}

}
