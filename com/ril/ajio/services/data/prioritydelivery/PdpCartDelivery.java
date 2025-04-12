/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.prioritydelivery;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PdpCartDelivery {
    private final Map deliverySLA;

    public PdpCartDelivery() {
        this(null, 1, null);
    }

    public PdpCartDelivery(Map map2) {
        this.deliverySLA = map2;
    }

    public /* synthetic */ PdpCartDelivery(Map map2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            map2 = null;
        }
        this(map2);
    }

    public static /* synthetic */ PdpCartDelivery copy$default(PdpCartDelivery pdpCartDelivery, Map map2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            map2 = pdpCartDelivery.deliverySLA;
        }
        return pdpCartDelivery.copy(map2);
    }

    public final Map component1() {
        return this.deliverySLA;
    }

    public final PdpCartDelivery copy(Map map2) {
        PdpCartDelivery pdpCartDelivery = new PdpCartDelivery(map2);
        return pdpCartDelivery;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PdpCartDelivery;
        if (!bl3) {
            return false;
        }
        object = (PdpCartDelivery)object;
        Map map2 = this.deliverySLA;
        object = ((PdpCartDelivery)object).deliverySLA;
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
        StringBuilder stringBuilder = new StringBuilder("PdpCartDelivery(deliverySLA=");
        stringBuilder.append(map2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

