package xyz;

import javax.swing.*;
import java.util.Scanner;

public class fileSix {
    public static void main(String[] args) {
        String num;
        int numCOnverted;
        String[] voters;
        num= JOptionPane.showInputDialog("How many voters?");
        numCOnverted=Integer.parseInt(num);
        voters= new String[numCOnverted];
        for (int i=0;i<numCOnverted;i++){
            voters[i]=JOptionPane.showInputDialog("Enter voter "+(i+1));

        }
        for(int i=0;i<numCOnverted;i++){
            System.out.println((i+1)+". "+voters[i]);
        }

    }
}
