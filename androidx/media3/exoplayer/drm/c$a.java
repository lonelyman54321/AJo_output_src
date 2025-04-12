/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.d;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.drm.c;
import androidx.media3.exoplayer.drm.c$b;
import androidx.media3.exoplayer.drm.f;

public final class c$a
implements c {
    public final void a(Looper looper, nu2 nu22) {
    }

    public final DrmSession b(b$a object, d object2) {
        object = ((d)object2).s;
        if (object == null) {
            return null;
        }
        UnsupportedDrmException unsupportedDrmException = new Exception();
        object2 = new DrmSession$DrmSessionException(unsupportedDrmException, 6001);
        object = new f((DrmSession$DrmSessionException)object2);
        return object;
    }

    public final int c(d object) {
        int n3;
        object = ((d)object).s;
        if (object != null) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final /* synthetic */ c$b d(b$a b$a, d d2) {
        return c$b.a;
    }

    public final /* synthetic */ void prepare() {
    }

    public final /* synthetic */ void release() {
    }
}

