package com.example.recyclerview;

public class TestItem {
    private int mImageResource;
    private  String mText;

    public TestItem(int imageResource, String text) {
        mImageResource = imageResource;
        mText = text;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText() {
        return mText;
    }
}
