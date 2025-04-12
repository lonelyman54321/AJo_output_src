/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.earlyaccess.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class EarlyAccessBanner {
    public static final int $stable = 8;
    private String backGroundColor;
    private Boolean enableClosetBanner;
    private Boolean enablePDPBanner;
    private Boolean enablePLPBanner;
    private String saleImage;
    private String saleInfo;
    private String saleSubTitle;
    private String saleTitle;

    public EarlyAccessBanner() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public EarlyAccessBanner(String string2, String string3, String string4, String string5, String string6, Boolean bl2, Boolean bl3, Boolean bl4) {
        this.saleTitle = string2;
        this.saleSubTitle = string3;
        this.saleInfo = string4;
        this.saleImage = string5;
        this.backGroundColor = string6;
        this.enablePLPBanner = bl2;
        this.enablePDPBanner = bl3;
        this.enableClosetBanner = bl4;
    }

    public /* synthetic */ EarlyAccessBanner(String object, String string2, String string3, String string4, String string5, Boolean object2, Boolean bl2, Boolean bl3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bl4;
        Boolean bl5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        int n4 = n3;
        int n7 = n3 & 1;
        Boolean bl6 = null;
        if (n7 != 0) {
            n7 = 0;
            string10 = null;
        } else {
            string10 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string9 = null;
        } else {
            string9 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string8 = null;
        } else {
            string8 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string7 = null;
        } else {
            string7 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string6 = null;
        } else {
            string6 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            bl5 = null;
        } else {
            bl5 = object2;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            bl4 = null;
        } else {
            bl4 = bl2;
        }
        if ((n4 &= 0x80) == 0) {
            bl6 = bl3;
        }
        object = this;
        string2 = string10;
        string3 = string9;
        string4 = string8;
        string5 = string7;
        object2 = string6;
        bl2 = bl5;
        bl3 = bl4;
        this(string10, string9, string8, string7, string6, bl5, bl4, bl6);
    }

    public static /* synthetic */ EarlyAccessBanner copy$default(EarlyAccessBanner earlyAccessBanner, String string2, String string3, String string4, String string5, String string6, Boolean bl2, Boolean bl3, Boolean bl4, int n3, Object object) {
        EarlyAccessBanner earlyAccessBanner2 = earlyAccessBanner;
        int n4 = n3;
        int n7 = n3 & 1;
        String string7 = n7 != 0 ? earlyAccessBanner.saleTitle : string2;
        int n8 = n4 & 2;
        String string8 = n8 != 0 ? earlyAccessBanner2.saleSubTitle : string3;
        int n10 = n4 & 4;
        String string9 = n10 != 0 ? earlyAccessBanner2.saleInfo : string4;
        int n14 = n4 & 8;
        String string10 = n14 != 0 ? earlyAccessBanner2.saleImage : string5;
        int n15 = n4 & 0x10;
        String string11 = n15 != 0 ? earlyAccessBanner2.backGroundColor : string6;
        int n16 = n4 & 0x20;
        Boolean bl5 = n16 != 0 ? earlyAccessBanner2.enablePLPBanner : bl2;
        int n17 = n4 & 0x40;
        Boolean bl6 = n17 != 0 ? earlyAccessBanner2.enablePDPBanner : bl3;
        Boolean bl7 = (n4 &= 0x80) != 0 ? earlyAccessBanner2.enableClosetBanner : bl4;
        string2 = string7;
        string3 = string8;
        string4 = string9;
        string5 = string10;
        string6 = string11;
        bl2 = bl5;
        bl3 = bl6;
        bl4 = bl7;
        return earlyAccessBanner.copy(string7, string8, string9, string10, string11, bl5, bl6, bl7);
    }

    public final String component1() {
        return this.saleTitle;
    }

    public final String component2() {
        return this.saleSubTitle;
    }

    public final String component3() {
        return this.saleInfo;
    }

    public final String component4() {
        return this.saleImage;
    }

    public final String component5() {
        return this.backGroundColor;
    }

    public final Boolean component6() {
        return this.enablePLPBanner;
    }

    public final Boolean component7() {
        return this.enablePDPBanner;
    }

    public final Boolean component8() {
        return this.enableClosetBanner;
    }

    public final EarlyAccessBanner copy(String string2, String string3, String string4, String string5, String string6, Boolean bl2, Boolean bl3, Boolean bl4) {
        EarlyAccessBanner earlyAccessBanner = new EarlyAccessBanner(string2, string3, string4, string5, string6, bl2, bl3, bl4);
        return earlyAccessBanner;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof EarlyAccessBanner;
        if (!bl3) {
            return false;
        }
        object = (EarlyAccessBanner)object;
        Object object2 = this.saleTitle;
        Object object3 = ((EarlyAccessBanner)object).saleTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.saleSubTitle;
        object3 = ((EarlyAccessBanner)object).saleSubTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.saleInfo;
        object3 = ((EarlyAccessBanner)object).saleInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.saleImage;
        object3 = ((EarlyAccessBanner)object).saleImage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.backGroundColor;
        object3 = ((EarlyAccessBanner)object).backGroundColor;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.enablePLPBanner;
        object3 = ((EarlyAccessBanner)object).enablePLPBanner;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.enablePDPBanner;
        object3 = ((EarlyAccessBanner)object).enablePDPBanner;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.enableClosetBanner;
        object = ((EarlyAccessBanner)object).enableClosetBanner;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBackGroundColor() {
        return this.backGroundColor;
    }

    public final Boolean getEnableClosetBanner() {
        return this.enableClosetBanner;
    }

    public final Boolean getEnablePDPBanner() {
        return this.enablePDPBanner;
    }

    public final Boolean getEnablePLPBanner() {
        return this.enablePLPBanner;
    }

    public final String getSaleImage() {
        return this.saleImage;
    }

    public final String getSaleInfo() {
        return this.saleInfo;
    }

    public final String getSaleSubTitle() {
        return this.saleSubTitle;
    }

    public final String getSaleTitle() {
        return this.saleTitle;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.saleTitle;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.saleSubTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.saleInfo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.saleImage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.backGroundColor;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.enablePLPBanner;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.enablePDPBanner;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.enableClosetBanner;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setBackGroundColor(String string2) {
        this.backGroundColor = string2;
    }

    public final void setEnableClosetBanner(Boolean bl2) {
        this.enableClosetBanner = bl2;
    }

    public final void setEnablePDPBanner(Boolean bl2) {
        this.enablePDPBanner = bl2;
    }

    public final void setEnablePLPBanner(Boolean bl2) {
        this.enablePLPBanner = bl2;
    }

    public final void setSaleImage(String string2) {
        this.saleImage = string2;
    }

    public final void setSaleInfo(String string2) {
        this.saleInfo = string2;
    }

    public final void setSaleSubTitle(String string2) {
        this.saleSubTitle = string2;
    }

    public final void setSaleTitle(String string2) {
        this.saleTitle = string2;
    }

    public String toString() {
        CharSequence charSequence = this.saleTitle;
        String string2 = this.saleSubTitle;
        String string3 = this.saleInfo;
        String string4 = this.saleImage;
        String string5 = this.backGroundColor;
        Boolean bl2 = this.enablePLPBanner;
        Boolean bl3 = this.enablePDPBanner;
        Boolean bl4 = this.enableClosetBanner;
        charSequence = og_1.a("EarlyAccessBanner(saleTitle=", (String)charSequence, ", saleSubTitle=", string2, ", saleInfo=");
        X50.a((StringBuilder)charSequence, string3, ", saleImage=", string4, ", backGroundColor=");
        vw0_1.a(bl2, string5, ", enablePLPBanner=", ", enablePDPBanner=", (StringBuilder)charSequence);
        ((StringBuilder)charSequence).append(bl3);
        ((StringBuilder)charSequence).append(", enableClosetBanner=");
        ((StringBuilder)charSequence).append(bl4);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

