package org.example;

public abstract class IntVector implements IntList {

    private int[] array;

    private int size;


    public IntVector() {
        this.array = new int[20];
        this.size = 0;
    }


    public void add(int element) {

        if (this.size == this.array.length) {
            int[] newArray = new int[this.array.length * 2];

            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }

        this.array[this.size] = element;
        this.size++;
    }

}
