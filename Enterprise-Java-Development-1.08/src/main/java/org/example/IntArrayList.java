package org.example;

public abstract class IntArrayList implements IntList{

    private int[] array;

    private int size;


    public IntArrayList() {
        this.array = new int[10];
        this.size = 0;
    }


    public void add(int element) {

        if (this.size == this.array.length) {
            int newLength = this.array.length + (this.array.length / 2);
            int[] newArray = new int[newLength];
            // Move all elements over to the new array
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }

        this.array[this.size] = element;
        this.size++;
    }
}