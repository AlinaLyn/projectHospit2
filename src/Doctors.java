import java.util.Scanner;
public class Doctors {
    private String name;
    private double receptionHours;
    private int age;


    public Doctors(String name,double receptionHours,int age) {
        this.name = name;
        this.receptionHours=receptionHours;
        this.age=age;

    }

    public Doctors() {

    }

    void staff(){
        System.out.println("Доброго дня!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReceptionHours() {
        return receptionHours;
    }

    public void setReceptionHours(double receptionHours) {
        this.receptionHours = receptionHours;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void processInformation(String information){
        System.out.println("Обробка інформації в класі Doctors: " + information);
    }
    }



