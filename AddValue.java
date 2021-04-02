package book;

import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        int value1;
        double value2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập value1 là số nguyên:");
        value1=scanner.nextInt();
        System.out.println("Nhạp value2 là số kép:");
        value2=scanner.nextDouble();
    }
}
