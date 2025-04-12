/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PlpExtendedBannerListData {
    private final String altText;
    private final String appVersions;
    private final String bannerType;
    private String bannerUrl;
    private Integer height;
    private final Boolean openInNewTab;
    private boolean showTimer;
    private Long timerEndTime;
    private Integer width;

    public PlpExtendedBannerListData() {
        this(null, null, null, null, null, null, false, null, null, 511, null);
    }

    public PlpExtendedBannerListData(String string2, String string3, String string4, String string5, Integer n3, Boolean bl2, boolean bl3, Long l2, Integer n4) {
        this.altText = string2;
        this.appVersions = string3;
        this.bannerType = string4;
        this.bannerUrl = string5;
        this.height = n3;
        this.openInNewTab = bl2;
        this.showTimer = bl3;
        this.timerEndTime = l2;
        this.width = n4;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ PlpExtendedBannerListData(String object, String string2, String string3, String string4, Integer object2, Boolean comparable, boolean bl2, Long l2, Integer number, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var26_29;
        Long l3;
        Comparable<Boolean> bl3;
        Object n4;
        String string5;
        String string6;
        String string7;
        Object string8;
        int n7 = n3;
        int n8 = n3 & 1;
        Number n10 = null;
        if (n8 != 0) {
            n8 = 0;
            string8 = null;
        } else {
            string8 = object;
        }
        int n14 = n7 & 2;
        if (n14 != 0) {
            n14 = 0;
            string7 = null;
        } else {
            string7 = string2;
        }
        int n15 = n7 & 4;
        if (n15 != 0) {
            n15 = 0;
            string6 = null;
        } else {
            string6 = string3;
        }
        int n16 = n7 & 8;
        if (n16 != 0) {
            n16 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        int n17 = n7 & 0x10;
        if (n17 != 0) {
            n17 = 0;
            n4 = null;
        } else {
            n4 = object2;
        }
        int n18 = n7 & 0x20;
        if (n18 != 0) {
            n18 = 0;
            bl3 = null;
        } else {
            bl3 = comparable;
        }
        int bl4 = n7 & 0x40;
        if (bl4 != 0) {
            boolean bl5 = false;
        } else {
            boolean bl6 = bl2;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            l3 = null;
        } else {
            l3 = l2;
        }
        if ((n7 &= 0x100) == 0) {
            n10 = number;
        }
        object = this;
        string2 = string8;
        string3 = string7;
        string4 = string6;
        object2 = string5;
        comparable = n4;
        number = l3;
        this((String)string8, string7, string6, string5, (Integer)n4, (Boolean)bl3, (boolean)var26_29, l3, (Integer)n10);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ PlpExtendedBannerListData copy$default(PlpExtendedBannerListData plpExtendedBannerListData, String string2, String string3, String string4, String string5, Integer n3, Boolean bl2, boolean bl3, Long l2, Integer n4, int n7, Object object) {
        void var26_29;
        PlpExtendedBannerListData plpExtendedBannerListData2 = plpExtendedBannerListData;
        int n8 = n7;
        int n10 = n7 & 1;
        String string6 = n10 != 0 ? plpExtendedBannerListData.altText : string2;
        int n14 = n8 & 2;
        String string7 = n14 != 0 ? plpExtendedBannerListData2.appVersions : string3;
        int n15 = n8 & 4;
        String string8 = n15 != 0 ? plpExtendedBannerListData2.bannerType : string4;
        int n16 = n8 & 8;
        String string9 = n16 != 0 ? plpExtendedBannerListData2.bannerUrl : string5;
        int n17 = n8 & 0x10;
        Integer n18 = n17 != 0 ? plpExtendedBannerListData2.height : n3;
        int n19 = n8 & 0x20;
        Boolean bl4 = n19 != 0 ? plpExtendedBannerListData2.openInNewTab : bl2;
        int bl5 = n8 & 0x40;
        if (bl5 != 0) {
            boolean bl6 = plpExtendedBannerListData2.showTimer;
        } else {
            boolean bl7 = bl3;
        }
        int n20 = n8 & 0x80;
        Long l3 = n20 != 0 ? plpExtendedBannerListData2.timerEndTime : l2;
        Integer n21 = (n8 &= 0x100) != 0 ? plpExtendedBannerListData2.width : n4;
        string2 = string6;
        string3 = string7;
        string4 = string8;
        string5 = string9;
        n3 = n18;
        bl2 = bl4;
        bl3 = var26_29;
        l2 = l3;
        n4 = n21;
        return plpExtendedBannerListData.copy(string6, string7, string8, string9, n18, bl4, (boolean)var26_29, l3, n21);
    }

    public final String component1() {
        return this.altText;
    }

    public final String component2() {
        return this.appVersions;
    }

    public final String component3() {
        return this.bannerType;
    }

    public final String component4() {
        return this.bannerUrl;
    }

    public final Integer component5() {
        return this.height;
    }

    public final Boolean component6() {
        return this.openInNewTab;
    }

    public final boolean component7() {
        return this.showTimer;
    }

    public final Long component8() {
        return this.timerEndTime;
    }

    public final Integer component9() {
        return this.width;
    }

    public final PlpExtendedBannerListData copy(String string2, String string3, String string4, String string5, Integer n3, Boolean bl2, boolean bl3, Long l2, Integer n4) {
        PlpExtendedBannerListData plpExtendedBannerListData = new PlpExtendedBannerListData(string2, string3, string4, string5, n3, bl2, bl3, l2, n4);
        return plpExtendedBannerListData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PlpExtendedBannerListData;
        if (!bl3) {
            return false;
        }
        object = (PlpExtendedBannerListData)object;
        Object object2 = this.altText;
        Object object3 = ((PlpExtendedBannerListData)object).altText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.appVersions;
        object3 = ((PlpExtendedBannerListData)object).appVersions;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerType;
        object3 = ((PlpExtendedBannerListData)object).bannerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerUrl;
        object3 = ((PlpExtendedBannerListData)object).bannerUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.height;
        object3 = ((PlpExtendedBannerListData)object).height;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.openInNewTab;
        object3 = ((PlpExtendedBannerListData)object).openInNewTab;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.showTimer;
        boolean bl4 = ((PlpExtendedBannerListData)object).showTimer;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.timerEndTime;
        object3 = ((PlpExtendedBannerListData)object).timerEndTime;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.width;
        object = ((PlpExtendedBannerListData)object).width;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final String getAppVersions() {
        return this.appVersions;
    }

    public final String getBannerType() {
        return this.bannerType;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Boolean getOpenInNewTab() {
        return this.openInNewTab;
    }

    public final boolean getShowTimer() {
        return this.showTimer;
    }

    public final Long getTimerEndTime() {
        return this.timerEndTime;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.altText;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.appVersions;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bannerType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bannerUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.height;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.openInNewTab;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.showTimer ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.timerEndTime;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.width;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setBannerUrl(String string2) {
        this.bannerUrl = string2;
    }

    public final void setHeight(Integer n3) {
        this.height = n3;
    }

    public final void setShowTimer(boolean bl2) {
        this.showTimer = bl2;
    }

    public final void setTimerEndTime(Long l2) {
        this.timerEndTime = l2;
    }

    public final void setWidth(Integer n3) {
        this.width = n3;
    }

    public String toString() {
        CharSequence charSequence = this.altText;
        String string2 = this.appVersions;
        String string3 = this.bannerType;
        String string4 = this.bannerUrl;
        Integer n3 = this.height;
        Boolean bl2 = this.openInNewTab;
        boolean bl3 = this.showTimer;
        Long l2 = this.timerEndTime;
        Integer n4 = this.width;
        charSequence = og_1.a("PlpExtendedBannerListData(altText=", (String)charSequence, ", appVersions=", string2, ", bannerType=");
        X50.a((StringBuilder)charSequence, string3, ", bannerUrl=", string4, ", height=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", openInNewTab=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(", showTimer=");
        ((StringBuilder)charSequence).append(bl3);
        ((StringBuilder)charSequence).append(", timerEndTime=");
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append(", width=");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

