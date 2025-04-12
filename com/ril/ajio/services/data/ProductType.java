/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import com.ril.ajio.services.query.CurrentQuery;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class ProductType {
    private int[] box;
    private final CurrentQuery query;
    private boolean selected;
    private final String type;

    public ProductType(String string2, int[] nArray, boolean bl2, CurrentQuery currentQuery) {
        Intrinsics.checkNotNullParameter(string2, "type");
        Intrinsics.checkNotNullParameter(nArray, "box");
        Intrinsics.checkNotNullParameter(currentQuery, "query");
        this.type = string2;
        this.box = nArray;
        this.selected = bl2;
        this.query = currentQuery;
    }

    public static /* synthetic */ ProductType copy$default(ProductType productType, String string2, int[] nArray, boolean bl2, CurrentQuery currentQuery, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = productType.type;
        }
        if ((n4 = n3 & 2) != 0) {
            nArray = productType.box;
        }
        if ((n4 = n3 & 4) != 0) {
            bl2 = productType.selected;
        }
        if ((n3 &= 8) != 0) {
            currentQuery = productType.query;
        }
        return productType.copy(string2, nArray, bl2, currentQuery);
    }

    public final String component1() {
        return this.type;
    }

    public final int[] component2() {
        return this.box;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final CurrentQuery component4() {
        return this.query;
    }

    public final ProductType copy(String string2, int[] nArray, boolean bl2, CurrentQuery currentQuery) {
        Intrinsics.checkNotNullParameter(string2, "type");
        Intrinsics.checkNotNullParameter(nArray, "box");
        Intrinsics.checkNotNullParameter(currentQuery, "query");
        ProductType productType = new ProductType(string2, nArray, bl2, currentQuery);
        return productType;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ProductType;
        if (!bl3) {
            return false;
        }
        object = (ProductType)object;
        Object object2 = this.type;
        Object object3 = ((ProductType)object).type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.box;
        object3 = ((ProductType)object).box;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.selected;
        boolean bl4 = ((ProductType)object).selected;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.query;
        object = ((ProductType)object).query;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int[] getBox() {
        return this.box;
    }

    public final CurrentQuery getQuery() {
        return this.query;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String string2 = this.type;
        int n3 = string2.hashCode() * 31;
        int[] nArray = this.box;
        int n4 = (Arrays.hashCode(nArray) + n3) * 31;
        n3 = (int)(this.selected ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        return this.query.hashCode() + n4;
    }

    public final void setBox(int[] nArray) {
        Intrinsics.checkNotNullParameter(nArray, "<set-?>");
        this.box = nArray;
    }

    public final void setSelected(boolean bl2) {
        this.selected = bl2;
    }

    public String toString() {
        CharSequence charSequence = this.type;
        String string2 = Arrays.toString(this.box);
        boolean bl2 = this.selected;
        CurrentQuery currentQuery = this.query;
        charSequence = og_1.a("ProductType(type=", (String)charSequence, ", box=", string2, ", selected=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(", query=");
        ((StringBuilder)charSequence).append(currentQuery);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

