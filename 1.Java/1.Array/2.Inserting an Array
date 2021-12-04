import java.io.*;
import java.util.*;


public class Test {

    public static int insert(int arr[], int x, int n, int cap, int pos)
    {
        int idx = pos-1;

        if(n==cap)
            return n;

        for(int i=n-1; i>=idx; i--)
        {
            arr[i+1] = arr[i];
        }

        arr[idx] = x;

        return n+1;
    }

    public static void main(String args[])
    {
        int arr[] = new int[5], cap=5, n=3;
        arr[0] = 10; arr[1] = 20; arr[2] = 40;

        System.out.println("Before insertion: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int x = 30, pos = 3;
        n = insert(arr,x,n,cap,pos);

        System.out.println("After insertion: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
