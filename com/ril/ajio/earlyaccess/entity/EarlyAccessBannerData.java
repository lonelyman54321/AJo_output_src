/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.earlyaccess.entity;

import com.ril.ajio.earlyaccess.entity.EarlyAccessBanner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class EarlyAccessBannerData {
    public static final int $stable = 8;
    private String cartVariant;
    private EarlyAccessBanner earlyAccessBanner;
    private Boolean enableEarlyAccess;
    private String onboardingCMSPath;
    private String plpCMSBannerPath;
    private String salePDPImageUrl;
    private String salePdpHeaderTag;

    public EarlyAccessBannerData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public EarlyAccessBannerData(String string2, String string3, Boolean bl2, String string4, EarlyAccessBanner earlyAccessBanner, String string5, String string6) {
        this.onboardingCMSPath = string2;
        this.plpCMSBannerPath = string3;
        this.enableEarlyAccess = bl2;
        this.cartVariant = string4;
        this.earlyAccessBanner = earlyAccessBanner;
        this.salePdpHeaderTag = string5;
        this.salePDPImageUrl = string6;
    }

    public /* synthetic */ EarlyAccessBannerData(String object, String string2, Boolean object2, String object3, EarlyAccessBanner object4, String object5, String object6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Object object7;
        EarlyAccessBanner earlyAccessBanner;
        int n4;
        String string3;
        Boolean bl2;
        String string4;
        String string5;
        int n7 = n3 & 1;
        String string6 = null;
        if (n7 != 0) {
            n7 = 0;
            string5 = null;
        } else {
            string5 = object;
        }
        int n8 = n3 & 2;
        if (n8 != 0) {
            n8 = 0;
            string4 = null;
        } else {
            string4 = string2;
        }
        int n10 = n3 & 4;
        if (n10 != 0) {
            n10 = 0;
            bl2 = null;
        } else {
            bl2 = object2;
        }
        int n14 = n3 & 8;
        if (n14 != 0) {
            n14 = 0;
            string3 = null;
        } else {
            string3 = object3;
        }
        int n15 = n3 & 0x10;
        if (n15 != 0) {
            int n16 = 255;
            n4 = 0;
            object7 = earlyAccessBanner;
            earlyAccessBanner = new EarlyAccessBanner(null, null, null, null, null, null, null, null, n16, null);
        } else {
            earlyAccessBanner = object4;
        }
        int n17 = n3 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            object7 = null;
        } else {
            object7 = object5;
        }
        n4 = n3 & 0x40;
        if (n4 == 0) {
            string6 = object6;
        }
        object = this;
        string2 = string5;
        object2 = string4;
        object3 = bl2;
        object4 = string3;
        object5 = earlyAccessBanner;
        object6 = object7;
        this(string5, string4, bl2, string3, earlyAccessBanner, (String)object7, string6);
    }

    public static /* synthetic */ EarlyAccessBannerData copy$default(EarlyAccessBannerData earlyAccessBannerData, String string2, String object, Boolean object2, String object3, EarlyAccessBanner object4, String string3, String object5, int n3, Object object6) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = earlyAccessBannerData.onboardingCMSPath;
        }
        if ((n4 = n3 & 2) != 0) {
            object = earlyAccessBannerData.plpCMSBannerPath;
        }
        object6 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = earlyAccessBannerData.enableEarlyAccess;
        }
        Boolean bl2 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = earlyAccessBannerData.cartVariant;
        }
        String string4 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = earlyAccessBannerData.earlyAccessBanner;
        }
        EarlyAccessBanner earlyAccessBanner = object4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string3 = earlyAccessBannerData.salePdpHeaderTag;
        }
        String string5 = string3;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object5 = earlyAccessBannerData.salePDPImageUrl;
        }
        String string6 = object5;
        object = earlyAccessBannerData;
        object2 = string2;
        object3 = object6;
        object4 = bl2;
        string3 = string4;
        object5 = earlyAccessBanner;
        object6 = string6;
        return earlyAccessBannerData.copy(string2, (String)object3, bl2, string4, earlyAccessBanner, string5, string6);
    }

    public final String component1() {
        return this.onboardingCMSPath;
    }

    public final String component2() {
        return this.plpCMSBannerPath;
    }

    public final Boolean component3() {
        return this.enableEarlyAccess;
    }

    public final String component4() {
        return this.cartVariant;
    }

    public final EarlyAccessBanner component5() {
        return this.earlyAccessBanner;
    }

    public final String component6() {
        return this.salePdpHeaderTag;
    }

    public final String component7() {
        return this.salePDPImageUrl;
    }

    public final EarlyAccessBannerData copy(String string2, String string3, Boolean bl2, String string4, EarlyAccessBanner earlyAccessBanner, String string5, String string6) {
        EarlyAccessBannerData earlyAccessBannerData = new EarlyAccessBannerData(string2, string3, bl2, string4, earlyAccessBanner, string5, string6);
        return earlyAccessBannerData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof EarlyAccessBannerData;
        if (!bl3) {
            return false;
        }
        object = (EarlyAccessBannerData)object;
        Object object2 = this.onboardingCMSPath;
        Object object3 = ((EarlyAccessBannerData)object).onboardingCMSPath;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plpCMSBannerPath;
        object3 = ((EarlyAccessBannerData)object).plpCMSBannerPath;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.enableEarlyAccess;
        object3 = ((EarlyAccessBannerData)object).enableEarlyAccess;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartVariant;
        object3 = ((EarlyAccessBannerData)object).cartVariant;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.earlyAccessBanner;
        object3 = ((EarlyAccessBannerData)object).earlyAccessBanner;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.salePdpHeaderTag;
        object3 = ((EarlyAccessBannerData)object).salePdpHeaderTag;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.salePDPImageUrl;
        object = ((EarlyAccessBannerData)object).salePDPImageUrl;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCartVariant() {
        return this.cartVariant;
    }

    public final EarlyAccessBanner getEarlyAccessBanner() {
        return this.earlyAccessBanner;
    }

    public final Boolean getEnableEarlyAccess() {
        return this.enableEarlyAccess;
    }

    public final String getOnboardingCMSPath() {
        return this.onboardingCMSPath;
    }

    public final String getPlpCMSBannerPath() {
        return this.plpCMSBannerPath;
    }

    public final String getSalePDPImageUrl() {
        return this.salePDPImageUrl;
    }

    public final String getSalePdpHeaderTag() {
        return this.salePdpHeaderTag;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.onboardingCMSPath;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.plpCMSBannerPath;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.enableEarlyAccess;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartVariant;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.earlyAccessBanner;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((EarlyAccessBanner)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.salePdpHeaderTag;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.salePDPImageUrl;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setCartVariant(String string2) {
        this.cartVariant = string2;
    }

    public final void setEarlyAccessBanner(EarlyAccessBanner earlyAccessBanner) {
        this.earlyAccessBanner = earlyAccessBanner;
    }

    public final void setEnableEarlyAccess(Boolean bl2) {
        this.enableEarlyAccess = bl2;
    }

    public final void setOnboardingCMSPath(String string2) {
        this.onboardingCMSPath = string2;
    }

    public final void setPlpCMSBannerPath(String string2) {
        this.plpCMSBannerPath = string2;
    }

    public final void setSalePDPImageUrl(String string2) {
        this.salePDPImageUrl = string2;
    }

    public final void setSalePdpHeaderTag(String string2) {
        this.salePdpHeaderTag = string2;
    }

    public String toString() {
        CharSequence charSequence = this.onboardingCMSPath;
        String string2 = this.plpCMSBannerPath;
        Boolean bl2 = this.enableEarlyAccess;
        String string3 = this.cartVariant;
        EarlyAccessBanner earlyAccessBanner = this.earlyAccessBanner;
        String string4 = this.salePdpHeaderTag;
        String string5 = this.salePDPImageUrl;
        charSequence = og_1.a("EarlyAccessBannerData(onboardingCMSPath=", (String)charSequence, ", plpCMSBannerPath=", string2, ", enableEarlyAccess=");
        xi0_2.a(bl2, ", cartVariant=", string3, ", earlyAccessBanner=", (StringBuilder)charSequence);
        ((StringBuilder)charSequence).append(earlyAccessBanner);
        ((StringBuilder)charSequence).append(", salePdpHeaderTag=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(", salePDPImageUrl=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }
}

