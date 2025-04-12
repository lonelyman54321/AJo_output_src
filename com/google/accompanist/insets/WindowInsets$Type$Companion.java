/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.ImmutableWindowInsetsType;
import com.google.accompanist.insets.WindowInsets$Type;

public final class WindowInsets$Type$Companion {
    static final /* synthetic */ WindowInsets$Type$Companion $$INSTANCE;
    private static final WindowInsets$Type Empty;

    static {
        Object object = new WindowInsets$Type$Companion();
        $$INSTANCE = object;
        Empty = object = new ImmutableWindowInsetsType(null, null, false, false, 0.0f, 31, null);
    }

    private WindowInsets$Type$Companion() {
    }

    public final WindowInsets$Type getEmpty() {
        return Empty;
    }
}

