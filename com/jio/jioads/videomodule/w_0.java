/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.videomodule.JioVideoViewState;

/*
 * Renamed from com.jio.jioads.videomodule.w
 */
public final class w_0
implements JioVideoViewState {
    public static final w_0 a;

    static {
        w_0 w_02;
        a = w_02 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof w_0;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return 222331045;
    }

    public final String toString() {
        return "PAUSED";
    }
}

