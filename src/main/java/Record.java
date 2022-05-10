/**
 * Objects of this class are records in data set
 */
public class Record {
    final private int ID;
    final private float SepalLengthCm;
    final private float SepalWidthCm;
    final private float PetalLengthCm;
    final private float PetalWidthCm;
    final private String species;

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

    public float getSepalLengthCm() {
        return SepalLengthCm;
    }

    public float getSepalWidthCm() {
        return SepalWidthCm;
    }

    public float getPetalLengthCm() {
        return PetalLengthCm;
    }


    public float getPetalWidthCm() {
        return PetalWidthCm;
    }


    public String getSpecies() {
        return species;
    }
}
