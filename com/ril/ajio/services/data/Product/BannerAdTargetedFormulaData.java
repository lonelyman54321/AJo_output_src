/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BannerAdTargetedFormulaData {
    private String facetType;
    private String operatorType;
    private int percentage;

    public BannerAdTargetedFormulaData(String string2, String string3, int n3) {
        this.facetType = string2;
        this.operatorType = string3;
        this.percentage = n3;
    }

    public /* synthetic */ BannerAdTargetedFormulaData(String string2, String string3, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = null;
        }
        if ((n4 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3, n3);
    }

    public static /* synthetic */ BannerAdTargetedFormulaData copy$default(BannerAdTargetedFormulaData bannerAdTargetedFormulaData, String string2, String string3, int n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = bannerAdTargetedFormulaData.facetType;
        }
        if ((n7 = n4 & 2) != 0) {
            string3 = bannerAdTargetedFormulaData.operatorType;
        }
        if ((n4 &= 4) != 0) {
            n3 = bannerAdTargetedFormulaData.percentage;
        }
        return bannerAdTargetedFormulaData.copy(string2, string3, n3);
    }

    public final String component1() {
        return this.facetType;
    }

    public final String component2() {
        return this.operatorType;
    }

    public final int component3() {
        return this.percentage;
    }

    public final BannerAdTargetedFormulaData copy(String string2, String string3, int n3) {
        BannerAdTargetedFormulaData bannerAdTargetedFormulaData = new BannerAdTargetedFormulaData(string2, string3, n3);
        return bannerAdTargetedFormulaData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof BannerAdTargetedFormulaData;
        if (n3 == 0) {
            return false;
        }
        object = (BannerAdTargetedFormulaData)object;
        String string2 = this.facetType;
        String string3 = ((BannerAdTargetedFormulaData)object).facetType;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        string2 = this.operatorType;
        string3 = ((BannerAdTargetedFormulaData)object).operatorType;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.percentage;
        int n4 = ((BannerAdTargetedFormulaData)object).percentage;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final String getFacetType() {
        return this.facetType;
    }

    public final String getOperatorType() {
        return this.operatorType;
    }

    public final int getPercentage() {
        return this.percentage;
    }

    public int hashCode() {
        int n3;
        String string2 = this.facetType;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.operatorType;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = this.percentage;
        return n3 + n4;
    }

    public final void setFacetType(String string2) {
        this.facetType = string2;
    }

    public final void setOperatorType(String string2) {
        this.operatorType = string2;
    }

    public final void setPercentage(int n3) {
        this.percentage = n3;
    }

    public String toString() {
        CharSequence charSequence = this.facetType;
        String string2 = this.operatorType;
        int n3 = this.percentage;
        charSequence = og_1.a("BannerAdTargetedFormulaData(facetType=", charSequence, ", operatorType=", string2, ", percentage=");
        return g30.a(n3, ")", (StringBuilder)charSequence);
    }
}

