/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.prioritydelivery;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ThankYouDelivery {
    private final Map deliverySLA;

    public ThankYouDelivery() {
        this(null, 1, null);
    }

    public ThankYouDelivery(Map map2) {
        this.deliverySLA = map2;
    }

    public /* synthetic */ ThankYouDelivery(Map map2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            map2 = null;
        }
        this(map2);
    }

    public static /* synthetic */ ThankYouDelivery copy$default(ThankYouDelivery thankYouDelivery, Map map2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            map2 = thankYouDelivery.deliverySLA;
        }
        return thankYouDelivery.copy(map2);
    }

    public final Map component1() {
        return this.deliverySLA;
    }

    public final ThankYouDelivery copy(Map map2) {
        ThankYouDelivery thankYouDelivery = new ThankYouDelivery(map2);
        return thankYouDelivery;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ThankYouDelivery;
        if (!bl3) {
            return false;
        }
        object = (ThankYouDelivery)object;
        Map map2 = this.deliverySLA;
        object = ((ThankYouDelivery)object).deliverySLA;
        boolean bl4 = Intrinsics.areEqual(map2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Map getDeliverySLA() {
        return this.deliverySLA;
    }

    public int hashCode() {
        int n3;
        Map map2 = this.deliverySLA;
        if (map2 == null) {
            n3 = 0;
            map2 = null;
        } else {
            n3 = ((Object)map2).hashCode();
        }
        return n3;
    }

    public String toString() {
        Map map2 = this.deliverySLA;
        StringBuilder stringBuilder = new StringBuilder("ThankYouDelivery(deliverySLA=");
        stringBuilder.append(map2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

