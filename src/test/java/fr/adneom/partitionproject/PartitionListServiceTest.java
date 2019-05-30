package fr.adneom.partitionproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PartitionListServiceTest {

	@Test
	public void givenNonEmptyList_whenPositiveTaille_thenCorrect() throws Exception {
		List<Integer> partitionList = Arrays.asList(1, 2, 3, 4, 5);
		Integer taille = 2;
		List<Integer> expectedLastSubList = Arrays.asList(5);
		List<List<Integer>> result = PartitionListService.partition(partitionList, taille);
		List<Integer> lastPartition = result.get(2);
		assertTrue(result.size() == 3);
		assertEquals(lastPartition, expectedLastSubList);
	}

	@Test
	public void givenEmptyList_whenPositiveTaille_thenCorrect() throws Exception {
		List<Integer> partitionList = Arrays.asList();
		Integer taille = 2;
		List<List<Integer>> result = PartitionListService.partition(partitionList, taille);
		assertTrue(result.size() == 0);
	}

	@Test(expected = Exception.class)
	public void givenNilList_whenPositiveTaille_thenThrowException() throws Exception {
		List<Integer> partitionList = null;
		Integer taille = 2;
		try {			
			PartitionListService.partition(partitionList, taille);
		} catch (Exception e) {
			assertEquals("Illegal parameter value", e.getMessage());
			throw e;
		}
	}

	@Test(expected = Exception.class)
	public void givenNonEmptyList_whenNegativeTaille_thenThrowException() throws Exception {
		List<Integer> partitionList = Arrays.asList(1, 2, 3, 4, 5);
		Integer taille = -2;
		PartitionListService.partition(partitionList, taille);
	}

}
