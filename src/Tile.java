import java.awt.image.BufferedImage;

public class Tile {
    public char character = '?';
    public BufferedImage image = null;
    public boolean solid = false;
    public boolean dangerous = false;
    public boolean spawn = false;
    public Character replace = null;
    public double speed = 0.4;
    public boolean jump = true;
    public boolean defaultchar = false;
}