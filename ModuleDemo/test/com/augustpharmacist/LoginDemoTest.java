package com.augustpharmacist;

import org.junit.Test;

public class LoginDemoTest {

    @Test
    public void login() {
        LoginDemo loginDemo = new LoginDemo();
        loginDemo.login("小明", "666");

    }
}