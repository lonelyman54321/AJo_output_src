/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import java.io.Serializable;
import java.util.ArrayList;

public final class BannerDetails
implements Serializable {
    private final String allowedCustomerState;
    private final String allowedCustomerType;
    private final String application;
    private ArrayList bannerImageDetails;
    private int bannerPosition;
    private int componentPosition;
    private String headLine;
    private String imageUrl;
    private boolean isEcommerceEventPushed;
    private ArrayList locationMedias;
    private String page;
    private String query;
    private String title;
    private String uId;
    private String urlLink;

    public BannerDetails() {
    }

    public BannerDetails(String string2, String string3, String string4, String string5, String string6, String string7) {
        this.imageUrl = string2;
        this.page = string3;
        this.uId = string4;
        this.urlLink = string5;
        this.headLine = string6;
        this.query = string7;
    }

    public final String getAllowedCustomerState() {
        return this.allowedCustomerState;
    }

    public final String getAllowedCustomerType() {
        return this.allowedCustomerType;
    }

    public final String getApplication() {
        return this.application;
    }

    public final ArrayList getBannerImageDetails() {
        return this.bannerImageDetails;
    }

    public final int getBannerPosition() {
        return this.bannerPosition;
    }

    public final int getComponentPosition() {
        return this.componentPosition;
    }

    public final String getHeadLine() {
        return this.headLine;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ArrayList getLocationMedias() {
        return this.locationMedias;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUId() {
        return this.uId;
    }

    public final String getUrlLink() {
        return this.urlLink;
    }

    public final boolean isEcommerceEventPushed() {
        return this.isEcommerceEventPushed;
    }

    public final void setBannerImageDetails(ArrayList arrayList) {
        this.bannerImageDetails = arrayList;
    }

    public final void setBannerPosition(int n3) {
        this.bannerPosition = n3;
    }

    public final void setComponentPosition(int n3) {
        this.componentPosition = n3;
    }

    public final void setEcommerceEventPushed(boolean bl2) {
        this.isEcommerceEventPushed = bl2;
    }

    public final void setHeadLine(String string2) {
        this.headLine = string2;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public final void setLocationMedias(ArrayList arrayList) {
        this.locationMedias = arrayList;
    }

    public final void setPage(String string2) {
        this.page = string2;
    }

    public final void setQuery(String string2) {
        this.query = string2;
    }

    public final void setTitle(String string2) {
        this.title = string2;
    }

    public final void setUId(String string2) {
        this.uId = string2;
    }

    public final void setUrlLink(String string2) {
        this.urlLink = string2;
    }
}

