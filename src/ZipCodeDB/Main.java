package ZipCodeDB;

public class Main {

    public static void main(String[] args) {
        ZipCode z1 = new ZipCode("13617", "NY", "Canton", 75.16, 44.59, 11781);
        System.out.println(z1);
        ZipCode z2 = new ZipCode("03894", "NH", "Wolfeboro", 71.19, 43.59, 5586);
        System.out.println(z2);

        Database db = new Database();
    }
}
