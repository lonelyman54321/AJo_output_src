/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Extra
implements Serializable {
    private final Double bookedOrders;
    private final Double bookedQuantity;
    private final Double rtoCount;
    private final Double rtoPercent;
    private final Double rvpCount;
    private final Double rvpPercent;

    public Extra() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Extra(Double d2, Double d5, Double d7, Double d9, Double d12, Double d13) {
        this.bookedOrders = d2;
        this.bookedQuantity = d5;
        this.rtoCount = d7;
        this.rtoPercent = d9;
        this.rvpCount = d12;
        this.rvpPercent = d13;
    }

    public /* synthetic */ Extra(Double serializable, Double object, Double d2, Double d5, Double d7, Double d9, int n3, DefaultConstructorMarker object2) {
        Double d12;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object2 = null;
        } else {
            object2 = serializable;
        }
        int n7 = n3 & 2;
        Object object3 = n7 != 0 ? null : object;
        n7 = n3 & 4;
        Double d13 = n7 != 0 ? null : d2;
        n7 = n3 & 8;
        Double d14 = n7 != 0 ? null : d5;
        n7 = n3 & 0x10;
        Double d15 = n7 != 0 ? null : d7;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            d12 = null;
        } else {
            d12 = d9;
        }
        serializable = this;
        object = object2;
        d2 = object3;
        d5 = d13;
        d7 = d14;
        d9 = d15;
        this((Double)object2, (Double)object3, d13, d14, d15, d12);
    }

    public static /* synthetic */ Extra copy$default(Extra extra, Double d2, Double serializable, Double d5, Double object, Double d7, Double d9, int n3, Object object2) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            d2 = extra.bookedOrders;
        }
        if ((n4 = n3 & 2) != 0) {
            serializable = extra.bookedQuantity;
        }
        object2 = serializable;
        int n7 = n3 & 4;
        if (n7 != 0) {
            d5 = extra.rtoCount;
        }
        Double d12 = d5;
        n7 = n3 & 8;
        if (n7 != 0) {
            object = extra.rtoPercent;
        }
        Double d13 = object;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            d7 = extra.rvpCount;
        }
        Double d14 = d7;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            d9 = extra.rvpPercent;
        }
        Double d15 = d9;
        serializable = extra;
        d5 = d2;
        object = object2;
        d7 = d12;
        d9 = d13;
        object2 = d15;
        return extra.copy(d2, (Double)object, d12, d13, d14, d15);
    }

    public final Double component1() {
        return this.bookedOrders;
    }

    public final Double component2() {
        return this.bookedQuantity;
    }

    public final Double component3() {
        return this.rtoCount;
    }

    public final Double component4() {
        return this.rtoPercent;
    }

    public final Double component5() {
        return this.rvpCount;
    }

    public final Double component6() {
        return this.rvpPercent;
    }

    public final Extra copy(Double d2, Double d5, Double d7, Double d9, Double d12, Double d13) {
        Extra extra = new Extra(d2, d5, d7, d9, d12, d13);
        return extra;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Extra;
        if (!bl3) {
            return false;
        }
        object = (Extra)object;
        Double d2 = this.bookedOrders;
        Double d5 = ((Extra)object).bookedOrders;
        bl3 = Intrinsics.areEqual((Object)d2, (Object)d5);
        if (!bl3) {
            return false;
        }
        d2 = this.bookedQuantity;
        d5 = ((Extra)object).bookedQuantity;
        bl3 = Intrinsics.areEqual((Object)d2, (Object)d5);
        if (!bl3) {
            return false;
        }
        d2 = this.rtoCount;
        d5 = ((Extra)object).rtoCount;
        bl3 = Intrinsics.areEqual((Object)d2, (Object)d5);
        if (!bl3) {
            return false;
        }
        d2 = this.rtoPercent;
        d5 = ((Extra)object).rtoPercent;
        bl3 = Intrinsics.areEqual((Object)d2, (Object)d5);
        if (!bl3) {
            return false;
        }
        d2 = this.rvpCount;
        d5 = ((Extra)object).rvpCount;
        bl3 = Intrinsics.areEqual((Object)d2, (Object)d5);
        if (!bl3) {
            return false;
        }
        d2 = this.rvpPercent;
        object = ((Extra)object).rvpPercent;
        boolean bl4 = Intrinsics.areEqual((Object)d2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Double getBookedOrders() {
        return this.bookedOrders;
    }

    public final Double getBookedQuantity() {
        return this.bookedQuantity;
    }

    public final Double getRtoCount() {
        return this.rtoCount;
    }

    public final Double getRtoPercent() {
        return this.rtoPercent;
    }

    public final Double getRvpCount() {
        return this.rvpCount;
    }

    public final Double getRvpPercent() {
        return this.rvpPercent;
    }

    public int hashCode() {
        int n3;
        int n4;
        Double d2 = this.bookedOrders;
        int n7 = 0;
        if (d2 == null) {
            n4 = 0;
            d2 = null;
        } else {
            n4 = ((Object)d2).hashCode();
        }
        n4 *= 31;
        Double d5 = this.bookedQuantity;
        if (d5 == null) {
            n3 = 0;
            d5 = null;
        } else {
            n3 = ((Object)d5).hashCode();
        }
        n4 = (n4 + n3) * 31;
        d5 = this.rtoCount;
        if (d5 == null) {
            n3 = 0;
            d5 = null;
        } else {
            n3 = ((Object)d5).hashCode();
        }
        n4 = (n4 + n3) * 31;
        d5 = this.rtoPercent;
        if (d5 == null) {
            n3 = 0;
            d5 = null;
        } else {
            n3 = ((Object)d5).hashCode();
        }
        n4 = (n4 + n3) * 31;
        d5 = this.rvpCount;
        if (d5 == null) {
            n3 = 0;
            d5 = null;
        } else {
            n3 = ((Object)d5).hashCode();
        }
        n4 = (n4 + n3) * 31;
        d5 = this.rvpPercent;
        if (d5 != null) {
            n7 = ((Object)d5).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Double d2 = this.bookedOrders;
        Double d5 = this.bookedQuantity;
        Double d7 = this.rtoCount;
        Double d9 = this.rtoPercent;
        Double d12 = this.rvpCount;
        Double d13 = this.rvpPercent;
        StringBuilder stringBuilder = new StringBuilder("Extra(bookedOrders=");
        stringBuilder.append(d2);
        stringBuilder.append(", bookedQuantity=");
        stringBuilder.append(d5);
        stringBuilder.append(", rtoCount=");
        stringBuilder.append(d7);
        stringBuilder.append(", rtoPercent=");
        stringBuilder.append(d9);
        stringBuilder.append(", rvpCount=");
        stringBuilder.append(d12);
        stringBuilder.append(", rvpPercent=");
        stringBuilder.append(d13);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

