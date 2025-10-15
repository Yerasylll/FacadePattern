package com.company;

public class HomeTheatreFacade {
    private Speaker speaker;
    private Projector projector;
    private Lights lights;
    private Display display;

    public HomeTheatreFacade() {
        this.speaker = new Speaker();
        this.projector = new Projector();
        this.lights = new Lights();
        this.display = new Display();
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie");
        lights.dim(10);
        display.down();
        projector.on();
        projector.setInput("HDMI");
        speaker.on();
        speaker.setVolume(15);
        System.out.println("Playing: " + movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the movie");
        lights.dim(0);
        display.up();
        projector.off();
        speaker.off();
    }
}
