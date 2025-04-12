/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.b$a;
import java.util.UUID;

public final class f
implements DrmSession {
    public final DrmSession$DrmSessionException a;

    public f(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.a = drmSession$DrmSessionException;
    }

    public final UUID a() {
        return OF.a;
    }

    public final boolean b() {
        return false;
    }

    public final be0_0 c() {
        return null;
    }

    public final void d(b$a b$a) {
    }

    public final void e(b$a b$a) {
    }

    public final boolean f(String string2) {
        return false;
    }

    public final DrmSession$DrmSessionException getError() {
        return this.a;
    }

    public final int getState() {
        return 1;
    }
}

