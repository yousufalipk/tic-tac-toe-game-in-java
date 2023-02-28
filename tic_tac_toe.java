import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class tic_tac_toe{
    static String choice, turn ="A";
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> arr = new ArrayList<String>(List.of("1","2","3","4","5","6","7","8","9"));

    public static void display(){
        System.out.println("\n\t\t+++(Tic Tac Toe)+++\n");
        System.out.println("\t\t     |     |     ");
        System.out.println("\t\t  "+arr.get(0)+"  |  "+arr.get(1)+"  |  "+arr.get(2)+"  ");
        System.out.println("\t\t_____|_____|_____");
        System.out.println("\t\t     |     |     ");
        System.out.println("\t\t  "+arr.get(3)+"  |  "+arr.get(4)+"  |  "+arr.get(5)+"  ");
        System.out.println("\t\t_____|_____|_____");
        System.out.println("\t\t     |     |     ");
        System.out.println("\t\t  "+arr.get(6)+"  |  "+arr.get(7)+"  |  "+arr.get(8)+"  ");
        System.out.println("\t\t     |     |     \n");
    }

    public static void inp(){
        if(turn=="A"){
            System.out.println("Player "+turn +" Turn! ");
            System.out.print("Choose option (1-9): ");
            choice=input.next();
            switch(choice){
                case "1": 
                    if(arr.get(0)=="A" || arr.get(0)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(0, turn);
                    }
                break;
                case "2": 
                    if(arr.get(1)=="A" || arr.get(1)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(1, turn);
                    }
                break;
                case "3": 
                    if(arr.get(2)=="A" || arr.get(2)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(2, turn);
                    }
                break;
                case "4": 
                    if(arr.get(3)=="A" || arr.get(3)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(3, turn);
                    }
                break;
                case "5": 
                    if(arr.get(4)=="A" || arr.get(4)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(4, turn);
                    }
                break;
                case "6": 
                    if(arr.get(5)=="A" || arr.get(5)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(5, turn);
                    }
                break;
                case "7": 
                    if(arr.get(6)=="A" || arr.get(6)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(6, turn);
                    }
                break;
                case "8": 
                    if(arr.get(7)=="A" || arr.get(7)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(7, turn);
                    }
                    break;
                case "9": 
                    if(arr.get(8)=="A" || arr.get(8)=="B"){ 
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(8, turn);
                    }
                break;
                default: 
                    System.out.println("Invalid choice");
                break;
            }
        }
        else if(turn=="B"){
            System.out.println("Player "+turn +" Turn! ");
            System.out.print("Choose option (1-9): ");
            choice=input.next();
            switch(choice){
                case "1": 
                    if(arr.get(0)=="A" || arr.get(0)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(0, turn);
                    }
                break;
                case "2": 
                    if(arr.get(1)=="A" || arr.get(1)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(1, turn);
                    }
                break;
                case "3": 
                    if(arr.get(2)=="A" || arr.get(2)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(2, turn);
                    }
                break;
                case "4": 
                    if(arr.get(3)=="A" || arr.get(3)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(3, turn);
                    }
                break;
                case "5": 
                    if(arr.get(4)=="A" || arr.get(4)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(4, turn);
                    }
                break;
                case "6": 
                    if(arr.get(5)=="A" || arr.get(5)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(5, turn);
                    }
                break;
                case "7": 
                    if(arr.get(6)=="A" || arr.get(6)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(6, turn);
                    }
                break;
                case "8": 
                    if(arr.get(7)=="A" || arr.get(7)=="B"){
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(7, turn);
                    }
                    break;
                case "9": 
                    if(arr.get(8)=="A" || arr.get(8)=="B"){ 
                        System.out.println("Already Choosen!");
                    }
                    else{
                        arr.set(8, turn);
                    }
                break;
                default: 
                    System.out.println("Invalid choice");
                break;
                }
            }
        }

    public static void checkwin(){
        if(turn=="A"){
            //For checking 3 columns 
            if(arr.get(0) == arr.get(1) && arr.get(0) == arr.get(2)){
                win();
            }
            else if(arr.get(3) == arr.get(4) && arr.get(3) == arr.get(5)){
                win();
            }
            else if(arr.get(6) == arr.get(7) && arr.get(6) == arr.get(8)){
                win();
            }
            //for checking 3 rows 
            else if(arr.get(0) == arr.get(3) && arr.get(0) == arr.get(6)){
                win();
            }
            else if(arr.get(1) == arr.get(4) && arr.get(1) == arr.get(7)){
                win();
            }
            else if(arr.get(2) == arr.get(5) && arr.get(2) == arr.get(8)){
                win();
            }
            //for checking diagonaly 
            else if(arr.get(0) == arr.get(4) && arr.get(0) == arr.get(8)){
                win();
            }
            else if(arr.get(6) == arr.get(4) && arr.get(6) == arr.get(2)){
                win();
            }
            turn="B";
        }
        else if(turn=="B"){
            //For checking 3 columns 
            if(arr.get(0) == arr.get(1) && arr.get(0) == arr.get(2)){
                win();
            }
            else if(arr.get(3) == arr.get(4) && arr.get(3) == arr.get(5)){
                win();
            }
            else if(arr.get(6) == arr.get(7) && arr.get(6) == arr.get(8)){
                win();
            }
            //for checking 3 rows 
            else if(arr.get(0) == arr.get(3) && arr.get(0) == arr.get(6)){
                win();
            }
            else if(arr.get(1) == arr.get(4) && arr.get(1) == arr.get(7)){
                win();
            }
            else if(arr.get(2) == arr.get(5) && arr.get(2) == arr.get(8)){
                win();
            }
            //for checking diagonaly 
            else if(arr.get(0) == arr.get(4) && arr.get(0) == arr.get(8)){
                win();
            }
            else if(arr.get(6) == arr.get(4) && arr.get(6) == arr.get(2)){
                win();
            }
            turn="A";
        }
    }

    public static void win(){
        System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.println("\n\n\n\n\t\t\t\t\t\t*****(Congragulations)*****");
                System.out.println("\t\t\t\t\t\tPlayer "+turn+" Wins!!");
                System.out.println("\t\t\t\t\t\t***************************\n\n\n\n");
                System.out.println("\n\n*****************************************************\n");
        System.out.println("<-\t **Coded by Ameer Yousuf Ali Bhatti &hearts;\t->");
        System.out.println("\n**********************************************************\n\n\n\n");
                System.exit(0);
    }

    public static void main(String[] args){
        System.out.println("\n\n**********************************************************\n");
        System.out.println("<-\tCoded by Ameer Yousuf Ali Bhatti &hearts;\t->");
        System.out.println("\n**********************************************************");
        while(true){
            display();
            System.out.println("\n**********************************************************\n");
            inp();
            checkwin();
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
        }  
    }
}