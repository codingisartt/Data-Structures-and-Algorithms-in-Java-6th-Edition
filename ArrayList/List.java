package com.tuba.ArrayList;

public interface List <E>{
    /** A simplified version of the java.util.List interface. */
    int size();
    boolean isEmpty();
    E get(int i) throws IndexOutOfBoundsException;
    E set (int i,E e) throws IndexOutOfBoundsException;
    void add(int i,E e) throws IndexOutOfBoundsException;
    E remove (int i) throws IndexOutOfBoundsException;
}

