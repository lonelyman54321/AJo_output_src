/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.SystemClock
 */
package androidx.media3.exoplayer.audio;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.b$a;
import androidx.media3.exoplayer.audio.c$a;
import androidx.media3.exoplayer.audio.g$a;

public final class DefaultAudioSink$j
implements c$a {
    public final /* synthetic */ DefaultAudioSink a;

    public DefaultAudioSink$j(DefaultAudioSink defaultAudioSink) {
        this.a = defaultAudioSink;
    }

    public final void a(int n3, long l2) {
        DefaultAudioSink defaultAudioSink = this.a;
        Object object = defaultAudioSink.s;
        if (object != null) {
            long l3 = SystemClock.elapsedRealtime();
            long l4 = defaultAudioSink.d0;
            long l7 = l3 - l4;
            b$a b$a = ((g$a)defaultAudioSink.s).a.U0;
            defaultAudioSink = b$a.a;
            if (defaultAudioSink != null) {
                object = new Pr(b$a, n3, l2, l7);
                defaultAudioSink.post((Runnable)object);
            }
        }
    }

    public final void b(long l2) {
        StringBuilder stringBuilder = new StringBuilder("Ignoring impossibly large audio latency: ");
        stringBuilder.append(l2);
        Cx.f(stringBuilder.toString());
    }

    public final void c(long l2) {
        Object object = this.a.s;
        if (object != null) {
            object = ((g$a)object).a.U0;
            Handler handler = ((b$a)object).a;
            if (handler != null) {
                Or or = new Or((b$a)object, l2);
                handler.post((Runnable)or);
            }
        }
    }

    public final void d(long l2, long l3, long l4, long l7) {
        String string2 = ", ";
        StringBuilder stringBuilder = D70.c(l2, "Spurious audio timestamp (frame position mismatch): ", string2);
        stringBuilder.append(l3);
        fn0_2.b(stringBuilder, string2, l4, string2);
        stringBuilder.append(l7);
        stringBuilder.append(string2);
        DefaultAudioSink defaultAudioSink = this.a;
        l3 = defaultAudioSink.w();
        stringBuilder.append(l3);
        stringBuilder.append(string2);
        long l8 = defaultAudioSink.x();
        stringBuilder.append(l8);
        Cx.f(stringBuilder.toString());
    }

    public final void e(long l2, long l3, long l4, long l7) {
        String string2 = ", ";
        StringBuilder stringBuilder = D70.c(l2, "Spurious audio timestamp (system clock mismatch): ", string2);
        stringBuilder.append(l3);
        fn0_2.b(stringBuilder, string2, l4, string2);
        stringBuilder.append(l7);
        stringBuilder.append(string2);
        DefaultAudioSink defaultAudioSink = this.a;
        l3 = defaultAudioSink.w();
        stringBuilder.append(l3);
        stringBuilder.append(string2);
        long l8 = defaultAudioSink.x();
        stringBuilder.append(l8);
        Cx.f(stringBuilder.toString());
    }
}

