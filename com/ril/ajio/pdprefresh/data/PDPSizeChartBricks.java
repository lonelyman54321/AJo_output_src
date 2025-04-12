/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.data;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PDPSizeChartBricks {
    public static final int $stable = 8;
    private ArrayList howToMeasureProducts;
    private Boolean isEnable;
    private Boolean isShowNewSizeGuideImage;

    public PDPSizeChartBricks() {
        this(null, null, null, 7, null);
    }

    public PDPSizeChartBricks(Boolean bl2, Boolean bl3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "howToMeasureProducts");
        this.isShowNewSizeGuideImage = bl2;
        this.isEnable = bl3;
        this.howToMeasureProducts = arrayList;
    }

    public /* synthetic */ PDPSizeChartBricks(Boolean bl2, Boolean bl3, ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = null;
        }
        if ((n3 &= 4) != 0) {
            arrayList = new ArrayList();
        }
        this(bl2, bl3, arrayList);
    }

    public static /* synthetic */ PDPSizeChartBricks copy$default(PDPSizeChartBricks pDPSizeChartBricks, Boolean bl2, Boolean bl3, ArrayList arrayList, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = pDPSizeChartBricks.isShowNewSizeGuideImage;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = pDPSizeChartBricks.isEnable;
        }
        if ((n3 &= 4) != 0) {
            arrayList = pDPSizeChartBricks.howToMeasureProducts;
        }
        return pDPSizeChartBricks.copy(bl2, bl3, arrayList);
    }

    public final Boolean component1() {
        return this.isShowNewSizeGuideImage;
    }

    public final Boolean component2() {
        return this.isEnable;
    }

    public final ArrayList component3() {
        return this.howToMeasureProducts;
    }

    public final PDPSizeChartBricks copy(Boolean bl2, Boolean bl3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "howToMeasureProducts");
        PDPSizeChartBricks pDPSizeChartBricks = new PDPSizeChartBricks(bl2, bl3, arrayList);
        return pDPSizeChartBricks;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PDPSizeChartBricks;
        if (!bl3) {
            return false;
        }
        object = (PDPSizeChartBricks)object;
        Serializable serializable = this.isShowNewSizeGuideImage;
        Boolean bl4 = ((PDPSizeChartBricks)object).isShowNewSizeGuideImage;
        bl3 = Intrinsics.areEqual(serializable, bl4);
        if (!bl3) {
            return false;
        }
        serializable = this.isEnable;
        bl4 = ((PDPSizeChartBricks)object).isEnable;
        bl3 = Intrinsics.areEqual(serializable, bl4);
        if (!bl3) {
            return false;
        }
        serializable = this.howToMeasureProducts;
        object = ((PDPSizeChartBricks)object).howToMeasureProducts;
        boolean bl5 = Intrinsics.areEqual(serializable, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getHowToMeasureProducts() {
        return this.howToMeasureProducts;
    }

    public int hashCode() {
        int n3;
        Boolean bl2 = this.isShowNewSizeGuideImage;
        int n4 = 0;
        if (bl2 == null) {
            n3 = 0;
            bl2 = null;
        } else {
            n3 = ((Object)bl2).hashCode();
        }
        n3 *= 31;
        Boolean bl3 = this.isEnable;
        if (bl3 != null) {
            n4 = ((Object)bl3).hashCode();
        }
        n3 = (n3 + n4) * 31;
        return this.howToMeasureProducts.hashCode() + n3;
    }

    public final Boolean isEnable() {
        return this.isEnable;
    }

    public final Boolean isShowNewSizeGuideImage() {
        return this.isShowNewSizeGuideImage;
    }

    public final void setEnable(Boolean bl2) {
        this.isEnable = bl2;
    }

    public final void setHowToMeasureProducts(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.howToMeasureProducts = arrayList;
    }

    public final void setShowNewSizeGuideImage(Boolean bl2) {
        this.isShowNewSizeGuideImage = bl2;
    }

    public String toString() {
        Boolean bl2 = this.isShowNewSizeGuideImage;
        Boolean bl3 = this.isEnable;
        ArrayList arrayList = this.howToMeasureProducts;
        StringBuilder stringBuilder = new StringBuilder("PDPSizeChartBricks(isShowNewSizeGuideImage=");
        stringBuilder.append(bl2);
        stringBuilder.append(", isEnable=");
        stringBuilder.append(bl3);
        stringBuilder.append(", howToMeasureProducts=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

