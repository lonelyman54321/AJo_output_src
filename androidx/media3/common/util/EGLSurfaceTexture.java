/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 *  android.opengl.EGLContext
 *  android.opengl.EGLDisplay
 *  android.opengl.EGLSurface
 *  android.os.Handler
 */
package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

public final class EGLSurfaceTexture
implements SurfaceTexture.OnFrameAvailableListener,
Runnable {
    public static final int[] g;
    public final Handler a;
    public final int[] b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public SurfaceTexture f;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[17];
        int[] nArray3 = nArray;
        nArray2[0] = 12352;
        nArray3[1] = 4;
        nArray2[2] = 12324;
        nArray3[3] = 8;
        nArray2[4] = 12323;
        nArray3[5] = 8;
        nArray2[6] = 12322;
        nArray3[7] = 8;
        nArray2[8] = 12321;
        nArray3[9] = 8;
        nArray2[10] = 12325;
        nArray3[11] = 0;
        nArray2[12] = 12327;
        nArray3[13] = 12344;
        nArray2[14] = 12339;
        nArray3[15] = 4;
        nArray3[16] = 12344;
        g = nArray;
    }

    public EGLSurfaceTexture(Handler object) {
        this.a = object;
        object = new int[1];
        this.b = (int[])object;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.a.post((Runnable)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        SurfaceTexture surfaceTexture = this.f;
        if (surfaceTexture == null) return;
        try {
            surfaceTexture.updateTexImage();
            return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
    }
}

