/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.autoCatchingClick;

import com.affise.attribution.events.autoCatchingClick.AutoCatchingType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AutoCatchingType$Companion {
    private AutoCatchingType$Companion() {
    }

    public /* synthetic */ AutoCatchingType$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final AutoCatchingType from(String string2) {
        AutoCatchingType autoCatchingType = null;
        if (string2 != null) {
            for (AutoCatchingType autoCatchingType2 : AutoCatchingType.values()) {
                String string3 = AutoCatchingType.access$getType$p(autoCatchingType2);
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                autoCatchingType = autoCatchingType2;
                break;
            }
        }
        return autoCatchingType;
    }
}

