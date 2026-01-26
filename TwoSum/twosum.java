public class twosum{
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int k = nums[i] + nums[j];

            if(k==target){
                System.out.println(i + "," + j);
            }
        }  
        }
    }
}