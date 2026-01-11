

class Main {
    public static void main(String[] args) {
        int [] arr = {1,9,2,8,3,6};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for (int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        
        
    }
    
    static void quickSort(int []arr, int l, int r){
        if (l<r){
            int p = partition(arr, l, r);
            quickSort(arr,l, p-1);
            quickSort(arr, p+1, r);
        }
    }
    static int partition(int [] arr, int l, int r){
        int key = arr[r];
        int start =l;
        for(int i=l; i<r; i++){
            if(arr[i]<=key){
            int temp = arr[i];
            arr[i]= arr[start];
            arr[start] = temp;
            start+=1;
        }
        }
        int temp = arr[start];
        arr[start] = arr[r];
        arr[r] = temp;

        return start;
        
    }
    
        
        
    
}
