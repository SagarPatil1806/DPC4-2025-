import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class MergeTwoSortedArray
{
    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] +" ");
        }
        System.out.println();

    }

    public static void sortArray(int[] a1, int[] a2)
    {
        int m=a1.length;
        int n=a2.length;
        int left=m-1;
        int right=0;

        while(left>=0 && right<n)
        {
            if(a1[left]>a2[right])
            {
                int temp=a1[left];
                a1[left]=a2[right];
                a2[right]=temp;
                left--;
                right++;
            }
        else{
            left--;
            right++;
        }
        }

        Arrays.sort(a1);
        Arrays.sort(a2);




    }

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int n=sc.nextInt();

        int arr1[]=new int[n];
        System.out.println("Enter "+n+" elemnets");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array2");
        int m=sc.nextInt();

        int arr2[]=new int[m];
        System.out.println("Enter "+m+" elemnets");
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Array befor the sorting");
        printArray(arr1);
        printArray(arr2);

        sortArray(arr1,arr2);

        System.out.println();

        System.out.println("Array after the sorting");
        printArray(arr1);
        printArray(arr2);


    }
}
