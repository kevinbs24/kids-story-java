package storyBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

    Pages pages;

    public ButtonHandler(Pages pages) {
        this.pages = pages;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == pages.window.nextButton) {
            pages.nextPage();
        } else if (src == pages.window.backButton) {
            pages.previousPage();
        }
    }
}
