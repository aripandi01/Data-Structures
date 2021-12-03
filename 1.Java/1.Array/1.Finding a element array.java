import java.io.*;
import java.util.*;

public class Test {

     public static int findElement(int arr[], int x, int n)
     {
         for(int i=0; i<n; i++)
             if(arr[i] == x)
                 return i;

         return -1;
     }

     public static void main(String args[])
     {
         int arr[] = {33,5,87,3,24};
         int x = 8;

         System.out.println(findElement(arr,x,5));
     }
}
