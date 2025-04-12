/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.PredefinedString;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PredefinedString$Companion {
    private PredefinedString$Companion() {
    }

    public /* synthetic */ PredefinedString$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final PredefinedString from(String string2) {
        PredefinedString predefinedString = null;
        if (string2 != null) {
            for (PredefinedString predefinedString2 : PredefinedString.values()) {
                CharSequence charSequence = new StringBuilder("affise_p_");
                String string3 = PredefinedString.access$getValue$p(predefinedString2);
                charSequence.append(string3);
                charSequence = charSequence.toString();
                boolean bl2 = Intrinsics.areEqual(charSequence, string2);
                if (!bl2) continue;
                predefinedString = predefinedString2;
                break;
            }
        }
        return predefinedString;
    }
}

