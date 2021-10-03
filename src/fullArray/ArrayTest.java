package fullArray;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import array_del.ArrayDeletion;

public class ArrayTest {

	Array arr= new Array();
	
	 @Test
    public void NoBubbleSortingEmptyArray() {
    	arr= new Array();
        arr.bubbleSort();
    }
	
	@Test
	public void test1() {
		arr= new Array();
		arr.insert(1, 0);
		arr.insert(2, 1);
		arr.insert(3, 2);
		arr.delete(2);
		for(int i=0; i<2; i++)
		{
			//System.out.println(i+1);
			//System.out.println(arr.array[i]);
			assertEquals(i+1, arr.array[i]);
		}
	}
	
	/*@Test
	public void test2()
	{
		arr.insert(1, 0);
		arr.insert(2, 1);
		arr.insert(3, 2);
		arr.insert(4, 3);
		arr.insert(5, 4);
		for(int i=0; i<5; i++)
		{ 
			arr.insert(9, 2);
		}
	}
 
    @Test
    public void shouldDoNothingWithOneElementArray() {
    	arr.insert(1, 0);
		arr.insert(2, 1);
		arr.insert(3, 2);
		arr.insert(4, 3);
        arr.bubbleSort();
        assertArrayEquals(new int[] {42}, values);
    }
 
    @Test
    public void shouldSortValues() {
        int[] values = { 9, -3, 5, 0, 1};
        int[] expectedOrder = { -3, 0, 1, 5, 9};
 
        sorter.sort(values);
 
        assertArrayEquals(expectedOrder, values);
    }*/

}
