import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SortOfSortTester {
    @Test
    public void testSortOfSort1(){
        // Tests the method with an even amount of integers in the array and all positive numbers
        // Tests the basic functionality of the method and if it works properly
        int [] A = {2,7,1,3,0,9,6,5};
        SortOfSort sol = new SortOfSort(A);
        sol.sortOfSort(A);
        // expected output --> {6,5,1,0,2,3,7,9}
        int [] B = {6,5,1,0,2,3,7,9};
        assertArrayEquals(B, sol.getArray());
    }

    @Test
    public void testSortOfSort2(){
        // Tests the method with an odd amount of integers in the array and all positive numbers
        // Tests the basic functionality of the method with a slightly different input
        int [] A = {2,7,1,3,0,9,6,5,17};
        SortOfSort sol = new SortOfSort(A);
        sol.sortOfSort(A);
        // expected output --> {7,6,2,1,0,3,5,9,17}
        int [] B = {7,6,2,1,0,3,5,9,17};
        assertArrayEquals(B, sol.getArray());
    }

    @Test
    public void testSortOfSort3(){
        // Tests the method with a different type of input; even amount of elements
        // Tests if the method is able to handle non positive numbers
        int [] A = {0,3,6,5,-8,-4,23,-23};
        SortOfSort sol = new SortOfSort(A);
        sol.sortOfSort(A);
        // expected output --> {5,3,-8,-23,-4,0,6,23}
        int [] B = {5,3,-8,-23,-4,0,6,23};
        assertArrayEquals(B, sol.getArray());
    }

    @Test
    public void testSortOfSort4(){
        // Tests the method with a different type of input; even amount of elements
        // Tests if the method is able to repeating numbers
        int [] A = {0,1,1,3,3,5,6,7,8,9,9};
        SortOfSort sol = new SortOfSort(A);
        sol.sortOfSort(A);
        // expected output --> {8,7,3,3,0,0,1,5,6,9,9}
        int [] B = {8,7,3,3,0,1,1,5,6,9,9};
        assertArrayEquals(B, sol.getArray());
    }
    @Test
    public void testSortOfSort5(){
        // Tests the method with a different type of input; odd amount of elements
        // Tests if the method is able to handle non positive numbers, and repeating integers
        // in an array with an odd amount of elements
        int [] A = {1,7,200,-60,5,5,5,8,200,-40,-4};
        SortOfSort sol = new SortOfSort(A);
        sol.sortOfSort(A);
        // expected output --> {8,7,5,1,-60,-40,-4,5,5,200,200}
        int [] B = {8,7,5,1,-60,-40,-4,5,5,200,200};
        assertArrayEquals(B, sol.getArray());
    }
}
