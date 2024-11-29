package org.example;

public record Color(int r, int g, int b, int alpha) {
    public Color {
        if (r < 0 || g < 0 || b < 0 || alpha < 0 || r > 255 || g > 255 || b
                > 255 || alpha > 255) {
            throw new IllegalArgumentException("Valid data provided");
        }
    }
    public Color(){
        this(0, 0, 0, 255);
    }

    public Color(int r, int g, int b){
        this(r, g, b, 255);
    }
}