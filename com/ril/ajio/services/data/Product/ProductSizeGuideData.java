/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.services.data.Product;

import android.text.TextUtils;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class ProductSizeGuideData
implements Serializable {
    private String applicationName;
    private String brandCode;
    private String brickCode;
    private String fittingType;
    private String gender;
    private String planningCategory;
    private String productCode;
    private String seasonCode;
    private String styleType;
    private String vendorCode;

    public ProductSizeGuideData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public ProductSizeGuideData(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        this.brickCode = string2;
        this.brandCode = string3;
        this.applicationName = string4;
        this.vendorCode = string5;
        this.fittingType = string6;
        this.styleType = string7;
        this.seasonCode = string8;
        this.planningCategory = string9;
        this.productCode = string10;
        this.gender = string11;
    }

    public /* synthetic */ ProductSizeGuideData(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3;
        int n7 = n3 & 1;
        String string11 = "";
        Object object2 = n7 != 0 ? string11 : object;
        int n8 = n4 & 2;
        String string12 = n8 != 0 ? string11 : string2;
        int n10 = n4 & 4;
        String string13 = n10 != 0 ? string11 : string3;
        int n14 = n4 & 8;
        String string14 = n14 != 0 ? string11 : string4;
        int n15 = n4 & 0x10;
        String string15 = n15 != 0 ? string11 : string5;
        int n16 = n4 & 0x20;
        String string16 = n16 != 0 ? string11 : string6;
        int n17 = n4 & 0x40;
        String string17 = n17 != 0 ? string11 : string7;
        int n18 = n4 & 0x80;
        String string18 = n18 != 0 ? string11 : string8;
        int n19 = n4 & 0x100;
        String string19 = n19 != 0 ? string11 : string9;
        if ((n4 &= 0x200) == 0) {
            string11 = string10;
        }
        object = this;
        string2 = object2;
        string3 = string12;
        string4 = string13;
        string5 = string14;
        string6 = string15;
        string7 = string16;
        string8 = string17;
        string9 = string18;
        string10 = string19;
        this((String)object2, string12, string13, string14, string15, string16, string17, string18, string19, string11);
    }

    public static /* synthetic */ ProductSizeGuideData copy$default(ProductSizeGuideData productSizeGuideData, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, int n3, Object object) {
        ProductSizeGuideData productSizeGuideData2 = productSizeGuideData;
        int n4 = n3;
        int n7 = n3 & 1;
        String string12 = n7 != 0 ? productSizeGuideData.brickCode : string2;
        int n8 = n4 & 2;
        String string13 = n8 != 0 ? productSizeGuideData2.brandCode : string3;
        int n10 = n4 & 4;
        String string14 = n10 != 0 ? productSizeGuideData2.applicationName : string4;
        int n14 = n4 & 8;
        String string15 = n14 != 0 ? productSizeGuideData2.vendorCode : string5;
        int n15 = n4 & 0x10;
        String string16 = n15 != 0 ? productSizeGuideData2.fittingType : string6;
        int n16 = n4 & 0x20;
        String string17 = n16 != 0 ? productSizeGuideData2.styleType : string7;
        int n17 = n4 & 0x40;
        String string18 = n17 != 0 ? productSizeGuideData2.seasonCode : string8;
        int n18 = n4 & 0x80;
        String string19 = n18 != 0 ? productSizeGuideData2.planningCategory : string9;
        int n19 = n4 & 0x100;
        String string20 = n19 != 0 ? productSizeGuideData2.productCode : string10;
        String string21 = (n4 &= 0x200) != 0 ? productSizeGuideData2.gender : string11;
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
        return productSizeGuideData.copy(string12, string13, string14, string15, string16, string17, string18, string19, string20, string21);
    }

    public final String component1() {
        return this.brickCode;
    }

    public final String component10() {
        return this.gender;
    }

    public final String component2() {
        return this.brandCode;
    }

    public final String component3() {
        return this.applicationName;
    }

    public final String component4() {
        return this.vendorCode;
    }

    public final String component5() {
        return this.fittingType;
    }

    public final String component6() {
        return this.styleType;
    }

    public final String component7() {
        return this.seasonCode;
    }

    public final String component8() {
        return this.planningCategory;
    }

    public final String component9() {
        return this.productCode;
    }

    public final ProductSizeGuideData copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        ProductSizeGuideData productSizeGuideData = new ProductSizeGuideData(string2, string3, string4, string5, string6, string7, string8, string9, string10, string11);
        return productSizeGuideData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ProductSizeGuideData;
        if (!bl3) {
            return false;
        }
        object = (ProductSizeGuideData)object;
        String string2 = this.brickCode;
        String string3 = ((ProductSizeGuideData)object).brickCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandCode;
        string3 = ((ProductSizeGuideData)object).brandCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.applicationName;
        string3 = ((ProductSizeGuideData)object).applicationName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.vendorCode;
        string3 = ((ProductSizeGuideData)object).vendorCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.fittingType;
        string3 = ((ProductSizeGuideData)object).fittingType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.styleType;
        string3 = ((ProductSizeGuideData)object).styleType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.seasonCode;
        string3 = ((ProductSizeGuideData)object).seasonCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.planningCategory;
        string3 = ((ProductSizeGuideData)object).planningCategory;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.productCode;
        string3 = ((ProductSizeGuideData)object).productCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.gender;
        object = ((ProductSizeGuideData)object).gender;
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

    public final String getPlanningCategory() {
        return this.planningCategory;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getSeasonCode() {
        return this.seasonCode;
    }

    public final String getSizeGuideURL() {
        String string2 = this.planningCategory;
        Object object = "clothing";
        int n3 = 1;
        boolean bl2 = b.i(string2, (String)object, n3 != 0);
        string2 = bl2 ? "YES" : "NO";
        object = this.seasonCode;
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        String string3 = "%20";
        object = !bl3 ? this.seasonCode : string3;
        this.seasonCode = object;
        object = this.applicationName;
        bl3 = TextUtils.isEmpty((CharSequence)object);
        object = !bl3 ? this.applicationName : string3;
        this.applicationName = object;
        object = this.brickCode;
        bl3 = TextUtils.isEmpty((CharSequence)object);
        object = !bl3 ? this.brickCode : string3;
        this.brickCode = object;
        object = this.brandCode;
        bl3 = TextUtils.isEmpty((CharSequence)object);
        object = !bl3 ? this.brandCode : string3;
        this.brandCode = object;
        object = this.vendorCode;
        bl3 = TextUtils.isEmpty((CharSequence)object);
        object = !bl3 ? this.vendorCode : string3;
        this.vendorCode = object;
        object = this.fittingType;
        bl3 = TextUtils.isEmpty((CharSequence)object);
        object = !bl3 ? this.fittingType : string3;
        this.fittingType = object;
        object = this.styleType;
        bl3 = TextUtils.isEmpty((CharSequence)object);
        object = !bl3 ? this.styleType : string3;
        this.styleType = object;
        object = this.gender;
        bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3) {
            string3 = this.gender;
        }
        this.gender = string3;
        object = UrlHelper.Companion.getInstance();
        string3 = this.applicationName;
        String string4 = this.brickCode;
        String string5 = this.brandCode;
        String string6 = this.productCode;
        String string7 = this.gender;
        String string8 = this.seasonCode;
        String string9 = this.vendorCode;
        String string10 = this.fittingType;
        String string11 = this.styleType;
        Object[] objectArray = new Object[10];
        objectArray[0] = string3;
        objectArray[n3] = string4;
        objectArray[2] = string5;
        objectArray[3] = string6;
        objectArray[4] = string7;
        objectArray[5] = string2;
        objectArray[6] = string8;
        objectArray[7] = string9;
        objectArray[8] = string10;
        objectArray[9] = string11;
        return ((UrlHelper)object).getApiUrl("pdp", "size_guide_data", objectArray);
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
        String string2 = this.brickCode;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.brandCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.applicationName;
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
        string3 = this.fittingType;
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
        string3 = this.seasonCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.planningCategory;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.productCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.gender;
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

    public final void setPlanningCategory(String string2) {
        this.planningCategory = string2;
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

    public final void setVendorCode(String string2) {
        this.vendorCode = string2;
    }

    public String toString() {
        CharSequence charSequence = this.brickCode;
        String string2 = this.brandCode;
        String string3 = this.applicationName;
        String string4 = this.vendorCode;
        String string5 = this.fittingType;
        String string6 = this.styleType;
        String string7 = this.seasonCode;
        String string8 = this.planningCategory;
        String string9 = this.productCode;
        String string10 = this.gender;
        charSequence = og_1.a("ProductSizeGuideData(brickCode=", charSequence, ", brandCode=", string2, ", applicationName=");
        X50.a((StringBuilder)charSequence, string3, ", vendorCode=", string4, ", fittingType=");
        X50.a((StringBuilder)charSequence, string5, ", styleType=", string6, ", seasonCode=");
        X50.a((StringBuilder)charSequence, string7, ", planningCategory=", string8, ", productCode=");
        return ko_0.a((StringBuilder)charSequence, string9, ", gender=", string10, ")");
    }
}

