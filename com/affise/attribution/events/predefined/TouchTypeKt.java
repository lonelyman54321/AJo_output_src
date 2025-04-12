/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.predefined;

import com.affise.attribution.events.predefined.TouchType;
import kotlin.jvm.internal.Intrinsics;

public final class TouchTypeKt {
    public static final TouchType toTouchType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        return TouchType.Companion.from(string2);
    }
}

