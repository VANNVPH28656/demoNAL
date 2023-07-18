package com.example.demo;

import java.util.Scanner;

public class testNAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi chữ cái : ");
        String chuoiNhap = scanner.nextLine();

        int slChuCai = demChuCaiTiengViet(chuoiNhap);
        System.out.println("Số lượng chữ cái Tiếng Việt : " + slChuCai);

        scanner.close();
    }
    public static int demChuCaiTiengViet(String chuoi) {
        String[] chuCaiTiengViet = {"aw", "aa", "dd", "ee", "oo", "ow", "w"};
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            String kyTu = chuoi.substring(i, i + 1);
            for (String chuCai : chuCaiTiengViet) {
                if (kyTu.equals(chuCai)) {
                    dem++;
                    break;
                }
            }
        }
        return dem;
    }


}

