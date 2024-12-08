package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is a test");
        int num =0;
        int x=1;

        int moy =8;

        if (moy>10){
            System.out.println("Success !");
        }
        else if (moy<7){
            System.out.println("Fail !");
        }
        else if (moy<10){
            System.out.println("Controle !");
        }

        if (num>0){
            System.out.println("postive number");
        }
        else if (num<0){
            System.out.println("negative number");
        }
        else if(num==0){
            System.out.println("zero");
        }
        while (x<=7){
            System.out.println("X is good number");
            x++;
        }
        if (x==13){
            System.out.println("X is bad number");
        }
        else if (x==14){
            System.out.println("X is very bad number");
        }
    }
}