/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.PredefinedFloat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PredefinedFloat$Companion {
    private PredefinedFloat$Companion() {
    }

    public /* synthetic */ PredefinedFloat$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final PredefinedFloat from(String string2) {
        PredefinedFloat predefinedFloat = null;
        if (string2 != null) {
            for (PredefinedFloat predefinedFloat2 : PredefinedFloat.values()) {
                CharSequence charSequence = new StringBuilder("affise_p_");
                String string3 = PredefinedFloat.access$getValue$p(predefinedFloat2);
                charSequence.append(string3);
                charSequence = charSequence.toString();
                boolean bl2 = Intrinsics.areEqual(charSequence, string2);
                if (!bl2) continue;
                predefinedFloat = predefinedFloat2;
                break;
            }
        }
        return predefinedFloat;
    }
}

