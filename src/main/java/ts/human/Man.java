package ts.human;

/**
 * Created by Алексей on 23.09.2016.
 */
public class Man
{
    private String name;
    private String sex;
    private int age;

    public Man(String name) {
        this.name = name;
        this.sex = "m";
        this.age = 30;
    }

    public Man(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
