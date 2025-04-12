/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.ad;

import com.affise.attribution.ad.AffiseAdSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseAdSource$Companion {
    private AffiseAdSource$Companion() {
    }

    public /* synthetic */ AffiseAdSource$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final AffiseAdSource from(String string2) {
        AffiseAdSource affiseAdSource = null;
        if (string2 != null) {
            for (AffiseAdSource affiseAdSource2 : AffiseAdSource.values()) {
                String string3 = affiseAdSource2.getType();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                affiseAdSource = affiseAdSource2;
                break;
            }
        }
        return affiseAdSource;
    }
}

