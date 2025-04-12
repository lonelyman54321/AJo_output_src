/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.prioritydelivery;

import kotlin.jvm.internal.Intrinsics;

public final class DeliveryTimeData {
    private final String displayName;
    private final boolean showDay;
    private final boolean showTime;

    public DeliveryTimeData(String string2, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(string2, "displayName");
        this.displayName = string2;
        this.showTime = bl2;
        this.showDay = bl3;
    }

    public static /* synthetic */ DeliveryTimeData copy$default(DeliveryTimeData deliveryTimeData, String string2, boolean bl2, boolean bl3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = deliveryTimeData.displayName;
        }
        if ((n4 = n3 & 2) != 0) {
            bl2 = deliveryTimeData.showTime;
        }
        if ((n3 &= 4) != 0) {
            bl3 = deliveryTimeData.showDay;
        }
        return deliveryTimeData.copy(string2, bl2, bl3);
    }

    public final String component1() {
        return this.displayName;
    }

    public final boolean component2() {
        return this.showTime;
    }

    public final boolean component3() {
        return this.showDay;
    }

    public final DeliveryTimeData copy(String string2, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(string2, "displayName");
        DeliveryTimeData deliveryTimeData = new DeliveryTimeData(string2, bl2, bl3);
        return deliveryTimeData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DeliveryTimeData;
        if (!bl3) {
            return false;
        }
        object = (DeliveryTimeData)object;
        String string2 = this.displayName;
        String string3 = ((DeliveryTimeData)object).displayName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.showTime;
        boolean bl4 = ((DeliveryTimeData)object).showTime;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.showDay;
        boolean bl5 = ((DeliveryTimeData)object).showDay;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getShowDay() {
        return this.showDay;
    }

    public final boolean getShowTime() {
        return this.showTime;
    }

    public int hashCode() {
        String string2 = this.displayName;
        int n3 = string2.hashCode() * 31;
        int n4 = this.showTime;
        int n7 = 1237;
        n4 = n4 != 0 ? 1231 : 1237;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.showDay ? 1 : 0);
        if (n4 != 0) {
            n7 = 1231;
        }
        return n3 + n7;
    }

    public String toString() {
        String string2 = this.displayName;
        boolean bl2 = this.showTime;
        boolean bl3 = this.showDay;
        StringBuilder stringBuilder = new StringBuilder("DeliveryTimeData(displayName=");
        stringBuilder.append(string2);
        stringBuilder.append(", showTime=");
        stringBuilder.append(bl2);
        stringBuilder.append(", showDay=");
        return Vm.a(")", bl3, stringBuilder);
    }
}

