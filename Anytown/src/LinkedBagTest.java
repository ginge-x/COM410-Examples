import java.io.File;
import java.util.Scanner;

public class LinkedBagTest{

    public static void main(String[] args) throws Exception{

        LinkedBag buildings = new LinkedBag();
        File fileIn = new File("src/buildings.txt");
        Scanner fileInput = new Scanner(fileIn);
        String buildingData;
        int marker1 = 2, marker2, marker3, marker4, marker5;
        String address, owner;
        int numberOfBedrooms, numberOfEmployees, avgTurnover;
        boolean hasGarage;

        while (fileInput.hasNextLine()){
            buildingData = fileInput.nextLine();
            marker2 = buildingData.indexOf("|", marker1);
            marker3 = buildingData.indexOf("|", marker2 + 1);
            marker4 = buildingData.indexOf("|", marker3 + 1);
            marker5 = buildingData.indexOf("|", marker4 + 1);

            address =buildingData.substring(marker1, marker2);
            owner = buildingData.substring(marker2+ 1, marker3);

            switch (buildingData.substring(0, 1)){
                case "B":
                    //create new Building
                    System.out.println("Building");
                    if (buildings.addNewEntry(new Building(address, owner)))
                        System.out.println("Building added");
                    else
                        System.out.println("Building NOT ADDED");
                    break;
                case "H":
                    //create new House
                    System.out.println("House");
                    numberOfBedrooms = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                    hasGarage = Boolean.parseBoolean(buildingData.substring(marker4 + 1, marker5));
                    if (buildings.addNewEntry(new House(address, owner, numberOfBedrooms, hasGarage)))
                        System.out.println("House added");
                    else System.out.println("House NOT ADDED");
                    break;
                case "S":
                    //create new Shop
                    System.out.println("Shop");
                    numberOfEmployees = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                    avgTurnover =   Integer.parseInt(buildingData.substring(marker4 + 1, marker5));
                    if (buildings.addNewEntry(new Shop(address, owner, numberOfEmployees, avgTurnover)))
                        System.out.println("Shop added");
                    else System.out.println("Shop NOT ADDED");
                    break;
            }
        }
        System.out.println(buildings);

        if (buildings.addNewEntry(new Building("101 Main Street", "Mr X")))
            System.out.println("Building added");
        else
            System.out.println("Building NOT ADDED");
        if (buildings.addNewEntry(new Building("101 Main Street", "B.O Either")))
            System.out.println("Building added");
        else
            System.out.println("Building NOT ADDED");
        if (buildings.addNewEntry(new Building("101 Main Street", "A.N.Y Body")))
            System.out.println("Building added");
        else
            System.out.println("Building NOT ADDED");

        System.out.println(buildings);

        if (buildings.contains(new Building("101 Main Street", "Mr X")))
            System.out.println("Building found");
        else
            System.out.println("Building NOT FOUND");

        if (buildings.contains(new Building("102 Main Street", "Mr X")))
            System.out.println("Building found");
        else
            System.out.println("Building NOT FOUND");

        System.out.printf("101 Main Street is found %d times \n",
                buildings.getFrequencyOf(new Building("101 Main Street", "Mr X")));

        System.out.printf("102 Main Street is found %d times \n",
                buildings.getFrequencyOf(new Building("102 Main Street", "Mr X")));
    }
}