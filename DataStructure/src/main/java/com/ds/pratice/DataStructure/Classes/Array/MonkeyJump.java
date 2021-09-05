package com.ds.pratice.DataStructure.Classes.Array;

public class MonkeyJump {

    public static void main(String[] args) {
        MonkeyJump m = new MonkeyJump();
        System.out.println("Monkey 2 Jump at Max can be done in   " + m.monekyJump(4));

    }
//For 3 jump make else statement monekyJump(n-1) + monekyJump(n-2) + monekyJump(n-3) and so on.
    public int monekyJump(int n){

        if(n ==1){
            return 1;
        }else if(n ==2){
            return 2;
        }

        return monekyJump(n-1) + monekyJump(n-2);
    }
}
