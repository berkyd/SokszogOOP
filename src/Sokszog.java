public abstract class Sokszog {
    private double a;
    public Sokszog(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public abstract double getKerulet();
    public abstract double getTerulet();
    @Override
    public String toString() {
        return String.format("K = %-10.3f   T = %-10.3f", this.getKerulet(), this.getTerulet());
    }
}