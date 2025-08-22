import java.util.*;
public class leaderOfArray
{
    static void printArray(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
//
static List<Integer> findLeader(int[] arr)
{
    int n=arr.length;
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        boolean leder=true;
        for(int j=i+1;j<n;j++)
        {

            if(arr[j]>arr[i])
            {
                leder=false;
                break;
            }
        }
        if(leder==true)
        {
            list.add(arr[i]);
        }

    }
    return list;
}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Elements are:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printArray(arr);
        System.out.println();
        System.out.println(findLeader(arr));

    }
}
