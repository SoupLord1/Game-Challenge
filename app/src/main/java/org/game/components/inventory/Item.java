package org.game.components.inventory;

import javafx.scene.image.Image;

public class Item {
    private final String name;
    private int amount;
    private final int id;
    private final int maxStack;
    private Image icon;
    private boolean consumable;
    private final String category;
  
    
    public Item(String name, int id, int amount, int maxStack, Image icon, boolean consumable, String category) {
        this.name = name;
        this.id = id;
        this.amount = amount;
        this.icon = icon;
        this.consumable = consumable;
        this.category = category;
        this.maxStack = maxStack;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public int getId() {
        return id;
    }

    public Image getIcon() {
        return icon;
    }

    public void setIcon(Image icon) {
        this.icon = icon;
    }

    public boolean isConsumable() {
        return consumable;
    }

    public void setConsumable(boolean consumable) {
        this.consumable = consumable;
    }

    public String getCategory() {
        return category;
    }

    public int getMaxStack() {
        return maxStack;
    }
}