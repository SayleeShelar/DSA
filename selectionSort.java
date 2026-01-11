class Main {
    public static void main(String[] args) {
        int [] arr = {2,8,5,4,7};
        int n =arr.length;
        selectionSort(arr, n);
        for (int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
    static void selectionSort(int[]arr, int n){
        for (int i=0; i<n; i++){
            int min = arr[i];
            int idx =i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<min){
                    min=arr[j];
                    idx=j;
                }
            }
            int temp =arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
}