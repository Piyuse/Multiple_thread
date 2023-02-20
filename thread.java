import java.util.*;
import java.lang.*;

    class Runnable1 implements Runnable{
        public void run(){
            
            Scanner S=new Scanner(System.in);
            System.out.println("enter the number whose multiplication table is needed to found first");
            int n1=S.nextInt();
            for(int i=1;i<10;i++){
                System.out.println(n1*i);


            }
        }
    }
  class  Runnable2 implements Runnable{
    public void run(){
        Scanner S=new Scanner(System.in);
        System.out.println("enter the number whose multiplication table is needed to found");
        int n2=S.nextInt();
        for(int i=1;i<10;i++){
            System.out.println(n2*i);


    }
  }
  }

        

    
    
public class thread {

public static void main(String args[]){
 Runnable r1=new Runnable1();
 Thread t1=new Thread(r1);
 t1.start();
 
 Runnable r2=new Runnable2();
 Thread t2=new Thread(r2);
 t2.start();
}
}