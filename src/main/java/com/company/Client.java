package com.company;

public class Client {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        Projector projector = new Projector();
        Lights lights = new Lights();
        Display display = new Display();

        HomeTheatreFacade homeTheatre = new HomeTheatreFacade(speaker, projector, lights, display);

        homeTheatre.watchMovie("Inception");

        System.out.println();

        homeTheatre.endMovie();
    }
}