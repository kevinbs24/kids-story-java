package storyBook;

public class Main {

    public static void main(String[] args) {
        Window window = new Window();
        window.createStoryWindow();
        Pages pages = new Pages(window);
        ButtonHandler bh = new ButtonHandler(pages);
        window.setButtonHandler(bh);
    }
}
