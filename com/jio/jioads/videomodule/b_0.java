/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.videomodule.JioVideoViewState;

/*
 * Renamed from com.jio.jioads.videomodule.B
 */
public final class b_0
implements JioVideoViewState {
    public static final b_0 a;

    static {
        b_0 b_02;
        a = b_02 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof b_0;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return -1216653043;
    }

    public final String toString() {
        return "PREPARING";
    }
}

