/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import com.ril.ajio.services.data.Home.Banner;
import java.io.Serializable;
import java.util.ArrayList;

public final class CategoryPageDetail
implements Serializable {
    private Banner banner;
    private String content;
    private ArrayList nativeCategoryNavigationListDetails;
    private String pageLayoutOption;
    private String position;
    private String typeCode;

    public final Banner getBanner() {
        return this.banner;
    }

    public final String getContent() {
        return this.content;
    }

    public final ArrayList getNativeCategoryNavigationListDetails() {
        return this.nativeCategoryNavigationListDetails;
    }

    public final String getPageLayoutOption() {
        return this.pageLayoutOption;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getTypeCode() {
        return this.typeCode;
    }

    public final void setBanner(Banner banner) {
        this.banner = banner;
    }

    public final void setContent(String string2) {
        this.content = string2;
    }

    public final void setNativeCategoryNavigationListDetails(ArrayList arrayList) {
        this.nativeCategoryNavigationListDetails = arrayList;
    }

    public final void setPageLayoutOption(String string2) {
        this.pageLayoutOption = string2;
    }

    public final void setPosition(String string2) {
        this.position = string2;
    }

    public final void setTypeCode(String string2) {
        this.typeCode = string2;
    }
}

