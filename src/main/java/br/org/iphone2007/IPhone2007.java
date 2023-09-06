package br.org.iphone2007;

import br.org.cellphone.CellPhone;
import br.org.midiaplayer.MidiaPlayer;
import br.org.webbrowser.WebBrowser;

public class IPhone2007 implements CellPhone, MidiaPlayer, WebBrowser {
    public void Startup() {
        System.out.println("Operation System has started");
    }
    public void Shutdown() {
        System.out.println("Operation System has been stopped");
    }
    @Override
    public void call(String number) {
        System.out.println("Calling "+number+ " from iPhone");
    }

    @Override
    public void answer() {
        System.out.println("Answering call from iPhone");
    }

    @Override
    public void voiceMessage() {
        System.out.println("Voice mail started from iPhone");
    }

    @Override
    public void play() {
        System.out.println("Play midia from iPhone");
    }

    @Override
    public void pause() {
        System.out.println("Pause midia from iPhone");
    }

    @Override
    public void select() {
        System.out.println("Select midia from iPhone");
    }

    @Override
    public void showPage() {
        System.out.println("Showing page from iPhone");
    }

    @Override
    public void newProcess() {
        System.out.println("New Process from iPhone");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page from iPhone");
    }
}
