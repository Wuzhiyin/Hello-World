package com.company;

/**
 * Created by Administrator on 2017/12/22.泳池迷宫答案 第一章 P24
 */
public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x<4){
            System.out.print("a");
            if(x<1){
                System.out.print(" ");
            }
            System.out.print("n");
            if(x>1){
                System.out.print("oyster");
                x= x+1;
            }
            if(x==1){
                System.out.print("noys");
            }
            if(x<1){
                System.out.print("oise");
            }
            System.out.println("");
            x=x+1;
        }
    }
}
