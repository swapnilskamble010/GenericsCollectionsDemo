package DesignPrinciplesAndPatterns.PrototypeAndRegistry;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(int id, String name, double psp, int gradYear, int iq) {
        super(id, name, psp, gradYear);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
