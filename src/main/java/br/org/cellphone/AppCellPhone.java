package br.org.cellphone;

public class AppCellPhone implements CellPhone{
    @Override
    public void call(String number) {
        System.out.println("Calling "+number+ " from App");
    }

    @Override
    public void answer() {
        System.out.println("Answering call from App");
    }

    @Override
    public void voiceMessage() {
        System.out.println("Voice mail started from App");
    }
}
