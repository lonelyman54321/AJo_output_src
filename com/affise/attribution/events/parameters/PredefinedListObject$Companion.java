/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.PredefinedListObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PredefinedListObject$Companion {
    private PredefinedListObject$Companion() {
    }

    public /* synthetic */ PredefinedListObject$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final PredefinedListObject from(String string2) {
        PredefinedListObject predefinedListObject = null;
        if (string2 != null) {
            for (PredefinedListObject predefinedListObject2 : PredefinedListObject.values()) {
                CharSequence charSequence = new StringBuilder("affise_p_");
                String string3 = PredefinedListObject.access$getValue$p(predefinedListObject2);
                charSequence.append(string3);
                charSequence = charSequence.toString();
                boolean bl2 = Intrinsics.areEqual(charSequence, string2);
                if (!bl2) continue;
                predefinedListObject = predefinedListObject2;
                break;
            }
        }
        return predefinedListObject;
    }
}

