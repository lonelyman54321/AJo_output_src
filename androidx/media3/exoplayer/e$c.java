/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaFormat
 */
package androidx.media3.exoplayer;

import android.media.MediaFormat;
import androidx.media3.common.d;
import androidx.media3.exoplayer.m$b;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;

public final class e$c
implements LB3,
jk_0,
m$b {
    public LB3 a;
    public jk_0 b;
    public LB3 c;
    public jk_0 d;

    public final void a(float[] fArray, long l2) {
        jk_0 jk_02 = this.d;
        if (jk_02 != null) {
            jk_02.a(fArray, l2);
        }
        if ((jk_02 = this.b) != null) {
            jk_02.a(fArray, l2);
        }
    }

    public final void f() {
        jk_0 jk_02 = this.d;
        if (jk_02 != null) {
            jk_02.f();
        }
        if ((jk_02 = this.b) != null) {
            jk_02.f();
        }
    }

    public final void j(int n3, Object object) {
        int n4 = 7;
        if (n3 != n4) {
            n4 = 8;
            if (n3 != n4) {
                n4 = 10000;
                if (n3 == n4) {
                    if ((object = (SphericalGLSurfaceView)((Object)object)) == null) {
                        n3 = 0;
                        Object var4_4 = null;
                        this.c = null;
                        this.d = null;
                    } else {
                        Object object2 = ((SphericalGLSurfaceView)((Object)object)).getVideoFrameMetadataListener();
                        this.c = object2;
                        this.d = object2 = ((SphericalGLSurfaceView)((Object)object)).getCameraMotionListener();
                    }
                }
            } else {
                this.b = object = (jk_0)object;
            }
        } else {
            this.a = object = (LB3)object;
        }
    }

    public final void q(long l2, long l3, d d2, MediaFormat mediaFormat) {
        LB3 lB3;
        LB3 lB32 = this.c;
        if (lB32 != null) {
            lB32.q(l2, l3, d2, mediaFormat);
        }
        if ((lB3 = this.a) != null) {
            lB3.q(l2, l3, d2, mediaFormat);
        }
    }
}

