public class Main {
    public static void main(String[] args) {
        Kugel kugelStahl = new Kugel(50, 7.86, 3);
        System.out.println(kugelStahl.volumeKugelInKubikMM());
        System.out.println(kugelStahl.gewichtKugelInKg());
        System.out.println(kugelStahl.geschwindigkeitAmAufprallInKmH());
    }
}
