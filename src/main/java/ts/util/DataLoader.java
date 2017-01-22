package ts.util;

import ts.factory.HouseFactory;
import ts.house.House;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 05.01.2017.
 */
public class DataLoader
{
    private static HouseFactory houseFactory = new HouseFactory();

    public static void main(String[] args) {
        try {
            String data = new String(Files.readAllBytes(Paths.get("D:\\work\\company\\Data\\ts.txt")));
            String[] splittedData = data.split("\r\n");
            List<House> houses = new ArrayList<>();
            for (int i = 0; i < splittedData.length; i++) {
                String s = splittedData[i];
                House house = houseFactory.createHouse(s);
                System.out.println("house:"+house.toString());
                houses.add(house);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
