package generics;

import java.lang.reflect.Array;
import java.util.*;


public class CustomgenericArraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomgenericArraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public String toString(){ 
        return "CustomArrayList{" +
        "data=" + Arrays.toString(data)+
        ", size=" + size +
        '}';
    }

    public static void main(String[] args) {
        CustomgenericArraylist<Integer> list = new CustomgenericArraylist<>();
        list.add(10);
        list.add(10);
        // list.add("Aaa");  //not allowed because you initialized Integer type ArrayList

        list.remove();
        System.out.println(list.get(0));
        list.set(1,90);
        list.size();
        System.out.println(list);
    }
}
