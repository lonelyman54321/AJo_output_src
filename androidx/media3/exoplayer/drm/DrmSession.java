/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.b$a;
import java.util.UUID;

public interface DrmSession {
    public UUID a();

    public boolean b();

    public be0_0 c();

    public void d(b$a var1);

    public void e(b$a var1);

    public boolean f(String var1);

    public DrmSession$DrmSessionException getError();

    public int getState();
}

