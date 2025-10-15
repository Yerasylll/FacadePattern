package com.company;

public class Client {
    public static void main(String[] args) {

        HomeTheatreFacade homeTheatre = new HomeTheatreFacade();

        homeTheatre.watchMovie("Inception");

        System.out.println();

        homeTheatre.endMovie();
    }
}