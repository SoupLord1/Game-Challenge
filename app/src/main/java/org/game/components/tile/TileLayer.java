package org.game.components.tile;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TileLayer {
    public Image texture;
    public ToolType requiredTool;
    public int hardness;
    public ImageView imageView = new ImageView();
    

    public TileLayer(Image texture, ToolType requiredTool, int hardness) {
        this.texture = texture;
        this.requiredTool = requiredTool;
        this.hardness = hardness;
        imageView.setImage(texture);
    }
}
