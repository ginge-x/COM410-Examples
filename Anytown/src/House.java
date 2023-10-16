public class House extends Building{
    private int numBedrooms;
    private boolean hasGarage;
    private static int numHouses = 0;
    public House(){
        super();
        this.numBedrooms = 0;
        this.hasGarage = false;
        House.numHouses++;
    }

    public House(String address, String owner, int numBedrooms, boolean hasGarage){
        super(address, owner);
        this.numBedrooms = numBedrooms;
        this.hasGarage = hasGarage;
        House.numHouses++;
    }

    public int getNumBedrooms(){
        return this.numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms){
        this.numBedrooms = numBedrooms;
    }

    public boolean getHasGarage(){
        return  this.hasGarage;
    }

    public void setHasGarage(boolean hasGarage){
        this.hasGarage = hasGarage;
    }

    public String toString(){
        return super.toString() + " and is a house with " +
                this.numBedrooms + " bedrooms. ";
    }

    public static int getNumHouses(){
        return House.numHouses;
    }
}