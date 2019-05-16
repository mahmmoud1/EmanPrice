package com.example.android.emanprice;

public class Word {

    // model name for the word
    private String mModelName;

    // model price of the word
    private String mModelPrice;

    // model image of the word
    private int mImageResourceID;


    public Word(String modelPrice, String modelName, int imageResourceID){
        mModelName = modelName;
        mModelPrice = modelPrice;
        mImageResourceID = imageResourceID;
    }


    // Get the model name
    public  String getModelName() {
        return mModelName;
    }

    // Get the model price
    public  String getModelPrice() {
        return mModelPrice;

    }

    // Get Image of model
    public  int getImageResourceID() {
        return  mImageResourceID;
    }
}
