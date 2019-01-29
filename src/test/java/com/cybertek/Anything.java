package com.cybertek;
import com.github.javafaker.Faker;
public class Anything {
    public static void main(String[] args) {
        System.out.println();

        Faker faker = new Faker();
        System.out.println(faker.funnyName().name());
    }
}
