import java.util.Scanner;

public class whichColor {
    //declares variables for the pixels to be checked
    static int r, g, b;

    //assigns rgb values
    public void returnColor(int[] x) {
        r = x[0];
        g = x[1];
        b = x[2];
    }

    public static String colorLevel(int r, int g, int b) {
        int Red = 0, Blue = 0, Green = 0;
        String color;

        //averages values of r, g, and b
        if (r > 0 && r <= 32) {
            Red = 0;
        } else if (r > 32 && r <= 64) {
            Red = 64;
        } else if (r > 64 && r <= 96) {
            Red = 64;
        }
        if (r > 96 && r <= 128) {
            Red = 128;
        } else if (r > 128 && r <= 160) {
            Red = 128;
        } else if (r > 160 && r <= 192) {
            Red = 192;
        } else if (r > 192 && r <= 223) {
            Red = 192;
        } else if (r > 223 && r <= 255) {
            Red = 255;
        }
        if (g > 0 && g <= 32) {
            Green = 0;
        } else if (g > 32 && g <= 64) {
            Green = 64;
        } else if (g > 64 && g <= 96) {
            Green = 64;
        }
        if (g > 96 && g <= 128) {
            Green = 128;
        } else if (g > 128 && g <= 160) {
            Green = 128;
        } else if (g > 160 && g <= 192) {
            Green = 192;
        } else if (g > 192 && g <= 223) {
            Green = 192;
        } else if (g > 223 && g <= 255) {
            Green = 255;
        }
        if (b > 0 && b <= 32) {
            Blue = 0;
        } else if (b > 32 && b <= 64) {
            Blue = 64;
        } else if (b > 64 && b <= 96) {
            Blue = 64;
        }
        if (b > 96 && b <= 128) {
            Blue = 128;
        } else if (b > 128 && b <= 160) {
            Blue = 128;
        } else if (b > 160 && b <= 192) {
            Blue = 192;
        } else if (b > 192 && b <= 223) {
            Blue = 192;
        } else if (b > 223 && b <= 255) {
            Blue = 255;
        }

        System.out.println("Red Value: " + Red);
        System.out.println("Blue Value: " + Blue);
        System.out.println("Green Value: " + Green);

        String[][][] colors = new String[256][256][256];

        String[] colorList = {“Black”, “White”, “Blue”, “Green”, “Red”, “Navy”, “Lime”, “Dark Green”, “Blue Green”, “
        Sky Blue”, “Sea Green”, “Teal”, “Light Green”, “Mint”, “Cyan”, “Maroon”, “Purple”, “Dark Purple”, “Olive”, “Gray”, “
        Dark Gray”, “Forest Green”, “Baby Blue”, “Dark Green”,"Bluish Purple", "Brown", "Burgundy", "Pale Blue”,  "
        Blue - Gray ", " Yellow - Green ", “Pale Green”, ", “Light Blue”, “Dark Red”, “Crimson”, “Light Brown”, “
        Dark Yellow”, “Dark Orange”, “Pale Red”, “Light Purple”, “Fuschia”, “Dirty Silver”, “Silver”, “Pink”, “
        Grape Purple”, “Dark Pink”, “Pale Pink”, “Orange”, “Salmon”, “Yellow - Orange”, “Light Orange”, “Pale Orange”, “
        Pale Yellow”, “Khaki” };

        colors[0][0][0] = "Black";
        colors[0][0][64] = "Navy";
        colors[0][0][128] = "Navy";
        colors[0][0][192] = "Blue";
        colors[0][0][255] = "Blue";
        colors[0][64][0] = "Dark Green";
        colors[0][64][64] = "Blue Green";
        colors[0][64][128] = "Blue";
        colors[0][64][192] = "Blue";
        colors[0][64][255] = "Sky Blue";
        colors[0][128][0] = "Green";
        colors[0][128][64] = "Sea Green";
        colors[0][128][128] = "Teal";
        colors[0][128][192] = "Blue";
        colors[0][128][255] = "Sky Blue";
        colors[0][192][0] = "Light Green";
        colors[0][192][64] = "Mint Green";
        colors[0][192][128] = "Sea Green";
        colors[0][192][192] = "Sky Blue";
        colors[0][192][255] = "Sky Blue";
        colors[0][255][0] = "Lime";
        colors[0][255][64] = "Lime";
        colors[0][255][128] = "Mint";
        colors[0][255][192] = "Cyan";
        colors[0][255][255] = "Cyan";

        colors[64][0][0] = "Maroon";
        colors[64][0][64] = "Dark Purple";
        colors[64][0][128] = "Purple";
        colors[64][0][192] = "Blue";
        colors[64][0][255] = "Blue";
        colors[64][64][0] = "Olive";
        colors[64][64][64] = "Dark Gray";
        colors[64][64][128] = "Dark Blue";
        colors[64][64][192] = "Blue";
        colors[64][64][255] = "Sky Blue";
        colors[64][128][0] = "Dark Green";
        colors[64][128][64] = "Forest Green";
        colors[64][128][128] = "Teal";
        colors[64][128][192] = "Sky Blue";
        colors[64][128][255] = "Baby Blue";
        colors[64][192][0] = "Lime";
        colors[64][192][64] = "Light Green";
        colors[64][192][128] = "Sea Green";
        colors[64][192][192] = "Sky Blue";
        colors[64][192][255] = "Sky Blue";
        colors[64][255][0] = "Lime";
        colors[64][255][64] = "Lime";
        colors[64][255][128] = "Mint";
        colors[64][255][192] = "Sky Blue";
        colors[64][255][255] = "Cyan";

        colors[128][0][0] = "Maroon";
        colors[128][0][64] = "Purple";
        colors[128][0][128] = "Purple";
        colors[128][0][192] = "Purple";
        colors[128][0][255] = "Bluish Purple";
        colors[128][64][0] = "Brown";
        colors[128][64][64] = "Burgundy";
        colors[128][64][128] = "Light Purple";
        colors[128][64][192] = "Light pruple";
        colors[128][64][255] = "Pale Blue";
        colors[128][128][0] = "Olive";
        colors[128][128][64] = "Olive";
        colors[128][128][128] = "Gray";
        colors[128][128][192] = "Blue-Gray";
        colors[128][128][255] = "Sky Blue";
        colors[128][192][0] = "Yellow-Green";
        colors[128][192][64] = "Pale Green";
        colors[128][192][128] = "Pale Green";
        colors[128][192][192] = "Pale Blue";
        colors[128][192][255] = "Cyan";
        colors[128][255][0] = "Lime";
        colors[128][255][64] = "Pale Green";
        colors[128][255][128] = "Pale Green";
        colors[128][255][192] = "Light Blue";
        colors[128][255][255] = "Cyan";

        colors[192][0][0] = "Dark Red";
        colors[192][0][64] = "Crimson";
        colors[192][0][128] = "Light Brown";
        colors[192][0][192] = "Dark Yellow";
        colors[192][0][255] = "Yellow-Green";
        colors[192][64][0] = "Dark Orange";
        colors[192][64][64] = "Pale Red";
        colors[192][64][128] = "Purple";
        colors[192][64][192] = "Purple";
        colors[192][64][255] = "Light Purple";
        colors[192][128][0] = "Brown";
        colors[192][128][64] = "Light Brown";
        colors[192][128][128] = "Fuschia";
        colors[192][128][192] = "Fuschia";
        colors[192][128][255] = "Fuschia";
        colors[192][192][0] = "Dark-Yellow";
        colors[192][192][64] = "Dark Yellow";
        colors[192][192][128] = "Dirty Silver";
        colors[192][192][192] = "Silver";
        colors[192][192][255] = "Baby Blue";
        colors[192][255][0] = "Dark Yellow";
        colors[192][255][64] = "Yellow Green";
        colors[192][255][128] = "Yellow Green";
        colors[192][255][192] = "Mint";
        colors[192][255][255] = "Baby Blue";

        colors[255][0][0] = "Red";
        colors[255][0][64] = "Red";
        colors[255][0][128] = "Pink";
        colors[255][0][192] = "Dark Pink";
        colors[255][0][255] = "Grape Purple";
        colors[255][64][0] = "Orange";
        colors[255][64][64] = "Salmon";
        colors[255][64][128] = "Pink";
        colors[255][64][192] = "Dark Pink";
        colors[255][64][255] = "Pink";
        colors[255][128][0] = "Orange";
        colors[255][128][64] = "Orange";
        colors[255][128][128] = "Salmon";
        colors[255][128][192] = "Pale Pink";
        colors[255][128][255] = "Pale Pink";
        colors[255][192][0] = "Yellow-Orange";
        colors[255][192][64] = "Light Orange";
        colors[255][192][128] = "Pale Orange";
        colors[255][192][192] = "Pale Pink";
        colors[255][192][255] = "Pale Pink";
        colors[255][255][0] = "Yellow";
        colors[255][255][64] = "Yellow";
        colors[255][255][128] = "Pale Yellow";
        colors[255][255][192] = "Khaki";
        colors[255][255][255] = "White";

        return colors[Red][Green][Blue];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            r = scan.nextInt();
            g = scan.nextInt();
            b = scan.nextInt();
            System.out.println(colorLevel(r, g, b));
        }
    }
}


