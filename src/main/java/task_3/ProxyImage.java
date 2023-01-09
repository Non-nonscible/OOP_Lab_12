package task_3;

public class ProxyImage implements MyImage{



    private final String str;

    public ProxyImage(String str) {
        this.str = str;
    }
    @Override
    public void display() {
        RealImage realImage = new RealImage(str);
        realImage.display();
    }
}
