package ts.human;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 10.12.2016.
 */
public class PresidentController
{
    private List<President> presidents;

    public PresidentController() {
        presidents = new ArrayList<>();
    }

    public void addPresident(President newPresident)
    {
        presidents.add(newPresident);
    }

    public void removePresident(President newPresident)
    {
        presidents.remove(newPresident);
    }

    public President getPresident(String name)
    {
        for (President president : presidents) {
            if (president.getName().equals(name))
            {
                return president;
            }
        }
        return null;
    }

}
