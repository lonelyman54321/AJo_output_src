/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.prioritydelivery;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SPCDelivery {
    private final Map deliverySLA;

    public SPCDelivery() {
        this(null, 1, null);
    }

    public SPCDelivery(Map map2) {
        this.deliverySLA = map2;
    }

    public /* synthetic */ SPCDelivery(Map map2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            map2 = null;
        }
        this(map2);
    }

    public static /* synthetic */ SPCDelivery copy$default(SPCDelivery sPCDelivery, Map map2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            map2 = sPCDelivery.deliverySLA;
        }
        return sPCDelivery.copy(map2);
    }

    public final Map component1() {
        return this.deliverySLA;
    }

    public final SPCDelivery copy(Map map2) {
        SPCDelivery sPCDelivery = new SPCDelivery(map2);
        return sPCDelivery;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SPCDelivery;
        if (!bl3) {
            return false;
        }
        object = (SPCDelivery)object;
        Map map2 = this.deliverySLA;
        object = ((SPCDelivery)object).deliverySLA;
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
        StringBuilder stringBuilder = new StringBuilder("SPCDelivery(deliverySLA=");
        stringBuilder.append(map2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

