/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PriorityDeliveryRefundTrackerData {
    public static final int $stable = 8;
    private String free;
    private final boolean isEnabledPostOrder;
    private String refundInitiated;
    private String refundYetToBeInitiated;
    private String refunded;

    public PriorityDeliveryRefundTrackerData() {
        this(false, null, null, null, null, 31, null);
    }

    public PriorityDeliveryRefundTrackerData(boolean bl2, String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "refundYetToBeInitiated");
        Intrinsics.checkNotNullParameter(string3, "refundInitiated");
        Intrinsics.checkNotNullParameter(string4, "refunded");
        Intrinsics.checkNotNullParameter(string5, "free");
        this.isEnabledPostOrder = bl2;
        this.refundYetToBeInitiated = string2;
        this.refundInitiated = string3;
        this.refunded = string4;
        this.free = string5;
    }

    public /* synthetic */ PriorityDeliveryRefundTrackerData(boolean bl2, String object, String string2, String object2, String string3, int n3, DefaultConstructorMarker object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = false;
        }
        n4 = n3 & 2;
        String string4 = "";
        object3 = n4 != 0 ? string4 : object;
        int n7 = n3 & 4;
        String string5 = n7 != 0 ? string4 : string2;
        n7 = n3 & 8;
        Object object4 = n7 != 0 ? string4 : object2;
        n7 = n3 & 0x10;
        if (n7 == 0) {
            string4 = string3;
        }
        object = this;
        object2 = object3;
        string3 = string5;
        object3 = string4;
        this(bl2, (String)object2, string5, (String)object4, string4);
    }

    public static /* synthetic */ PriorityDeliveryRefundTrackerData copy$default(PriorityDeliveryRefundTrackerData priorityDeliveryRefundTrackerData, boolean bl2, String object, String string2, String object2, String string3, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = priorityDeliveryRefundTrackerData.isEnabledPostOrder;
        }
        if ((n4 = n3 & 2) != 0) {
            object = priorityDeliveryRefundTrackerData.refundYetToBeInitiated;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string2 = priorityDeliveryRefundTrackerData.refundInitiated;
        }
        String string4 = string2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = priorityDeliveryRefundTrackerData.refunded;
        }
        String string5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string3 = priorityDeliveryRefundTrackerData.free;
        }
        String string6 = string3;
        object = priorityDeliveryRefundTrackerData;
        object2 = object3;
        string3 = string4;
        object3 = string6;
        return priorityDeliveryRefundTrackerData.copy(bl2, (String)object2, string4, string5, string6);
    }

    public final boolean component1() {
        return this.isEnabledPostOrder;
    }

    public final String component2() {
        return this.refundYetToBeInitiated;
    }

    public final String component3() {
        return this.refundInitiated;
    }

    public final String component4() {
        return this.refunded;
    }

    public final String component5() {
        return this.free;
    }

    public final PriorityDeliveryRefundTrackerData copy(boolean bl2, String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "refundYetToBeInitiated");
        Intrinsics.checkNotNullParameter(string3, "refundInitiated");
        Intrinsics.checkNotNullParameter(string4, "refunded");
        Intrinsics.checkNotNullParameter(string5, "free");
        PriorityDeliveryRefundTrackerData priorityDeliveryRefundTrackerData = new PriorityDeliveryRefundTrackerData(bl2, string2, string3, string4, string5);
        return priorityDeliveryRefundTrackerData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PriorityDeliveryRefundTrackerData;
        if (!bl3) {
            return false;
        }
        object = (PriorityDeliveryRefundTrackerData)object;
        bl3 = this.isEnabledPostOrder;
        boolean bl4 = ((PriorityDeliveryRefundTrackerData)object).isEnabledPostOrder;
        if (bl3 != bl4) {
            return false;
        }
        String string2 = this.refundYetToBeInitiated;
        String string3 = ((PriorityDeliveryRefundTrackerData)object).refundYetToBeInitiated;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.refundInitiated;
        string3 = ((PriorityDeliveryRefundTrackerData)object).refundInitiated;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.refunded;
        string3 = ((PriorityDeliveryRefundTrackerData)object).refunded;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.free;
        object = ((PriorityDeliveryRefundTrackerData)object).free;
        boolean bl5 = Intrinsics.areEqual(string2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getFree() {
        return this.free;
    }

    public final String getRefundInitiated() {
        return this.refundInitiated;
    }

    public final String getRefundYetToBeInitiated() {
        return this.refundYetToBeInitiated;
    }

    public final String getRefunded() {
        return this.refunded;
    }

    public int hashCode() {
        int n3 = this.isEnabledPostOrder;
        n3 = n3 != 0 ? 1231 : 1237;
        int n4 = 31;
        n3 *= 31;
        String string2 = this.refundYetToBeInitiated;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.refundInitiated;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.refunded;
        n3 = zy_2.b(n3, n4, string2);
        return this.free.hashCode() + n3;
    }

    public final boolean isEnabledPostOrder() {
        return this.isEnabledPostOrder;
    }

    public final void setFree(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.free = string2;
    }

    public final void setRefundInitiated(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.refundInitiated = string2;
    }

    public final void setRefundYetToBeInitiated(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.refundYetToBeInitiated = string2;
    }

    public final void setRefunded(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.refunded = string2;
    }

    public String toString() {
        boolean bl2 = this.isEnabledPostOrder;
        String string2 = this.refundYetToBeInitiated;
        String string3 = this.refundInitiated;
        String string4 = this.refunded;
        String string5 = this.free;
        StringBuilder stringBuilder = new StringBuilder("PriorityDeliveryRefundTrackerData(isEnabledPostOrder=");
        stringBuilder.append(bl2);
        stringBuilder.append(", refundYetToBeInitiated=");
        stringBuilder.append(string2);
        stringBuilder.append(", refundInitiated=");
        X50.a(stringBuilder, string3, ", refunded=", string4, ", free=");
        return h30_0.a(stringBuilder, string5, ")");
    }
}

