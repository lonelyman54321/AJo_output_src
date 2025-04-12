/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.videomodule.JioVideoViewState;

public final class z
implements JioVideoViewState {
    public static final z a;

    static {
        z z5;
        a = z5 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof z;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return 653489652;
    }

    public final String toString() {
        return "PREPARED";
    }
}

