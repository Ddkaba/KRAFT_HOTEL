package com.example.kraft_hotel;

public class Partner {
    private int Image;
    private String URL;

    public Partner(int image, String URL) {
        Image = image;
        this.URL = URL;
    }


    public int getImage() { return Image; }
    public String getURL() { return URL; }
    public void setImage(int image) { Image = image; }
    public void setURL(String URL) { this.URL = URL; }
}
