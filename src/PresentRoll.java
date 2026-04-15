import java.util.Scanner;
//enter the missing roll number and donot print the name of the absent roll number
public class PresentRoll {
    public static void main(String[] args) {
        int i = 0, missing = 3;
    int roll [] = {9,8,3,4,2,6};
    String names[] = {"Ranita","Akashi","Megha","Rani","Mou","Ria"};
        while (i < roll.length) {
            if (roll[i]!=missing) System.out.println(names[i]); i++;
        }
    }
}