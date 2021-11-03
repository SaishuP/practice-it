/*
* Write a method named isUnique that takes an array of integers as a parameter and that 
* returns a boolean value indicating whether or not the values in the array are unique (true 
* for yes, false for no). The values in the list are considered unique if there is no 
* pair of values that are equal. 
*/

public static boolean isUnique(int[] a) {
    int counter = 0;
    
    for (int num : a) {
        for (int nums : a) {
            if(num == nums) counter++;   
        }
        if (counter > 1) return false;
        counter = 0;
    }
    
    return true;
}
