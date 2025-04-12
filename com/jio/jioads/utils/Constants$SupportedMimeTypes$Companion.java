/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

import com.jio.jioads.utils.Constants$SupportedMimeTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Constants$SupportedMimeTypes$Companion {
    public Constants$SupportedMimeTypes$Companion() {
    }

    public /* synthetic */ Constants$SupportedMimeTypes$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean contains(String string2) {
        Constants$SupportedMimeTypes constants$SupportedMimeTypes;
        boolean bl2;
        block3: {
            Intrinsics.checkNotNullParameter(string2, "value");
            Constants$SupportedMimeTypes[] constants$SupportedMimeTypesArray = Constants$SupportedMimeTypes.values();
            int n3 = constants$SupportedMimeTypesArray.length;
            bl2 = false;
            for (int i3 = 0; i3 < n3; ++i3) {
                constants$SupportedMimeTypes = constants$SupportedMimeTypesArray[i3];
                String string3 = constants$SupportedMimeTypes.getValue();
                boolean bl3 = Intrinsics.areEqual(string3, string2);
                if (!bl3) {
                    continue;
                }
                break block3;
            }
            constants$SupportedMimeTypes = null;
        }
        if (constants$SupportedMimeTypes != null) {
            bl2 = true;
        }
        return bl2;
    }
}

