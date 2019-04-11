package com.oginotihiro.cropview;

import android.graphics.Rect;
import android.net.Uri;

public class CropStatusInfo {
    Uri sourceUri;
    Rect cropRect;
    int outputX;
    int outputY;
    int ifRotation;

    public CropStatusInfo(Uri sourceUri, Rect cropRect, int outputX, int outputY, int ifRotation) {
        this.sourceUri = sourceUri;
        this.cropRect = cropRect;
        this.outputX = outputX;
        this.outputY = outputY;
        this.ifRotation = ifRotation;
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
}
