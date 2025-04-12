/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.videomodule.VideoViewAudioState;

/*
 * Renamed from com.jio.jioads.videomodule.J
 */
public final class j_0
implements VideoViewAudioState {
    public static final j_0 a;

    static {
        j_0 j_02;
        a = j_02 = new Object();
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof j_0;
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return -35054014;
    }

    public final String toString() {
        return "UN_MUTED";
    }
}

