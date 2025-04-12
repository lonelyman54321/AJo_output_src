/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules;

import com.affise.attribution.modules.AffiseModules;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

public final class AffiseModules$Companion {
    private AffiseModules$Companion() {
    }

    public /* synthetic */ AffiseModules$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final AffiseModules from(String string2) {
        AffiseModules affiseModules = null;
        if (string2 == null) {
            return null;
        }
        for (AffiseModules affiseModules2 : AffiseModules.values()) {
            boolean bl2;
            String string3 = affiseModules2.getModule();
            boolean bl3 = StringsKt.F(string3, string2, bl2 = true);
            if (!bl3) continue;
            affiseModules = affiseModules2;
            break;
        }
        return affiseModules;
    }
}

