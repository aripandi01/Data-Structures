import java.io.*;
import java.util.*;

public class Test {

    static int findLargest(int arr[])
    {
        int n = arr.length;
        int res = 0;

        for(int i=1; i<n; i++)
        {
            if(arr[i]>arr[res])
                res = i;
        }

        return res;
    }


    public static void main(String args[])
    {
        int arr[] = new int[10];
        arr[0] = 7; arr[1] = 88; arr[2] = 78; arr[3] = 68; arr[4] = 58;

        System.out.print(findLargest(arr));
    }
}
