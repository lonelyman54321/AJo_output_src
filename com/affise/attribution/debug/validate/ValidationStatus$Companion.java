/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.debug.validate;

import com.affise.attribution.debug.validate.ValidationStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ValidationStatus$Companion {
    private ValidationStatus$Companion() {
    }

    public /* synthetic */ ValidationStatus$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final ValidationStatus from(String string2) {
        ValidationStatus validationStatus = null;
        if (string2 != null) {
            for (ValidationStatus validationStatus2 : ValidationStatus.values()) {
                String string3 = validationStatus2.getStatus();
                boolean bl2 = Intrinsics.areEqual(string3, string2);
                if (!bl2) continue;
                validationStatus = validationStatus2;
                break;
            }
        }
        return validationStatus;
    }
}

