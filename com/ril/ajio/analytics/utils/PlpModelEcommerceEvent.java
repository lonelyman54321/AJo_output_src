/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.utils;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class PlpModelEcommerceEvent {
    public static final int $stable = 8;
    private final Integer clickedPosition;
    private final List clickedProduct;
    private final String plpCategoryId;
    private final String plpPageTitle;
    private final String plpSource;
    private final String plpSourceDetails;
    private final String plpTypeOfRedirection;
    private final String screenName;

    public PlpModelEcommerceEvent(String string2, Integer n3, String string3, String string4, String string5, String string6, String string7, List list) {
        Intrinsics.checkNotNullParameter(list, "clickedProduct");
        this.screenName = string2;
        this.clickedPosition = n3;
        this.plpSource = string3;
        this.plpSourceDetails = string4;
        this.plpCategoryId = string5;
        this.plpPageTitle = string6;
        this.plpTypeOfRedirection = string7;
        this.clickedProduct = list;
    }

    public static /* synthetic */ PlpModelEcommerceEvent copy$default(PlpModelEcommerceEvent plpModelEcommerceEvent, String string2, Integer n3, String string3, String string4, String string5, String string6, String string7, List list, int n4, Object object) {
        PlpModelEcommerceEvent plpModelEcommerceEvent2 = plpModelEcommerceEvent;
        int n7 = n4;
        int n8 = n4 & 1;
        String string8 = n8 != 0 ? plpModelEcommerceEvent.screenName : string2;
        int n10 = n7 & 2;
        Integer n14 = n10 != 0 ? plpModelEcommerceEvent2.clickedPosition : n3;
        int n15 = n7 & 4;
        String string9 = n15 != 0 ? plpModelEcommerceEvent2.plpSource : string3;
        int n16 = n7 & 8;
        String string10 = n16 != 0 ? plpModelEcommerceEvent2.plpSourceDetails : string4;
        int n17 = n7 & 0x10;
        String string11 = n17 != 0 ? plpModelEcommerceEvent2.plpCategoryId : string5;
        int n18 = n7 & 0x20;
        String string12 = n18 != 0 ? plpModelEcommerceEvent2.plpPageTitle : string6;
        int n19 = n7 & 0x40;
        String string13 = n19 != 0 ? plpModelEcommerceEvent2.plpTypeOfRedirection : string7;
        List list2 = (n7 &= 0x80) != 0 ? plpModelEcommerceEvent2.clickedProduct : list;
        string2 = string8;
        n3 = n14;
        string3 = string9;
        string4 = string10;
        string5 = string11;
        string6 = string12;
        string7 = string13;
        list = list2;
        return plpModelEcommerceEvent.copy(string8, n14, string9, string10, string11, string12, string13, list2);
    }

    public final String component1() {
        return this.screenName;
    }

    public final Integer component2() {
        return this.clickedPosition;
    }

    public final String component3() {
        return this.plpSource;
    }

    public final String component4() {
        return this.plpSourceDetails;
    }

    public final String component5() {
        return this.plpCategoryId;
    }

    public final String component6() {
        return this.plpPageTitle;
    }

    public final String component7() {
        return this.plpTypeOfRedirection;
    }

    public final List component8() {
        return this.clickedProduct;
    }

    public final PlpModelEcommerceEvent copy(String string2, Integer n3, String string3, String string4, String string5, String string6, String string7, List list) {
        Intrinsics.checkNotNullParameter(list, "clickedProduct");
        PlpModelEcommerceEvent plpModelEcommerceEvent = new PlpModelEcommerceEvent(string2, n3, string3, string4, string5, string6, string7, list);
        return plpModelEcommerceEvent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PlpModelEcommerceEvent;
        if (!bl3) {
            return false;
        }
        object = (PlpModelEcommerceEvent)object;
        Object object2 = this.screenName;
        Object object3 = ((PlpModelEcommerceEvent)object).screenName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clickedPosition;
        object3 = ((PlpModelEcommerceEvent)object).clickedPosition;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpSource;
        object3 = ((PlpModelEcommerceEvent)object).plpSource;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpSourceDetails;
        object3 = ((PlpModelEcommerceEvent)object).plpSourceDetails;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpCategoryId;
        object3 = ((PlpModelEcommerceEvent)object).plpCategoryId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpPageTitle;
        object3 = ((PlpModelEcommerceEvent)object).plpPageTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpTypeOfRedirection;
        object3 = ((PlpModelEcommerceEvent)object).plpTypeOfRedirection;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clickedProduct;
        object = ((PlpModelEcommerceEvent)object).clickedProduct;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getClickedPosition() {
        return this.clickedPosition;
    }

    public final List getClickedProduct() {
        return this.clickedProduct;
    }

    public final String getPlpCategoryId() {
        return this.plpCategoryId;
    }

    public final String getPlpPageTitle() {
        return this.plpPageTitle;
    }

    public final String getPlpSource() {
        return this.plpSource;
    }

    public final String getPlpSourceDetails() {
        return this.plpSourceDetails;
    }

    public final String getPlpTypeOfRedirection() {
        return this.plpTypeOfRedirection;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.screenName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.clickedPosition;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plpSource;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plpSourceDetails;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plpCategoryId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plpPageTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plpTypeOfRedirection;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        return ((Object)this.clickedProduct).hashCode() + n4;
    }

    public String toString() {
        String string2 = this.screenName;
        Integer n3 = this.clickedPosition;
        String string3 = this.plpSource;
        String string4 = this.plpSourceDetails;
        String string5 = this.plpCategoryId;
        String string6 = this.plpPageTitle;
        String string7 = this.plpTypeOfRedirection;
        List list = this.clickedProduct;
        StringBuilder stringBuilder = new StringBuilder("PlpModelEcommerceEvent(screenName=");
        stringBuilder.append(string2);
        stringBuilder.append(", clickedPosition=");
        stringBuilder.append(n3);
        stringBuilder.append(", plpSource=");
        X50.a(stringBuilder, string3, ", plpSourceDetails=", string4, ", plpCategoryId=");
        X50.a(stringBuilder, string5, ", plpPageTitle=", string6, ", plpTypeOfRedirection=");
        stringBuilder.append(string7);
        stringBuilder.append(", clickedProduct=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

