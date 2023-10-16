public class Building{

    private String address;
    private String owner;
    private static int numBuildings = 0;

    public Building(){
        this.address = "";
        this.owner = "";
        Building.numBuildings++;
    }

    public Building(String address, String owner){
        this.address = address;
        this.owner = owner;
        Building.numBuildings++;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String toString(){
        return this.address + " occupied by " + this.owner;
    }

    public static int getNumBuildings(){
        return Building.numBuildings;
    }

    public boolean equals(Building anotherBuilding){
        return this.getAddress().equals(anotherBuilding.getAddress());
    }
}