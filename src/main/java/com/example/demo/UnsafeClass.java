package com.example.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class UnsafeClass {
    public static Object deserialize(InputStream is) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(is);
        return ois.readObject();
    }    
}
