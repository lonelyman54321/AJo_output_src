/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import com.affise.attribution.modules.subscription.TimeUnitType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class TimeUnitType$Companion {
    private TimeUnitType$Companion() {
    }

    public /* synthetic */ TimeUnitType$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final TimeUnitType from(String string2) {
        TimeUnitType timeUnitType = null;
        if (string2 != null) {
            for (TimeUnitType timeUnitType2 : TimeUnitType.values()) {
                String string3 = timeUnitType2.getValue();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                timeUnitType = timeUnitType2;
                break;
            }
        }
        return timeUnitType;
    }
}

