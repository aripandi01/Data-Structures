public class Test {

    static boolean isSorted(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        int arr[] = new int[5];
        arr[0] = 58; arr[1] = 68; arr[2] = 78; arr[3] = 88; arr[4] = 98;

        System.out.print(isSorted(arr));
    }
}
