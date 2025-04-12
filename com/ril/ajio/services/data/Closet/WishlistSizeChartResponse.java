/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Closet;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class WishlistSizeChartResponse {
    private String applicationName;
    private String brandCode;
    private String brickCode;
    private String errorDesc;
    private ArrayList errorList;
    private String fittingType;
    private String message;
    private ArrayList sizechart;
    private String styleType;
    private String vendorCode;

    public WishlistSizeChartResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public WishlistSizeChartResponse(String string2, String string3, String string4, String string5, ArrayList arrayList, String string6, String string7, ArrayList arrayList2, String string8, String string9) {
        this.applicationName = string2;
        this.brandCode = string3;
        this.brickCode = string4;
        this.errorDesc = string5;
        this.errorList = arrayList;
        this.fittingType = string6;
        this.message = string7;
        this.sizechart = arrayList2;
        this.styleType = string8;
        this.vendorCode = string9;
    }

    public /* synthetic */ WishlistSizeChartResponse(String object, String string2, String string3, String string4, ArrayList object2, String object3, String string5, ArrayList object4, String object5, String string6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string7;
        ArrayList arrayList;
        String string8;
        String string9;
        ArrayList arrayList2;
        String string10;
        String string11;
        String string12;
        String string13;
        int n4 = n3;
        int n7 = n3 & 1;
        String string14 = null;
        if (n7 != 0) {
            n7 = 0;
            string13 = null;
        } else {
            string13 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string12 = null;
        } else {
            string12 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string11 = null;
        } else {
            string11 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string10 = null;
        } else {
            string10 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            arrayList2 = null;
        } else {
            arrayList2 = object2;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string9 = null;
        } else {
            string9 = object3;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string8 = null;
        } else {
            string8 = string5;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            arrayList = null;
        } else {
            arrayList = object4;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            string7 = null;
        } else {
            string7 = object5;
        }
        if ((n4 &= 0x200) == 0) {
            string14 = string6;
        }
        object = this;
        string2 = string13;
        string3 = string12;
        string4 = string11;
        object2 = string10;
        object3 = arrayList2;
        string5 = string9;
        object4 = string8;
        object5 = arrayList;
        string6 = string7;
        this(string13, string12, string11, string10, arrayList2, string9, string8, arrayList, string7, string14);
    }

    public static /* synthetic */ WishlistSizeChartResponse copy$default(WishlistSizeChartResponse wishlistSizeChartResponse, String string2, String string3, String string4, String string5, ArrayList arrayList, String string6, String string7, ArrayList arrayList2, String string8, String string9, int n3, Object object) {
        WishlistSizeChartResponse wishlistSizeChartResponse2 = wishlistSizeChartResponse;
        int n4 = n3;
        int n7 = n3 & 1;
        String string10 = n7 != 0 ? wishlistSizeChartResponse.applicationName : string2;
        int n8 = n4 & 2;
        String string11 = n8 != 0 ? wishlistSizeChartResponse2.brandCode : string3;
        int n10 = n4 & 4;
        String string12 = n10 != 0 ? wishlistSizeChartResponse2.brickCode : string4;
        int n14 = n4 & 8;
        String string13 = n14 != 0 ? wishlistSizeChartResponse2.errorDesc : string5;
        int n15 = n4 & 0x10;
        ArrayList arrayList3 = n15 != 0 ? wishlistSizeChartResponse2.errorList : arrayList;
        int n16 = n4 & 0x20;
        String string14 = n16 != 0 ? wishlistSizeChartResponse2.fittingType : string6;
        int n17 = n4 & 0x40;
        String string15 = n17 != 0 ? wishlistSizeChartResponse2.message : string7;
        int n18 = n4 & 0x80;
        ArrayList arrayList4 = n18 != 0 ? wishlistSizeChartResponse2.sizechart : arrayList2;
        int n19 = n4 & 0x100;
        String string16 = n19 != 0 ? wishlistSizeChartResponse2.styleType : string8;
        String string17 = (n4 &= 0x200) != 0 ? wishlistSizeChartResponse2.vendorCode : string9;
        string2 = string10;
        string3 = string11;
        string4 = string12;
        string5 = string13;
        arrayList = arrayList3;
        string6 = string14;
        string7 = string15;
        arrayList2 = arrayList4;
        string8 = string16;
        string9 = string17;
        return wishlistSizeChartResponse.copy(string10, string11, string12, string13, arrayList3, string14, string15, arrayList4, string16, string17);
    }

    public final String component1() {
        return this.applicationName;
    }

    public final String component10() {
        return this.vendorCode;
    }

    public final String component2() {
        return this.brandCode;
    }

    public final String component3() {
        return this.brickCode;
    }

    public final String component4() {
        return this.errorDesc;
    }

    public final ArrayList component5() {
        return this.errorList;
    }

    public final String component6() {
        return this.fittingType;
    }

    public final String component7() {
        return this.message;
    }

    public final ArrayList component8() {
        return this.sizechart;
    }

    public final String component9() {
        return this.styleType;
    }

    public final WishlistSizeChartResponse copy(String string2, String string3, String string4, String string5, ArrayList arrayList, String string6, String string7, ArrayList arrayList2, String string8, String string9) {
        WishlistSizeChartResponse wishlistSizeChartResponse = new WishlistSizeChartResponse(string2, string3, string4, string5, arrayList, string6, string7, arrayList2, string8, string9);
        return wishlistSizeChartResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof WishlistSizeChartResponse;
        if (!bl3) {
            return false;
        }
        object = (WishlistSizeChartResponse)object;
        Object object2 = this.applicationName;
        Object object3 = ((WishlistSizeChartResponse)object).applicationName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brandCode;
        object3 = ((WishlistSizeChartResponse)object).brandCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.brickCode;
        object3 = ((WishlistSizeChartResponse)object).brickCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.errorDesc;
        object3 = ((WishlistSizeChartResponse)object).errorDesc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.errorList;
        object3 = ((WishlistSizeChartResponse)object).errorList;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.fittingType;
        object3 = ((WishlistSizeChartResponse)object).fittingType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((WishlistSizeChartResponse)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sizechart;
        object3 = ((WishlistSizeChartResponse)object).sizechart;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.styleType;
        object3 = ((WishlistSizeChartResponse)object).styleType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.vendorCode;
        object = ((WishlistSizeChartResponse)object).vendorCode;
        boolean bl4 = Intrinsics.areEqual(object2, object);
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

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final ArrayList getErrorList() {
        return this.errorList;
    }

    public final String getFittingType() {
        return this.fittingType;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ArrayList getSizechart() {
        return this.sizechart;
    }

    public final String getStyleType() {
        return this.styleType;
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
        Object object = this.brandCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.brickCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.errorDesc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.errorList;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.fittingType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.message;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.sizechart;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.styleType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.vendorCode;
        if (object != null) {
            n7 = ((String)object).hashCode();
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

    public final void setErrorDesc(String string2) {
        this.errorDesc = string2;
    }

    public final void setErrorList(ArrayList arrayList) {
        this.errorList = arrayList;
    }

    public final void setFittingType(String string2) {
        this.fittingType = string2;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setSizechart(ArrayList arrayList) {
        this.sizechart = arrayList;
    }

    public final void setStyleType(String string2) {
        this.styleType = string2;
    }

    public final void setVendorCode(String string2) {
        this.vendorCode = string2;
    }

    public String toString() {
        CharSequence charSequence = this.applicationName;
        String string2 = this.brandCode;
        String string3 = this.brickCode;
        String string4 = this.errorDesc;
        ArrayList arrayList = this.errorList;
        String string5 = this.fittingType;
        String string6 = this.message;
        ArrayList arrayList2 = this.sizechart;
        String string7 = this.styleType;
        String string8 = this.vendorCode;
        charSequence = og_1.a("WishlistSizeChartResponse(applicationName=", (String)charSequence, ", brandCode=", string2, ", brickCode=");
        X50.a((StringBuilder)charSequence, string3, ", errorDesc=", string4, ", errorList=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(", fittingType=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(", message=");
        ((StringBuilder)charSequence).append(string6);
        ((StringBuilder)charSequence).append(", sizechart=");
        ((StringBuilder)charSequence).append(arrayList2);
        ((StringBuilder)charSequence).append(", styleType=");
        return ko_0.a((StringBuilder)charSequence, string7, ", vendorCode=", string8, ")");
    }
}

