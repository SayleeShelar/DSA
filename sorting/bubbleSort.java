class Main{
    public static void main(String args[]){
        int [] nums = {2,9,6,3,8};
        int n = nums.length;
        bubbleSort(nums);
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i]);
        }

    }
    static void bubbleSort(int [] nums){
        for (int i = 0; i<nums.length; i++){
            boolean isSwap =false;
            for(int j=0; j<nums.length-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    isSwap=true;
                }
            }
            if (isSwap!=true){
                break;
                
            
            }
        }
    }
}