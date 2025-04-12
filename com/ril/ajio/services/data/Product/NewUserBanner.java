/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

public final class NewUserBanner {
    private String newUserImageUrl;
    private String returningUserImageUrl;
    private String uId;
    private Boolean visible;

    public final String getNewUserImageUrl() {
        return this.newUserImageUrl;
    }

    public final String getReturningUserImageUrl() {
        return this.returningUserImageUrl;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public final String getuId() {
        return this.uId;
    }

    public final void setNewUserImageUrl(String string2) {
        this.newUserImageUrl = string2;
    }

    public final void setReturningUserImageUrl(String string2) {
        this.returningUserImageUrl = string2;
    }

    public final void setVisible(Boolean bl2) {
        this.visible = bl2;
    }

    public final void setuId(String string2) {
        this.uId = string2;
    }
}

