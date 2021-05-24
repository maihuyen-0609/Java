package book;

import java.util.Scanner;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str= "Nguyen@@ Thi^^ Mai%%#@! Huyen)(*&^";
        str= str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }
}
