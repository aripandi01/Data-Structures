import java.io.*;
import java.util.*;


public class Test {

    static int removeDup(int arr[], int n)
    {
        int res=1;

        for(int i=1; i<n; i++)
        {
            if(arr[res-1] != arr[i])
            {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }


    public static void main(String args[])
    {
        int arr[] = new int[10], n=6;
        arr[0] = 10; arr[1] = 20; arr[2] = 20; arr[3] = 30; arr[4] = 30; arr[5] = 30;

        System.out.println("Before Removing: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        n = removeDup(arr,n);

        System.out.println("After Removing: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
