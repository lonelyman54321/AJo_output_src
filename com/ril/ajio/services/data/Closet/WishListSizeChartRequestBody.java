/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Closet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class WishListSizeChartRequestBody {
    private String applicationName;
    private String brandCode;
    private String brickCode;
    private String fittingType;
    private String gender;
    private String productCode;
    private String seasonCode;
    private String styleType;
    private String subCategory;
    private String vendorCode;

    public WishListSizeChartRequestBody() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public WishListSizeChartRequestBody(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        this.applicationName = string2;
        this.productCode = string3;
        this.brickCode = string4;
        this.brandCode = string5;
        this.fittingType = string6;
        this.vendorCode = string7;
        this.seasonCode = string8;
        this.styleType = string9;
        this.gender = string10;
        this.subCategory = string11;
    }

    public /* synthetic */ WishListSizeChartRequestBody(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        int n4 = n3;
        int n7 = n3 & 1;
        String string20 = null;
        if (n7 != 0) {
            n7 = 0;
            string19 = null;
        } else {
            string19 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string18 = null;
        } else {
            string18 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string17 = null;
        } else {
            string17 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string16 = null;
        } else {
            string16 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string15 = null;
        } else {
            string15 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string14 = null;
        } else {
            string14 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string13 = null;
        } else {
            string13 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string12 = null;
        } else {
            string12 = string8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string11 = null;
        } else {
            string11 = string9;
        }
        if ((n4 &= 0x200) == 0) {
            string20 = string10;
        }
        object = this;
        string2 = string19;
        string3 = string18;
        string4 = string17;
        string5 = string16;
        string6 = string15;
        string7 = string14;
        string8 = string13;
        string9 = string12;
        string10 = string11;
        this(string19, string18, string17, string16, string15, string14, string13, string12, string11, string20);
    }

    public static /* synthetic */ WishListSizeChartRequestBody copy$default(WishListSizeChartRequestBody wishListSizeChartRequestBody, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, int n3, Object object) {
        WishListSizeChartRequestBody wishListSizeChartRequestBody2 = wishListSizeChartRequestBody;
        int n4 = n3;
        int n7 = n3 & 1;
        String string12 = n7 != 0 ? wishListSizeChartRequestBody.applicationName : string2;
        int n8 = n4 & 2;
        String string13 = n8 != 0 ? wishListSizeChartRequestBody2.productCode : string3;
        int n10 = n4 & 4;
        String string14 = n10 != 0 ? wishListSizeChartRequestBody2.brickCode : string4;
        int n14 = n4 & 8;
        String string15 = n14 != 0 ? wishListSizeChartRequestBody2.brandCode : string5;
        int n15 = n4 & 0x10;
        String string16 = n15 != 0 ? wishListSizeChartRequestBody2.fittingType : string6;
        int n16 = n4 & 0x20;
        String string17 = n16 != 0 ? wishListSizeChartRequestBody2.vendorCode : string7;
        int n17 = n4 & 0x40;
        String string18 = n17 != 0 ? wishListSizeChartRequestBody2.seasonCode : string8;
        int n18 = n4 & 0x80;
        String string19 = n18 != 0 ? wishListSizeChartRequestBody2.styleType : string9;
        int n19 = n4 & 0x100;
        String string20 = n19 != 0 ? wishListSizeChartRequestBody2.gender : string10;
        String string21 = (n4 &= 0x200) != 0 ? wishListSizeChartRequestBody2.subCategory : string11;
        string2 = string12;
        string3 = string13;
        string4 = string14;
        string5 = string15;
        string6 = string16;
        string7 = string17;
        string8 = string18;
        string9 = string19;
        string10 = string20;
        string11 = string21;
        return wishListSizeChartRequestBody.copy(string12, string13, string14, string15, string16, string17, string18, string19, string20, string21);
    }

    public final String component1() {
        return this.applicationName;
    }

    public final String component10() {
        return this.subCategory;
    }

    public final String component2() {
        return this.productCode;
    }

    public final String component3() {
        return this.brickCode;
    }

    public final String component4() {
        return this.brandCode;
    }

    public final String component5() {
        return this.fittingType;
    }

    public final String component6() {
        return this.vendorCode;
    }

    public final String component7() {
        return this.seasonCode;
    }

    public final String component8() {
        return this.styleType;
    }

    public final String component9() {
        return this.gender;
    }

    public final WishListSizeChartRequestBody copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        WishListSizeChartRequestBody wishListSizeChartRequestBody = new WishListSizeChartRequestBody(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11);
        return wishListSizeChartRequestBody;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof WishListSizeChartRequestBody;
        if (!bl3) {
            return false;
        }
        object = (WishListSizeChartRequestBody)object;
        String string2 = this.applicationName;
        String string3 = ((WishListSizeChartRequestBody)object).applicationName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.productCode;
        string3 = ((WishListSizeChartRequestBody)object).productCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brickCode;
        string3 = ((WishListSizeChartRequestBody)object).brickCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandCode;
        string3 = ((WishListSizeChartRequestBody)object).brandCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.fittingType;
        string3 = ((WishListSizeChartRequestBody)object).fittingType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.vendorCode;
        string3 = ((WishListSizeChartRequestBody)object).vendorCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.seasonCode;
        string3 = ((WishListSizeChartRequestBody)object).seasonCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.styleType;
        string3 = ((WishListSizeChartRequestBody)object).styleType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.gender;
        string3 = ((WishListSizeChartRequestBody)object).gender;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.subCategory;
        object = ((WishListSizeChartRequestBody)object).subCategory;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final String getBrandCode() {
        return this.brandCode;
    }

    public final String getBrickCode() {
        return this.brickCode;
    }

    public final String getFittingType() {
        return this.fittingType;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getSeasonCode() {
        return this.seasonCode;
    }

    public final String getStyleType() {
        return this.styleType;
    }

    public final String getSubCategory() {
        return this.subCategory;
    }

    public final String getVendorCode() {
        return this.vendorCode;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.applicationName;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.productCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brickCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.fittingType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.vendorCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.seasonCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.styleType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.gender;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.subCategory;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setApplicationName(String string2) {
        this.applicationName = string2;
    }

    public final void setBrandCode(String string2) {
        this.brandCode = string2;
    }

    public final void setBrickCode(String string2) {
        this.brickCode = string2;
    }

    public final void setFittingType(String string2) {
        this.fittingType = string2;
    }

    public final void setGender(String string2) {
        this.gender = string2;
    }

    public final void setProductCode(String string2) {
        this.productCode = string2;
    }

    public final void setSeasonCode(String string2) {
        this.seasonCode = string2;
    }

    public final void setStyleType(String string2) {
        this.styleType = string2;
    }

    public final void setSubCategory(String string2) {
        this.subCategory = string2;
    }

    public final void setVendorCode(String string2) {
        this.vendorCode = string2;
    }

    public String toString() {
        CharSequence charSequence = this.applicationName;
        String string2 = this.productCode;
        String string3 = this.brickCode;
        String string4 = this.brandCode;
        String string5 = this.fittingType;
        String string6 = this.vendorCode;
        String string7 = this.seasonCode;
        String string8 = this.styleType;
        String string9 = this.gender;
        String string10 = this.subCategory;
        charSequence = og_1.a("WishListSizeChartRequestBody(applicationName=", charSequence, ", productCode=", string2, ", brickCode=");
        X50.a((StringBuilder)charSequence, string3, ", brandCode=", string4, ", fittingType=");
        X50.a((StringBuilder)charSequence, string5, ", vendorCode=", string6, ", seasonCode=");
        X50.a((StringBuilder)charSequence, string7, ", styleType=", string8, ", gender=");
        return ko_0.a((StringBuilder)charSequence, string9, ", subCategory=", string10, ")");
    }
}

