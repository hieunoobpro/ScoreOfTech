

public abstract class  SinhVienTechMaster {
    private String name;
    private String subject;

    public abstract double getDiem();

    public SinhVienTechMaster() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
