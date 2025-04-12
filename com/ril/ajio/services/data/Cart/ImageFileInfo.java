/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;

public class ImageFileInfo
implements Serializable {
    private String filePath;
    private String fileUri;
    private String imageName;

    public String getFilePath() {
        return this.filePath;
    }

    public String getFileUri() {
        return this.fileUri;
    }

    public String getImageName() {
        return this.imageName;
    }

    public void setFilePath(String string2) {
        this.filePath = string2;
    }

    public void setFileUri(String string2) {
        this.fileUri = string2;
    }

    public void setImageName(String string2) {
        this.imageName = string2;
    }
}

