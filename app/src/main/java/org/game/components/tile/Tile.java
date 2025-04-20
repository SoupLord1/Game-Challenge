package org.game.components.tile;

import javafx.scene.image.ImageView;

public class Tile {
    public TileLayer background;
    public TileLayer underGround;
    public TileLayer ground;
    public TileLayer surface;

    public ImageView imageView = new ImageView();

    public Tile(TileLayer background, TileLayer underGround, TileLayer ground, TileLayer surface){
        this.background = background;
        this.underGround = underGround;
        this.ground = ground;
        this.surface = surface;

    }
}
