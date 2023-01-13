public class Main {
    public static void main(String[] args) {
        Kugel kugelStahl = new Kugel(20, 7.86, 3);
        System.out.println("Volume in mm³: " + kugelStahl.volumeKugelInKubikMM());
        System.out.println("Masse in kg: " + kugelStahl.masseKugelInKg());
        System.out.println("Geschwindigkeit beim Aufprall in km/h: " + kugelStahl.geschwindigkeitBeimAufprallInKmH());
        System.out.println("Fläsche in mm²: " + kugelStahl.flaecheKugelInQmm());
    }
}
