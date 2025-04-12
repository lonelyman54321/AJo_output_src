/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.videomodule.JioVideoViewState;

public final class x
implements JioVideoViewState {
    public static final x a;

    static {
        x x5;
        a = x5 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof x;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return -1401038985;
    }

    public final String toString() {
        return "PLAYING";
    }
}

