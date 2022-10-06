public class Haromszog extends Sokszog {
    private double b;
    private double c;
    public Haromszog() {
        super(veletlenOldal());
        this.b = veletlenOldal();
        this.c =veletlenOldal();
        while (!isSzerkesztheto()) {
            super.setA(veletlenOldal());
            this.b = veletlenOldal();
            this.c = veletlenOldal();
        }
    }
    private static double veletlenOldal() {
        return Math.random() * 10 + 5;
    }
    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető!");
        }
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető!");
        }
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető!");
        }
    }
    @Override
    public void setA(double a) {
        super.setA(a);
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető!");
        }
    }
    private boolean isSzerkesztheto() {
        boolean szerkesztheto = true;
        if ((this.getA() + this.b) <= this.getC() || (this.getA() + this.c) <= this.getB() || (this.getC() + this.b) <= this.getA()) {
            szerkesztheto = false;
        }
        return szerkesztheto;
    }
    public double getKerulet() {
        return this.getA() + this.getB() + this.getC();
    }
    private double getS() {
        return getKerulet() / 2;
    }
    public double getTerulet() {
        return Math.sqrt(this.getS() * (this.getS() - this.getA()) * (this.getS() - this.getB()) * (this.getS() - this.getC()));
    }
    @Override
    public String toString() {
        return String.format("Háromszög: a = %-10.3f  b = %-10.3f  c = %-10.3f  %s", this.getA(), this.getB(), this.getC(),super.toString());
    }
}