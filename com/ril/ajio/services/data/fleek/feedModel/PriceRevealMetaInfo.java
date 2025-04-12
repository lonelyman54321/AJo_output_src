/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriceRevealMetaInfo {
    private Integer saleEndTime;
    private Integer saleStartTime;

    public PriceRevealMetaInfo() {
        this(null, null, 3, null);
    }

    public PriceRevealMetaInfo(Integer n3, Integer n4) {
        this.saleEndTime = n3;
        this.saleStartTime = n4;
    }

    public /* synthetic */ PriceRevealMetaInfo(Integer n3, Integer n4, int n7, DefaultConstructorMarker defaultConstructorMarker) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = null;
        }
        if ((n7 &= 2) != 0) {
            n4 = null;
        }
        this(n3, n4);
    }

    public static /* synthetic */ PriceRevealMetaInfo copy$default(PriceRevealMetaInfo priceRevealMetaInfo, Integer n3, Integer n4, int n7, Object object) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = priceRevealMetaInfo.saleEndTime;
        }
        if ((n7 &= 2) != 0) {
            n4 = priceRevealMetaInfo.saleStartTime;
        }
        return priceRevealMetaInfo.copy(n3, n4);
    }

    public final Integer component1() {
        return this.saleEndTime;
    }

    public final Integer component2() {
        return this.saleStartTime;
    }

    public final PriceRevealMetaInfo copy(Integer n3, Integer n4) {
        PriceRevealMetaInfo priceRevealMetaInfo = new PriceRevealMetaInfo(n3, n4);
        return priceRevealMetaInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PriceRevealMetaInfo;
        if (!bl3) {
            return false;
        }
        object = (PriceRevealMetaInfo)object;
        Integer n3 = this.saleEndTime;
        Integer n4 = ((PriceRevealMetaInfo)object).saleEndTime;
        bl3 = Intrinsics.areEqual(n3, n4);
        if (!bl3) {
            return false;
        }
        n3 = this.saleStartTime;
        object = ((PriceRevealMetaInfo)object).saleStartTime;
        boolean bl4 = Intrinsics.areEqual(n3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getSaleEndTime() {
        return this.saleEndTime;
    }

    public final Integer getSaleStartTime() {
        return this.saleStartTime;
    }

    public int hashCode() {
        int n3;
        Integer n4 = this.saleEndTime;
        int n7 = 0;
        if (n4 == null) {
            n3 = 0;
            n4 = null;
        } else {
            n3 = ((Object)n4).hashCode();
        }
        n3 *= 31;
        Integer n8 = this.saleStartTime;
        if (n8 != null) {
            n7 = ((Object)n8).hashCode();
        }
        return n3 + n7;
    }

    public final void setSaleEndTime(Integer n3) {
        this.saleEndTime = n3;
    }

    public final void setSaleStartTime(Integer n3) {
        this.saleStartTime = n3;
    }

    public String toString() {
        Integer n3 = this.saleEndTime;
        Integer n4 = this.saleStartTime;
        StringBuilder stringBuilder = new StringBuilder("PriceRevealMetaInfo(saleEndTime=");
        stringBuilder.append(n3);
        stringBuilder.append(", saleStartTime=");
        stringBuilder.append(n4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

