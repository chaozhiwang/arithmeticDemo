package com.zhenyi;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

 示例:

 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //int[] nums = {3,5,9,4};
        int[] nums = {11,34,56,98};
        ArrayDemo01 demo01 = new ArrayDemo01();
        int[] result = demo01.twoSum(nums,45);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    //hash两遍遍历
//    public int[] twoSum(int[] nums, int target) {
//
//        Map<Integer,Integer> maps = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            maps.put(nums[i],i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int comm = target - nums[i];
//            if(maps.containsKey(comm)) {
//                return new int[]{i,maps.get(comm)};
//            }
//        }
//        return null;
//
//    }

    //hash一遍遍历
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int conn = target - nums[i];
            if(maps.containsKey(conn)) {
                return new int[]{i,maps.get(conn)};
            }
            maps.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");

    }
}
