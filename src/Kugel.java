public class Kugel {

    public double radiusInMM;
    public double spezifischesGewicht;
    public double fallHoeheInMeter;

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
        return 4 * Math.PI * Math.pow(radiusInMM, 2);
    }

    public double volumeKugelInKubikMM() {
        return (4.0 / 3) * Math.PI * Math.pow(radiusInMM, 3);
    }

    public double masseKugelInKg() {
        return (volumeKugelInKubikMM() / 1000_000) * spezifischesGewicht;
    }

    public double geschwindigkeitBeimAufprallInKmH(){
        return Math.sqrt(2 * 9.81 * fallHoeheInMeter) * 3.6;
    }
}
