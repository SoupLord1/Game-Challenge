package org.game.components.inventory;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class Slot extends BorderPane{
    private Item item;
    private Image image;
    private ImageView imageContainer;
    private Label amountLabel;
    public Slot(Item item) {
        this.item = item;
        this.setPrefSize(50, 50);
        this.setStyle("-fx-background-color:rgb(201, 198, 198); -fx-border-color:rgb(0, 0, 0); -fx-border-width: 1px;");
        this.setCenter(imageContainer);
        this.setBottom(amountLabel);
        this.update();
    }
    public void update() {
        if (item != null) {
            imageContainer.setImage(item.getIcon());
            amountLabel.setText(String.valueOf(item.getAmount()));
        }
    }
    
}
