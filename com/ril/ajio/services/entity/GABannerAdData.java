/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class GABannerAdData {
    private Integer bannerIndex;
    private String bannerType;
    private String campaignId;
    private Integer componentIndex;
    private String creativeName;
    private String imageName;
    private String pageName;
    private String url;

    public GABannerAdData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public GABannerAdData(String string2, String string3, Integer n3, Integer n4, String string4, String string5, String string6, String string7) {
        this.url = string2;
        this.campaignId = string3;
        this.bannerIndex = n3;
        this.componentIndex = n4;
        this.creativeName = string4;
        this.imageName = string5;
        this.bannerType = string6;
        this.pageName = string7;
    }

    public /* synthetic */ GABannerAdData(String object, String string2, Integer object2, Integer n3, String object3, String string3, String string4, String string5, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        String string6;
        String string7;
        String string8;
        Integer n7;
        Integer n8;
        String string9;
        String string10;
        int n10 = n4;
        int n14 = n4 & 1;
        String string11 = null;
        if (n14 != 0) {
            n14 = 0;
            string10 = null;
        } else {
            string10 = object;
        }
        int n15 = n10 & 2;
        if (n15 != 0) {
            n15 = 0;
            string9 = null;
        } else {
            string9 = string2;
        }
        int n16 = n10 & 4;
        if (n16 != 0) {
            n16 = 0;
            n8 = null;
        } else {
            n8 = object2;
        }
        int n17 = n10 & 8;
        if (n17 != 0) {
            n17 = 0;
            n7 = null;
        } else {
            n7 = n3;
        }
        int n18 = n10 & 0x10;
        if (n18 != 0) {
            n18 = 0;
            string8 = null;
        } else {
            string8 = object3;
        }
        int n19 = n10 & 0x20;
        if (n19 != 0) {
            n19 = 0;
            string7 = null;
        } else {
            string7 = string3;
        }
        int n20 = n10 & 0x40;
        if (n20 != 0) {
            n20 = 0;
            string6 = null;
        } else {
            string6 = string4;
        }
        if ((n10 &= 0x80) == 0) {
            string11 = string5;
        }
        object = this;
        string2 = string10;
        object2 = string9;
        n3 = n8;
        object3 = n7;
        string3 = string8;
        string4 = string7;
        string5 = string6;
        this(string10, string9, n8, n7, string8, string7, string6, string11);
    }

    public static /* synthetic */ GABannerAdData copy$default(GABannerAdData gABannerAdData, String string2, String string3, Integer n3, Integer n4, String string4, String string5, String string6, String string7, int n7, Object object) {
        GABannerAdData gABannerAdData2 = gABannerAdData;
        int n8 = n7;
        int n10 = n7 & 1;
        String string8 = n10 != 0 ? gABannerAdData.url : string2;
        int n14 = n8 & 2;
        String string9 = n14 != 0 ? gABannerAdData2.campaignId : string3;
        int n15 = n8 & 4;
        Integer n16 = n15 != 0 ? gABannerAdData2.bannerIndex : n3;
        int n17 = n8 & 8;
        Integer n18 = n17 != 0 ? gABannerAdData2.componentIndex : n4;
        int n19 = n8 & 0x10;
        String string10 = n19 != 0 ? gABannerAdData2.creativeName : string4;
        int n20 = n8 & 0x20;
        String string11 = n20 != 0 ? gABannerAdData2.imageName : string5;
        int n21 = n8 & 0x40;
        String string12 = n21 != 0 ? gABannerAdData2.bannerType : string6;
        String string13 = (n8 &= 0x80) != 0 ? gABannerAdData2.pageName : string7;
        string2 = string8;
        string3 = string9;
        n3 = n16;
        n4 = n18;
        string4 = string10;
        string5 = string11;
        string6 = string12;
        string7 = string13;
        return gABannerAdData.copy(string8, string9, n16, n18, string10, string11, string12, string13);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.campaignId;
    }

    public final Integer component3() {
        return this.bannerIndex;
    }

    public final Integer component4() {
        return this.componentIndex;
    }

    public final String component5() {
        return this.creativeName;
    }

    public final String component6() {
        return this.imageName;
    }

    public final String component7() {
        return this.bannerType;
    }

    public final String component8() {
        return this.pageName;
    }

    public final GABannerAdData copy(String string2, String string3, Integer n3, Integer n4, String string4, String string5, String string6, String string7) {
        GABannerAdData gABannerAdData = new GABannerAdData(string2, string3, n3, n4, string4, string5, string6, string7);
        return gABannerAdData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GABannerAdData;
        if (!bl3) {
            return false;
        }
        object = (GABannerAdData)object;
        Object object2 = this.url;
        Object object3 = ((GABannerAdData)object).url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.campaignId;
        object3 = ((GABannerAdData)object).campaignId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerIndex;
        object3 = ((GABannerAdData)object).bannerIndex;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.componentIndex;
        object3 = ((GABannerAdData)object).componentIndex;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.creativeName;
        object3 = ((GABannerAdData)object).creativeName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageName;
        object3 = ((GABannerAdData)object).imageName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerType;
        object3 = ((GABannerAdData)object).bannerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageName;
        object = ((GABannerAdData)object).pageName;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getBannerIndex() {
        return this.bannerIndex;
    }

    public final String getBannerType() {
        return this.bannerType;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final Integer getComponentIndex() {
        return this.componentIndex;
    }

    public final String getCreativeName() {
        return this.creativeName;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.url;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.campaignId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bannerIndex;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.componentIndex;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.creativeName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.imageName;
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
        object = this.pageName;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setBannerIndex(Integer n3) {
        this.bannerIndex = n3;
    }

    public final void setBannerType(String string2) {
        this.bannerType = string2;
    }

    public final void setCampaignId(String string2) {
        this.campaignId = string2;
    }

    public final void setComponentIndex(Integer n3) {
        this.componentIndex = n3;
    }

    public final void setCreativeName(String string2) {
        this.creativeName = string2;
    }

    public final void setImageName(String string2) {
        this.imageName = string2;
    }

    public final void setPageName(String string2) {
        this.pageName = string2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public String toString() {
        CharSequence charSequence = this.url;
        String string2 = this.campaignId;
        Integer n3 = this.bannerIndex;
        Integer n4 = this.componentIndex;
        String string3 = this.creativeName;
        String string4 = this.imageName;
        String string5 = this.bannerType;
        String string6 = this.pageName;
        charSequence = og_1.a("GABannerAdData(url=", (String)charSequence, ", campaignId=", string2, ", bannerIndex=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", componentIndex=");
        ((StringBuilder)charSequence).append(n4);
        ((StringBuilder)charSequence).append(", creativeName=");
        X50.a((StringBuilder)charSequence, string3, ", imageName=", string4, ", bannerType=");
        return ko_0.a((StringBuilder)charSequence, string5, ", pageName=", string6, ")");
    }
}

