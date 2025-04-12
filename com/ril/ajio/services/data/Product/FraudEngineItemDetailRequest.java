/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FraudEngineItemDetailRequest {
    private String brand;
    private String brick;
    private String catalogId;
    private String category;
    private double mrp;
    private String name;
    private String optionCode;
    private double salesPrice;
    private String subCategory;

    public FraudEngineItemDetailRequest() {
        this(null, null, null, null, null, 0.0, 0.0, null, null, 511, null);
    }

    public FraudEngineItemDetailRequest(String string2, String string3, String string4, String string5, String string6, double d2, double d5, String string7, String string8) {
        this.brand = string2;
        this.brick = string3;
        this.catalogId = string4;
        this.category = string5;
        this.name = string6;
        this.salesPrice = d2;
        this.mrp = d5;
        this.optionCode = string7;
        this.subCategory = string8;
    }

    public /* synthetic */ FraudEngineItemDetailRequest(String object, String string2, String string3, String string4, String string5, double d2, double d5, String string6, String string7, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string8;
        String string9;
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
            string9 = null;
        } else {
            string9 = string5;
        }
        int n16 = n4 & 0x20;
        double d7 = 0.0;
        double d9 = n16 != 0 ? d7 : d2;
        n16 = n4 & 0x40;
        if (n16 == 0) {
            d7 = d5;
        }
        n16 = n4 & 0x80;
        if (n16 != 0) {
            n16 = 0;
            string8 = null;
        } else {
            string8 = string6;
        }
        if ((n4 &= 0x100) == 0) {
            string14 = string7;
        }
        object = this;
        string2 = string13;
        string3 = string12;
        string4 = string11;
        string5 = string10;
        string7 = string8;
        this(string13, string12, string11, string10, string9, d9, d7, string8, string14);
    }

    public static /* synthetic */ FraudEngineItemDetailRequest copy$default(FraudEngineItemDetailRequest fraudEngineItemDetailRequest, String string2, String string3, String string4, String string5, String string6, double d2, double d5, String string7, String string8, int n3, Object object) {
        FraudEngineItemDetailRequest fraudEngineItemDetailRequest2 = fraudEngineItemDetailRequest;
        int n4 = n3;
        int n7 = n3 & 1;
        String string9 = n7 != 0 ? fraudEngineItemDetailRequest.brand : string2;
        int n8 = n4 & 2;
        String string10 = n8 != 0 ? fraudEngineItemDetailRequest2.brick : string3;
        int n10 = n4 & 4;
        String string11 = n10 != 0 ? fraudEngineItemDetailRequest2.catalogId : string4;
        int n14 = n4 & 8;
        String string12 = n14 != 0 ? fraudEngineItemDetailRequest2.category : string5;
        int n15 = n4 & 0x10;
        String string13 = n15 != 0 ? fraudEngineItemDetailRequest2.name : string6;
        int n16 = n4 & 0x20;
        double d7 = n16 != 0 ? fraudEngineItemDetailRequest2.salesPrice : d2;
        int n17 = n4 & 0x40;
        double d9 = n17 != 0 ? fraudEngineItemDetailRequest2.mrp : d5;
        int n18 = n4 & 0x80;
        String string14 = n18 != 0 ? fraudEngineItemDetailRequest2.optionCode : string7;
        String string15 = (n4 &= 0x100) != 0 ? fraudEngineItemDetailRequest2.subCategory : string8;
        string2 = string9;
        string3 = string10;
        string4 = string11;
        string5 = string12;
        string6 = string13;
        d2 = d7;
        d5 = d9;
        string7 = string14;
        string8 = string15;
        return fraudEngineItemDetailRequest.copy(string9, string10, string11, string12, string13, d7, d9, string14, string15);
    }

    public final String component1() {
        return this.brand;
    }

    public final String component2() {
        return this.brick;
    }

    public final String component3() {
        return this.catalogId;
    }

    public final String component4() {
        return this.category;
    }

    public final String component5() {
        return this.name;
    }

    public final double component6() {
        return this.salesPrice;
    }

    public final double component7() {
        return this.mrp;
    }

    public final String component8() {
        return this.optionCode;
    }

    public final String component9() {
        return this.subCategory;
    }

    public final FraudEngineItemDetailRequest copy(String string2, String string3, String string4, String string5, String string6, double d2, double d5, String string7, String string8) {
        FraudEngineItemDetailRequest fraudEngineItemDetailRequest = new FraudEngineItemDetailRequest(string2, string3, string4, string5, string6, d2, d5, string7, string8);
        return fraudEngineItemDetailRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof FraudEngineItemDetailRequest;
        if (n3 == 0) {
            return false;
        }
        object = (FraudEngineItemDetailRequest)object;
        String string2 = this.brand;
        String string3 = ((FraudEngineItemDetailRequest)object).brand;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        string2 = this.brick;
        string3 = ((FraudEngineItemDetailRequest)object).brick;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        string2 = this.catalogId;
        string3 = ((FraudEngineItemDetailRequest)object).catalogId;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        string2 = this.category;
        string3 = ((FraudEngineItemDetailRequest)object).category;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        string2 = this.name;
        string3 = ((FraudEngineItemDetailRequest)object).name;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        double d2 = this.salesPrice;
        double d5 = ((FraudEngineItemDetailRequest)object).salesPrice;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        d2 = this.mrp;
        d5 = ((FraudEngineItemDetailRequest)object).mrp;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        string2 = this.optionCode;
        string3 = ((FraudEngineItemDetailRequest)object).optionCode;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.subCategory;
        object = ((FraudEngineItemDetailRequest)object).subCategory;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getBrick() {
        return this.brick;
    }

    public final String getCatalogId() {
        return this.catalogId;
    }

    public final String getCategory() {
        return this.category;
    }

    public final double getMrp() {
        return this.mrp;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOptionCode() {
        return this.optionCode;
    }

    public final double getSalesPrice() {
        return this.salesPrice;
    }

    public final String getSubCategory() {
        return this.subCategory;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.brand;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.brick;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.catalogId;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.category;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.name;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        long l2 = Double.doubleToLongBits(this.salesPrice);
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^ l3);
        n4 = (n4 + n10) * 31;
        double d2 = this.mrp;
        l2 = Double.doubleToLongBits(d2);
        long l4 = l2 >>> n8;
        n10 = (int)(l2 ^= l4);
        n4 = (n4 + n10) * 31;
        string3 = this.optionCode;
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

    public final void setBrand(String string2) {
        this.brand = string2;
    }

    public final void setBrick(String string2) {
        this.brick = string2;
    }

    public final void setCatalogId(String string2) {
        this.catalogId = string2;
    }

    public final void setCategory(String string2) {
        this.category = string2;
    }

    public final void setMrp(double d2) {
        this.mrp = d2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setOptionCode(String string2) {
        this.optionCode = string2;
    }

    public final void setSalesPrice(double d2) {
        this.salesPrice = d2;
    }

    public final void setSubCategory(String string2) {
        this.subCategory = string2;
    }

    public String toString() {
        CharSequence charSequence = this.brand;
        String string2 = this.brick;
        String string3 = this.catalogId;
        String string4 = this.category;
        String string5 = this.name;
        double d2 = this.salesPrice;
        double d5 = this.mrp;
        String string6 = this.optionCode;
        String string7 = this.subCategory;
        charSequence = og_1.a("FraudEngineItemDetailRequest(brand=", (String)charSequence, ", brick=", string2, ", catalogId=");
        X50.a((StringBuilder)charSequence, string3, ", category=", string4, ", name=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(", salesPrice=");
        ((StringBuilder)charSequence).append(d2);
        ((StringBuilder)charSequence).append(", mrp=");
        ((StringBuilder)charSequence).append(d5);
        ((StringBuilder)charSequence).append(", optionCode=");
        return ko_0.a((StringBuilder)charSequence, string6, ", subCategory=", string7, ")");
    }
}

