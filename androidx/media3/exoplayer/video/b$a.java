/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.SystemClock
 *  android.view.Surface
 */
package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.video.VideoSink$a;
import androidx.media3.exoplayer.video.b;
import androidx.media3.exoplayer.video.f$a;

public final class b$a
implements VideoSink$a {
    public final /* synthetic */ b b;

    public b$a(b b2) {
        this.b = b2;
    }

    public final void c() {
        b b2 = this.b;
        Surface surface = b2.g1;
        if (surface != null) {
            boolean bl2;
            f$a f$a = b2.V0;
            Handler handler = f$a.a;
            if (handler != null) {
                long l2 = SystemClock.elapsedRealtime();
                qc3_1 qc3_12 = new qc3_1(f$a, surface, l2);
                handler.post((Runnable)qc3_12);
            }
            b2.j1 = bl2 = true;
        }
    }

    public final void f() {
        b b2 = this.b;
        Surface surface = b2.g1;
        if (surface != null) {
            surface = null;
            int n3 = 1;
            b2.N0(0, n3);
        }
    }
}

