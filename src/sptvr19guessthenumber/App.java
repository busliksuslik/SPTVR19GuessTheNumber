/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19guessthenumber;

import java.util.Random;
import java.util.Scanner;


class App {
    private final Scanner scan = new Scanner(System.in);
    private final Random rand = new Random();
    public void run(){
        while (true){
            int hidden = rand.nextInt(10);
            int concid = 0;
            int numoftryes = 0;
            String choise;
            System.out.printf("Number is guessed\n");
            while(true){
                System.out.println("write concidered number: ");
                concid = scan.nextInt();
                if (concid < hidden){
                    System.out.println("bigger");
                    numoftryes ++;
                } else if (concid > hidden){
                    System.out.println("smaller");
                    numoftryes ++;
                } else if (concid == hidden){
                    System.out.printf("Done in %d attempts %n", numoftryes);
                    break;
                }
            }
            System.out.println("Do you want to continue? Y/N");
            scan.nextLine();
            choise = scan.nextLine();
            if (choise.equals("N")||choise.equals("n")){
                break;
            }
            }
        }
    }
