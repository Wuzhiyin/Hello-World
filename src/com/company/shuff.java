package com.company;

/**
 * Created by Administrator on 2017/12/21.Head First Java 第一章P20 连连看答案
 */
public class shuff {
    public static void main(String[] args) {
        int x = 3;
        if(x>2){
            System.out.print("a");
        }
        while(x>0){
            x=x-1;
            System.out.print("-");
            if(x==2){
                System.out.print("b c");
            }
            if(x==1){
                System.out.print("d");
                x = x-1;
            }
        }
    }
}
