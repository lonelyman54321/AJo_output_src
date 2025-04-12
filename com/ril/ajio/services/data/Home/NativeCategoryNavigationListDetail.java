/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import java.io.Serializable;
import java.util.List;

public final class NativeCategoryNavigationListDetail
implements Serializable {
    private String activeAltText;
    private String activeImageUrl;
    private boolean defaultNode;
    private List imageDetails;
    private String imgUrlForTab;
    private String inactiveAltText;
    private String inactiveImageUrl;
    private boolean isPageIdUpdated;
    private boolean isShimmer;
    private String nativeCategoryLabel;
    private String nativeCategoryName;
    private String nativeCategoryPageId;
    private String nativeCategoryType;
    private String pageId;

    public final String getActiveAltText() {
        return this.activeAltText;
    }

    public final String getActiveImageUrl() {
        return this.activeImageUrl;
    }

    public final boolean getDefaultNode() {
        return this.defaultNode;
    }

    public final List getImageDetails() {
        return this.imageDetails;
    }

    public final String getImgUrlForTab() {
        return this.imgUrlForTab;
    }

    public final String getInactiveAltText() {
        return this.inactiveAltText;
    }

    public final String getInactiveImageUrl() {
        return this.inactiveImageUrl;
    }

    public final String getNativeCategoryLabel() {
        return this.nativeCategoryLabel;
    }

    public final String getNativeCategoryName() {
        return this.nativeCategoryName;
    }

    public final String getNativeCategoryPageId() {
        return this.nativeCategoryPageId;
    }

    public final String getNativeCategoryType() {
        return this.nativeCategoryType;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final boolean isPageIdUpdated() {
        return this.isPageIdUpdated;
    }

    public final boolean isShimmer() {
        return this.isShimmer;
    }

    public final void setActiveAltText(String string2) {
        this.activeAltText = string2;
    }

    public final void setActiveImageUrl(String string2) {
        this.activeImageUrl = string2;
    }

    public final void setDefaultNode(boolean bl2) {
        this.defaultNode = bl2;
    }

    public final void setImageDetails(List list) {
        this.imageDetails = list;
    }

    public final void setImgUrlForTab(String string2) {
        this.imgUrlForTab = string2;
    }

    public final void setInactiveAltText(String string2) {
        this.inactiveAltText = string2;
    }

    public final void setInactiveImageUrl(String string2) {
        this.inactiveImageUrl = string2;
    }

    public final void setNativeCategoryLabel(String string2) {
        this.nativeCategoryLabel = string2;
    }

    public final void setNativeCategoryName(String string2) {
        this.nativeCategoryName = string2;
    }

    public final void setNativeCategoryPageId(String string2) {
        this.nativeCategoryPageId = string2;
    }

    public final void setNativeCategoryType(String string2) {
        this.nativeCategoryType = string2;
    }

    public final void setPageId(String string2) {
        this.pageId = string2;
    }

    public final void setPageIdUpdated(boolean bl2) {
        this.isPageIdUpdated = bl2;
    }

    public final void setShimmer(boolean bl2) {
        this.isShimmer = bl2;
    }
}

