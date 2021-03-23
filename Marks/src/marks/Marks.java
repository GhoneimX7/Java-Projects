package marks;

public class Marks {
    private double oop;
    private double db;
    private double arc;
    private double net;
    private double stat;
    private double sa;
    private double GPA;

    public Marks(double oop, double db, double arc, double net, double stat, double sa) {
        this.oop = oop;
        this.db = db;
        this.arc = arc;
        this.net = net;
        this.stat = stat;
        this.sa = sa;
    }

    public double getOop() {
        return oop;
    }

    public void setOop(double oop) {
        this.oop = oop;
    }

    public double getDb() {
        return db;
    }

    public void setDb(double db) {
        this.db = db;
    }

    public double getArc() {
        return arc;
    }

    public void setArc(double arc) {
        this.arc = arc;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public double getStat() {
        return stat;
    }

    public void setStat(double stat) {
        this.stat = stat;
    }

    public double getSa() {
        return sa;
    }

    public void setSa(double sa) {
        this.sa = sa;
    }

    public double getGPA() {
        return (oop + db + arc + net + stat + sa)/6;
    }

    @Override
    public String toString() {
        return "Marks{" + "oop=" + oop + ", db=" + db + ", arc=" + arc + ", net=" + net + ", stat=" + stat + ", sa=" + sa + ", GPA=" + getGPA + '}';
    }
    

    
    
}
