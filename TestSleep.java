package com.AI;

public class TestSleep extends Thread{
    public void run(){
        for(int i=1;i<3;i++){
            try{Thread.sleep(1000);}
             catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
}
