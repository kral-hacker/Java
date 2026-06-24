package OOPS;

public class Car {
    int modelYear;
    String modelName;

    // Parameterized Const;
    public Car(int m, String mn){
        this.modelYear = m; // this refers to this class variable
        this.modelName = mn;
    }
    public static void main(){
        Car merc = new Car(2026, "Maybach");
        System.out.println(merc.modelName + " " + merc.modelYear);
    }
}

