package storyBook;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Pages {

    int currentPage = 0;
    Window window;
    ArrayList<Page> pages = new ArrayList<>();

    public Pages(Window window) {
        this.window = window;
        initPages();
    }

    private void initPages() {
        pages.add(new Page("The Four Stars of Everlight Forest", window.cover));
        pages.add(new Page("In the heart of a fading forest, where the stars no "
        		+ "longer shone, four small lights began to glow.", window.page1));
        pages.add(new Page("The first was Sarah, the Star of Memory. Her songs "
        		+ "brought light to old places. With each note, the forest whispered "
        		+ "secrets only she could hear.", window.page2));
        pages.add(new Page("The second was Abel, the Star of Courage. He charged "
        		+ "into the unknown, his steps strong and sure. Shadows feared his "
        		+ "brave heart.", window.page3));
        pages.add(new Page("Then came Lucy, the Star of Wonder. Every rock, leaf, "
        		+ "and stream held magic when she looked. She could see what others "
        		+ "missed.", window.page4));
        pages.add(new Page("And the tiniest star was Khloe, the Star of Joy. When "
        		+ "she giggled, flowers bloomed. When she smiled, even the clouds "
        		+ "softened.", window.page5));
        pages.add(new Page("One night, a quiet voice echoed from the center of the forest. "
        		+ "\"Help us,\" it whispered. \"The light is fading. Only you four can bring "
        		+ "it back.\"", window.page6));
        pages.add(new Page("The four stars traveled together — singing songs, facing winds, "
        		+ "uncovering ancient roots. And everywhere they went, light returned.", window.page7));
        pages.add(new Page("When they reached the heart of the forest, they joined hands. "
        		+ "A glow rose from them all — memory, courage, wonder, and joy — and the "
        		+ "stars above returned.", window.page8));

        showPage(currentPage);
    }

    public void nextPage() {
        if (currentPage < pages.size() - 1) {
            currentPage++;
            showPage(currentPage);
        }
    }

    public void previousPage() {
        if (currentPage > 0) {
            currentPage--;
            showPage(currentPage);
        }
    }

    private void showPage(int index) {
        Page p = pages.get(index);
        window.gameText.setText(p.text);
        window.gamePicLabel.setIcon(p.image);
    }
}
