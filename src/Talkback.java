import java.util.Scanner;

class TalkBack {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a username");

        String userName = myObj.nextLine(); //This takes the user input
        System.out.println("Your username is " + userName);

        System.out.println("And how old are you, " + userName + " ?");
        String userAge = myObj.nextLine(); // but how to do an actual number?
        System.out.println("You are " +userAge );

        System.out.println("Great. Well welcome " + userName + ". " + "So far we know that you are " + userAge + " years old. What else should we know?");
        String userFact = myObj.nextLine();
        //split into an array
        //detect "I am" and then delete that
        //replace it with "You are"
    }

}
