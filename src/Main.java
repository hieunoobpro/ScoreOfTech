import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double score = null;
        Output output = new Output();
        DecimalFormat df = new DecimalFormat("#.##");
        SinhVienIT sinhVienIT = new SinhVienIT();
        SinhVienBiz sinhVienBiz = new SinhVienBiz();
        Scanner scanner = new Scanner(System.in);
        /* Diem cho sinh vien thuong*/
        System.out.println("Nhap ho va ten: ");
        output.setName(scanner.nextLine());
        System.out.println("Nhap nganh: ");
        String nganh = scanner.nextLine();
        if (Objects.equals(nganh, "it")) {
            double scoreOfJava;
            do {
                System.out.println("Nhap diem Java: ");
                scoreOfJava = Double.parseDouble(scanner.nextLine());
            } while (scoreOfJava < 0 || scoreOfJava > 10);
            sinhVienIT.setJava(scoreOfJava);
            double scoreOfHtml;
            do {
                System.out.println("Nhap diem Html: ");
                scoreOfHtml = Double.parseDouble(scanner.nextLine());
            } while (scoreOfHtml < 0 || scoreOfHtml > 10);
            sinhVienIT.setHtml(scoreOfHtml);
            double scoreOfCss;
            do {
                System.out.println("Nhap diem Css: ");
                scoreOfCss = Double.parseDouble(scanner.nextLine());
            } while (scoreOfCss < 0 || scoreOfCss > 10);
            sinhVienIT.setCss(scoreOfCss);
            score = sinhVienIT.getDiem();
            System.out.println("Diem cua sinh vien IT " + output.getName() + " la " + score);
        } else if (Objects.equals(nganh, "biz")) {
            double scoreOfMarketing;
            do {
                System.out.println("Nhap diem Marketing: ");
                scoreOfMarketing = Double.parseDouble(scanner.nextLine());
            } while (scoreOfMarketing < 0 || scoreOfMarketing > 10);
            sinhVienBiz.setMarketing(scoreOfMarketing);
            double scoreOfSale;
            do {
                System.out.println("Nhap diem Sale: ");
                scoreOfSale = Double.parseDouble(scanner.nextLine());
            } while (scoreOfSale < 0 || scoreOfSale > 10);
            sinhVienBiz.setSale(scoreOfSale);
            df.format(sinhVienBiz.getDiem());
            score = sinhVienBiz.getDiem();
            System.out.println("Diem cua sinh vien " + output.getName() + " la " + score);
        } else {
            output.setSubject(nganh);
            do {
                System.out.println("Nhap diem chuyen nganh: " + output.getSubject());
                score = Double.parseDouble(scanner.nextLine());
            } while (score < 0 || score > 10);
            output.setScore(score);
            System.out.println("Ten sinh vien: " + output.getName());
            System.out.println("Diem: " + output.getScore(score));
        }
        System.out.println("Chuyen nganh: " + nganh);
        System.out.println("Xep loai: ");
        System.out.println(output.xuat(score));
    }
}