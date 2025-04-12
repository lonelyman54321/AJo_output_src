/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics;

public final class MyRewardsOption {
    public static final int $stable = 8;
    private boolean isEnabled;
    private boolean isNewTag;
    private String title;
    private String urlEndPoint;
    private String webUrlLink;

    public MyRewardsOption() {
        String string2;
        this.title = string2 = "";
        this.webUrlLink = string2;
        this.urlEndPoint = string2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrlEndPoint() {
        return this.urlEndPoint;
    }

    public final String getWebUrlLink() {
        return this.webUrlLink;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isNewTag() {
        return this.isNewTag;
    }

    public final void setEnabled(boolean bl2) {
        this.isEnabled = bl2;
    }

    public final void setNewTag(boolean bl2) {
        this.isNewTag = bl2;
    }

    public final void setTitle(String string2) {
        this.title = string2;
    }

    public final void setUrlEndPoint(String string2) {
        this.urlEndPoint = string2;
    }

    public final void setWebUrlLink(String string2) {
        this.webUrlLink = string2;
    }
}

