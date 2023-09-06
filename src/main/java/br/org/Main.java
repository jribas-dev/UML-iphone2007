package br.org;

import br.org.cellphone.CellPhone;
import br.org.iphone2007.IPhone2007;
import br.org.midiaplayer.MidiaPlayer;
import br.org.webbrowser.WebBrowser;

public class Main {
    public static void main(String[] args) {
        IPhone2007 iphone = new IPhone2007();

        ((CellPhone) iphone).call("+5516992135544");
        ((CellPhone) iphone).answer();
        ((CellPhone) iphone).voiceMessage();

        ((MidiaPlayer) iphone).select();
        ((MidiaPlayer) iphone).play();
        ((MidiaPlayer) iphone).pause();

        ((WebBrowser) iphone).newProcess();
        ((WebBrowser) iphone).showPage();
        ((WebBrowser) iphone).refreshPage();
    }
}