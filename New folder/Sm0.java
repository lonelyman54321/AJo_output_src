/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

public final class Sm0 {
    public final Handler a;

    public Sm0() {
        Handler handler;
        this.a = handler = y21_0.a(Looper.getMainLooper());
    }

    public final void a(Runnable runnable2) {
        this.a.removeCallbacks(runnable2);
    }

    public final void b(long l2, Runnable runnable2) {
        this.a.postDelayed(runnable2, l2);
    }
}

