/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thrPkg;

import static java.lang.Thread.sleep;

/**
 *
 * @author SaiF El-deen
 */
public class SimpleThread2 extends Thread{
    
    String name;

    public SimpleThread2(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        for (int i=0; i < 10; i++){
            System.out.println(i + " " + name );
            try{
                sleep((int) (Math.random()* 1000));
                
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Done!" + name);
    }
}