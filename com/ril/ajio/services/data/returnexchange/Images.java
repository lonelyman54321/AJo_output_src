/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import java.io.Serializable;

public class Images
implements Serializable {
    private String altText;
    private String format;
    private String imageType;
    private String url;

    public String getAltText() {
        return this.altText;
    }

    public String getFormat() {
        return this.format;
    }

    public String getImageType() {
        return this.imageType;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAltText(String string2) {
        this.altText = string2;
    }

    public void setFormat(String string2) {
        this.format = string2;
    }

    public void setImageType(String string2) {
        this.imageType = string2;
    }

    public void setUrl(String string2) {
        this.url = string2;
    }
}

