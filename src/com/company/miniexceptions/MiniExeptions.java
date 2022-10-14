package com.company.miniexceptions;

public class MiniExeptions {
    public static void getSomeExeptions() {
        try {
            int[] numbers = new int[3];
            numbers[4] = 45;
            System.out.println(numbers[4]);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Блок finally");
        }
        System.out.println("Программа завершена");
    }
    public static void MyException(Integer number){
        try{
            if(number==null){
                throw new Exception("Число не может быть null");
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}

