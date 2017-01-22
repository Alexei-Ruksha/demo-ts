package ts.human;

import ts.house.Flat;

/**
 * Created by Алексей on 23.09.2016.
 */
public class Tenant extends Man
{
   public Tenant(String name, Flat flat) {
      super(name);
      this.flat = flat;
   }

   Flat flat;
}
