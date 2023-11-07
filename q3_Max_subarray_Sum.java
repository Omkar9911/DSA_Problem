// Q 8 Max Subarray sum
/*Enter size of an array = 
5
Enter no of element = 
2
4
6
8
10
You Entered no in an array is :
2 4 6 8 10
0
2
6
12
20
30
0
4
10
18
28
0
6
14
24
0
8
18
0
10
Max sum = 30 
*/

import java.util.Scanner;
public class q3_Max_subarray_Sum 
{
  public static void maxSubarraySum(int number[])
  {
    int currsum = 0;
   int  maxsum = Integer.MIN_VALUE;
    for(int i=0; i<number.length; i++)
    {
      int start = i;
      for(int j=i; j<=number.length; j++)
      {
        currsum = 0;
        int end = j;
        
          for(int k=start; k<end; k++)
          {
            currsum = currsum + number[k];
            
          }
           System.out.print(currsum);
          if(maxsum < currsum)
          {
            maxsum = currsum;
          }
          System.out.println();
        
      }
    }
              System.out.println("Max sum = " + maxsum);

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of an array = ");
    int n = sc.nextInt();
    int number[] = new int[n];

    System.out.println("Enter no of element = ");

    for(int i=0; i<n; i++)
    {
      number[i]=sc.nextInt();
    }

    System.out.println("You Entered no in an array is :");
    // print array
    for(int i=0; i<n; i++)
    {
      System.out.print( number[i]+ " " );
    }
    System.out.println();

    maxSubarraySum(number);
    
   
  }

  
}
