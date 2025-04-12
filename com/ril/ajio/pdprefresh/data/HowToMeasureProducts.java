/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class HowToMeasureProducts {
    public static final int $stable = 8;
    private String brandName;
    private String brickCategory;
    private String brickName;
    private String brickSubCategory;

    public HowToMeasureProducts() {
        this(null, null, null, null, 15, null);
    }

    public HowToMeasureProducts(String string2, String string3, String string4, String string5) {
        this.brickCategory = string2;
        this.brickName = string3;
        this.brickSubCategory = string4;
        this.brandName = string5;
    }

    public /* synthetic */ HowToMeasureProducts(String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = null;
        }
        if ((n3 &= 8) != 0) {
            string5 = null;
        }
        this(string2, string3, string4, string5);
    }

    public static /* synthetic */ HowToMeasureProducts copy$default(HowToMeasureProducts howToMeasureProducts, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = howToMeasureProducts.brickCategory;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = howToMeasureProducts.brickName;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = howToMeasureProducts.brickSubCategory;
        }
        if ((n3 &= 8) != 0) {
            string5 = howToMeasureProducts.brandName;
        }
        return howToMeasureProducts.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.brickCategory;
    }

    public final String component2() {
        return this.brickName;
    }

    public final String component3() {
        return this.brickSubCategory;
    }

    public final String component4() {
        return this.brandName;
    }

    public final HowToMeasureProducts copy(String string2, String string3, String string4, String string5) {
        HowToMeasureProducts howToMeasureProducts = new HowToMeasureProducts(string2, string3, string4, string5);
        return howToMeasureProducts;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HowToMeasureProducts;
        if (!bl3) {
            return false;
        }
        object = (HowToMeasureProducts)object;
        String string2 = this.brickCategory;
        String string3 = ((HowToMeasureProducts)object).brickCategory;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brickName;
        string3 = ((HowToMeasureProducts)object).brickName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brickSubCategory;
        string3 = ((HowToMeasureProducts)object).brickSubCategory;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.brandName;
        object = ((HowToMeasureProducts)object).brandName;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getBrickCategory() {
        return this.brickCategory;
    }

    public final String getBrickName() {
        return this.brickName;
    }

    public final String getBrickSubCategory() {
        return this.brickSubCategory;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.brickCategory;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.brickName;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brickSubCategory;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.brandName;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setBrandName(String string2) {
        this.brandName = string2;
    }

    public final void setBrickCategory(String string2) {
        this.brickCategory = string2;
    }

    public final void setBrickName(String string2) {
        this.brickName = string2;
    }

    public final void setBrickSubCategory(String string2) {
        this.brickSubCategory = string2;
    }

    public String toString() {
        String string2 = this.brickCategory;
        String string3 = this.brickName;
        String string4 = this.brickSubCategory;
        String string5 = this.brandName;
        return ko_0.a(og_1.a("HowToMeasureProducts(brickCategory=", string2, ", brickName=", string3, ", brickSubCategory="), string4, ", brandName=", string5, ")");
    }
}

