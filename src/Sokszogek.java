import java.util.ArrayList;
import java.util.List;

public class Sokszogek {
    private List<Sokszog> sokszogek;
    public Sokszogek() {
        this.sokszogek = new ArrayList<>();
        int ind = (int) Math.floor(Math.random() * 100);
        for (int i = 0; i < ind; i++) {
            switch (this.sokszogValasztoSzam()) {
                case 1:
                    sokszogek.add(new Teglalap(Math.random() * 10 + 5, Math.random() * 10 + 5));
                    break;
                case 2:
                    sokszogek.add(new Haromszog());
                    break;
                case 3:
                    sokszogek.add(new Paralelogramma());
                    break;
                case 4:
                    sokszogek.add(new Otszog(Math.random() * 10 + 5));
                    break;
            }
        }
    }
    public void addSokszog(Sokszog s) {
        this.sokszogek.add(s);
    }
    private int sokszogValasztoSzam() {
        return (int) (Math.floor(Math.random() * 4) + 1);
    }
    public double osszKerulet() {
        double ossz = 0;
        for (Sokszog s : this.sokszogek) {
            ossz += s.getKerulet();
        }
        return ossz;
    }
    public double osszTerulet() {
        double ossz = 0;
        for (Sokszog s : this.sokszogek) {
            ossz += s.getTerulet();
        }
        return ossz;
    }
    public int maxTerulet() {
        int index = 0;
        for (int i = 0; i < this.sokszogek.size(); i++) {
            if (this.sokszogek.get(index).getTerulet() < this.sokszogek.get(i).getTerulet()){
                index = i;
            }
        }
        return index+1;
    }
    @Override
    public String toString() {
        return this.sokszogek.toString();
    }
}
