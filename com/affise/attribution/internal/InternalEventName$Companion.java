/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.internal;

import com.affise.attribution.internal.InternalEventName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class InternalEventName$Companion {
    private InternalEventName$Companion() {
    }

    public /* synthetic */ InternalEventName$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final InternalEventName from(String string2) {
        InternalEventName internalEventName = null;
        if (string2 != null) {
            for (InternalEventName internalEventName2 : InternalEventName.values()) {
                String string3 = internalEventName2.getEventName();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                internalEventName = internalEventName2;
                break;
            }
        }
        return internalEventName;
    }
}

