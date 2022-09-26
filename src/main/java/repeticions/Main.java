package repeticions;

public class Main {
    public static void main(String[] args) {
        char primerNoRepe = DetectorCaracters.cercarPrimerNoRepetit("hholaaoxs");
        System.out.println(primerNoRepe);


        char primerRepe = DetectorCaracters.cercarPrimerRepetit("qwerrty");
        System.out.println(primerRepe);
    }
}
