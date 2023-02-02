package com.example.kraft_hotel;

import java.util.ArrayList;

public class Hotel_Room {
    private int id;
    private int picture;
    private String description;
    private String price;
    private String full_description;
    private ArrayList<Integer>Photo;


    public Hotel_Room(int id, int picture, String description, String price, String full_description, ArrayList<Integer> photo) {
        this.id = id;
        this.picture = picture;
        this.description = description;
        this.price = price;
        this.full_description = full_description;
        Photo = photo;
    }

    public int getId() { return id; }
    public int getPicture() { return picture; }
    public String getDescription() { return description; }
    public String getPrice() { return price; }
    public String getFull_description() { return full_description; }
    public ArrayList<Integer> getPhoto() { return Photo; }
    public void setId(int id) { this.id = id; }
    public void setPicture(int picture) { this.picture = picture; }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(String price) { this.price = price; }
    public void setFull_description(String full_description) { this.full_description = full_description; }
    public void setPhoto(ArrayList<Integer> photo) { Photo = photo; }
}
