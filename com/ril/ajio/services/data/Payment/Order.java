/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Order
implements Serializable {
    private Float amount;
    private Float netPayableAmount;
    private String orderId;

    public Order() {
        this(null, null, null, 7, null);
    }

    public Order(String string2, Float f5, Float f6) {
        this.orderId = string2;
        this.amount = f5;
        this.netPayableAmount = f6;
    }

    public /* synthetic */ Order(String string2, Float f5, Float f6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            f5 = Float.valueOf(0.0f);
        }
        if ((n3 &= 4) != 0) {
            f6 = Float.valueOf(0.0f);
        }
        this(string2, f5, f6);
    }

    public static /* synthetic */ Order copy$default(Order order, String string2, Float f5, Float f6, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = order.orderId;
        }
        if ((n4 = n3 & 2) != 0) {
            f5 = order.amount;
        }
        if ((n3 &= 4) != 0) {
            f6 = order.netPayableAmount;
        }
        return order.copy(string2, f5, f6);
    }

    public final String component1() {
        return this.orderId;
    }

    public final Float component2() {
        return this.amount;
    }

    public final Float component3() {
        return this.netPayableAmount;
    }

    public final Order copy(String string2, Float f5, Float f6) {
        Order order = new Order(string2, f5, f6);
        return order;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Order;
        if (!bl3) {
            return false;
        }
        object = (Order)object;
        Object object2 = this.orderId;
        Object object3 = ((Order)object).orderId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.amount;
        object3 = ((Order)object).amount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.netPayableAmount;
        object = ((Order)object).netPayableAmount;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getAmount() {
        return this.amount;
    }

    public final Float getNetPayableAmount() {
        return this.netPayableAmount;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.orderId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Float f5 = this.amount;
        if (f5 == null) {
            n3 = 0;
            f5 = null;
        } else {
            n3 = ((Object)f5).hashCode();
        }
        n4 = (n4 + n3) * 31;
        f5 = this.netPayableAmount;
        if (f5 != null) {
            n7 = ((Object)f5).hashCode();
        }
        return n4 + n7;
    }

    public final void setAmount(Float f5) {
        this.amount = f5;
    }

    public final void setNetPayableAmount(Float f5) {
        this.netPayableAmount = f5;
    }

    public final void setOrderId(String string2) {
        this.orderId = string2;
    }

    public String toString() {
        String string2 = this.orderId;
        Float f5 = this.amount;
        Float f6 = this.netPayableAmount;
        StringBuilder stringBuilder = new StringBuilder("Order(orderId=");
        stringBuilder.append(string2);
        stringBuilder.append(", amount=");
        stringBuilder.append(f5);
        stringBuilder.append(", netPayableAmount=");
        stringBuilder.append(f6);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

