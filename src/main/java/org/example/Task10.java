package org.example;

public class Task10 {
    public static void main(String[] args) {

        String[] color = {"white", "blue", "black", "navy", "red", "yellow", "blue", "black"};
        for (int i = 0; i < color.length; i++) {
            for (int j = i + 1; j < color.length; j++) {
                if (color[i].equals(color[j])) {
                    System.out.println(color[j]);
                }
            }
        }}}