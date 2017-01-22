package ts.human;

import ts.house.House;

import java.util.List;

/**
 * Created by Алексей on 23.09.2016.
 */
public class President extends Man
{
     private List<House> houses;

     public President(Man man) {
          super(man.getName());
     }

     public President(String name, List<House> houses) {
          super(name);
          this.houses = houses;
     }

     public President(String name, String sex, int age, List<House> houses) {
          super(name, sex, age);
          this.houses = houses;
     }

     public List<House> getHouses() {
          return houses;
     }
}
