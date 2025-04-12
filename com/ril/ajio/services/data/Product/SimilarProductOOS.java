/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SimilarProductOOS {
    private String colorGroup;
    private List products;
    private String size;

    public SimilarProductOOS() {
        this(null, null, null, 7, null);
    }

    public SimilarProductOOS(List list, String string2, String string3) {
        this.products = list;
        this.colorGroup = string2;
        this.size = string3;
    }

    public /* synthetic */ SimilarProductOOS(List list, String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            string3 = null;
        }
        this(list, string2, string3);
    }

    public static /* synthetic */ SimilarProductOOS copy$default(SimilarProductOOS similarProductOOS, List list, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = similarProductOOS.products;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = similarProductOOS.colorGroup;
        }
        if ((n3 &= 4) != 0) {
            string3 = similarProductOOS.size;
        }
        return similarProductOOS.copy(list, string2, string3);
    }

    public final List component1() {
        return this.products;
    }

    public final String component2() {
        return this.colorGroup;
    }

    public final String component3() {
        return this.size;
    }

    public final SimilarProductOOS copy(List list, String string2, String string3) {
        SimilarProductOOS similarProductOOS = new SimilarProductOOS(list, string2, string3);
        return similarProductOOS;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SimilarProductOOS;
        if (!bl3) {
            return false;
        }
        object = (SimilarProductOOS)object;
        Object object2 = this.products;
        Object object3 = ((SimilarProductOOS)object).products;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.colorGroup;
        object3 = ((SimilarProductOOS)object).colorGroup;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.size;
        object = ((SimilarProductOOS)object).size;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getColorGroup() {
        return this.colorGroup;
    }

    public final List getProducts() {
        return this.products;
    }

    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        int n3;
        int n4;
        List list = this.products;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = ((Object)list).hashCode();
        }
        n4 *= 31;
        String string2 = this.colorGroup;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.size;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }

    public final void setColorGroup(String string2) {
        this.colorGroup = string2;
    }

    public final void setProducts(List list) {
        this.products = list;
    }

    public final void setSize(String string2) {
        this.size = string2;
    }

    public String toString() {
        List list = this.products;
        String string2 = this.colorGroup;
        String string3 = this.size;
        StringBuilder stringBuilder = new StringBuilder("SimilarProductOOS(products=");
        stringBuilder.append(list);
        stringBuilder.append(", colorGroup=");
        stringBuilder.append(string2);
        stringBuilder.append(", size=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

