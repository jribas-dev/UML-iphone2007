package br.org.midiaplayer;

public class AppMidiaPlayer implements MidiaPlayer{
    @Override
    public void play() {
        System.out.println("Play midia from App");
    }

    @Override
    public void pause() {
        System.out.println("Pause midia from App");
    }

    @Override
    public void select() {
        System.out.println("Select midia from App");
    }
}
