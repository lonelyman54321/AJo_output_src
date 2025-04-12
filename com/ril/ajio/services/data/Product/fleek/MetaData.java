/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product.fleek;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class MetaData
implements Serializable {
    private String brandImageHeight;
    private String brandImageMediaType;
    private String brandImageWidth;
    private String brandLogoHeight;
    private String brandLogoMediaType;
    private String brandLogoWidth;
    private String brandPageHeaderDuration;
    private String brandPageHeaderHeight;
    private String brandPageHeaderMediaType;
    private final String brandPageHeaderVideoDuration;
    private String brandPageHeaderWidth;
    private final String height;
    private final String width;

    public MetaData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public MetaData(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        this.brandLogoMediaType = string2;
        this.brandPageHeaderWidth = string3;
        this.brandPageHeaderDuration = string4;
        this.brandPageHeaderHeight = string5;
        this.brandImageHeight = string6;
        this.brandImageMediaType = string7;
        this.brandPageHeaderMediaType = string8;
        this.brandLogoWidth = string9;
        this.brandImageWidth = string10;
        this.brandLogoHeight = string11;
        this.brandPageHeaderVideoDuration = string12;
        this.height = string13;
        this.width = string14;
    }

    public /* synthetic */ MetaData(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        String string20;
        String string21;
        String string22;
        String string23;
        String string24;
        String string25;
        int n4 = n3;
        int n7 = n3 & 1;
        String string26 = null;
        if (n7 != 0) {
            n7 = 0;
            string25 = null;
        } else {
            string25 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string24 = null;
        } else {
            string24 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string23 = null;
        } else {
            string23 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string22 = null;
        } else {
            string22 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string21 = null;
        } else {
            string21 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string20 = null;
        } else {
            string20 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string19 = null;
        } else {
            string19 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string18 = null;
        } else {
            string18 = string8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string17 = null;
        } else {
            string17 = string9;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            string16 = null;
        } else {
            string16 = string10;
        }
        int n21 = n4 & 0x400;
        if (n21 != 0) {
            n21 = 0;
            string15 = null;
        } else {
            string15 = string11;
        }
        int n22 = n4 & 0x800;
        if (n22 != 0) {
            n22 = 0;
            string14 = null;
        } else {
            string14 = string12;
        }
        if ((n4 &= 0x1000) == 0) {
            string26 = string13;
        }
        object = this;
        string2 = string25;
        string3 = string24;
        string4 = string23;
        string5 = string22;
        string6 = string21;
        string7 = string20;
        string8 = string19;
        string9 = string18;
        string10 = string17;
        string11 = string16;
        string12 = string15;
        string13 = string14;
        this(string25, string24, string23, string22, string21, string20, string19, string18, string17, string16, string15, string14, string26);
    }

    public static /* synthetic */ MetaData copy$default(MetaData metaData, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, int n3, Object object) {
        MetaData metaData2 = metaData;
        int n4 = n3;
        int n7 = n3 & 1;
        String string15 = n7 != 0 ? metaData.brandLogoMediaType : string2;
        int n8 = n4 & 2;
        String string16 = n8 != 0 ? metaData2.brandPageHeaderWidth : string3;
        int n10 = n4 & 4;
        String string17 = n10 != 0 ? metaData2.brandPageHeaderDuration : string4;
        int n14 = n4 & 8;
        String string18 = n14 != 0 ? metaData2.brandPageHeaderHeight : string5;
        int n15 = n4 & 0x10;
        String string19 = n15 != 0 ? metaData2.brandImageHeight : string6;
        int n16 = n4 & 0x20;
        String string20 = n16 != 0 ? metaData2.brandImageMediaType : string7;
        int n17 = n4 & 0x40;
        String string21 = n17 != 0 ? metaData2.brandPageHeaderMediaType : string8;
        int n18 = n4 & 0x80;
        String string22 = n18 != 0 ? metaData2.brandLogoWidth : string9;
        int n19 = n4 & 0x100;
        String string23 = n19 != 0 ? metaData2.brandImageWidth : string10;
        int n20 = n4 & 0x200;
        String string24 = n20 != 0 ? metaData2.brandLogoHeight : string11;
        int n21 = n4 & 0x400;
        String string25 = n21 != 0 ? metaData2.brandPageHeaderVideoDuration : string12;
        int n22 = n4 & 0x800;
        String string26 = n22 != 0 ? metaData2.height : string13;
        String string27 = (n4 &= 0x1000) != 0 ? metaData2.width : string14;
        string2 = string15;
        string3 = string16;
        string4 = string17;
        string5 = string18;
        string6 = string19;
        string7 = string20;
        string8 = string21;
        string9 = string22;
        string10 = string23;
        string11 = string24;
        string12 = string25;
        string13 = string26;
        string14 = string27;
        return metaData.copy(string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27);
    }

    public final String component1() {
        return this.brandLogoMediaType;
    }

    public final String component10() {
        return this.brandLogoHeight;
    }

    public final String component11() {
        return this.brandPageHeaderVideoDuration;
    }

    public final String component12() {
        return this.height;
    }

    public final String component13() {
        return this.width;
    }

    public final String component2() {
        return this.brandPageHeaderWidth;
    }

    public final String component3() {
        return this.brandPageHeaderDuration;
    }

    public final String component4() {
        return this.brandPageHeaderHeight;
    }

    public final String component5() {
        return this.brandImageHeight;
    }

    public final String component6() {
        return this.brandImageMediaType;
    }

    public final String component7() {
        return this.brandPageHeaderMediaType;
    }

    public final String component8() {
        return this.brandLogoWidth;
    }

    public final String component9() {
        return this.brandImageWidth;
    }

    public final MetaData copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {
        MetaData metaData = new MetaData(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14);
        return metaData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof MetaData;
        if (!bl3) {
            return false;
        }
        object = (MetaData)object;
        String string2 = this.brandLogoMediaType;
        String string3 = ((MetaData)object).brandLogoMediaType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandPageHeaderWidth;
        string3 = ((MetaData)object).brandPageHeaderWidth;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandPageHeaderDuration;
        string3 = ((MetaData)object).brandPageHeaderDuration;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandPageHeaderHeight;
        string3 = ((MetaData)object).brandPageHeaderHeight;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandImageHeight;
        string3 = ((MetaData)object).brandImageHeight;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandImageMediaType;
        string3 = ((MetaData)object).brandImageMediaType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandPageHeaderMediaType;
        string3 = ((MetaData)object).brandPageHeaderMediaType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandLogoWidth;
        string3 = ((MetaData)object).brandLogoWidth;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandImageWidth;
        string3 = ((MetaData)object).brandImageWidth;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandLogoHeight;
        string3 = ((MetaData)object).brandLogoHeight;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandPageHeaderVideoDuration;
        string3 = ((MetaData)object).brandPageHeaderVideoDuration;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.height;
        string3 = ((MetaData)object).height;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.width;
        object = ((MetaData)object).width;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrandImageHeight() {
        return this.brandImageHeight;
    }

    public final String getBrandImageMediaType() {
        return this.brandImageMediaType;
    }

    public final String getBrandImageWidth() {
        return this.brandImageWidth;
    }

    public final String getBrandLogoHeight() {
        return this.brandLogoHeight;
    }

    public final String getBrandLogoMediaType() {
        return this.brandLogoMediaType;
    }

    public final String getBrandLogoWidth() {
        return this.brandLogoWidth;
    }

    public final String getBrandPageHeaderDuration() {
        return this.brandPageHeaderDuration;
    }

    public final String getBrandPageHeaderHeight() {
        return this.brandPageHeaderHeight;
    }

    public final String getBrandPageHeaderMediaType() {
        return this.brandPageHeaderMediaType;
    }

    public final String getBrandPageHeaderVideoDuration() {
        return this.brandPageHeaderVideoDuration;
    }

    public final String getBrandPageHeaderWidth() {
        return this.brandPageHeaderWidth;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.brandLogoMediaType;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.brandPageHeaderWidth;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandPageHeaderDuration;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandPageHeaderHeight;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandImageHeight;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandImageMediaType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandPageHeaderMediaType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandLogoWidth;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandImageWidth;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandLogoHeight;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandPageHeaderVideoDuration;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.height;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.width;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setBrandImageHeight(String string2) {
        this.brandImageHeight = string2;
    }

    public final void setBrandImageMediaType(String string2) {
        this.brandImageMediaType = string2;
    }

    public final void setBrandImageWidth(String string2) {
        this.brandImageWidth = string2;
    }

    public final void setBrandLogoHeight(String string2) {
        this.brandLogoHeight = string2;
    }

    public final void setBrandLogoMediaType(String string2) {
        this.brandLogoMediaType = string2;
    }

    public final void setBrandLogoWidth(String string2) {
        this.brandLogoWidth = string2;
    }

    public final void setBrandPageHeaderDuration(String string2) {
        this.brandPageHeaderDuration = string2;
    }

    public final void setBrandPageHeaderHeight(String string2) {
        this.brandPageHeaderHeight = string2;
    }

    public final void setBrandPageHeaderMediaType(String string2) {
        this.brandPageHeaderMediaType = string2;
    }

    public final void setBrandPageHeaderWidth(String string2) {
        this.brandPageHeaderWidth = string2;
    }

    public String toString() {
        Serializable serializable = this;
        String string2 = this.brandLogoMediaType;
        String string3 = this.brandPageHeaderWidth;
        String string4 = this.brandPageHeaderDuration;
        String string5 = this.brandPageHeaderHeight;
        String string6 = this.brandImageHeight;
        String string7 = this.brandImageMediaType;
        String string8 = this.brandPageHeaderMediaType;
        String string9 = this.brandLogoWidth;
        String string10 = this.brandImageWidth;
        String string11 = this.brandLogoHeight;
        String string12 = this.brandPageHeaderVideoDuration;
        String string13 = this.height;
        String string14 = this.width;
        serializable = og_1.a("MetaData(brandLogoMediaType=", string2, ", brandPageHeaderWidth=", string3, ", brandPageHeaderDuration=");
        X50.a((StringBuilder)serializable, string4, ", brandPageHeaderHeight=", string5, ", brandImageHeight=");
        X50.a((StringBuilder)serializable, string6, ", brandImageMediaType=", string7, ", brandPageHeaderMediaType=");
        X50.a((StringBuilder)serializable, string8, ", brandLogoWidth=", string9, ", brandImageWidth=");
        X50.a((StringBuilder)serializable, string10, ", brandLogoHeight=", string11, ", brandPageHeaderVideoDuration=");
        X50.a((StringBuilder)serializable, string12, ", height=", string13, ", width=");
        return h30_0.a((StringBuilder)serializable, string14, ")");
    }
}

