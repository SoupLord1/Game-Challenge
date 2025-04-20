package org.game.components.inventory;

import java.util.ArrayList;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;

public class Inventory extends ArrayList<Item>{
    int maxSlots;
    public Inventory() {
        this.maxSlots = 30;
        for (int i = 0; i < maxSlots; i++) {
            // this.add(i, new Slot());
        }
    
    }

    public void showInventory(Object parent) {
        BorderPane basePane = new BorderPane();
        basePane.setPrefSize(800, 600);
        basePane.setStyle("-fx-background-color:rgb(243, 233, 233); -fx-border-color:rgb(0, 0, 0); -fx-border-width: 2px;");
        basePane.setVisible(true);

        TilePane slotPane = new TilePane();
        slotPane.setPrefSize(800, 600);
        slotPane.setStyle("-fx-background-color:rgb(34, 31, 31)");
        slotPane.setHgap(10);
        slotPane.setVgap(10);
        slotPane.setPrefColumns(10);
    }
    public void RenderSlots() {

    }
    public void addItem(Item item, int slotNum, int amount) {
        this.add(slotNum, item);
    }
    public void removeItem(int slotNum) {
        this.remove(slotNum);
    }
}