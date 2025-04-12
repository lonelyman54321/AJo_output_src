/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.PredefinedLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PredefinedLong$Companion {
    private PredefinedLong$Companion() {
    }

    public /* synthetic */ PredefinedLong$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final PredefinedLong from(String string2) {
        PredefinedLong predefinedLong = null;
        if (string2 != null) {
            for (PredefinedLong predefinedLong2 : PredefinedLong.values()) {
                CharSequence charSequence = new StringBuilder("affise_p_");
                String string3 = PredefinedLong.access$getValue$p(predefinedLong2);
                charSequence.append(string3);
                charSequence = charSequence.toString();
                boolean bl2 = Intrinsics.areEqual(charSequence, string2);
                if (!bl2) continue;
                predefinedLong = predefinedLong2;
                break;
            }
        }
        return predefinedLong;
    }
}

