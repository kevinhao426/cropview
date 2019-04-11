package com.oginotihiro.cropview;

import android.net.Uri;

public class EditRecord {
    private Uri uri;
    private float scale;
    private float leftOffset;
    private float topOffset;
    private int sampleSize;

    public EditRecord(Uri uri, float scale, float leftOffset, float topOffset, int sampleSize) {
        this.uri = uri;
        this.scale = scale;
        this.leftOffset = leftOffset;
        this.topOffset = topOffset;
        this.sampleSize = sampleSize;
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

    public float getLeftOffset() {
        return leftOffset;
    }

    public void setLeftOffset(float leftOffset) {
        this.leftOffset = leftOffset;
    }

    public float getTopOffset() {
        return topOffset;
    }

    public void setTopOffset(float topOffset) {
        this.topOffset = topOffset;
    }

    public int getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(int sampleSize) {
        this.sampleSize = sampleSize;
    }
}
