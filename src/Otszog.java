public class Otszog extends Sokszog {
    public Otszog(double a) {
        super(a);
    }
    public double getKerulet() {
        return 5 * this.getA();
    }
    public double getTerulet() {
        return (Math.sqrt((25 + (10 * Math.sqrt(5)))) / 4) * this.getA() * this.getA();
    }
    public double getBeirtKorSugar() {
        return (Math.sqrt((25 + (10 * Math.sqrt(5)))) / 10) * this.getA();
    }
    public double getKoreirtKorSugar() {
        return (Math.sqrt((50 + (10 * Math.sqrt(5)))) / 10) * this.getA();
    }
    @Override
    public String toString() {
        return String.format("Ötszög: a = %-10.3f  Beírható kör sugara: %-10.3f  Köréírható kör sugara: %-10.3f  %s", this.getA(), this.getBeirtKorSugar(), this.getKoreirtKorSugar(), super.toString());
    }
}