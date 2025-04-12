/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.predefined;

import com.affise.attribution.events.predefined.TouchType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class TouchType$Companion {
    private TouchType$Companion() {
    }

    public /* synthetic */ TouchType$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final TouchType from(String string2) {
        TouchType touchType = null;
        if (string2 != null) {
            for (TouchType touchType2 : TouchType.values()) {
                String string3 = TouchType.access$getType$p(touchType2);
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                touchType = touchType2;
                break;
            }
        }
        return touchType;
    }
}

