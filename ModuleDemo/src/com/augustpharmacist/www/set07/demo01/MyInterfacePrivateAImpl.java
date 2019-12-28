package com.augustpharmacist.www.set07.demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother() {
        // 直接访问到了接口中的默认方法，这样是错误的！
//        methodCommon();
    }

    @Override
    public void methodCommon() {

    }
}
