/*Q4. Takes an input array of numbers and return a new array, sorted in ascending order (smallest to biggest).

  If the function's argument is null, an empty array, or undefined; return an empty array.
 
  Examples
    [1, 2, 10, 50, 5] ➞ [1, 2, 5, 10, 50]

    [80, 29, 4, -95, -24, 85] ➞ [-95, -24, 4, 29, 80, 85]

    [] ➞ []*/

import java.util.*; 
public class Question4 {
    public static void main(String[] args) {
        int a[]=new int[20];
        int i,j,temp,max,size;
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        if(size==0){
            return;
        }
        System.out.println("Enter the elements:");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();  
        }
        for(i=0;i<size;i++)
        {
            for(j=0;j<i;j++)
            {   
                if(a[i]<a[j]) 
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for(i=0;i<size;i++)
        {
            
            System.out.print(+a[i]+" ");  
        }
    }
}
