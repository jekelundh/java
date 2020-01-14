import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
public class Enum {
 
    public enum Season{
        SPRING, SUMMER, FALL, WINTER              //Fördefinierade värden på variabeln Season
    }
 
    public static Season season = Season.SPRING;  //Skapar en datatyp av typen enum. Sätter värdet till SPRING
 
    public static void main (String args[]){
 
        System.out.println(season);               //Skriver ut SPRING
        season = Season.SUMMER;                   //Sätter värdet på season till SUMMER
        System.out.println(season);               //Skriver ut SUMMER
        season = Season.FALL;                     //Sätter värdet på season till FALL
        System.out.println(season);               //Skriver ut FALL
        season = Season.WINTER;                   //Sätter värdet på season till WINTER
        System.out.println(season);               //Skriver ut WINTER
 
        season =  Season.SPRING;                  //Kraschar programmet, AUTUMN är inte fördefinierad som tillåten variabel i Season
 
    }
}
