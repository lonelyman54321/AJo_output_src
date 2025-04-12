/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.SystemClock
 */
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/*
 * Renamed from ph3
 */
public final class ph3_0
implements VV {
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    public final rh3_0 b(Looper looper, Handler.Callback callback2) {
        Handler handler = new Handler(looper, callback2);
        rh3_0 rh3_02 = new rh3_0(handler);
        return rh3_02;
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public final long nanoTime() {
        return System.nanoTime();
    }
}

