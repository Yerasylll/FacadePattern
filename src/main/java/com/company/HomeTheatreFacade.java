package com.company;

public class HomeTheatreFacade {
    private Speaker speaker;
    private Projector projector;
    private Lights lights;
    private Display display;

    public HomeTheatreFacade(Speaker speaker, Projector projector, Lights lights, Display display) {
        this.speaker = speaker;
        this.projector = projector;
        this.lights = lights;
        this.display = display;
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
