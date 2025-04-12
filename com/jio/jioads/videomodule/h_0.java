/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.videomodule.VideoViewAudioState;

/*
 * Renamed from com.jio.jioads.videomodule.H
 */
public final class h_0
implements VideoViewAudioState {
    public static final h_0 a;

    static {
        h_0 h_02;
        a = h_02 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof h_0;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return 715532366;
    }

    public final String toString() {
        return "MUTED";
    }
}

