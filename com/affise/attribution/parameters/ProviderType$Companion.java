/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.parameters;

import com.affise.attribution.parameters.ProviderType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ProviderType$Companion {
    private ProviderType$Companion() {
    }

    public /* synthetic */ ProviderType$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final ProviderType from(String string2) {
        ProviderType providerType = null;
        if (string2 != null) {
            for (ProviderType providerType2 : ProviderType.values()) {
                String string3 = providerType2.getProvider();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                providerType = providerType2;
                break;
            }
        }
        return providerType;
    }
}

