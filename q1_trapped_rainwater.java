
import java.util.Scanner;

public class q1_trapped_rainwater 
{
  public static void main(String[] args) 
  {
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
    
  }
  
}
