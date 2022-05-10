/**
 * Objects of this class are records in data set
 */
public class Record {
    int ID;
    private float SepalLengthCm;
    private float SepalWidthCm;
    private float PetalLengthCm;
    private float PetalWidthCm;
    private String species;

    public Record(int ID,float SepalLengthCm, float SepalWidthCm,float PetalLengthCm, float PetalWidthCm, String species){
        this.ID=ID;
        this.SepalLengthCm=SepalLengthCm;
        this.SepalWidthCm=SepalWidthCm;
        this.PetalLengthCm=PetalLengthCm;
        this.PetalWidthCm=PetalWidthCm;
        this.species=species;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getSepalLengthCm() {
        return SepalLengthCm;
    }

    public void setSepalLengthCm(float sepalLengthCm) {
        SepalLengthCm = sepalLengthCm;
    }

    public float getSepalWidthCm() {
        return SepalWidthCm;
    }

    public void setSepalWidthCm(float sepalWidthCm) {
        SepalWidthCm = sepalWidthCm;
    }

    public float getPetalLengthCm() {
        return PetalLengthCm;
    }

    public void setPetalLengthCm(float petalLengthCm) {
        PetalLengthCm = petalLengthCm;
    }

    public float getPetalWidthCm() {
        return PetalWidthCm;
    }

    public void setPetalWidthCm(float petalWidthCm) {
        PetalWidthCm = petalWidthCm;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
