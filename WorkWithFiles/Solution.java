package com.company;

import java.io.File;

public class Solution {
    public static void main(String[] args) throws Exception {
        File file = new File("temp.txt");
        if(!file.exists())
        {
           // file.createNewFile(); create file
            file.mkdir(); // create directory
            System.out.println("exists");
        }

        if(file.isDirectory()){
            System.out.println("dir");
        }
        if(file.isFile()){
            System.out.println("file");
        }
        file.delete();
    }
}
