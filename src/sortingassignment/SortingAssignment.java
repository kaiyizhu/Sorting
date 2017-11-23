/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingassignment;

import java.util.Arrays;

/**
 *
 * @author 070035266
 */
public class SortingAssignment {
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////Ascending Order////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comparable[] set = {2, 1, 4, 4, 8, 12, 71, 63, 15, 85, 97, 12, 53, 71, 123};
        System.out.println(Arrays.toString(bubble(set)));
    }

    public static Comparable[] bubble(Comparable[] set) {
        //Continue looping through the array until all items are sorted
        while (true) {
            boolean sorted = true;
            //Loop through all items
            for (int i = 0; i < set.length - 1; i++) {
                //If the first value is greater than the second value, then swap the two items
                if (set[i].compareTo(set[i + 1]) > 0) {
                    //If any items are swapped, then the set is not sorted
                    sorted = false;
                    Comparable temp = set[i];
                    set[i] = set[i + 1];
                    set[i + 1] = temp;
                }
            }
            
            //If the set is sorted, then return it
            if(sorted) {
                return set;
            }
        }
    }
}
