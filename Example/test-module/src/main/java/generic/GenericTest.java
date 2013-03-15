/*
 * Copyright (C) 2013 Cefalo AS. All Rights Reserved. 
 */
package generic;

/**
 * @author : humayun
 * @version 1.0
 */
public class GenericTest {
    public static void main(String args[]) {
        Box<String> b = new Box<>();
        b.set("humayun");
        System.out.println(b.get());

    }
}


class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}