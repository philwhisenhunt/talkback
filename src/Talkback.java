import java.util.Scanner;

class TalkBack {
    public static void main(String args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a username");

        String userName = myObj.nextLine(); //This takes the user input
        System.out.println("Your username is " + userName);
    }

}
