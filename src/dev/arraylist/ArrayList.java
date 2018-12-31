package dev.arraylist;

import java.util.Vector;

public class ArrayList<E>{
    private Vector<E> vector;

    public ArrayList(){
        vector = new Vector<>();
    }

    public ArrayList(E element){
        vector = new Vector<>();
        vector.add(element);
    }

    public int getSize(){
        return vector.size();
    }

    public void showVector(){
        for(E element : vector){
            System.out.print(element + " ");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(vector.size());
    }
}
