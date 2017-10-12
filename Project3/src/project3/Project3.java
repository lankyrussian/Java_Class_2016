/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jaws4
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static int generateMarblePilePls(){
        Random rand = new Random();
        int numberPile = rand.nextInt(91)+10; 
        return numberPile;
    }
    
    public static int smartComputer(int pileHard){
        int totake=0;
        if (pileHard>63){
            totake = pileHard-63;
        }
        else if (pileHard>31){
            totake = pileHard-31;
        }
        else if (pileHard>15){
            totake = pileHard-15;
        }
        else if (pileHard>7){
            totake = pileHard-7;
        }
        else if (pileHard>3){
            totake = pileHard-3;
        }
        else {
            totake = 1;
        }
        return totake;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yes or no? (answer with y or n, but please choose y, i'm begging you");
        String a = scanner.next();
        while (!(a.equals("y")||a.equals("n")))
        {
            System.out.println("ayo answer y, only y, no other choice, just y");
            a = scanner.next();
        }
        if (a.equals("y")){
            System.out.println("okey dokey");
            System.out.println("easy peasy or lemon squeezy? (e or h)");
            String b = scanner.next();
            while (!(b.equals("e")||b.equals("h"))){
                System.out.println("is english your first language? choose e or h");
                b = scanner.next();
            }
            int pile = generateMarblePilePls();
            Random rand = new Random();
            int whoGoes = rand.nextInt(2);
            while (pile>0){
                System.out.println("number of marbles in your big ol' pile is "+pile);
                int totake = 0;
                if (whoGoes==0){
                    System.out.println("you, go! chews #");
                    while(true){
                        totake = scanner.nextInt();
                        if(pile == 1 && totake>1){
                            System.out.println("you are taking too much boyo");
                        }
                        else if (pile > 1 && totake>(pile/2)){
                            System.out.println("u take 2 much! lessen it boyo");
                        }
                        else if (totake<1){
                            System.out.println("2smol, make bigg'r");
                        }
                        else{
                            break;
                        }
                    }
                    System.out.println(totake+" was taken from the pile by you");
                    whoGoes = 1;
                }
                else if (whoGoes==1){
                    System.out.println("wait boy, compooter go");
                    if (b.equals("e")){
                        if (pile == 1 || pile/2 == 1){
                            totake = 1;
                        }
                        else{
                            totake = rand.nextInt(pile/2)+1;
                        }
                    }
                    else {
                        totake=smartComputer(pile);
                    }
                    System.out.println(totake+" was taken from the pile by Kompyuter");
                    whoGoes = 0;
                }
                
                pile = pile-totake;
                if (pile == 0){
                    if (whoGoes==1){
                        System.out.println("you lose big girl, try again next time on family feud!");
                    }
                    else if (whoGoes == 0){
                        System.out.println("you won ww3!!!!!!1111!!!1");
                    } 
                    break;
                }
            }
        }
        else if (a.equals("n")){
            System.out.println("k fine");
        }
    } 
}
