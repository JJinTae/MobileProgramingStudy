package com.example.mobileprogramingstudy;

import android.graphics.drawable.shapes.RectShape;

import java.util.ArrayList;
import java.util.List;

public class Sandbox extends RectShape {
    private List<String> mGreetings = new ArrayList<>();

    public List<String> getmGreetings() {
        return mGreetings;
    }

    public void setmGreetings(List<String> mGreetings) {
        this.mGreetings = mGreetings;
    }

    public Sandbox() {
    }

    @Override
    public String toString() {
        return "Sandbox{" +
                "mGreetings=" + mGreetings +
                '}';
    }
}


