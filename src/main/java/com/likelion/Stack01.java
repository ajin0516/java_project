package com.likelion;

public class Stack01 {

    private int[] arr = new int[10000];
    private int pointer = 0;

    // 기본값
    public  Stack01(){}

    // 개수 설정
    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value){
        // 10 arr[10]
        // 20 arr[20]
        this.arr[this.pointer] = value;
        this.pointer ++;
    }
    public int pop(){
        // push 10 push 20 point 2
        int value = this.arr[this.pointer-1];
        this.pointer--;
        return value;
    }

    public int[] getArr(){
        return arr;
    }
}
