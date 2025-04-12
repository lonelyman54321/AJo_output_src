/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import com.ril.ajio.services.data.user.LocationData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.b;

public final class LocationData$Companion {
    private LocationData$Companion() {
    }

    public /* synthetic */ LocationData$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isDiffLocaleData(LocationData object, LocationData object2) {
        boolean bl2;
        String string2;
        boolean bl3;
        String string3;
        boolean bl4 = true;
        if (object2 != null && object != null && (string3 = ((LocationData)object2).getCity()) != null && (bl3 = b.i(string3 = ((LocationData)object2).getCity(), string2 = ((LocationData)object).getCity(), bl4)) && (string3 = ((LocationData)object2).getState()) != null && (bl3 = b.i(string3 = ((LocationData)object2).getState(), string2 = ((LocationData)object).getState(), bl4)) && (string3 = ((LocationData)object2).getZone()) != null && (bl2 = b.i((String)(object2 = ((LocationData)object2).getZone()), (String)(object = ((LocationData)object).getZone()), bl4))) {
            return false;
        }
        return bl4;
    }
}

