package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
https://javarush.ru/groups/posts/593-bufferedreader-i-bufferedwritter
*/

public class Solution {
public static void main(String[] args) {
		String inputFileName = "file.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line + "\n");
			}
		}
                catch (IOException e) {
			e.printStackTrace();
		}
	}
}
