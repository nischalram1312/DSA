public class Sort {
    public static void main(String[] args) {
        int[] nums = {1-,0,2,1,23,-10,22,7};
        for(int i=0; i< nums.length; i++){
            for(int j=1; j< nums.length-1; j++){
                if(nums[j]<nums[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0; i< nums.length; i++){
            System.out.println(nums[i]+" ");
        }
    }
}
