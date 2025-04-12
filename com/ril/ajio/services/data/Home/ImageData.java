/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import java.io.Serializable;

public class ImageData
implements Serializable {
    private int bannerPosition;
    private int componentPosition;
    private String imageUrl;
    private String page;
    private String query;
    private String uId;
    private String urlLink;

    public int getBannerPosition() {
        return this.bannerPosition;
    }

    public int getComponentPosition() {
        return this.componentPosition;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getPage() {
        return this.page;
    }

    public String getQuery() {
        return this.query;
    }

    public String getUId() {
        return this.uId;
    }

    public String getUrlLink() {
        return this.urlLink;
    }

    public String getuId() {
        return this.uId;
    }

    public void setBannerPosition(int n3) {
        this.bannerPosition = n3;
    }

    public void setComponentPosition(int n3) {
        this.componentPosition = n3;
    }

    public void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public void setPage(String string2) {
        this.page = string2;
    }

    public void setQuery(String string2) {
        this.query = string2;
    }

    public void setUId(String string2) {
        this.uId = string2;
    }

    public void setUrlLink(String string2) {
        this.urlLink = string2;
    }

    public void setuId(String string2) {
        this.uId = string2;
    }
}

