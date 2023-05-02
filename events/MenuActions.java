package events;

import java.util.Scanner;

public class MenuActions {
    // считывание поля id
    public String GetId(){
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        return id;
    } 

    // считывание поля text
    public String GetText(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    // считывание поля chance
    public String GetChance(){
        Scanner scanner = new Scanner(System.in);
        String chance = scanner.nextLine();
        return chance;
    } 


}
