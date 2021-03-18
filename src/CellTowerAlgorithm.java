import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CellTowerAlgorithm {
    public CellTowerAlgorithm() {
        ArrayList<Integer> housesList = new ArrayList<>();

        Random rand = new Random();
        // RANDOM GENERATOR JUST FOR SAMPLE DATA AND IS NOT CONSIDERED WHEN FACTORING TIME COMPLEXITY

        // loop uses rand object to generate random numbers and add them to the list of houses
        // while the randomly generated number already exists in the list, generate a new random number
        for (int i = 0; i < 20; i++) {
            int randNum = rand.nextInt(100);
            while (housesList.contains(randNum)) {
                randNum = rand.nextInt(100);
            }
            housesList.add(randNum);
        }

        // Using java's sort algorithm the sort the houses list in ascending order
        Collections.sort(housesList);
        ArrayList<Integer> cellTowersList = placeTowers(housesList);
        System.out.println("Houses are located at:");
        System.out.println(housesList);
        System.out.println("Cell towers are located at:");
        System.out.println(cellTowersList);
        System.out.println("Press enter to exit.");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // This function takes in an ArrayList of houses (Sorted in ascending order as a list of ints)
    // Each int represents the # of miles from 0, which represents the beginning of the road
    // (the westmost point) and the last element of the array, which would represent the end of the road(the eastmost point)
    public ArrayList<Integer> placeTowers(ArrayList<Integer> housesList) {
        // cellTowers is an int ArrayList of cell towers in which the int represents the # miles
        // from the start of the road
        ArrayList<Integer> cellTowers = new ArrayList<>();
        // This loops iterates through housesList
        for (int i = 0; i < housesList.size(); i++) {
            // get the current house represented by index i
            int currentHouse = housesList.get(i);
            // if there are no cell towers add one and move on to next iteration
            if (cellTowers.isEmpty()) {
                cellTowers.add(currentHouse + 4);
                continue;
            }
            // get the last tower added to the cell list and save to var lastPlacedTower
            int lastPlacedTower = cellTowers.get(cellTowers.size() - 1);
            // if the house in question is out of range (further than distance 4 from the last tower in both directions)
            // then add a cell tower 4 miles east of the current house (currentHouse + 4)
            if (currentHouse > lastPlacedTower + 4 || currentHouse < lastPlacedTower - 4) {
                cellTowers.add(currentHouse + 4);
            }
        }
        // return the list of cell towers
        return cellTowers;
    }
}
