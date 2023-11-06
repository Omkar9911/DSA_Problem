// Q1 Trappint Rainwater
/*  Given n non-negative intergers representing an elevation map whare the width of each bar is 1, compute how much water it can trap after raining
 *  DSA #22
 *  #Medium
 */

import java.util.*;
public class q1_trapped_rainwater 
{
  public static int trappedRainwater(int height[])
  {
    // calculate left max boundary - array
    // calculate right max boundary - array
    // loop
    // waterlevel = min(leftmax bond, rightmax bond)
    // trapped water = waterlevel - height[i]

    // int a=height.length;
    // calculate left max boundary - array
    int leftmax[] = new int [height.length];
    leftmax[0] = height[0];
    for(int i=1;i<height.length; i++)
    {
      leftmax[i] = Math.max(height[i], leftmax[i-1]);  
    }

     // calculate right max boundary - array
     int rightmax[] = new int[height.length];
     rightmax[height.length-1] = height[height.length-1];
     for(int i=height.length-2; i>=0; i-- )
     {
        rightmax[i] = Math.max(height[i], rightmax[i+1]);
     }

     int trappedwater = 0;
      // loop
      for(int i=0; i<height.length; i++)
      {
        // waterlevel = min(leftmax bond, rightmax bond)
  
        int waterlevel = Math.min(leftmax[i], rightmax[i]);

        // trapped water = waterlevel - height[i]
        trappedwater +=waterlevel -height[i];
      }
      return trappedwater;
  }
  public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of an array = ");
    int n = sc.nextInt();
    int height[] = new int[n];

    System.out.println("Enter no of element = ");

    for(int i=0; i<n; i++)
    {
      height[i]=sc.nextInt();
    }

    System.out.println("You Entered no in an array is :");
    // print array
    for(int i=0; i<n; i++)
    {
      System.out.print( height[i]+ " " );
    }
    System.out.println();
   
    System.out.println(trappedRainwater(height));
  }
  
}
