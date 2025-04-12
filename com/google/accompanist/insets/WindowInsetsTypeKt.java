/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.CalculatedWindowInsetsType;
import com.google.accompanist.insets.WindowInsets$Type;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class WindowInsetsTypeKt {
    public static final WindowInsets$Type derivedWindowInsetsTypeOf(WindowInsets$Type ... windowInsets$TypeArray) {
        Intrinsics.checkNotNullParameter(windowInsets$TypeArray, "types");
        int n3 = windowInsets$TypeArray.length;
        windowInsets$TypeArray = Arrays.copyOf(windowInsets$TypeArray, n3);
        CalculatedWindowInsetsType calculatedWindowInsetsType = new CalculatedWindowInsetsType(windowInsets$TypeArray);
        return calculatedWindowInsetsType;
    }
}

