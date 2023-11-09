import java.util.Scanner;
public class Patiens {
    private String name;
    private String typeOfinjury;
    private int age;

    public Patiens() {
        this.name = name;
        this.typeOfinjury = typeOfinjury;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfinjury() {
        return typeOfinjury;
    }

    public void setTypeOfinjury(String typeOfinjury) {
        this.typeOfinjury = typeOfinjury;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    int chooseProcedure() {
        System.out.println("Доброго дня!" + "Яку процедуру Ви б хотіли обрати?");
        System.out.println("Введіть в систему код '103',щоб побачити перелік");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("" + choice);
        return choice;
    }



    public void preferenceProcedure() {
        System.out.println("Вкажіть потрібне Вам обстеження");
        System.out.println("1.Лабораторні дослідження(загальний аналіз крові/біохімічний аналіз крові/група та резус-фактор крові/аналізи на інфекції/аналізи гормонів та імунологічні тести)");
        System.out.println("2.Зображувальні дослідження(рентгенографія/УЗД/КТ/МРТ/флюрографія)");
        System.out.println("3.Електрокардіографія і дослідження серця");
        System.out.println("4.Ендоскопія(гастроскопія/колоноскопія/бронхоскопія)");
        System.out.println("5.Хірургічні процедури ( операції на серці/видалення апендециту/лапароскопічні операції /ампутації кінцівок/пластична хірургія)");
        System.out.println("6.Лікування інфекцій( інфузії антибіотиків та інших лікарських засобів)");
        System.out.println("7.Постановка діагнозу та консультація лікарів різних спеціалізацій");
        System.out.println("№: ");
    }
 public static void processInformation(String information){
     System.out.println("Обробка інформації в класі Patiens: "+information);
 }




}






