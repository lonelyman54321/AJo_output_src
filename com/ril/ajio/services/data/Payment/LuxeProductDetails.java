/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class LuxeProductDetails
implements Serializable {
    private Float price;
    private Integer quantity;
    private String sku;

    public LuxeProductDetails(String string2, Float f5, Integer n3) {
        this.sku = string2;
        this.price = f5;
        this.quantity = n3;
    }

    public /* synthetic */ LuxeProductDetails(String string2, Float f5, Integer n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 &= 2) != 0) {
            f5 = Float.valueOf(0.0f);
        }
        this(string2, f5, n3);
    }

    public static /* synthetic */ LuxeProductDetails copy$default(LuxeProductDetails luxeProductDetails, String string2, Float f5, Integer n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = luxeProductDetails.sku;
        }
        if ((n7 = n4 & 2) != 0) {
            f5 = luxeProductDetails.price;
        }
        if ((n4 &= 4) != 0) {
            n3 = luxeProductDetails.quantity;
        }
        return luxeProductDetails.copy(string2, f5, n3);
    }

    public final String component1() {
        return this.sku;
    }

    public final Float component2() {
        return this.price;
    }

    public final Integer component3() {
        return this.quantity;
    }

    public final LuxeProductDetails copy(String string2, Float f5, Integer n3) {
        LuxeProductDetails luxeProductDetails = new LuxeProductDetails(string2, f5, n3);
        return luxeProductDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LuxeProductDetails;
        if (!bl3) {
            return false;
        }
        object = (LuxeProductDetails)object;
        Object object2 = this.sku;
        Object object3 = ((LuxeProductDetails)object).sku;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.price;
        object3 = ((LuxeProductDetails)object).price;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.quantity;
        object = ((LuxeProductDetails)object).quantity;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getPrice() {
        return this.price;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.sku;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Number number = this.price;
        if (number == null) {
            n3 = 0;
            number = null;
        } else {
            n3 = number.hashCode();
        }
        n4 = (n4 + n3) * 31;
        number = this.quantity;
        if (number != null) {
            n7 = number.hashCode();
        }
        return n4 + n7;
    }

    public final void setPrice(Float f5) {
        this.price = f5;
    }

    public final void setQuantity(Integer n3) {
        this.quantity = n3;
    }

    public final void setSku(String string2) {
        this.sku = string2;
    }

    public String toString() {
        String string2 = this.sku;
        Float f5 = this.price;
        Integer n3 = this.quantity;
        StringBuilder stringBuilder = new StringBuilder("LuxeProductDetails(sku=");
        stringBuilder.append(string2);
        stringBuilder.append(", price=");
        stringBuilder.append(f5);
        stringBuilder.append(", quantity=");
        stringBuilder.append(n3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

