package com.example.android.tourguide;

    public class Item {
        private String itemTitle;
        private int itemImageResourseId;
        private String itemLocation;
        private int itemReviewStar;
        private String itemOverview;
        private String itemNumber;
        private String itemWebSite;



    public Item(String title, int imageResourseId, String location, int reviewStar){
        itemTitle = title;
        itemImageResourseId = imageResourseId;
        itemLocation = location;
        itemReviewStar = reviewStar;
    }

    public Item(String title, int imageResourseId, String location, int reviewStar, String overview, String number, String website){
        itemTitle = title;
        itemImageResourseId = imageResourseId;
        itemLocation = location;
        itemReviewStar = reviewStar;
        itemOverview = overview;
        itemNumber = number;
        itemWebSite = website;


    }

    public String getTitle() {
        return itemTitle;
    }

    public int getImageResourceId() {
        return itemImageResourseId;
    }

    public String getLocation(){
        return itemLocation;
    }

    public int getReviewStar(){
        return itemReviewStar;
    }

    public String getOverview(){
        return itemOverview;
    }

    public String getNumber(){
        return itemNumber;
    }

    public String getWebSite(){
            return itemWebSite;
        }


    }

