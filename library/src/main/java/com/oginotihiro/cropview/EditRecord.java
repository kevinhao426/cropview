package com.oginotihiro.cropview;

import android.graphics.RectF;
import android.net.Uri;

public class EditRecord {
    private Uri uri;
    private float scale;
    private float transLeft;
    private float transTop;

    public EditRecord(Uri uri, float scale, float transLeft, float transTop) {
        this.uri = uri;
        this.scale = scale;
        this.transLeft = transLeft;
        this.transTop = transTop;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public float getTransLeft() {
        return transLeft;
    }

    public void setTransLeft(float transLeft) {
        this.transLeft = transLeft;
    }

    public float getTransTop() {
        return transTop;
    }

    public void setTransTop(float transTop) {
        this.transTop = transTop;
    }
}
