package com.abhisheksingh.easy.arrays;


public class Solution {

    //palindrome number
    public boolean isPalindrome (int x) {
        if(x==0){
            return true ;
        }
        if(x<0 || x % 10 == 0){
            return false ;
        }
        int reversedNum = 0;
        while(x>reversedNum){
            int lastDigit = x%10;
            x/=10;
            reversedNum = (reversedNum*10)+lastDigit;

        }
        return x==reversedNum || x == reversedNum / 10;
    }


    //remove Element
    public int removeElement(int[] nums, int val) {
        int k = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
    // remove duplicates from sorted array
    public int removeDuplicatesFromSortedArray(int[] arr) {
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
               k++;
               arr[k] = arr[i];
            }
        }
        return k + 1;
    }
}

