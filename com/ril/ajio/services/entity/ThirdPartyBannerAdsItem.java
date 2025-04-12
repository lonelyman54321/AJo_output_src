/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import com.ril.ajio.services.entity.ThirdPartyBannerAdsElements;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ThirdPartyBannerAdsItem {
    private String au;
    private String clickTrackingUrl;
    private Integer clientId;
    private ThirdPartyBannerAdsElements elements;
    private String impressionTrackingUrl;
    private Boolean isVisited;
    private Integer rank;
    private String uclid;

    public ThirdPartyBannerAdsItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public ThirdPartyBannerAdsItem(Integer n3, String string2, Integer n4, String string3, ThirdPartyBannerAdsElements thirdPartyBannerAdsElements, String string4, String string5, Boolean bl2) {
        this.clientId = n3;
        this.au = string2;
        this.rank = n4;
        this.clickTrackingUrl = string3;
        this.elements = thirdPartyBannerAdsElements;
        this.impressionTrackingUrl = string4;
        this.uclid = string5;
        this.isVisited = bl2;
    }

    public /* synthetic */ ThirdPartyBannerAdsItem(Integer object, String object2, Integer object3, String object4, ThirdPartyBannerAdsElements object5, String object6, String string2, Boolean object7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string3;
        ThirdPartyBannerAdsElements thirdPartyBannerAdsElements;
        String string4;
        Integer n4;
        String string5;
        Integer n7;
        int n8 = n3;
        int n10 = n3 & 1;
        String string6 = null;
        if (n10 != 0) {
            n10 = 0;
            n7 = null;
        } else {
            n7 = object;
        }
        int n14 = n8 & 2;
        if (n14 != 0) {
            n14 = 0;
            string5 = null;
        } else {
            string5 = object2;
        }
        int n15 = n8 & 4;
        if (n15 != 0) {
            n15 = 0;
            n4 = null;
        } else {
            n4 = object3;
        }
        int n16 = n8 & 8;
        if (n16 != 0) {
            n16 = 0;
            string4 = null;
        } else {
            string4 = object4;
        }
        int n17 = n8 & 0x10;
        if (n17 != 0) {
            n17 = 0;
            thirdPartyBannerAdsElements = null;
        } else {
            thirdPartyBannerAdsElements = object5;
        }
        int n18 = n8 & 0x20;
        if (n18 != 0) {
            n18 = 0;
            string3 = null;
        } else {
            string3 = object6;
        }
        int n19 = n8 & 0x40;
        if (n19 == 0) {
            string6 = string2;
        }
        Object object8 = (n8 &= 0x80) != 0 ? Boolean.FALSE : object7;
        object = this;
        object2 = n7;
        object3 = string5;
        object4 = n4;
        object5 = string4;
        object6 = thirdPartyBannerAdsElements;
        string2 = string3;
        object7 = string6;
        this(n7, string5, n4, string4, thirdPartyBannerAdsElements, string3, string6, (Boolean)object8);
    }

    public static /* synthetic */ ThirdPartyBannerAdsItem copy$default(ThirdPartyBannerAdsItem thirdPartyBannerAdsItem, Integer n3, String string2, Integer n4, String string3, ThirdPartyBannerAdsElements thirdPartyBannerAdsElements, String string4, String string5, Boolean bl2, int n7, Object object) {
        ThirdPartyBannerAdsItem thirdPartyBannerAdsItem2 = thirdPartyBannerAdsItem;
        int n8 = n7;
        int n10 = n7 & 1;
        Integer n14 = n10 != 0 ? thirdPartyBannerAdsItem.clientId : n3;
        int n15 = n8 & 2;
        String string6 = n15 != 0 ? thirdPartyBannerAdsItem2.au : string2;
        int n16 = n8 & 4;
        Integer n17 = n16 != 0 ? thirdPartyBannerAdsItem2.rank : n4;
        int n18 = n8 & 8;
        String string7 = n18 != 0 ? thirdPartyBannerAdsItem2.clickTrackingUrl : string3;
        int n19 = n8 & 0x10;
        ThirdPartyBannerAdsElements thirdPartyBannerAdsElements2 = n19 != 0 ? thirdPartyBannerAdsItem2.elements : thirdPartyBannerAdsElements;
        int n20 = n8 & 0x20;
        String string8 = n20 != 0 ? thirdPartyBannerAdsItem2.impressionTrackingUrl : string4;
        int n21 = n8 & 0x40;
        String string9 = n21 != 0 ? thirdPartyBannerAdsItem2.uclid : string5;
        Boolean bl3 = (n8 &= 0x80) != 0 ? thirdPartyBannerAdsItem2.isVisited : bl2;
        n3 = n14;
        string2 = string6;
        n4 = n17;
        string3 = string7;
        thirdPartyBannerAdsElements = thirdPartyBannerAdsElements2;
        string4 = string8;
        string5 = string9;
        bl2 = bl3;
        return thirdPartyBannerAdsItem.copy(n14, string6, n17, string7, thirdPartyBannerAdsElements2, string8, string9, bl3);
    }

    public final Integer component1() {
        return this.clientId;
    }

    public final String component2() {
        return this.au;
    }

    public final Integer component3() {
        return this.rank;
    }

    public final String component4() {
        return this.clickTrackingUrl;
    }

    public final ThirdPartyBannerAdsElements component5() {
        return this.elements;
    }

    public final String component6() {
        return this.impressionTrackingUrl;
    }

    public final String component7() {
        return this.uclid;
    }

    public final Boolean component8() {
        return this.isVisited;
    }

    public final ThirdPartyBannerAdsItem copy(Integer n3, String string2, Integer n4, String string3, ThirdPartyBannerAdsElements thirdPartyBannerAdsElements, String string4, String string5, Boolean bl2) {
        ThirdPartyBannerAdsItem thirdPartyBannerAdsItem = new ThirdPartyBannerAdsItem(n3, string2, n4, string3, thirdPartyBannerAdsElements, string4, string5, bl2);
        return thirdPartyBannerAdsItem;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ThirdPartyBannerAdsItem;
        if (!bl3) {
            return false;
        }
        object = (ThirdPartyBannerAdsItem)object;
        Object object2 = this.clientId;
        Object object3 = ((ThirdPartyBannerAdsItem)object).clientId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.au;
        object3 = ((ThirdPartyBannerAdsItem)object).au;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.rank;
        object3 = ((ThirdPartyBannerAdsItem)object).rank;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clickTrackingUrl;
        object3 = ((ThirdPartyBannerAdsItem)object).clickTrackingUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.elements;
        object3 = ((ThirdPartyBannerAdsItem)object).elements;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.impressionTrackingUrl;
        object3 = ((ThirdPartyBannerAdsItem)object).impressionTrackingUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.uclid;
        object3 = ((ThirdPartyBannerAdsItem)object).uclid;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isVisited;
        object = ((ThirdPartyBannerAdsItem)object).isVisited;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAu() {
        return this.au;
    }

    public final String getClickTrackingUrl() {
        return this.clickTrackingUrl;
    }

    public final Integer getClientId() {
        return this.clientId;
    }

    public final ThirdPartyBannerAdsElements getElements() {
        return this.elements;
    }

    public final String getImpressionTrackingUrl() {
        return this.impressionTrackingUrl;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final String getUclid() {
        return this.uclid;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.clientId;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        Object object = this.au;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.rank;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.clickTrackingUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.elements;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ThirdPartyBannerAdsElements)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.impressionTrackingUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.uclid;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isVisited;
        if (object != null) {
            n8 = object.hashCode();
        }
        return n4 + n8;
    }

    public final Boolean isVisited() {
        return this.isVisited;
    }

    public final void setAu(String string2) {
        this.au = string2;
    }

    public final void setClickTrackingUrl(String string2) {
        this.clickTrackingUrl = string2;
    }

    public final void setClientId(Integer n3) {
        this.clientId = n3;
    }

    public final void setElements(ThirdPartyBannerAdsElements thirdPartyBannerAdsElements) {
        this.elements = thirdPartyBannerAdsElements;
    }

    public final void setImpressionTrackingUrl(String string2) {
        this.impressionTrackingUrl = string2;
    }

    public final void setRank(Integer n3) {
        this.rank = n3;
    }

    public final void setUclid(String string2) {
        this.uclid = string2;
    }

    public final void setVisited(Boolean bl2) {
        this.isVisited = bl2;
    }

    public String toString() {
        Integer n3 = this.clientId;
        String string2 = this.au;
        Integer n4 = this.rank;
        String string3 = this.clickTrackingUrl;
        ThirdPartyBannerAdsElements thirdPartyBannerAdsElements = this.elements;
        String string4 = this.impressionTrackingUrl;
        String string5 = this.uclid;
        Boolean bl2 = this.isVisited;
        StringBuilder stringBuilder = new StringBuilder("ThirdPartyBannerAdsItem(clientId=");
        stringBuilder.append(n3);
        stringBuilder.append(", au=");
        stringBuilder.append(string2);
        stringBuilder.append(", rank=");
        stringBuilder.append(n4);
        stringBuilder.append(", clickTrackingUrl=");
        stringBuilder.append(string3);
        stringBuilder.append(", elements=");
        stringBuilder.append(thirdPartyBannerAdsElements);
        stringBuilder.append(", impressionTrackingUrl=");
        stringBuilder.append(string4);
        stringBuilder.append(", uclid=");
        stringBuilder.append(string5);
        stringBuilder.append(", isVisited=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

