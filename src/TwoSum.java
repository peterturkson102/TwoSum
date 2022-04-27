import java.util.Arrays;

class TwoSum {
        public static int[] twoSum(int[] nums, int target) {
            int[] twoSumArray = new int[2];
            for(int i = 0; i<nums.length-1;i++){
                for(int j=i+1; j<nums.length;j++){
                    if (nums[i]+nums[j]==target){
                        twoSumArray[0]=i;
                        twoSumArray[1]=j;
                        break;
                    }
                }

            }
            return twoSumArray;
        }


    public static void main(String[] args) {
        int[] nums = new int[]{-1,-2,-3,-4,-5};
        int target = -8;
        int[] solu = twoSum(nums,target);
        System.out.println(Arrays.toString(solu));
    }
}