public class SinhVienBiz extends SinhVienTechMaster{
    private double marketing;
    private double sale;
    @Override
    public double getDiem() {
    return (2*marketing+sale)/3;
    }

    public SinhVienBiz() {
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}
