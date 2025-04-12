/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BannerAdsMetaData {
    private Integer bannerIndex;
    private String bannerType;
    private String campaignId;
    private String ccbValue;
    private String clickId;
    private String clickTracker;
    private String creativeName;
    private String ctaFb;
    private String imageName;
    private Boolean impressionStatus;
    private String impressionTracker;
    private String url;

    public BannerAdsMetaData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public BannerAdsMetaData(String string2, String string3, String string4, String string5, String string6, String string7, Boolean bl2, Integer n3, String string8, String string9, String string10, String string11) {
        this.clickId = string2;
        this.campaignId = string3;
        this.imageName = string4;
        this.ctaFb = string5;
        this.impressionTracker = string6;
        this.clickTracker = string7;
        this.impressionStatus = bl2;
        this.bannerIndex = n3;
        this.creativeName = string8;
        this.ccbValue = string9;
        this.url = string10;
        this.bannerType = string11;
    }

    public /* synthetic */ BannerAdsMetaData(String object, String string2, String string3, String string4, String string5, String string6, Boolean object2, Integer constable, String object3, String string7, String string8, String string9, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string10;
        String string11;
        String string12;
        Integer n4;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        int n7 = n3;
        int n8 = n3 & 1;
        String string19 = null;
        if (n8 != 0) {
            n8 = 0;
            string18 = null;
        } else {
            string18 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string17 = null;
        } else {
            string17 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string16 = null;
        } else {
            string16 = string3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string15 = null;
        } else {
            string15 = string4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            string14 = null;
        } else {
            string14 = string5;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string13 = null;
        } else {
            string13 = string6;
        }
        int n18 = n7 & 0x40;
        Object object4 = n18 != 0 ? Boolean.FALSE : object2;
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            n4 = null;
        } else {
            n4 = constable;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            string12 = null;
        } else {
            string12 = object3;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            string11 = null;
        } else {
            string11 = string7;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            string10 = null;
        } else {
            string10 = string8;
        }
        if ((n7 &= 0x800) == 0) {
            string19 = string9;
        }
        object = this;
        string2 = string18;
        string3 = string17;
        string4 = string16;
        string5 = string15;
        string6 = string14;
        object2 = string13;
        constable = object4;
        object3 = n4;
        string7 = string12;
        string8 = string11;
        string9 = string10;
        this(string18, string17, string16, string15, string14, string13, (Boolean)object4, n4, string12, string11, string10, string19);
    }

    public static /* synthetic */ BannerAdsMetaData copy$default(BannerAdsMetaData bannerAdsMetaData, String string2, String string3, String string4, String string5, String string6, String string7, Boolean bl2, Integer n3, String string8, String string9, String string10, String string11, int n4, Object object) {
        BannerAdsMetaData bannerAdsMetaData2 = bannerAdsMetaData;
        int n7 = n4;
        int n8 = n4 & 1;
        String string12 = n8 != 0 ? bannerAdsMetaData.clickId : string2;
        int n10 = n7 & 2;
        String string13 = n10 != 0 ? bannerAdsMetaData2.campaignId : string3;
        int n14 = n7 & 4;
        String string14 = n14 != 0 ? bannerAdsMetaData2.imageName : string4;
        int n15 = n7 & 8;
        String string15 = n15 != 0 ? bannerAdsMetaData2.ctaFb : string5;
        int n16 = n7 & 0x10;
        String string16 = n16 != 0 ? bannerAdsMetaData2.impressionTracker : string6;
        int n17 = n7 & 0x20;
        String string17 = n17 != 0 ? bannerAdsMetaData2.clickTracker : string7;
        int n18 = n7 & 0x40;
        Boolean bl3 = n18 != 0 ? bannerAdsMetaData2.impressionStatus : bl2;
        int n19 = n7 & 0x80;
        Integer n20 = n19 != 0 ? bannerAdsMetaData2.bannerIndex : n3;
        int n21 = n7 & 0x100;
        String string18 = n21 != 0 ? bannerAdsMetaData2.creativeName : string8;
        int n22 = n7 & 0x200;
        String string19 = n22 != 0 ? bannerAdsMetaData2.ccbValue : string9;
        int n24 = n7 & 0x400;
        String string20 = n24 != 0 ? bannerAdsMetaData2.url : string10;
        String string21 = (n7 &= 0x800) != 0 ? bannerAdsMetaData2.bannerType : string11;
        string2 = string12;
        string3 = string13;
        string4 = string14;
        string5 = string15;
        string6 = string16;
        string7 = string17;
        bl2 = bl3;
        n3 = n20;
        string8 = string18;
        string9 = string19;
        string10 = string20;
        string11 = string21;
        return bannerAdsMetaData.copy(string12, string13, string14, string15, string16, string17, bl3, n20, string18, string19, string20, string21);
    }

    public final String component1() {
        return this.clickId;
    }

    public final String component10() {
        return this.ccbValue;
    }

    public final String component11() {
        return this.url;
    }

    public final String component12() {
        return this.bannerType;
    }

    public final String component2() {
        return this.campaignId;
    }

    public final String component3() {
        return this.imageName;
    }

    public final String component4() {
        return this.ctaFb;
    }

    public final String component5() {
        return this.impressionTracker;
    }

    public final String component6() {
        return this.clickTracker;
    }

    public final Boolean component7() {
        return this.impressionStatus;
    }

    public final Integer component8() {
        return this.bannerIndex;
    }

    public final String component9() {
        return this.creativeName;
    }

    public final BannerAdsMetaData copy(String string2, String string3, String string4, String string5, String string6, String string7, Boolean bl2, Integer n3, String string8, String string9, String string10, String string11) {
        BannerAdsMetaData bannerAdsMetaData = new BannerAdsMetaData(string2, string3, string4, string5, string6, string7, bl2, n3, string8, string9, string10, string11);
        return bannerAdsMetaData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BannerAdsMetaData;
        if (!bl3) {
            return false;
        }
        object = (BannerAdsMetaData)object;
        Object object2 = this.clickId;
        Object object3 = ((BannerAdsMetaData)object).clickId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.campaignId;
        object3 = ((BannerAdsMetaData)object).campaignId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageName;
        object3 = ((BannerAdsMetaData)object).imageName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ctaFb;
        object3 = ((BannerAdsMetaData)object).ctaFb;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.impressionTracker;
        object3 = ((BannerAdsMetaData)object).impressionTracker;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clickTracker;
        object3 = ((BannerAdsMetaData)object).clickTracker;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.impressionStatus;
        object3 = ((BannerAdsMetaData)object).impressionStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerIndex;
        object3 = ((BannerAdsMetaData)object).bannerIndex;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.creativeName;
        object3 = ((BannerAdsMetaData)object).creativeName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.ccbValue;
        object3 = ((BannerAdsMetaData)object).ccbValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.url;
        object3 = ((BannerAdsMetaData)object).url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerType;
        object = ((BannerAdsMetaData)object).bannerType;
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

    public final String getCcbValue() {
        return this.ccbValue;
    }

    public final String getClickId() {
        return this.clickId;
    }

    public final String getClickTracker() {
        return this.clickTracker;
    }

    public final String getCreativeName() {
        return this.creativeName;
    }

    public final String getCtaFb() {
        return this.ctaFb;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final Boolean getImpressionStatus() {
        return this.impressionStatus;
    }

    public final String getImpressionTracker() {
        return this.impressionTracker;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.clickId;
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
        object = this.imageName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ctaFb;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.impressionTracker;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.clickTracker;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.impressionStatus;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        object = this.creativeName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.ccbValue;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.url;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bannerType;
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

    public final void setCcbValue(String string2) {
        this.ccbValue = string2;
    }

    public final void setClickId(String string2) {
        this.clickId = string2;
    }

    public final void setClickTracker(String string2) {
        this.clickTracker = string2;
    }

    public final void setCreativeName(String string2) {
        this.creativeName = string2;
    }

    public final void setCtaFb(String string2) {
        this.ctaFb = string2;
    }

    public final void setImageName(String string2) {
        this.imageName = string2;
    }

    public final void setImpressionStatus(Boolean bl2) {
        this.impressionStatus = bl2;
    }

    public final void setImpressionTracker(String string2) {
        this.impressionTracker = string2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public String toString() {
        CharSequence charSequence = this.clickId;
        String string2 = this.campaignId;
        String string3 = this.imageName;
        String string4 = this.ctaFb;
        String string5 = this.impressionTracker;
        String string6 = this.clickTracker;
        Boolean bl2 = this.impressionStatus;
        Integer n3 = this.bannerIndex;
        String string7 = this.creativeName;
        String string8 = this.ccbValue;
        String string9 = this.url;
        String string10 = this.bannerType;
        charSequence = og_1.a("BannerAdsMetaData(clickId=", (String)charSequence, ", campaignId=", string2, ", imageName=");
        X50.a((StringBuilder)charSequence, string3, ", ctaFb=", string4, ", impressionTracker=");
        X50.a((StringBuilder)charSequence, string5, ", clickTracker=", string6, ", impressionStatus=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(", bannerIndex=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", creativeName=");
        X50.a((StringBuilder)charSequence, string7, ", ccbValue=", string8, ", url=");
        return ko_0.a((StringBuilder)charSequence, string9, ", bannerType=", string10, ")");
    }
}

