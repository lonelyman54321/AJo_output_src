/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.videomodule.JioVideoViewState;

/*
 * Renamed from com.jio.jioads.videomodule.F
 */
public final class f_0
implements JioVideoViewState {
    public static final f_0 a;

    static {
        f_0 f_02;
        a = f_02 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof f_0;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return -1045118473;
    }

    public final String toString() {
        return "STARTING";
    }
}

