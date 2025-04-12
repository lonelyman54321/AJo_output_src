/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.PredefinedObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PredefinedObject$Companion {
    private PredefinedObject$Companion() {
    }

    public /* synthetic */ PredefinedObject$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final PredefinedObject from(String string2) {
        PredefinedObject predefinedObject = null;
        if (string2 != null) {
            for (PredefinedObject predefinedObject2 : PredefinedObject.values()) {
                CharSequence charSequence = new StringBuilder("affise_p_");
                String string3 = PredefinedObject.access$getValue$p(predefinedObject2);
                charSequence.append(string3);
                charSequence = charSequence.toString();
                boolean bl2 = Intrinsics.areEqual(charSequence, string2);
                if (!bl2) continue;
                predefinedObject = predefinedObject2;
                break;
            }
        }
        return predefinedObject;
    }
}

