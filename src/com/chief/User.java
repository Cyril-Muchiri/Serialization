package com.chief;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;

    public void sayHello()
    {
        System.out.println("Info saved for "+name+" :)");
    }
}
