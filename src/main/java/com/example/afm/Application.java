package com.example.afm;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) throws Exception {

        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            factory = new MacFactory();
        } else if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else {
            throw new Exception("Unknown operating system");
        }

        Application app = new Application(factory);
        app.paint(); // A
    }
}
