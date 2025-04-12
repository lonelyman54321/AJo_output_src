/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class PlatformData
implements Serializable {
    private final List upiAppsData;

    public PlatformData(List list) {
        Intrinsics.checkNotNullParameter(list, "upiAppsData");
        this.upiAppsData = list;
    }

    public static /* synthetic */ PlatformData copy$default(PlatformData platformData, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = platformData.upiAppsData;
        }
        return platformData.copy(list);
    }

    public final List component1() {
        return this.upiAppsData;
    }

    public final PlatformData copy(List list) {
        Intrinsics.checkNotNullParameter(list, "upiAppsData");
        PlatformData platformData = new PlatformData(list);
        return platformData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PlatformData;
        if (!bl3) {
            return false;
        }
        object = (PlatformData)object;
        List list = this.upiAppsData;
        object = ((PlatformData)object).upiAppsData;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getUpiAppsData() {
        return this.upiAppsData;
    }

    public int hashCode() {
        return ((Object)this.upiAppsData).hashCode();
    }

    public String toString() {
        List list = this.upiAppsData;
        StringBuilder stringBuilder = new StringBuilder("PlatformData(upiAppsData=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

