/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import logic.SelectionSort;

import validate.Validation;

public class Main {

    public static void main(String[] args) {
        
        int sizeOfArray = Validation.getInt("Enter size of array:",
                                            "Size is out of range", 
                                            "Number is not valid", 
                                            0, 100);
        SelectionSort selectionSort = new SelectionSort(sizeOfArray);
        selectionSort.getArray();
        // Array before you sort
        System.out.print("Unsorted: ");
        selectionSort.display();
        int choice;
        do{
            System.out.println("1. Ascending: ");
            System.out.println("2. Descending: ");
            System.out.println("3. Both");
            System.out.println("0. Exit: You are the best");
            choice = Validation.getInt("Enter your choice(0-3):",
                                        "Choice must be 0 to 3", 
                                        "Invalid number", 
                                        0, 3);
            switch(choice){
                case 1: 
                    System.out.println("1. Ascending: ");
                    selectionSort.sort("ASC");
                    selectionSort.display();
                    break;
                case 2:
                    System.out.println("1. Descending: ");
                    selectionSort.sort("DESC");
                    selectionSort.display();
                    break;
                case 3:
                    System.out.println("Both: ");
                    selectionSort.sort("ASC");
                    selectionSort.display();
                    selectionSort.sort("DESC");
                    selectionSort.display();
                    break;                 
            }
        } while(choice == 0);
    }
}