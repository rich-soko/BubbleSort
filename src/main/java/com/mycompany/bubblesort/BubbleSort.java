/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bubblesort;

import java.util.Arrays;

/**
 *
 * @author rs
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {5,7,9,2,4,10,465};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
    
    public static int[] bubbleSort(int[] nums) {
        int currentIndex = 0;
        while (currentIndex < nums.length - 1) {
            for (int i = currentIndex + 1; i < nums.length; i++) {
                int currentNum = nums[currentIndex];
                int next = nums[i];
                  if (nums[currentIndex] > next) {
                      nums[currentIndex] = next;
                      nums[i] = currentNum;
                  }                
            }
            currentIndex++;
        }
        
        
        return nums;
    }
}
