public class Kugel {

    private double radiusInMM;
    private double spezifischesGewicht;
    private double fallHoeheInMeter;

    public Kugel(double radiusInMM, double spezifischesGewicht, double fallHoehe){
        this.radiusInMM = radiusInMM;
        this.spezifischesGewicht = spezifischesGewicht;
        this.fallHoeheInMeter = fallHoehe;
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
        return 4 * Math.PI * Math.pow(this.radiusInMM, 2);
    }

    public double volumeKugelInKubikMM() {
        return (4.0 / 3) * Math.PI * Math.pow(this.radiusInMM, 3);
    }

    public double masseKugelInKg() {
        return (this.volumeKugelInKubikMM() / 1000_000) * this.spezifischesGewicht;
    }

    public double geschwindigkeitBeimAufprallInKmH(){
        return Math.sqrt(2 * 9.81 * this.fallHoeheInMeter) * 3.6;
    }

    public void info(){
        System.out.println("Volume in mm³: " + this.volumeKugelInKubikMM());
        System.out.println("Masse in kg: " + this.masseKugelInKg());
        System.out.println("Geschwindigkeit beim Aufprall in km/h: " + this.geschwindigkeitBeimAufprallInKmH());
        System.out.println("Fläsche in mm²: " + this.flaecheKugelInQmm());
    }
}
