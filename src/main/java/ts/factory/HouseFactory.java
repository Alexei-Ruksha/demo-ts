package ts.factory;

import ts.house.House;
import ts.human.President;
import ts.human.PresidentController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 05.01.2017.
 */
public class HouseFactory
{
    private PresidentController presidentController = new PresidentController();
    public House createHouse(String data){

        House house = new House();

        String[] houseData = data.split(";");
        List<House> houses = new ArrayList<>(1);
        houses.add(house);

        house.setAddress(houseData[1]);
        President president = presidentController.getPresident(houseData[2]);
        if (president == null)
        {
            president = new President(houseData[2], houses);
//            Man citizen = citizenController.get(houseData[2]);
//            president = new President(citizen);
            presidentController.addPresident(president);
        }
        //else todo - add house to president
        house.setPresident(president);
        return house;
        //звонок прервался?
        //ну хер с ним - задачи
        // 1) заполнить данные в файлах
        // 2) загрузить файлы и создать объекты из модели со связями
        // сча я те скину кой чего минут через 10
    }
}
