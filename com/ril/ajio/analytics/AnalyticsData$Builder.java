/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.analytics;

import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.services.data.Payment.LuxeDetails;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class AnalyticsData$Builder {
    public static final int $stable = 8;
    private String action;
    private String brand;
    private Bundle bundle;
    private String catalogId;
    private HashMap eventMap;
    private String eventName;
    private List fbContentData;
    private String label;
    private LuxeDetails luxeDetails;
    private Integer numItems;
    private String paymentMode;
    private String price;
    private String productCode;
    private String screenName;
    private String searchString;
    private long value;

    public AnalyticsData$Builder() {
        Object object;
        String string2;
        this.eventName = string2 = "";
        this.action = string2;
        this.label = string2;
        this.value = 1L;
        this.screenName = string2;
        this.searchString = string2;
        this.productCode = string2;
        this.price = string2;
        this.eventMap = object = new HashMap();
        this.bundle = object = new Bundle();
        this.paymentMode = string2;
        this.fbContentData = object;
        this.catalogId = string2;
        object = 0;
        this.numItems = object;
        this.brand = string2;
    }

    public final AnalyticsData$Builder action(String string2) {
        Intrinsics.checkNotNullParameter(string2, "action");
        this.action = string2;
        return this;
    }

    public final AnalyticsData build() {
        String string2 = this.eventName;
        String string3 = this.action;
        String string4 = this.label;
        long l2 = this.value;
        String string5 = this.screenName;
        String string6 = this.searchString;
        String string7 = this.productCode;
        String string8 = this.price;
        HashMap hashMap = this.eventMap;
        Bundle bundle = this.bundle;
        String string9 = this.paymentMode;
        List list = this.fbContentData;
        String string10 = this.catalogId;
        Integer n3 = this.numItems;
        String string11 = this.brand;
        LuxeDetails luxeDetails = this.luxeDetails;
        AnalyticsData analyticsData = new AnalyticsData(string2, string3, string4, l2, string5, string6, string7, string8, hashMap, bundle, string9, list, string10, n3, string11, luxeDetails);
        return analyticsData;
    }

    public final AnalyticsData$Builder bundle(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.bundle = bundle;
        return this;
    }

    public final AnalyticsData$Builder eventMap(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "eventMap");
        this.eventMap = hashMap;
        return this;
    }

    public final AnalyticsData$Builder eventName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        this.eventName = string2;
        return this;
    }

    public final AnalyticsData$Builder fbContentData(List list) {
        Intrinsics.checkNotNullParameter(list, "fbEventContentData");
        this.fbContentData = list;
        return this;
    }

    public final AnalyticsData$Builder label(String string2) {
        Intrinsics.checkNotNullParameter(string2, "label");
        this.label = string2;
        return this;
    }

    public final AnalyticsData$Builder paymentMode(String string2) {
        this.paymentMode = string2;
        return this;
    }

    public final AnalyticsData$Builder price(String string2) {
        Intrinsics.checkNotNullParameter(string2, "price");
        this.price = string2;
        return this;
    }

    public final AnalyticsData$Builder productCode(String string2) {
        this.productCode = string2;
        return this;
    }

    public final AnalyticsData$Builder screenName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        this.screenName = string2;
        return this;
    }

    public final AnalyticsData$Builder searchString(String string2) {
        Intrinsics.checkNotNullParameter(string2, "searchString");
        this.searchString = string2;
        return this;
    }

    public final AnalyticsData$Builder setBrand(String string2) {
        this.brand = string2;
        return this;
    }

    public final AnalyticsData$Builder setCatalogId(String string2) {
        this.catalogId = string2;
        return this;
    }

    public final AnalyticsData$Builder setLuxeDetails(LuxeDetails luxeDetails) {
        this.luxeDetails = luxeDetails;
        return this;
    }

    public final AnalyticsData$Builder setNumItems(Integer n3) {
        this.numItems = n3;
        return this;
    }

    public final AnalyticsData$Builder state(long l2) {
        this.value = l2;
        return this;
    }
}

