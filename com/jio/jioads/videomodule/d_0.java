/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.videomodule.JioVideoViewState;

/*
 * Renamed from com.jio.jioads.videomodule.D
 */
public final class d_0
implements JioVideoViewState {
    public static final d_0 a;

    static {
        d_0 d_02;
        a = d_02 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof d_0;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return 1381743348;
    }

    public final String toString() {
        return "RELEASED";
    }
}

