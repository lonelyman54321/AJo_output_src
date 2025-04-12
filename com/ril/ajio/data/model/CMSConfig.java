/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.model;

import com.ril.ajio.data.model.PreviewConfig;
import com.ril.ajio.data.model.PreviewUrl;
import java.util.ArrayList;

public final class CMSConfig {
    public static final int $stable = 8;
    private final String luxeDefaultHomePageUrl;
    private final PreviewConfig previewConfig;
    private final PreviewUrl previewUrl;
    private final int recentlyViewedHomePageMax;
    private final int recentlyViewedHomePageMin;
    private final ArrayList supportedStoresForPreview;
    private ArrayList userGroupForPreview;

    public CMSConfig() {
        this.luxeDefaultHomePageUrl = "/shop/luxe";
        this.recentlyViewedHomePageMax = 10;
        this.recentlyViewedHomePageMin = 2;
    }

    public final String getLuxeDefaultHomePageUrl() {
        return this.luxeDefaultHomePageUrl;
    }

    public final PreviewConfig getPreviewConfig() {
        return this.previewConfig;
    }

    public final PreviewUrl getPreviewUrl() {
        return this.previewUrl;
    }

    public final int getRecentlyViewedHomePageMax() {
        return this.recentlyViewedHomePageMax;
    }

    public final int getRecentlyViewedHomePageMin() {
        return this.recentlyViewedHomePageMin;
    }

    public final ArrayList getSupportedStoresForPreview() {
        return this.supportedStoresForPreview;
    }

    public final ArrayList getUserGroupForPreview() {
        return this.userGroupForPreview;
    }

    public final void setUserGroupForPreview(ArrayList arrayList) {
        this.userGroupForPreview = arrayList;
    }
}

