/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import java.io.Serializable;

public class CategoryTextLinkDetails
implements Serializable {
    private int bannerPosition;
    private String categoryText;
    private int componentPosition;
    private String page;
    private String query;
    private String urlLink;

    public int getBannerPosition() {
        return this.bannerPosition;
    }

    public String getCategoryText() {
        return this.categoryText;
    }

    public int getComponentPosition() {
        return this.componentPosition;
    }

    public String getPage() {
        return this.page;
    }

    public String getQuery() {
        return this.query;
    }

    public String getUrlLink() {
        return this.urlLink;
    }

    public void setBannerPosition(int n3) {
        this.bannerPosition = n3;
    }

    public void setCategoryText(String string2) {
        this.categoryText = string2;
    }

    public void setComponentPosition(int n3) {
        this.componentPosition = n3;
    }

    public void setPage(String string2) {
        this.page = string2;
    }

    public void setQuery(String string2) {
        this.query = string2;
    }

    public void setUrlLink(String string2) {
        this.urlLink = string2;
    }
}

