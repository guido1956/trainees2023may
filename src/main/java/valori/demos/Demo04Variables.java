package valori.demos;

public class Demo04Variables {
    public static void main(String[] args) {
        demoStrings();
        demoInts();
        demoDoubles();

    }

    public static void demoStrings() {
        String myFirstName = "Walter";    // declaration and initialisation
        String myLastName = "Scott"; //declaration and initialisation
        String myfullName = myFirstName + " " + myLastName;
        System.out.println(myFirstName);
        System.out.println(myLastName);
        System.out.println(myfullName);
    }

    public static void demoInts() {
        int age = 14;
        int ageNextYear = age + 1;
        System.out.println("I am " + age + " year old");
        System.out.println("Next year I am " + ageNextYear + " year old");

    }

    public static void demoDoubles() {

    }


}
