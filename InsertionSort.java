// Java program for implementation of Insertion Sort
class InsertionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; i++) 
        {
            int key = arr[i];
            int j = i-1;
 
           while (j>=0 && arr[j] > key)
           {
                int temp = arr[j]; // save arr[j] into a temporary
                arr[j] = arr[j+1] ; // [J+1] will always be key
                arr[j+1] = temp; // arr[j+1] will be temporary
                j--;
           }
        }
    }
 
    static void printArray(int arr[])
    {
        System.out.println(Arrays.toString(arr));
    }
 
    public static void main(String args[])
    {        
        int arr[] = {12, 11, 13, 5, 6};
 
        InsertionSort ob = new InsertionSort();        
        ob.sort(arr);
         
        printArray(arr);
    }
}
