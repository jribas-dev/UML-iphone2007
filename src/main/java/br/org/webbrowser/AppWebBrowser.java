package br.org.webbrowser;

public class AppWebBrowser implements WebBrowser{
    @Override
    public void showPage() {
        System.out.println("Showing page from App");
    }

    @Override
    public void newProcess() {
        System.out.println("New Process from App");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page from App");
    }
}
