/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.ril.ajio.analytics;

import android.os.Bundle;
import com.ril.ajio.services.data.Payment.LuxeDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AnalyticsData {
    public static final int $stable = 8;
    private final String action;
    private final String brand;
    private final Bundle bundle;
    private final String catalogId;
    private final HashMap eventMap;
    private final String eventName;
    private final List fbEventContentData;
    private final String label;
    private final LuxeDetails luxeDetails;
    private final Integer numItems;
    private final String paymentMode;
    private final String price;
    private final String productCode;
    private final String screenName;
    private final String searchString;
    private final long value;

    public AnalyticsData() {
        this(null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, (char)-1, null);
    }

    public AnalyticsData(String string2, String string3, String string4, long l2, String string5, String string6, String string7, String string8, HashMap hashMap, Bundle bundle, String string9, List list, String string10, Integer n3, String string11, LuxeDetails luxeDetails) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "screenName");
        Intrinsics.checkNotNullParameter(string6, "searchString");
        Intrinsics.checkNotNullParameter(string8, "price");
        Intrinsics.checkNotNullParameter(hashMap, "eventMap");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(list, "fbEventContentData");
        this.eventName = string2;
        this.action = string3;
        this.label = string4;
        this.value = l2;
        this.screenName = string5;
        this.searchString = string6;
        this.productCode = string7;
        this.price = string8;
        this.eventMap = hashMap;
        this.bundle = bundle;
        this.paymentMode = string9;
        this.fbEventContentData = list;
        this.catalogId = string10;
        this.numItems = n3;
        this.brand = string11;
        this.luxeDetails = luxeDetails;
    }

    public /* synthetic */ AnalyticsData(String object, String string2, String string3, long l2, String string4, String string5, String string6, String string7, HashMap object2, Bundle object3, String string8, List object4, String object5, Integer object6, String object7, LuxeDetails object8, int n3, DefaultConstructorMarker object9) {
        LuxeDetails luxeDetails;
        int n4 = n3;
        int n7 = n3 & 1;
        Object object10 = "";
        Object object11 = n7 != 0 ? object10 : object;
        int n8 = n4 & 2;
        Object object12 = n8 != 0 ? object10 : string2;
        int n10 = n4 & 4;
        Object object13 = n10 != 0 ? object10 : string3;
        int n14 = n4 & 8;
        long l3 = n14 != 0 ? 1L : l2;
        int n15 = n4 & 0x10;
        Object object14 = n15 != 0 ? object10 : string4;
        int n16 = n4 & 0x20;
        Object object15 = n16 != 0 ? object10 : string5;
        int n17 = n4 & 0x40;
        Object object16 = n17 != 0 ? object10 : string6;
        int n18 = n4 & 0x80;
        Object object17 = n18 != 0 ? object10 : string7;
        int n19 = n4 & 0x100;
        Object object18 = n19 != 0 ? new Object() : object2;
        int n20 = n4 & 0x200;
        Bundle bundle = n20 != 0 ? new Bundle() : object3;
        int n21 = n4 & 0x400;
        Object object19 = n21 != 0 ? object10 : string8;
        int n22 = n4 & 0x800;
        Object object20 = n22 != 0 ? new ArrayList() : object4;
        int n24 = n4 & 0x1000;
        Object object21 = n24 != 0 ? object10 : object5;
        object9 = object10;
        int n25 = n4 & 0x2000;
        if (n25 != 0) {
            n25 = 0;
            object10 = 0;
        } else {
            object10 = object6;
        }
        Object object22 = object10;
        n25 = n4 & 0x4000;
        object10 = n25 != 0 ? object9 : object7;
        int n26 = 32768;
        if ((n4 &= n26) != 0) {
            n4 = 0;
            luxeDetails = null;
        } else {
            luxeDetails = object8;
        }
        object = this;
        string2 = object11;
        string3 = object12;
        string5 = object14;
        string6 = object15;
        string7 = object16;
        object2 = object17;
        object3 = object18;
        string8 = bundle;
        object4 = object19;
        object5 = object20;
        object6 = object21;
        object7 = object22;
        object8 = object10;
        this((String)object11, (String)object12, (String)object13, l3, (String)object14, (String)object15, (String)object16, (String)object17, (HashMap)object18, bundle, (String)object19, (List)object20, (String)object21, (Integer)object22, (String)object10, luxeDetails);
    }

    public static /* synthetic */ AnalyticsData copy$default(AnalyticsData analyticsData, String string2, String string3, String string4, long l2, String string5, String string6, String string7, String string8, HashMap hashMap, Bundle bundle, String string9, List list, String string10, Integer object, String object2, LuxeDetails luxeDetails, int n3, Object object3) {
        AnalyticsData analyticsData2 = analyticsData;
        int n4 = n3;
        int n7 = n3 & 1;
        String string11 = n7 != 0 ? analyticsData.eventName : string2;
        int n8 = n4 & 2;
        String string12 = n8 != 0 ? analyticsData2.action : string3;
        int n10 = n4 & 4;
        String string13 = n10 != 0 ? analyticsData2.label : string4;
        int n14 = n4 & 8;
        long l3 = n14 != 0 ? analyticsData2.value : l2;
        int n15 = n4 & 0x10;
        String string14 = n15 != 0 ? analyticsData2.screenName : string5;
        int n16 = n4 & 0x20;
        String string15 = n16 != 0 ? analyticsData2.searchString : string6;
        int n17 = n4 & 0x40;
        String string16 = n17 != 0 ? analyticsData2.productCode : string7;
        int n18 = n4 & 0x80;
        String string17 = n18 != 0 ? analyticsData2.price : string8;
        int n19 = n4 & 0x100;
        HashMap hashMap2 = n19 != 0 ? analyticsData2.eventMap : hashMap;
        int n20 = n4 & 0x200;
        Bundle bundle2 = n20 != 0 ? analyticsData2.bundle : bundle;
        int n21 = n4 & 0x400;
        String string18 = n21 != 0 ? analyticsData2.paymentMode : string9;
        int n22 = n4 & 0x800;
        List list2 = n22 != 0 ? analyticsData2.fbEventContentData : list;
        int n24 = n4 & 0x1000;
        Object object4 = n24 != 0 ? analyticsData2.catalogId : string10;
        string10 = object4;
        n24 = n4 & 0x2000;
        object4 = n24 != 0 ? analyticsData2.numItems : object;
        object = object4;
        n24 = n4 & 0x4000;
        object4 = n24 != 0 ? analyticsData2.brand : object2;
        int n25 = 32768;
        LuxeDetails luxeDetails2 = (n4 &= n25) != 0 ? analyticsData2.luxeDetails : luxeDetails;
        string2 = string11;
        string3 = string12;
        string4 = string13;
        l2 = l3;
        string5 = string14;
        string6 = string15;
        string7 = string16;
        string8 = string17;
        hashMap = hashMap2;
        bundle = bundle2;
        string9 = string18;
        list = list2;
        object2 = object4;
        luxeDetails = luxeDetails2;
        return analyticsData.copy(string11, string12, string13, l3, string14, string15, string16, string17, hashMap2, bundle2, string18, list2, string10, (Integer)object, (String)object4, luxeDetails2);
    }

    public final String component1() {
        return this.eventName;
    }

    public final Bundle component10() {
        return this.bundle;
    }

    public final String component11() {
        return this.paymentMode;
    }

    public final List component12() {
        return this.fbEventContentData;
    }

    public final String component13() {
        return this.catalogId;
    }

    public final Integer component14() {
        return this.numItems;
    }

    public final String component15() {
        return this.brand;
    }

    public final LuxeDetails component16() {
        return this.luxeDetails;
    }

    public final String component2() {
        return this.action;
    }

    public final String component3() {
        return this.label;
    }

    public final long component4() {
        return this.value;
    }

    public final String component5() {
        return this.screenName;
    }

    public final String component6() {
        return this.searchString;
    }

    public final String component7() {
        return this.productCode;
    }

    public final String component8() {
        return this.price;
    }

    public final HashMap component9() {
        return this.eventMap;
    }

    public final AnalyticsData copy(String string2, String string3, String string4, long l2, String string5, String string6, String string7, String string8, HashMap hashMap, Bundle bundle, String string9, List list, String string10, Integer n3, String string11, LuxeDetails luxeDetails) {
        Intrinsics.checkNotNullParameter(string2, "eventName");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "label");
        Intrinsics.checkNotNullParameter(string5, "screenName");
        Intrinsics.checkNotNullParameter(string6, "searchString");
        Intrinsics.checkNotNullParameter(string8, "price");
        Intrinsics.checkNotNullParameter(hashMap, "eventMap");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(list, "fbEventContentData");
        AnalyticsData analyticsData = new AnalyticsData(string2, string3, string4, l2, string5, string6, string7, string8, hashMap, bundle, string9, list, string10, n3, string11, luxeDetails);
        return analyticsData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof AnalyticsData;
        if (!object2) {
            return false;
        }
        object = (AnalyticsData)object;
        Object object3 = this.eventName;
        Object object4 = ((AnalyticsData)object).eventName;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.action;
        object4 = ((AnalyticsData)object).action;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.label;
        object4 = ((AnalyticsData)object).label;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        long l2 = this.value;
        long l3 = ((AnalyticsData)object).value;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object3 = this.screenName;
        object4 = ((AnalyticsData)object).screenName;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.searchString;
        object4 = ((AnalyticsData)object).searchString;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.productCode;
        object4 = ((AnalyticsData)object).productCode;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.price;
        object4 = ((AnalyticsData)object).price;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.eventMap;
        object4 = ((AnalyticsData)object).eventMap;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.bundle;
        object4 = ((AnalyticsData)object).bundle;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.paymentMode;
        object4 = ((AnalyticsData)object).paymentMode;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.fbEventContentData;
        object4 = ((AnalyticsData)object).fbEventContentData;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.catalogId;
        object4 = ((AnalyticsData)object).catalogId;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.numItems;
        object4 = ((AnalyticsData)object).numItems;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.brand;
        object4 = ((AnalyticsData)object).brand;
        object2 = Intrinsics.areEqual(object3, object4);
        if (!object2) {
            return false;
        }
        object3 = this.luxeDetails;
        object = ((AnalyticsData)object).luxeDetails;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final String getCatalogId() {
        return this.catalogId;
    }

    public final HashMap getEventMap() {
        return this.eventMap;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final List getFbEventContentData() {
        return this.fbEventContentData;
    }

    public final String getLabel() {
        return this.label;
    }

    public final LuxeDetails getLuxeDetails() {
        return this.luxeDetails;
    }

    public final Integer getNumItems() {
        return this.numItems;
    }

    public final String getPaymentMode() {
        return this.paymentMode;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final String getSearchString() {
        return this.searchString;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        String string2 = this.eventName;
        int n4 = string2.hashCode();
        int n7 = 31;
        n4 *= 31;
        Object object = this.action;
        n4 = zy_2.b(n4, n7, (String)object);
        object = this.label;
        n4 = zy_2.b(n4, n7, (String)object);
        long l2 = this.value;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^= l3);
        n4 = (n4 + n10) * 31;
        object = this.screenName;
        n4 = zy_2.b(n4, n7, (String)object);
        object = this.searchString;
        n4 = zy_2.b(n4, n7, (String)object);
        object = this.productCode;
        n10 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.price;
        n4 = zy_2.b(n4, n7, (String)object);
        n3 = (((Object)this.eventMap).hashCode() + n4) * 31;
        string2 = this.bundle;
        n4 = (string2.hashCode() + n3) * 31;
        object = this.paymentMode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fbEventContentData;
        n4 = ne_0.a(n4, n7, (List)object);
        object = this.catalogId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.numItems;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brand;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        LuxeDetails luxeDetails = this.luxeDetails;
        if (luxeDetails != null) {
            n10 = luxeDetails.hashCode();
        }
        return n4 + n10;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.eventName;
        String string2 = this.action;
        String string3 = this.label;
        long l2 = this.value;
        String string4 = this.screenName;
        String string5 = this.searchString;
        String string6 = this.productCode;
        String string7 = this.price;
        HashMap hashMap = this.eventMap;
        Bundle bundle = this.bundle;
        String string8 = this.paymentMode;
        List list = this.fbEventContentData;
        String string9 = this.catalogId;
        Integer n3 = this.numItems;
        String string10 = this.brand;
        LuxeDetails luxeDetails = this.luxeDetails;
        object = og_1.a("AnalyticsData(eventName=", (String)object2, ", action=", string2, ", label=");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(", value=");
        ((StringBuilder)object).append(l2);
        X50.a((StringBuilder)object, ", screenName=", string4, ", searchString=", string5);
        X50.a((StringBuilder)object, ", productCode=", string6, ", price=", string7);
        ((StringBuilder)object).append(", eventMap=");
        ((StringBuilder)object).append(hashMap);
        ((StringBuilder)object).append(", bundle=");
        ((StringBuilder)object).append(bundle);
        ((StringBuilder)object).append(", paymentMode=");
        ((StringBuilder)object).append(string8);
        ((StringBuilder)object).append(", fbEventContentData=");
        ((StringBuilder)object).append(list);
        ((StringBuilder)object).append(", catalogId=");
        object2 = string9;
        ((StringBuilder)object).append(string9);
        ((StringBuilder)object).append(", numItems=");
        object2 = n3;
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", brand=");
        object2 = string10;
        ((StringBuilder)object).append(string10);
        ((StringBuilder)object).append(", luxeDetails=");
        object2 = luxeDetails;
        ((StringBuilder)object).append(luxeDetails);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

