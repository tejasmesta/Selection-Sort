class Solution
{
	int  select(int arr[], int n)
	{
        // code here such that selectionSort() sorts arr[]
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
        return 1;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    select(arr,n);
	}
}
