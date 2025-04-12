/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.PredefinedListString;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PredefinedListString$Companion {
    private PredefinedListString$Companion() {
    }

    public /* synthetic */ PredefinedListString$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final PredefinedListString from(String string2) {
        PredefinedListString predefinedListString = null;
        if (string2 != null) {
            for (PredefinedListString predefinedListString2 : PredefinedListString.values()) {
                CharSequence charSequence = new StringBuilder("affise_p_");
                String string3 = PredefinedListString.access$getValue$p(predefinedListString2);
                charSequence.append(string3);
                charSequence = charSequence.toString();
                boolean bl2 = Intrinsics.areEqual(charSequence, string2);
                if (!bl2) continue;
                predefinedListString = predefinedListString2;
                break;
            }
        }
        return predefinedListString;
    }
}

