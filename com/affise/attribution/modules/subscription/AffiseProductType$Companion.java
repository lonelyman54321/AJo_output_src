/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import com.affise.attribution.modules.subscription.AffiseProductType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseProductType$Companion {
    private AffiseProductType$Companion() {
    }

    public /* synthetic */ AffiseProductType$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final AffiseProductType from(String string2) {
        AffiseProductType affiseProductType = null;
        if (string2 != null) {
            for (AffiseProductType affiseProductType2 : AffiseProductType.values()) {
                String string3 = affiseProductType2.getValue();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                affiseProductType = affiseProductType2;
                break;
            }
        }
        return affiseProductType;
    }
}

