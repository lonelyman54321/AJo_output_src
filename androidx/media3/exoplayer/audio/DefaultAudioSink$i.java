/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package androidx.media3.exoplayer.audio;

import android.os.SystemClock;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

public final class DefaultAudioSink$i {
    public Exception a;
    public long b;
    public long c;

    public DefaultAudioSink$i() {
        long l2;
        this.b = l2 = -9223372036854775807L;
        this.c = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(Exception exception) {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        long l12 = SystemClock.elapsedRealtime();
        Object object = this.a;
        if (object == null) {
            this.a = exception;
        }
        if ((l8 = (l7 = (l4 = this.b) - (l3 = -9223372036854775807L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) {
            object = DefaultAudioSink.k0;
            // MONITORENTER : object
            int n3 = DefaultAudioSink.m0;
            n3 = n3 > 0 ? 1 : 0;
            // MONITOREXIT : object
            if (n3 == 0) {
                this.b = l4 = 200L + l12;
            }
        }
        if ((l8 = (l2 = (l4 = this.b) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false && (l8 = l12 == l4 ? 0 : (l12 < l4 ? -1 : 1)) >= 0) {
            Exception exception2 = this.a;
            if (exception2 != exception) {
                exception2.addSuppressed(exception);
            }
            exception = this.a;
            this.a = null;
            this.b = l3;
            this.c = l3;
            throw exception;
        }
        this.c = l12 += (long)50;
    }
}

