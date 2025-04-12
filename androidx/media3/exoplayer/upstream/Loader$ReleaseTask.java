/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.upstream.Loader$d;

final class Loader$ReleaseTask
implements Runnable {
    public final Loader$d a;

    public Loader$ReleaseTask(Loader$d d2) {
        this.a = d2;
    }

    public final void run() {
        Object object = (n)this.a;
        for (q q2 : ((n)object).u) {
            boolean bl2 = true;
            q2.r(bl2);
            DrmSession drmSession = q2.h;
            if (drmSession == null) continue;
            b$a b$a = q2.e;
            drmSession.e(b$a);
            q2.h = null;
            q2.g = null;
        }
        object = (fe_0)((n)object).n;
        eI0 eI02 = ((fe_0)object).b;
        if (eI02 != null) {
            eI02.release();
            ((fe_0)object).b = null;
        }
        ((fe_0)object).c = null;
    }
}

