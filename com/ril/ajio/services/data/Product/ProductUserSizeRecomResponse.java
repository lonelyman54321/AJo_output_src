/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;

public class ProductUserSizeRecomResponse
implements Serializable {
    private String brandSizeAttribute;
    private String brandSizeFormatAttribute;
    private String brandVoiceMessage;
    private String imageUrl;
    private String sizeName;
    private String universalSizeAttribute;
    private String universalSizeFormatAttribute;
    private String userVoiceMessage;

    public String getBrandSizeAttribute() {
        return this.brandSizeAttribute;
    }

    public String getBrandSizeFormatAttribute() {
        return this.brandSizeFormatAttribute;
    }

    public String getBrandVoiceMessage() {
        return this.brandVoiceMessage;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getSizeName() {
        return this.sizeName;
    }

    public String getUniversalSizeAttribute() {
        return this.universalSizeAttribute;
    }

    public String getUniversalSizeFormatAttribute() {
        return this.universalSizeFormatAttribute;
    }

    public String getUserVoiceMessage() {
        return this.userVoiceMessage;
    }

    public void setBrandVoiceMessage(String string2) {
        this.brandVoiceMessage = string2;
    }

    public void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public void setUserVoiceMessage(String string2) {
        this.userVoiceMessage = string2;
    }
}

