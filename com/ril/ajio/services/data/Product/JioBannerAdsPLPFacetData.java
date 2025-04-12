/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.Intrinsics;

public final class JioBannerAdsPLPFacetData {
    private final int count;
    private final boolean enable;
    private String facet_type;
    private final String jioAdsKey;
    private float percentage;

    public JioBannerAdsPLPFacetData(String string2, float f5, int n3, String string3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "facet_type");
        Intrinsics.checkNotNullParameter(string3, "jioAdsKey");
        this.facet_type = string2;
        this.percentage = f5;
        this.count = n3;
        this.jioAdsKey = string3;
        this.enable = bl2;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ JioBannerAdsPLPFacetData copy$default(JioBannerAdsPLPFacetData jioBannerAdsPLPFacetData, String string2, float f5, int n3, String string3, boolean bl2, int n4, Object object) {
        boolean bl3;
        void var6_8;
        int n7 = var6_8 & 1;
        if (n7 != 0) {
            string2 = jioBannerAdsPLPFacetData.facet_type;
        }
        if ((n7 = var6_8 & 2) != 0) {
            f5 = jioBannerAdsPLPFacetData.percentage;
        }
        float f6 = f5;
        int n8 = var6_8 & 4;
        if (n8 != 0) {
            n3 = jioBannerAdsPLPFacetData.count;
        }
        int n10 = n3;
        n8 = var6_8 & 8;
        if (n8 != 0) {
            string3 = jioBannerAdsPLPFacetData.jioAdsKey;
        }
        String string4 = string3;
        n8 = var6_8 & 0x10;
        if (n8 != 0) {
            bl3 = jioBannerAdsPLPFacetData.enable;
        }
        void var13_15 = bl3;
        int n14 = n10;
        n7 = var13_15;
        return jioBannerAdsPLPFacetData.copy(string2, f6, n10, string4, (boolean)var13_15);
    }

    public final String component1() {
        return this.facet_type;
    }

    public final float component2() {
        return this.percentage;
    }

    public final int component3() {
        return this.count;
    }

    public final String component4() {
        return this.jioAdsKey;
    }

    public final boolean component5() {
        return this.enable;
    }

    public final JioBannerAdsPLPFacetData copy(String string2, float f5, int n3, String string3, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "facet_type");
        Intrinsics.checkNotNullParameter(string3, "jioAdsKey");
        JioBannerAdsPLPFacetData jioBannerAdsPLPFacetData = new JioBannerAdsPLPFacetData(string2, f5, n3, string3, bl2);
        return jioBannerAdsPLPFacetData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof JioBannerAdsPLPFacetData;
        if (n3 == 0) {
            return false;
        }
        object = (JioBannerAdsPLPFacetData)object;
        String string2 = this.facet_type;
        String string3 = ((JioBannerAdsPLPFacetData)object).facet_type;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        float f5 = this.percentage;
        float f6 = ((JioBannerAdsPLPFacetData)object).percentage;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        n3 = this.count;
        int n4 = ((JioBannerAdsPLPFacetData)object).count;
        if (n3 != n4) {
            return false;
        }
        string2 = this.jioAdsKey;
        string3 = ((JioBannerAdsPLPFacetData)object).jioAdsKey;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = (int)(this.enable ? 1 : 0);
        int n7 = ((JioBannerAdsPLPFacetData)object).enable;
        if (n3 != n7) {
            return false;
        }
        return bl2;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getFacet_type() {
        return this.facet_type;
    }

    public final String getJioAdsKey() {
        return this.jioAdsKey;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    public int hashCode() {
        String string2 = this.facet_type;
        int n3 = string2.hashCode();
        int n4 = 31;
        n3 *= 31;
        float f5 = this.percentage;
        n3 = UR0.a(f5, n3, n4);
        int n7 = this.count;
        n3 = (n3 + n7) * 31;
        String string3 = this.jioAdsKey;
        n3 = zy_2.b(n3, n4, string3);
        n4 = (int)(this.enable ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final void setFacet_type(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.facet_type = string2;
    }

    public final void setPercentage(float f5) {
        this.percentage = f5;
    }

    public String toString() {
        String string2 = this.facet_type;
        float f5 = this.percentage;
        int n3 = this.count;
        String string3 = this.jioAdsKey;
        boolean bl2 = this.enable;
        StringBuilder stringBuilder = new StringBuilder("JioBannerAdsPLPFacetData(facet_type=");
        stringBuilder.append(string2);
        stringBuilder.append(", percentage=");
        stringBuilder.append(f5);
        stringBuilder.append(", count=");
        h30_0.b(stringBuilder, n3, ", jioAdsKey=", string3, ", enable=");
        return Vm.a(")", bl2, stringBuilder);
    }
}

