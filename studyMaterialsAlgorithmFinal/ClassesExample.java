import java.util.Scanner;

class ClassesExample {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {

        Teachers mustafa = new Teachers(1,"Mustafa", "Çil", 60000);
        Teachers elif = new Teachers("Elif Hüsna", "Turkay");

        /* System.out.println(smallest(2, 4, 5));

        System.out.println(smallest(21, 46, 4894, 213));

        printMonthName(2);

        System.out.println(wallSpace(15,20,60));

        usersChoice(); */
    }

    public static int smallest(int x, int y, int z) {
        int smallestNumber = 0;
        if (x < y && x < z) {
            smallestNumber = x;
        } else if (y < x && y < z) {
            smallestNumber = y;
        } else if (z < x && z < y) {
            smallestNumber = z;
        } else {
            System.out.println("There is some equality..");
        }
        return smallestNumber;
    }

    public static int smallest(double x, double y, double z, double w) {
        int smallestNumber = 0;
        if (x < y && x < z && x < w) {
            smallestNumber = (int) x;
        } else if (y < x && y < z && x < w) {
            smallestNumber = (int) y;
        } else if (z < x && z < y && x < w) {
            smallestNumber = (int) z;
        } else if (w < x && w < y && w < z) {
            smallestNumber = (int) w;
        } else {
            System.out.println("There is some equality..");
        }
        return smallestNumber;
    }

    public static void printMonthName(int monthCounter) {
        switch (monthCounter) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("blablabla");
        }
    }

    public static double wallSpace(double height, double width, double length) {
        double spaceOfArea = height * width * length;
        return spaceOfArea;
    }

    public static String usersChoice() {
        boolean trueEntry = false;
        String userInput = "";
        while (trueEntry == false) {
            System.out.println("Please make your choice:");
            System.out.println("ROCK - PAPER - SCISSORS");
            userInput = keyboard.nextLine();

            switch (userInput) {
                case "rock":
                    System.out.println("Your choice is rock");
                    trueEntry = true;
                    break;
                case "paper":
                    System.out.println("Your choice is paper");
                    trueEntry = true;
                    break;
                case "scissors":
                    System.out.println("Your choice is scissors");
                    trueEntry = true;
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }
        }
        return userInput;
    }

    public static String determineWinner(String computersValue, String usersValue) {
        String winner = "";
        if (computersValue.equals("scissors") && usersValue.equals("paper")) {
            System.out.println("Computer win");
            winner = "computer";
        } else if (computersValue.equals("paper") && usersValue.equals("rock")) {
            System.out.println("Computer win");
            winner = "computer";
        } else if (computersValue.equals("rock") && usersValue.equals("scissors")) {
            System.out.println("Computer win");
            winner = "computer";
        } else if (computersValue.equals("rock") && usersValue.equals("paper")) {
            System.out.println("user win");
            winner = "user";
        } else if (computersValue.equals("paper") && usersValue.equals("scissors")) {
            System.out.println("user win");
            winner = "user";
        } else if (computersValue.equals("scissors") && usersValue.equals("rock")) {
            System.out.println("user win");
            winner = "user";
        } else if (computersValue.equals(usersValue)) {
            System.out.println("tie win");
            winner = "tie";
        }
        return winner;
    }
}
    class Teachers {
    private int ID;
    private String name;
    private double salary;
    private String lastName;

    public Teachers(int tID, String tname, String tlastName, double salary) {
        this.ID = tID;
        this.name = tname;
        this.lastName = tlastName;
        this.salary = salary;
    }
    public Teachers(String tname, String tlastName) {
        this.name = tname;
        this.lastName = tlastName;
    }

    String getName(){
        return name;
    }

    void setName(String changingName){
        name = changingName;
    }

}





