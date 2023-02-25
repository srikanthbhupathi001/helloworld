import java.sql.SQLOutput;

class Human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String a[]) {
        Human H = new Human();
        H.setAge(28);
        H.setName("sri");
        System.out.println(H.getAge() +":"+H.getName() );
    }
}