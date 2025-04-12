/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.autoCatchingClick;

import com.affise.attribution.events.autoCatchingClick.AutoCatchingType;
import kotlin.jvm.internal.Intrinsics;

public final class AutoCatchingTypeKt {
    public static final AutoCatchingType toAutoCatchingType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        return AutoCatchingType.Companion.from(string2);
    }
}

