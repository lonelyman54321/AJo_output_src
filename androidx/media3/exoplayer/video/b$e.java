/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.os.SystemClock
 */
package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.d$d;
import androidx.media3.exoplayer.video.b;
import androidx.media3.exoplayer.video.d;
import androidx.media3.exoplayer.video.f$a;

public final class b$e
implements d$d,
Handler.Callback {
    public final Handler a;
    public final /* synthetic */ b b;

    public b$e(b b2, androidx.media3.exoplayer.mediacodec.d d2) {
        this.b = b2;
        b2 = gz3.k(this);
        this.a = b2;
        d2.d(this, (Handler)b2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(long l2) {
        b b2 = this.b;
        Object object = b2.y1;
        if (this != object) return;
        object = b2.L;
        if (object == null) {
            return;
        }
        long l3 = Long.MAX_VALUE;
        int n3 = 1;
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 == false) {
            b2.M0 = n3;
            return;
        }
        try {
            b2.C0(l2);
            object = b2.t1;
            wc3_0 wc3_02 = wc3_0.d;
            int n4 = ((wc3_0)object).equals(wc3_02);
            f$a f$a = b2.V0;
            if (n4 == 0 && (n4 = ((wc3_0)object).equals(wc3_02 = b2.u1)) == 0) {
                b2.u1 = object;
                f$a.b((wc3_0)object);
            }
            object = b2.O0;
            ((fj0)object).e = n4 = ((fj0)object).e + n3;
            object = b2.Y0;
            n4 = ((d)object).e;
            int n7 = 3;
            if (n4 != n7) {
                n4 = 1;
            } else {
                n4 = 0;
                wc3_02 = null;
            }
            ((d)object).e = n7;
            VV vV = ((d)object).l;
            long l4 = vV.elapsedRealtime();
            ((d)object).g = l4 = gz3.I(l4);
            if (n4 != 0 && (object = b2.g1) != null) {
                wc3_02 = f$a.a;
                if (wc3_02 != null) {
                    l4 = SystemClock.elapsedRealtime();
                    qc3_1 qc3_12 = new qc3_1(f$a, object, l4);
                    wc3_02.post(qc3_12);
                }
                b2.j1 = n3;
            }
            b2.j0(l2);
            return;
        }
        catch (ExoPlaybackException exoPlaybackException) {
            b2.N0 = exoPlaybackException;
        }
    }

    public final boolean handleMessage(Message message) {
        int n3 = message.what;
        if (n3 != 0) {
            return false;
        }
        n3 = message.arg1;
        int n4 = message.arg2;
        long l2 = n3;
        long l3 = 0xFFFFFFFFL;
        l2 = (l2 & l3) << 32;
        long l4 = n4;
        this.a(l2 |= (l3 &= l4));
        return true;
    }
}

