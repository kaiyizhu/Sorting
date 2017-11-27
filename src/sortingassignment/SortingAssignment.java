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
public class SortingAssignment
{
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
    public static void main(String[] args)
    {
        // TODO code application logic here
        Comparable[] set =
        {
            2, 1, 4, 4, 8, 12, 71, 63, 15, 85, 97, 12, 53, 71, 123
        };
        System.out.println(Arrays.toString(bubble(set)));
    }
    
    public static Comparable[] insertion(Comparable[] data){
        Comparable[] sorted = null;
        int high;
        //starting at the second element, and moving to the end of the array,
        //insert the element at i into its proper postition
        for (int i = 1; i < data.length; i++)
        {
            //starting at the element to the left of the inserted, moving back
            //towards the begginning of the array
            for (int j = i - 1; j > 0; j--)
            {
                Comparable temp = data[i];
                //if the element being inserted is less than the element at this
                //location, swap their locations.
                if (temp.compareTo(data[j]) < 0)
                {
                    //move it to the right
                    data[j + 1] = data[j];
                    //otherwise, leave the elements in their place, and move on
                } else
                {
                    data[j + 1] = temp;
                    break;
                }
            }
        }
        return sorted;
    }
    
    public static Comparable[] bubble(Comparable[] set) {
        //Continue looping through the array until all items are sorted
        while (true)
        {
            boolean sorted = true;
            //Loop through all items
            for (int i = 0; i < set.length - 1; i++)
            {
                //If the first value is greater than the second value, then swap the two items
                if (set[i].compareTo(set[i + 1]) > 0)
                {
                    //If any items are swapped, then the set is not sorted
                    sorted = false;
                    Comparable temp = set[i];
                    set[i] = set[i + 1];
                    set[i + 1] = temp;
                }
            }

            //If the set is sorted, then return it
            if (sorted)
            {
                return set;
            }
        }
    }   
         

    public static Comparable[] selection(Comparable[] set)
    {
        for (int i = 0; i < set.length; i++)
        {
            //goes from 0 to end of array
            int index = i;
            for (int j = i + 1; j < set.length; j++)
            {
                if (set[j].compareTo(set[index]) < 0)
                {
                    //search for lowest index
                    index = j;
                }
            }
            Comparable ascendNum = set[index];
            set[index] = set[i];
            set[i] = ascendNum;
        }
        for (int i = 0; i < set.length; i++)
        {
            System.out.print(set[i] + ", ");
        }
        return set;
    }
}
