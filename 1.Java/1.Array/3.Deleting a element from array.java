
import java.io.*;
import java.util.*;

public class Test {

    public static int deleteArray(int arr[], int x, int n)
    {
        int i=0;
        for(i=0; i<n; i++)
        {
            if(arr[i] == x)
                break;
        }

        if(i==n)
            return n;

        for(int j=i; j<n-1; j++)
        {
            arr[j] = arr[j+1];
        }

        return n-1;
    }

    public static void main(String args[])
    {
        int arr[] = new int[5], cap=5, n=5;
        arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;

        System.out.print("Before Deleting: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int x = 20;
        n = deleteArray(arr,x,n);

        System.out.print("After Deleting: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
