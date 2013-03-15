/*
 * Copyright (C) 2013 Cefalo AS. All Rights Reserved. 
 */
package generic;

/**
 * @author : humayun
 * @version 1.0
 */
class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
