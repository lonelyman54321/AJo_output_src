/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.google.firebase.sessions;

import android.os.SystemClock;
import com.google.firebase.sessions.TimeProvider;
import kotlin.time.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class WallClock
implements TimeProvider {
    public static final WallClock INSTANCE;
    private static final long US_PER_MILLIS = 1000L;

    static {
        WallClock wallClock;
        INSTANCE = wallClock = new WallClock();
    }

    private WallClock() {
    }

    public long currentTimeUs() {
        return System.currentTimeMillis() * 1000L;
    }

    public long elapsedRealtime-UwyO8pc() {
        long l2 = SystemClock.elapsedRealtime();
        aw0_1 aw0_12 = aw0_1.MILLISECONDS;
        return b.g(l2, aw0_12);
    }
}

