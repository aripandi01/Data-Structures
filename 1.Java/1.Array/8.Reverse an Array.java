public class Test {

    static void reverseArray(int arr[])
    {
        int low = 0, high = arr.length-1;

        while(low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String args[])
    {
        int arr[] = new int[5];
        arr[0] = 58; arr[1] = 68; arr[2] = 78; arr[3] = 88; arr[4] = 98;

        reverseArray(arr);
        System.out.print("Reverse array: \n");
        for(int i=0; i<5; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
