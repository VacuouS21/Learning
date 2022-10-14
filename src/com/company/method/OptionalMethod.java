package com.company.method;

public class OptionalMethod {
    public static void optionalNums(int... nums) {
        switch (nums.length) {
            case 0:
                System.out.println("Havent numbers");
                break;
            case 1:
                System.out.println("We have one number its: " + nums[0]);
                break;
            default:
                System.out.println("Many numbers:");
                for (int i : nums) {
                    System.out.print(i + " ");
                }
                break;

        }
    }
}
