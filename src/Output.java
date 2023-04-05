public class Output extends SinhVienTechMaster {
    private double score;

    public Output(double score) {
        this.score = score;
    }

    public Output() {
    }

    public double getScore(double score) {
        return score;
    }

    public double setScore(double score) {
        return this.score;
    }

    public String xuat(double score){
        this.score=score;
        if(score<5) {
            System.out.println("Hoc sinh yeu");
        } else if (5 <= score && score<6.5)  {
            System.out.println("Hoc sinh trung binh");
        } else if (score >= 6.5 && score<7.5 ) {
            System.out.println("Hoc sinh kha");
        } else {
            System.out.println("Hoc sinh gioi");
        }
        return "";
    }

    @Override
    public double getDiem() {
        return 0;
    }
}


