package com.augustpharmacist.www;

import java.io.File;

class test{
    public static void main(String[] args) {
        File file = new File("/Users/august/Desktop/00 讲义+笔记+资料");
        System.out.println(file.exists());
        getAllFile(file);
    }

    private static void getAllFile(File dir) {
        File[] files = dir.listFiles();
        System.out.println(dir.isDirectory());
        for (File file : files) {
           if (file.isDirectory()){
               getAllFile(file);
           }else {
               System.out.println(file);
           }
        }
    }

}