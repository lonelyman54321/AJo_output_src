/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.mediacodec.b;

public final class Rq
implements Runnable {
    public final /* synthetic */ b a;

    public /* synthetic */ Rq(b b2) {
        this.a = b2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        b b2 = this.a;
        Object object = b2.a;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                try {
                    boolean bl2 = b2.m;
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                long l2 = b2.l;
                long l3 = 1L;
                b2.l = l2 -= l3;
                l3 = 0L;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 > 0) {
                    return;
                }
                if (l4 < 0) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    b2.b(illegalStateException);
                    return;
                }
                b2.a();
                return;
            }
            throw throwable2;
        }
    }
}

