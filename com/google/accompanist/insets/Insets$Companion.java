/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.ImmutableInsets;
import com.google.accompanist.insets.Insets;

public final class Insets$Companion {
    static final /* synthetic */ Insets$Companion $$INSTANCE;
    private static final Insets Empty;

    static {
        Object object = new Insets$Companion();
        $$INSTANCE = object;
        Empty = object = new ImmutableInsets(0, 0, 0, 0, 15, null);
    }

    private Insets$Companion() {
    }

    public static /* synthetic */ Insets Insets$default(Insets$Companion insets$Companion, int n3, int n4, int n7, int n8, int n10, Object object) {
        int n14 = n10 & 1;
        if (n14 != 0) {
            n3 = 0;
        }
        if ((n14 = n10 & 2) != 0) {
            n4 = 0;
        }
        if ((n14 = n10 & 4) != 0) {
            n7 = 0;
        }
        if ((n10 &= 8) != 0) {
            n8 = 0;
        }
        return insets$Companion.Insets(n3, n4, n7, n8);
    }

    public final Insets Insets(int n3, int n4, int n7, int n8) {
        ImmutableInsets immutableInsets = new ImmutableInsets(n3, n4, n7, n8);
        return immutableInsets;
    }

    public final Insets getEmpty() {
        return Empty;
    }
}

