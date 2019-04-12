package com.oginotihiro.cropview;

import android.graphics.Rect;
import android.net.Uri;

public class CropStatusInfo {
    private Uri sourceUri;
    private  Rect cropRect;
    private  int outputX;
    private  int outputY;
    private  int ifRotation;
    private float scale;
    private float targetLeft;
    private float targetTop;

    public CropStatusInfo(Uri sourceUri, Rect cropRect,
                          int outputX, int outputY,
                          int ifRotation, float scale,
                          float targetLeft, float targetTop) {
        this.sourceUri = sourceUri;
        this.cropRect = cropRect;
        this.outputX = outputX;
        this.outputY = outputY;
        this.ifRotation = ifRotation;
        this.scale = scale;
        this.targetLeft = targetLeft;
        this.targetTop = targetTop;
    }

    public Uri getSourceUri() {
        return sourceUri;
    }

    public void setSourceUri(Uri sourceUri) {
        this.sourceUri = sourceUri;
    }

    public Rect getCropRect() {
        return cropRect;
    }

    public void setCropRect(Rect cropRect) {
        this.cropRect = cropRect;
    }

    public int getOutputX() {
        return outputX;
    }

    public void setOutputX(int outputX) {
        this.outputX = outputX;
    }

    public int getOutputY() {
        return outputY;
    }

    public void setOutputY(int outputY) {
        this.outputY = outputY;
    }

    public int getIfRotation() {
        return ifRotation;
    }

    public void setIfRotation(int ifRotation) {
        this.ifRotation = ifRotation;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public float getTargetLeft() {
        return targetLeft;
    }

    public void setTargetLeft(float targetLeft) {
        this.targetLeft = targetLeft;
    }

    public float getTargetTop() {
        return targetTop;
    }

    public void setTargetTop(float targetTop) {
        this.targetTop = targetTop;
    }
}
