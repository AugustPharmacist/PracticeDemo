package com.augustpharmacist.www;

import java.io.File;

class test{
    public static void main(String[] args) {
        File file = new File("/Users/august/Desktop/00 讲义+笔记+资料/0 Java基础/01.Java基础语法");
        System.out.println(file.exists());
        System.out.println(file);
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.toString());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println();

        File d1 = new File("/Users/august/Desktop/00 讲义+笔记+资料/0 Java基础/01.Java基础语法/百度云SVIP长期免费使用.url");
        File d2 = new File("/Users/august/Desktop/00 讲义+笔记+资料/0 Java基础/01.Java基础语法/本教程由我爱学it提供.url");
        File d3 = new File("/Users/august/Desktop/00 讲义+笔记+资料/0 Java基础/01.Java基础语法/高清电子书籍.url");
        File d4 = new File("/Users/august/Desktop/00 讲义+笔记+资料/0 Java基础/01.Java基础语法/更多精品教程.url");
        File d5 = new File("/Users/august/Desktop/00 讲义+笔记+资料/0 Java基础/01.Java基础语法/下载必看.txt");
        System.out.println(d1.exists()+" "+d2.exists()+" "+d3.exists()+" "+d4.exists()+" "+d5.exists());
        System.gc();
        System.out.println(d1.delete()+" "+d2.delete()+" "+d3.delete()+" "+d4.delete()+" "+d5.delete());

    }
}