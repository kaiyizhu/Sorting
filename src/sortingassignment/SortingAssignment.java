/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingassignment;

/**
 *
 * @author 070035266
 */
public class SortingAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
        public static Comparable[] selection(Comparable[] set){
        for (int i = 0; i < set.length; i++){
            //goes from 0 to end of array
            int index = i;
            for(int j = i+1; j < set.length; j++){
                if(set[j].compareTo(set[index]) < 0) {
                //search for lowest index
                index = j;
                }
            } 
            Comparable ascendNum = set[index];
            set[index] = set[i];
            set[i] = ascendNum;
        }
        for (int i = 0; i < set.length; i ++){
            System.out.print(set[i] + ", ");
        }
        return set;
    }
}
