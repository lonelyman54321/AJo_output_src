/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.SystemClock
 */
package androidx.media3.exoplayer.upstream;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.Loader$LoadTask;
import androidx.media3.exoplayer.upstream.Loader$ReleaseTask;
import androidx.media3.exoplayer.upstream.Loader$a;
import androidx.media3.exoplayer.upstream.Loader$b;
import androidx.media3.exoplayer.upstream.Loader$c;
import androidx.media3.exoplayer.upstream.Loader$d;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class Loader {
    public static final Loader$b d;
    public static final Loader$b e;
    public final gi2_0 a;
    public Loader$LoadTask b;
    public IOException c;

    static {
        Loader$b loader$b;
        long l2 = -9223372036854775807L;
        d = loader$b = new Loader$b(2, l2);
        e = loader$b = new Loader$b(3, l2);
    }

    public Loader(gi2_0 gi2_02) {
        this.a = gi2_02;
    }

    public Loader(String object) {
        object = "ExoPlayer:Loader:".concat((String)object);
        Object object2 = new bz3((String)object);
        object = Executors.newSingleThreadExecutor((ThreadFactory)object2);
        object2 = new Object();
        fI2 fI22 = new fI2((ExecutorService)object, (tv1_0)object2);
        this(fI22);
    }

    public final void a() {
        Loader$LoadTask loader$LoadTask = this.b;
        ct3.h(loader$LoadTask);
        loader$LoadTask.a(false);
    }

    public final boolean b() {
        boolean bl2;
        Loader$LoadTask loader$LoadTask = this.b;
        if (loader$LoadTask != null) {
            bl2 = true;
        } else {
            bl2 = false;
            loader$LoadTask = null;
        }
        return bl2;
    }

    public final void c(int n3) {
        Object object = this.c;
        if (object == null) {
            object = this.b;
            if (object != null) {
                int n4;
                IOException iOException;
                int n7 = -1 << -1;
                if (n3 == n7) {
                    n3 = ((Loader$LoadTask)object).a;
                }
                if ((iOException = ((Loader$LoadTask)object).e) != null && (n4 = ((Loader$LoadTask)object).f) > n3) {
                    throw iOException;
                }
            }
            return;
        }
        throw object;
    }

    public final void d(Loader$d loader$d) {
        Object object = this.b;
        if (object != null) {
            boolean bl2 = true;
            ((Loader$LoadTask)object).a(bl2);
        }
        object = this.a;
        if (loader$d != null) {
            Loader$ReleaseTask loader$ReleaseTask = new Loader$ReleaseTask(loader$d);
            object.execute(loader$ReleaseTask);
        }
        object.release();
    }

    public final long e(Loader$c object, Loader$a loader$a, int n3) {
        boolean bl2;
        Looper looper = Looper.myLooper();
        ct3.h(looper);
        this.c = null;
        long l2 = SystemClock.elapsedRealtime();
        Loader$LoadTask loader$LoadTask = new Loader$LoadTask(this, looper, (Loader$c)object, loader$a, n3, l2);
        object = this.b;
        if (object == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        ct3.f(bl2);
        this.b = loader$LoadTask;
        loader$LoadTask.b();
        return l2;
    }
}

