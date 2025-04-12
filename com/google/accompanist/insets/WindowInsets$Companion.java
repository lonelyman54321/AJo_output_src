/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.ImmutableWindowInsets;
import com.google.accompanist.insets.WindowInsets;

public final class WindowInsets$Companion {
    static final /* synthetic */ WindowInsets$Companion $$INSTANCE;
    private static final WindowInsets Empty;

    static {
        Object object = new WindowInsets$Companion();
        $$INSTANCE = object;
        Empty = object = new ImmutableWindowInsets(null, null, null, null, null, 31, null);
    }

    private WindowInsets$Companion() {
    }

    public final WindowInsets getEmpty() {
        return Empty;
    }
}

