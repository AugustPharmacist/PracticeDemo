package com.augustpharmacist;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class DemoYYYYyyyyTest {

    @Test
    public void testFunction() {
        Calendar instance = Calendar.getInstance();

        //2019-12-31
        instance.set(2019,Calendar.DECEMBER,31);
        Date time1 = instance.getTime();

        //2020-01-01
        instance.set(2020,Calendar.JANUARY,1);
        Date time2 = instance.getTime();

        //YYYY
        SimpleDateFormat Y_Format = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(Y_Format.format(time1));
        System.out.println(Y_Format.format(time2));
        Assert.assertEquals("2020-12-31",Y_Format.format(time1));
        Assert.assertEquals("2020-01-01",Y_Format.format(time2));

        //yyyy
        SimpleDateFormat y_Format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(y_Format.format(time1));
        System.out.println(y_Format.format(time2));
        Assert.assertEquals("2019-12-31",y_Format.format(time1));
        Assert.assertEquals("2020-01-01",y_Format.format(time2));
    }
}