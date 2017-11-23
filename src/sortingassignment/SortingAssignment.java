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
    public static Comparable[] insertion(Comparable[] data){
        Comparable[] sorted = null;
        int high;
        //starting at the second element, and moving to the end of the array,
        //insert the element at i into its proper postition
        for(int i=1; i<data.length; i++){
            //starting at the element to the left of the inserted, moving back
            //towards the begginning of the array
            for(int j=i-1; j>0;j--){
                Comparable temp = data[i];
                //if the element being inserted is less than the element at this
                //location, swap their locations.
                if(temp.compareTo(data[j]) <0){
                    //move it to the right
                    data[j+1] = data[j];
                //otherwise, leave the elements in their place, and move on
                }else{
                    data[j+1]= temp;
                    break;
                }
            }
        }
        return sorted;
    }
}
