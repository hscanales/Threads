/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hectorcanalessv.thread;

import javax.swing.JLabel;

/**
 *
 * @author estudiante
 */
public class AnimalThread extends Thread {
    private String nombre;
    private int limite;
    private JLabel animal;
    private int x,y;

    public AnimalThread() {
    }

    /**
     *
     * @param nombre
     * @param x
     * @param y
     * @param limite
     * @param animal
     */
    public AnimalThread(String nombre, int x,int y, int limite, JLabel animal) {
        this.nombre = nombre;
        this.limite = limite;
        this.animal = animal;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void run()
    {   
        if(this.nombre=="tortuga"){
        for(int i=x;i<this.limite;i+=10){
            //
            //System.out.println(this.nombre+" avanza");
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            }catch( InterruptedException e){
                e.printStackTrace();
            }
        }
        
        for(int i=limite;i>10;i-=10){
            //
            //System.out.println(this.nombre+" avanza");
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            }catch( InterruptedException e){
                e.printStackTrace();
            }
        }
        }else{
        if(this.nombre=="dragon"){
            //System.out.println(x);
                    for(int i=x;i<this.limite;i+=50){
            //System.out.println(this.nombre+" avanza");
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            }catch( InterruptedException e){
                e.printStackTrace();
            }
                    }
                    //System.out.println(x);
                    for(int i=limite-1;i>10;i-=50){
            //System.out.println(this.nombre+" avanza");
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            }catch( InterruptedException e){
                e.printStackTrace();
            }
                    }
        }else{
                if(this.nombre=="canguro"){
                     for(int i=x;i<this.limite;i+=30){
            //System.out.println(this.nombre+" avanza");
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            }catch( InterruptedException e){
                e.printStackTrace();
            }
        }
                 for(int i=limite;i>10;i-=30){
            //System.out.println(this.nombre+" avanza");
            this.animal.setLocation(i,y);
            try{
                sleep(100);
            }catch( InterruptedException e){
                e.printStackTrace();
            }
        }
    }
                }
                
                }                
            System.out.println(this.nombre+" A llegado a la meta");
        yield();
    }    
    }



