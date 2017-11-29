/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingassignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

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
        Scanner f;
        try{
            //try to assign the scanner to the dictionary file
            File dict = new File("src/sortingassignment/stockdataunsorted.txt");
            f = new Scanner(dict);
        //catch any errors thrown by the lack of a file
        }catch(FileNotFoundException e){
            //quit the method
            return;
        }
        //initialize a count of the number of lines in the file
        int numLines =0;
        //while the file has another line
        while(f.hasNextLine()){
            //move the scanner to the next line
            f.nextLine();
            //increment num lines
            numLines++;
        }
        //repeat the process
        try{
            //re initialize the file
            File dict = new File("src/sortingassignment/stockdataunsorted.txt");
            //assign the scanner to the start of the file
            f = new Scanner(dict);
        //if any errors were thrown from not having a file
        }catch(FileNotFoundException e){
            //break the method
            return;
        }
        //create a stock info array with an element for every line in the file
        StockInfo[] data = new StockInfo[numLines];
        //for every line in the file
        for(int i=0 ; i<numLines;i++){
            //assign this line to this data element
            String[] elements = f.nextLine().split(",");
            double[] doubles  = new double[elements.length];
            for(int j=0; j<elements.length; j++){
                doubles[j] = Double.parseDouble(elements[j]);
            }
            data[i]=new StockInfo(doubles);
        }
        
        Comparable[] set =
        {
            2, 1, 4, 4, 8, 12, 71, 63, 15, 85, 97, 12, 53, 71, 123
        };
        System.out.println(Arrays.toString(insertion(set)));
    }
    
    public static Comparable[] insertion(Comparable[] data){
        //starting at the second element, and moving to the end of the array,
        //insert the element at i into its proper postition
        for (int i = 1; i < data.length; i++)
        {
            Comparable inserted = data[i];
            //starting at the element to the left of the inserted, moving back
            //towards the begginning of the array
            for (int j = i; j > 0; j--)
            {

                //if the element being inserted is less than the element at this
                //location, swap their locations.
                if (inserted.compareTo(data[j-1]) < 0)
                {
                    //move it to the right
                    data[j] = data[j-1];
                    //if this is the first element
                    if(j==1){
                        //insert the temp into the first position
                        data[0] = inserted;
                    }
                //otherwise
                } else
                {
                    //leave the elements in their place, and move on
                    data[j] = inserted;
                    break;
                }
            }
        }
        return data;
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

        return set;
    }
}
