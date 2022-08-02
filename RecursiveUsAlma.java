/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursiveusalma;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class RecursiveUsAlma {

    /**
     * @param args the command line arguments
     */
    
    static int usAl(int a,int b){
        if(b==0){
            return 1;
        }else{
            return (a*usAl(a, b-1));
        }
        
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Taban Sayisini Giriniz:");
        int x=input.nextInt();
        System.out.print("Us Sayisini Giriniz:");
        int y=input.nextInt();
        System.out.println("Sonuc:"+usAl(x,y));
        
        
        
    }
    
}
