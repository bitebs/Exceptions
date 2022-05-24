package com.company;

public class UserExceptions {
    public static void main(String[] args) throws NotEvenException {
        //проверка на четность
        int n = 2;
        if (n%2!=0)
            throw new NotEvenException("The number is not even");

        //проверка нахождения числа в диапазоне 1...10
        n=0;
        if (n<1 || n>10) try {
            throw new NotInRange("The number is not in range 1...10");
        } catch (NotInRange notInRange) {
            System.out.println("The number is not in range");
        }
    }
}

class NotEvenException extends Exception{
    NotEvenException(String s){
        super(s);
    }
}

class NotInRange extends Exception{
    NotInRange(String s){
        super(s);
    }
}

