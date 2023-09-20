package System.TextureLoader;

import System.Setup.Setup;
import processing.core.PImage;

public class Texture{
    protected PImage texture;
    protected String name;

    public Texture(String path, String n) {
        PImage img = Setup.getApplet().loadImage(path);
        PGraphics g = createGraphics(img.width, img.height, P3D);
        g.image(img,0,0);
        ((PGraphicsOpenGL) g).textureSampling(2);
        texture = g.get();
        name = n;
    }

    public PImage getTexture() {
        return texture;
    }

    public void setTexture(PImage texture) {
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void update(){}
}
