package book;

import java.util.Scanner;

public class HinhChuNhat {
    double dai, rong;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public HinhChuNhat() {

    }

    public void HinhChuNhat(){
    }
    public double getRong(){
        return rong;
    }
    public double getDai(){
        return dai;
    }
    public void setRong (double rong){
        this.rong=rong;
    }
    public void setDai (double dai){
        this.dai=dai;
    }
    double tinhDienTich(){
        return dai*rong;
    }
    double tinhChuVi(){
        return (dai+rong)*2;
    }


    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        hcn.setDai(scanner.nextDouble());
        System.out.println("Nhập chiều rộng: ");
        hcn.setRong(scanner.nextDouble());
        System.out.println("Chu vi hình chữ nhật là: " + hcn.tinhChuVi());
        System.out.println("Diện tích hình chữ nhật là: "+hcn.tinhDienTich());
    }
}
