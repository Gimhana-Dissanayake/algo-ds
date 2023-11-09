import java.util.HashSet;
import java.util.Set;

class Driver{
    public static int singleNumber(int[] nums){
        if(nums.length == 1) return nums[0];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

        public static int singleNumber2(int[] nums){
        
            int singleNum = 0;
            for(int num: nums){
                singleNum = singleNum ^ num;
            }

            return singleNum;

    }

    public static void main(String[] args){

        int numbersArray[] = {1,2,3,4,1,2,3};

        System.out.println(singleNumber(numbersArray));
         // TC: O(n), SC: O(n)

         System.out.println(singleNumber2(numbersArray));
          // TC: O(n), SC: O(1)
    }
   
}