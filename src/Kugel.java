public class Kugel {

    private Kugel __ = this;
    private double radiusInMM;
    private double spezifischesGewicht;
    private double fallHoeheInMeter;

    public Kugel(double radiusInMM, double spezifischesGewicht, double fallHoehe){
        __.radiusInMM = radiusInMM;
        __.spezifischesGewicht = spezifischesGewicht;
        __.fallHoeheInMeter = fallHoehe;
    }

    public Kugel(double radiusInMM, double spezifischesGewicht){
        this(radiusInMM, spezifischesGewicht, 0);
    }

    public Kugel(double radiusInMM){
        this(radiusInMM, 0);
    }

    public Kugel(){
        this(0);
    }

    public double flaecheKugelInQmm(){
        return 4 * Math.PI * Math.pow(__.radiusInMM, 2);
    }

    public double volumeKugelInKubikMM() {
        return (4.0 / 3) * Math.PI * Math.pow(__.radiusInMM, 3);
    }

    public double masseKugelInKg() {
        return (__.volumeKugelInKubikMM() / 1000_000) * __.spezifischesGewicht;
    }

    public double geschwindigkeitBeimAufprallInKmH(){
        return Math.sqrt(2 * 9.81 * __.fallHoeheInMeter) * 3.6;
    }

    public void info(){
        System.out.println("Volume in mm³: " + __.volumeKugelInKubikMM());
        System.out.println("Masse in kg: " + __.masseKugelInKg());
        System.out.println("Geschwindigkeit beim Aufprall in km/h: " + __.geschwindigkeitBeimAufprallInKmH());
        System.out.println("Fläsche in mm²: " + __.flaecheKugelInQmm());
    }
}
