/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ThirdPartyBannerAdsElements {
    private String desktopImage;
    private String destinationUrl;
    private String mediaType;
    private String mobileImage;
    private String promotionName;

    public ThirdPartyBannerAdsElements() {
        this(null, null, null, null, null, 31, null);
    }

    public ThirdPartyBannerAdsElements(String string2, String string3, String string4, String string5, String string6) {
        this.mobileImage = string2;
        this.desktopImage = string3;
        this.destinationUrl = string4;
        this.promotionName = string5;
        this.mediaType = string6;
    }

    public /* synthetic */ ThirdPartyBannerAdsElements(String object, String object2, String string2, String string3, String string4, int n3, DefaultConstructorMarker object3) {
        String string5;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string6 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        String string7 = n7 != 0 ? null : string3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string5 = null;
        } else {
            string5 = string4;
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string6;
        string4 = string7;
        this((String)object3, (String)object4, string6, string7, string5);
    }

    public static /* synthetic */ ThirdPartyBannerAdsElements copy$default(ThirdPartyBannerAdsElements thirdPartyBannerAdsElements, String string2, String object, String string3, String object2, String string4, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = thirdPartyBannerAdsElements.mobileImage;
        }
        if ((n4 = n3 & 2) != 0) {
            object = thirdPartyBannerAdsElements.desktopImage;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = thirdPartyBannerAdsElements.destinationUrl;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = thirdPartyBannerAdsElements.promotionName;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = thirdPartyBannerAdsElements.mediaType;
        }
        String string7 = string4;
        object = thirdPartyBannerAdsElements;
        string3 = string2;
        object2 = object3;
        string4 = string5;
        object3 = string7;
        return thirdPartyBannerAdsElements.copy(string2, (String)object2, string5, string6, string7);
    }

    public final String component1() {
        return this.mobileImage;
    }

    public final String component2() {
        return this.desktopImage;
    }

    public final String component3() {
        return this.destinationUrl;
    }

    public final String component4() {
        return this.promotionName;
    }

    public final String component5() {
        return this.mediaType;
    }

    public final ThirdPartyBannerAdsElements copy(String string2, String string3, String string4, String string5, String string6) {
        ThirdPartyBannerAdsElements thirdPartyBannerAdsElements = new ThirdPartyBannerAdsElements(string2, string3, string4, string5, string6);
        return thirdPartyBannerAdsElements;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ThirdPartyBannerAdsElements;
        if (!bl3) {
            return false;
        }
        object = (ThirdPartyBannerAdsElements)object;
        String string2 = this.mobileImage;
        String string3 = ((ThirdPartyBannerAdsElements)object).mobileImage;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.desktopImage;
        string3 = ((ThirdPartyBannerAdsElements)object).desktopImage;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.destinationUrl;
        string3 = ((ThirdPartyBannerAdsElements)object).destinationUrl;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.promotionName;
        string3 = ((ThirdPartyBannerAdsElements)object).promotionName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.mediaType;
        object = ((ThirdPartyBannerAdsElements)object).mediaType;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDesktopImage() {
        return this.desktopImage;
    }

    public final String getDestinationUrl() {
        return this.destinationUrl;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getMobileImage() {
        return this.mobileImage;
    }

    public final String getPromotionName() {
        return this.promotionName;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.mobileImage;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.desktopImage;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.destinationUrl;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.promotionName;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.mediaType;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setDesktopImage(String string2) {
        this.desktopImage = string2;
    }

    public final void setDestinationUrl(String string2) {
        this.destinationUrl = string2;
    }

    public final void setMediaType(String string2) {
        this.mediaType = string2;
    }

    public final void setMobileImage(String string2) {
        this.mobileImage = string2;
    }

    public final void setPromotionName(String string2) {
        this.promotionName = string2;
    }

    public String toString() {
        CharSequence charSequence = this.mobileImage;
        String string2 = this.desktopImage;
        String string3 = this.destinationUrl;
        String string4 = this.promotionName;
        String string5 = this.mediaType;
        charSequence = og_1.a("ThirdPartyBannerAdsElements(mobileImage=", charSequence, ", desktopImage=", string2, ", destinationUrl=");
        X50.a((StringBuilder)charSequence, string3, ", promotionName=", string4, ", mediaType=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }
}

