package com.company;

import java.util.Scanner;

public class ThrowsException {
    public static void main(String[] args) {
        //дан номер месяца вывести пору года
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = scanner.nextInt();
        if (month<1 || month>12) throw new IllegalArgumentException(
                String.format("month %d is invalid, the number should be in range 1...12", month)
        );
        String season;
        if (month<3) season = "winter";
                else if (month<6) season = "spring";
                else if (month<9) season = "summer";
        else if (month<12) season = "autumn";
        else  season = "winter";

        System.out.println(season);
    }
}
