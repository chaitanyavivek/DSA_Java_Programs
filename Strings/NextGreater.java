class NextGreater
{
public static void nextGreater(int[] arr){
        for (int i = 0; i < arr.length; i++)
        {
            int next = -1;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] > arr[i])
                {
                    next = arr[j];//what elements are there in j will be stored in next
                    break;
                }
            }
            System.out.print(next + " ");
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = {1,3,2,6,4,5,2};
        nextGreater(arr);
    }
}