package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {

    public static void main(String[] args) {

        try ( BufferedReader br = new BufferedReader(new FileReader("src/main/resources/lorem.txt"))) {
            String l;
            while ((l = br.readLine()) != null) {
                System.out.println(l);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
