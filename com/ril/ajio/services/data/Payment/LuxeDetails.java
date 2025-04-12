/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class LuxeDetails
implements Serializable {
    private List luxeProductDetails;
    private Float totalPrice;
    private Integer totalQuantity;

    public LuxeDetails(Float f5, Integer n3, List list) {
        Intrinsics.checkNotNullParameter(list, "luxeProductDetails");
        this.totalPrice = f5;
        this.totalQuantity = n3;
        this.luxeProductDetails = list;
    }

    public /* synthetic */ LuxeDetails(Float f5, Integer n3, List list, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 &= 1) != 0) {
            f5 = Float.valueOf(0.0f);
        }
        this(f5, n3, list);
    }

    public static /* synthetic */ LuxeDetails copy$default(LuxeDetails luxeDetails, Float f5, Integer n3, List list, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            f5 = luxeDetails.totalPrice;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = luxeDetails.totalQuantity;
        }
        if ((n4 &= 4) != 0) {
            list = luxeDetails.luxeProductDetails;
        }
        return luxeDetails.copy(f5, n3, list);
    }

    public final Float component1() {
        return this.totalPrice;
    }

    public final Integer component2() {
        return this.totalQuantity;
    }

    public final List component3() {
        return this.luxeProductDetails;
    }

    public final LuxeDetails copy(Float f5, Integer n3, List list) {
        Intrinsics.checkNotNullParameter(list, "luxeProductDetails");
        LuxeDetails luxeDetails = new LuxeDetails(f5, n3, list);
        return luxeDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LuxeDetails;
        if (!bl3) {
            return false;
        }
        object = (LuxeDetails)object;
        Object object2 = this.totalPrice;
        Number number = ((LuxeDetails)object).totalPrice;
        bl3 = Intrinsics.areEqual(object2, number);
        if (!bl3) {
            return false;
        }
        object2 = this.totalQuantity;
        number = ((LuxeDetails)object).totalQuantity;
        bl3 = Intrinsics.areEqual(object2, number);
        if (!bl3) {
            return false;
        }
        object2 = this.luxeProductDetails;
        object = ((LuxeDetails)object).luxeProductDetails;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getLuxeProductDetails() {
        return this.luxeProductDetails;
    }

    public final Float getTotalPrice() {
        return this.totalPrice;
    }

    public final Integer getTotalQuantity() {
        return this.totalQuantity;
    }

    public int hashCode() {
        int n3;
        Float f5 = this.totalPrice;
        int n4 = 0;
        if (f5 == null) {
            n3 = 0;
            f5 = null;
        } else {
            n3 = ((Object)f5).hashCode();
        }
        n3 *= 31;
        Integer n7 = this.totalQuantity;
        if (n7 != null) {
            n4 = ((Object)n7).hashCode();
        }
        n3 = (n3 + n4) * 31;
        return ((Object)this.luxeProductDetails).hashCode() + n3;
    }

    public final void setLuxeProductDetails(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.luxeProductDetails = list;
    }

    public final void setTotalPrice(Float f5) {
        this.totalPrice = f5;
    }

    public final void setTotalQuantity(Integer n3) {
        this.totalQuantity = n3;
    }

    public String toString() {
        Float f5 = this.totalPrice;
        Integer n3 = this.totalQuantity;
        List list = this.luxeProductDetails;
        StringBuilder stringBuilder = new StringBuilder("LuxeDetails(totalPrice=");
        stringBuilder.append(f5);
        stringBuilder.append(", totalQuantity=");
        stringBuilder.append(n3);
        stringBuilder.append(", luxeProductDetails=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

