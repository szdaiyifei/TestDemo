package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] result = new int[k];
        //从0-n中抽取k个数
        for(int i=0;i<nums.length;i++){
            nums[i]=i+1;
        }

        for(int i=0;i<result.length;i++){
            //下标是0-n-1
            int index = (int)(Math.random()*n);
            result[i] = nums[index];

            nums[index] = nums[n-1];//使用数组的最后一个数覆盖nums[index]
            n--; //减少数组一位长度 相当于去掉了最后一个数

        }

        Arrays.sort(result);
        for(int i : result){
            System.out.println(i);
        }



    }
}
