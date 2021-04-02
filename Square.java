package book;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        double number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số: ");
        number=scanner.nextDouble();
        Double square = number*number;
        System.out.println("Bình phương của số"+ number+"là:"+ square);
    }
}
