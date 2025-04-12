/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.referrer;

import com.affise.attribution.referrer.ReferrerKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ReferrerKey$Companion {
    private ReferrerKey$Companion() {
    }

    public /* synthetic */ ReferrerKey$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final ReferrerKey from(String string2) {
        ReferrerKey referrerKey = null;
        if (string2 != null) {
            for (ReferrerKey referrerKey2 : ReferrerKey.values()) {
                String string3 = referrerKey2.getType();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                referrerKey = referrerKey2;
                break;
            }
        }
        return referrerKey;
    }
}

