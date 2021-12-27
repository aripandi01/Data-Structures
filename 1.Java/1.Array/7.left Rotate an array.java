import java.io.*;
import java.util.*;

public class Test {

    static void lRotate(int arr[], int n)
    {
        int temp = arr[0];

        for(int i=1; i<n; i++)
        {
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;
    }

    public static void main(String args[])
    {
        int arr[] = new int[10], n=5;
        arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;

        System.out.println("Before Rotating: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        lRotate(arr,n);

        System.out.println("After Rotating: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
