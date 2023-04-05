import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Output output = new Output();
        DecimalFormat df = new DecimalFormat("#.##");
        SinhVienIT sinhVienIT = new SinhVienIT();
        SinhVienBiz sinhVienBiz = new SinhVienBiz();
        Scanner scanner = new Scanner(System.in);
        /* Diem cho sinh vien thuong*/
        System.out.println("Nhap ho va ten: ");
        output.setName(scanner.nextLine());
        System.out.println("Nhap nganh: ");
        output.setSubject(scanner.nextLine());
        System.out.println("Nhap diem: ");
        Double score;
        do {
            score = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap lai so nho hon 10 va lon hon 0");
        } while ( score < 0 || score > 10);
        output.setScore(score);
        System.out.println("Ten sinh vien: " + output.getName());
        System.out.println("Diem: " + output.getScore(score));
        System.out.println("Chuyen nganh: " + output.getSubject());
        System.out.println("Xep loai: " + output.xuat(score));
        /* DIem cho sinh vien IT*/
        System.out.println("--------------------------------");
        System.out.println("Nhap ten sinh vien IT: ");
        sinhVienIT.setName(scanner.nextLine());
        System.out.println("Nhap diem Java: ");
        double scoreOfJava;
        do {
            scoreOfJava = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap lai so nho hon 10 va lon hon 0");
        } while ( scoreOfJava < 0 || scoreOfJava > 10);
        sinhVienIT.setJava(scoreOfJava);
        System.out.println("Nhap diem Html: ");
        double scoreOfHtml;
        do {
            scoreOfHtml = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap lai so nho hon 10 va lon hon 0");
        } while ( scoreOfHtml < 0 || scoreOfHtml > 10);
        sinhVienIT.setHtml(scoreOfHtml);
        System.out.println("NHap diem Css: ");
        double scoreOfCss;
        do {
            scoreOfCss = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap lai so nho hon 10 va be hon 0");
        } while ( scoreOfCss < 0 || scoreOfCss > 10);
        sinhVienIT.setCss(scoreOfCss);
        System.out.println("Diem cua sinh vien " + sinhVienIT.getName() + " la " + df.format(sinhVienIT.getDiem()));
        /*Diem cho sinh vien Biz*/
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Nhap ten sinh vien Biz: ");
        sinhVienBiz.setName(scanner.nextLine());
        System.out.println("Nhap diem Marketing: ");
        double scoreOfMarketing;
        do {
            scoreOfMarketing = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap lai so nho hon 10 va lon hon 0");
        } while ( scoreOfMarketing < 0 || scoreOfMarketing > 10);
        sinhVienBiz.setMarketing(scoreOfMarketing);
        System.out.println("Nhap diem Sale: ");
        double scoreOfSale;
        do {
            scoreOfSale = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap lai so nho hon 10 va lon hon 0");
        } while ( scoreOfSale < 0 || scoreOfSale > 10);
        sinhVienBiz.setSale(scoreOfSale);
        System.out.println("Diem cua sinh vien " + sinhVienBiz.getName() + " la " + df.format(sinhVienBiz.getDiem()));
    }
}