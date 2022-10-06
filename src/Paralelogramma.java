public class Paralelogramma extends Sokszog {
    private double b;
    private double alfa;

    public Paralelogramma(double a, double b) {
        super(a);
        this.b = b;
    }
    public Paralelogramma() {
        super(veletlenOldal());
        this.b = veletlenOldal();
        this.alfa = veletlenSzog();
    }
    private static double veletlenOldal() {
        return Math.random() * 10 + 5;
    }
    private static double veletlenSzog() {
        return Math.random() * 89 + 1;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getAlfa() {
        return alfa;
    }
    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }
    public double getKerulet() {
        return 2 * (this.getA() + this.b);
    }
    public double getTerulet() {
        return this.getA() * this.b *Math.sin(Math.toRadians(this.alfa));
    }
    @Override
    public String toString() {
        return String.format("Paralelogramma: a = %-10.3f  b = %-10.3f  a és b által közbezárt szög = %-10.3f  %s", this.getA(), this.getB(), this.getAlfa(),super.toString());
    }
}
