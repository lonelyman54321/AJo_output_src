/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.videomodule.JioVideoViewState;

/*
 * Renamed from com.jio.jioads.videomodule.u
 */
public final class u_0
implements JioVideoViewState {
    public static final u_0 a;

    static {
        u_0 u_02;
        a = u_02 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof u_0;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return 780766;
    }

    public final String toString() {
        return "IDEAL";
    }
}

