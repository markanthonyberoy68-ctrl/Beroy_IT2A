import java.util.Scanner;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("===JAVA ACTIVITY PORTFOLIO");
    System.out.println("==NAME: MARK ANTHONY BEROY ==");
    System.out.println("===SECTION/YEAR: BSIT2A==");
    System.out.println("=====CONTENTS=====");
    System.out.println("1. ACTIVITY 1");
    System.out.println("2. ACTIVITY 2");
    System.out.println("=====================");
    System.out.print("ENTER SELECTION: ");
    int select = sc.nextInt();

    if(select == 1){
        Activity1 act1 = new Activity1();
        act1.greetUser();
    }else if(select == 2){

    }else{
        System.out.print("Selection not Found!");

    }



}