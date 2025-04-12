/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.drm.c$b;

public final class DefaultDrmSessionManager$c
implements c$b {
    public final b$a b;
    public DrmSession c;
    public boolean d;
    public final /* synthetic */ DefaultDrmSessionManager e;

    public DefaultDrmSessionManager$c(DefaultDrmSessionManager defaultDrmSessionManager, b$a b$a) {
        this.e = defaultDrmSessionManager;
        this.b = b$a;
    }

    public final void release() {
        Handler handler = this.e.u;
        handler.getClass();
        Dl0 dl0 = new Dl0(this, 0);
        gz3.L(handler, dl0);
    }
}

