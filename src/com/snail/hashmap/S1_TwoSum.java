package com.snail.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author: taozhi
 * @date: Created in 2019/9/9 下午 3:15
 * @version: V1.0
 * @modified By:
 */
public class S1_TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15, 3, 6};
        int[] answer = twoSum(nums, 9);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    /**
     * 遍历整个数组，将元素值和下标索引存入哈希表，并在遍历途中判定表中是否存在target-当前元素
     */
    private static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //先判定，再加入
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]) , i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
