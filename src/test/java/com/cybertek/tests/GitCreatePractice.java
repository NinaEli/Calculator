package com.cybertek.tests;

public class GitCreatePractice {
    public static void main(String[] args) {
        System.out.println("I love Java");
        /*
        Craete git Repository:
        1.git init-->hiiden file .git/
        see history of version of your code-->git log
         */
        String word= "Java";
        System.out.println("My favorite language is "+word);
        System.out.println(word.charAt(word.indexOf('v')));
        System.out.println(word.substring(1,2));

        for (int i=0; i<=word.length()-1;i++){
            System.out.println(word.charAt(i));
        }
    }
}
