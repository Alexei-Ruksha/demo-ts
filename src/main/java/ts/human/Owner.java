
package ts.human;

import ts.house.Flat;

import java.util.List;

/**
 * Created by Алексей on 23.09.2016.
 */
public class Owner extends Man
{
     public Owner(String name, List<Flat> flats) {
          super(name);
          this.flats = flats;
     }

     List<Flat> flats;
}
