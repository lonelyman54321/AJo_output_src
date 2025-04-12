/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdp.data;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class BrickBrandSizes {
    public static final int $stable = 8;
    private final ArrayList sizeChartAttributes;
    private final String sizeName;
    private final String sizePriority;

    public BrickBrandSizes(String string2, String string3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(string2, "sizeName");
        Intrinsics.checkNotNullParameter(string3, "sizePriority");
        Intrinsics.checkNotNullParameter(arrayList, "sizeChartAttributes");
        this.sizeName = string2;
        this.sizePriority = string3;
        this.sizeChartAttributes = arrayList;
    }

    public static /* synthetic */ BrickBrandSizes copy$default(BrickBrandSizes brickBrandSizes, String string2, String string3, ArrayList arrayList, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = brickBrandSizes.sizeName;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = brickBrandSizes.sizePriority;
        }
        if ((n3 &= 4) != 0) {
            arrayList = brickBrandSizes.sizeChartAttributes;
        }
        return brickBrandSizes.copy(string2, string3, arrayList);
    }

    public final String component1() {
        return this.sizeName;
    }

    public final String component2() {
        return this.sizePriority;
    }

    public final ArrayList component3() {
        return this.sizeChartAttributes;
    }

    public final BrickBrandSizes copy(String string2, String string3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(string2, "sizeName");
        Intrinsics.checkNotNullParameter(string3, "sizePriority");
        Intrinsics.checkNotNullParameter(arrayList, "sizeChartAttributes");
        BrickBrandSizes brickBrandSizes = new BrickBrandSizes(string2, string3, arrayList);
        return brickBrandSizes;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BrickBrandSizes;
        if (!bl3) {
            return false;
        }
        object = (BrickBrandSizes)object;
        Object object2 = this.sizeName;
        String string2 = ((BrickBrandSizes)object).sizeName;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.sizePriority;
        string2 = ((BrickBrandSizes)object).sizePriority;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.sizeChartAttributes;
        object = ((BrickBrandSizes)object).sizeChartAttributes;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getSizeChartAttributes() {
        return this.sizeChartAttributes;
    }

    public final String getSizeName() {
        return this.sizeName;
    }

    public final String getSizePriority() {
        return this.sizePriority;
    }

    public int hashCode() {
        int n3 = this.sizeName.hashCode() * 31;
        String string2 = this.sizePriority;
        n3 = zy_2.b(n3, 31, string2);
        return this.sizeChartAttributes.hashCode() + n3;
    }

    public String toString() {
        CharSequence charSequence = this.sizeName;
        String string2 = this.sizePriority;
        ArrayList arrayList = this.sizeChartAttributes;
        charSequence = og_1.a("BrickBrandSizes(sizeName=", (String)charSequence, ", sizePriority=", string2, ", sizeChartAttributes=");
        ((StringBuilder)charSequence).append(arrayList);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

