import java.io.*;
import java.util.*;

public class Test {

    static void print1ToN(int n)
    {
        if(n==0)
            return;
        print1ToN(n-1);
        System.out.println(n);
    }

    public static void main(String args[])
    {
        int n = 5;

        print1ToN(n);
    }
}
