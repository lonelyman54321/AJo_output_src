/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ProductQuickFilterItem {
    private final String code;
    private final List values;

    public ProductQuickFilterItem() {
        this(null, null, 3, null);
    }

    public ProductQuickFilterItem(String string2, List list) {
        this.code = string2;
        this.values = list;
    }

    public /* synthetic */ ProductQuickFilterItem(String string2, List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            list = null;
        }
        this(string2, list);
    }

    public static /* synthetic */ ProductQuickFilterItem copy$default(ProductQuickFilterItem productQuickFilterItem, String string2, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = productQuickFilterItem.code;
        }
        if ((n3 &= 2) != 0) {
            list = productQuickFilterItem.values;
        }
        return productQuickFilterItem.copy(string2, list);
    }

    public final String component1() {
        return this.code;
    }

    public final List component2() {
        return this.values;
    }

    public final ProductQuickFilterItem copy(String string2, List list) {
        ProductQuickFilterItem productQuickFilterItem = new ProductQuickFilterItem(string2, list);
        return productQuickFilterItem;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ProductQuickFilterItem;
        if (!bl3) {
            return false;
        }
        object = (ProductQuickFilterItem)object;
        Object object2 = this.code;
        String string2 = ((ProductQuickFilterItem)object).code;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.values;
        object = ((ProductQuickFilterItem)object).values;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final List getValues() {
        return this.values;
    }

    public int hashCode() {
        int n3;
        String string2 = this.code;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        List list = this.values;
        if (list != null) {
            n4 = ((Object)list).hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.code;
        List list = this.values;
        StringBuilder stringBuilder = new StringBuilder("ProductQuickFilterItem(code=");
        stringBuilder.append(string2);
        stringBuilder.append(", values=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

