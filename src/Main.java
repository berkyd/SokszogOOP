public class Main {
    public static void main(String[] args) {
        System.out.println("Háromszög teszt ---------------------------------------\n");
        for (int i = 0; i < 100; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h);
        }
        System.out.println("\nTéglalap teszt ---------------------------------------\n");
        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10 + 5;
            double b = Math.random() * 10 + 5;
            System.out.println(new Teglalap(a, b));
        }
        System.out.println("\nParalelogramma teszt ---------------------------------------\n");
        for (int i = 0; i < 16; i++) {
            System.out.println(new Paralelogramma());
        }
        System.out.println("\nÖtszög teszt ---------------------------------------\n");
        for (int i = 0; i < 20; i++) {
            System.out.println(new Otszog(Math.random() * 10 + 5));
        }
        System.out.println("\nSokszogek osztály teszt---------------------------------------\n");
        Sokszogek szgs = new Sokszogek();
        System.out.println(szgs);
        System.out.printf("\nA kerületek összege: %-10.3f\n",szgs.osszKerulet());
        System.out.printf("A területek összege: %-10.3f\n",szgs.osszTerulet());
        System.out.printf("A legnagyobb területű sokszüg helyiértéke: %d\n",szgs.maxTerulet());

    }
}