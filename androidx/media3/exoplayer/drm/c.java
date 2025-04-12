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
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.drm.c$a;
import androidx.media3.exoplayer.drm.c$b;

public interface c {
    public static final c$a a;

    static {
        c$a c$a;
        a = c$a = new Object();
    }

    public void a(Looper var1, nu2 var2);

    public DrmSession b(b$a var1, d var2);

    public int c(d var1);

    public c$b d(b$a var1, d var2);

    public void prepare();

    public void release();
}

