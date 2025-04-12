/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 *  android.opengl.EGL14
 *  android.opengl.EGLConfig
 *  android.opengl.EGLContext
 *  android.opengl.EGLDisplay
 *  android.opengl.EGLSurface
 *  android.opengl.GLES20
 *  android.opengl.GLU
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzew;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzez;
import java.util.Locale;

public final class zzex
implements SurfaceTexture.OnFrameAvailableListener,
Runnable {
    private static final int[] zza;
    private final Handler zzb;
    private final int[] zzc;
    private EGLDisplay zzd;
    private EGLContext zze;
    private EGLSurface zzf;
    private SurfaceTexture zzg;

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
        zza = nArray;
    }

    public zzex(Handler object, zzew zzew2) {
        this.zzb = object;
        object = new int[1];
        this.zzc = (int[])object;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzb.post((Runnable)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        SurfaceTexture surfaceTexture = this.zzg;
        if (surfaceTexture == null) return;
        try {
            surfaceTexture.updateTexImage();
            return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
    }

    public final SurfaceTexture zza() {
        SurfaceTexture surfaceTexture = this.zzg;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    /*
     * WARNING - void declaration
     */
    public final void zzb(int object) {
        char c2;
        String string2;
        Object object2;
        Object object3;
        void var19_29;
        Object object4;
        boolean bl2;
        int bl3 = 3;
        int n3 = 2;
        Object object5 = EGL14.eglGetDisplay((int)0);
        int n4 = 1;
        if (object5 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object4 = null;
        }
        zzez.zza(bl2, "eglGetDisplay failed");
        object4 = new int[n3];
        bl2 = EGL14.eglInitialize((EGLDisplay)object5, (int[])object4, (int)0, (int[])object4, (int)n4);
        zzez.zza(bl2, "eglInitialize failed");
        this.zzd = object5;
        EGLConfig eGLConfig = new EGLConfig[n4];
        int[] nArray = new int[n4];
        object4 = zza;
        int n7 = 1;
        int n8 = 0;
        Object object6 = null;
        int n10 = 0;
        Object object7 = null;
        int n14 = 0;
        Object[] objectArray = null;
        EGLConfig eGLConfig2 = eGLConfig;
        boolean bl4 = EGL14.eglChooseConfig((EGLDisplay)object5, (int[])object4, (int)0, (EGLConfig[])eGLConfig, (int)0, (int)n7, (int[])nArray, (int)0);
        if (bl4 && (bl2 = nArray[0]) > false && (object4 = (Object)eGLConfig[0]) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object4 = null;
        }
        object5 = bl4;
        object7 = nArray[0];
        eGLConfig2 = eGLConfig[0];
        objectArray = new Object[bl3];
        objectArray[0] = object5;
        objectArray[n4] = object7;
        objectArray[n3] = eGLConfig2;
        object5 = Locale.US;
        object7 = "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s";
        object5 = String.format((Locale)object5, (String)object7, objectArray);
        zzez.zza(bl2, (String)object5);
        object5 = eGLConfig[0];
        object4 = this.zzd;
        n10 = 12992;
        int n15 = 12440;
        n14 = 4;
        n7 = 5;
        int n16 = 12344;
        if (object == 0) {
            object6 = new int[bl3];
            object6[0] = n15;
            object6[n4] = n3;
            object6[n3] = n16;
        } else {
            object6 = new int[n7];
            object6[0] = n15;
            object6[n4] = n3;
            object6[n3] = n10;
            object6[bl3] = n4;
            object6[n14] = n16;
        }
        eGLConfig2 = EGL14.EGL_NO_CONTEXT;
        object4 = EGL14.eglCreateContext((EGLDisplay)object4, (EGLConfig)object5, (EGLContext)eGLConfig2, (int[])object6, (int)0);
        if (object4 != null) {
            boolean bl5 = true;
        } else {
            boolean bl6 = false;
            eGLConfig2 = null;
        }
        object6 = "eglCreateContext failed";
        zzez.zza((boolean)var19_29, (String)object6);
        this.zze = (EGLContext)object4;
        eGLConfig2 = this.zzd;
        if (object == n4) {
            object3 = EGL14.EGL_NO_SURFACE;
        } else {
            void var2_6;
            n8 = 12374;
            int n17 = 12375;
            if (object == n3) {
                object = 7;
                object3 = new int[object];
                object3[0] = (EGLSurface)n17;
                object3[n4] = (EGLSurface)n4;
                object3[n3] = (EGLSurface)n8;
                object3[bl3] = (EGLSurface)n4;
                object3[n14] = (EGLSurface)n10;
                object3[n7] = (EGLSurface)n4;
                int n18 = 6;
                object3[n18] = n16;
            } else {
                object3 = new int[n7];
                object3[0] = (EGLSurface)n17;
                object3[n4] = (EGLSurface)n4;
                object3[n3] = (EGLSurface)n8;
                object3[bl3] = (EGLSurface)n4;
                object3[n14] = (EGLSurface)n16;
            }
            object3 = EGL14.eglCreatePbufferSurface((EGLDisplay)eGLConfig2, (EGLConfig)object5, (int[])object3, (int)0);
            if (object3 != null) {
                boolean bl7 = true;
            } else {
                boolean bl8 = false;
                object2 = null;
            }
            string2 = "eglCreatePbufferSurface failed";
            zzez.zza((boolean)var2_6, string2);
        }
        boolean bl9 = EGL14.eglMakeCurrent((EGLDisplay)eGLConfig2, (EGLSurface)object3, (EGLSurface)object3, (EGLContext)object4);
        string2 = "eglMakeCurrent failed";
        zzez.zza(bl9, string2);
        this.zzf = object3;
        object3 = this.zzc;
        GLES20.glGenTextures((int)n4, (int[])object3, (int)0);
        object3 = new StringBuilder();
        boolean bl10 = false;
        object2 = null;
        while ((n3 = GLES20.glGetError()) != 0) {
            if (c2 != '\u0000') {
                c2 = '\n';
                ((StringBuilder)object3).append(c2);
            }
            if ((object2 = GLU.gluErrorString((int)n3)) == null) {
                object2 = String.valueOf(Integer.toHexString(n3));
                string2 = "error code: 0x";
                object2 = string2.concat((String)object2);
            }
            string2 = "glError: ";
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append((String)object2);
            c2 = '\u0001';
        }
        if (c2 == '\u0000') {
            object3 = this.zzc;
            object = object3[0];
            object2 = new SurfaceTexture(object);
            this.zzg = object2;
            object2.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener)this);
            return;
        }
        object3 = ((StringBuilder)object3).toString();
        object2 = new zzey((String)object3);
        throw object2;
    }

    public final void zzc() {
        EGLDisplay eGLDisplay;
        EGLDisplay eGLDisplay2;
        boolean bl2;
        Throwable throwable2;
        block13: {
            boolean bl3;
            Object object;
            block12: {
                this.zzb.removeCallbacks((Runnable)this);
                try {
                    object = this.zzg;
                    if (object == null) break block12;
                }
                catch (Throwable throwable2) {}
                object.release();
                object = this.zzc;
                bl2 = false;
                eGLDisplay2 = null;
                int n3 = 1;
                GLES20.glDeleteTextures((int)n3, (int[])object, (int)0);
                break block13;
            }
            if ((object = this.zzd) != null && !(bl3 = object.equals((Object)(eGLDisplay2 = EGL14.EGL_NO_DISPLAY)))) {
                object = this.zzd;
                eGLDisplay2 = EGL14.EGL_NO_SURFACE;
                EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                EGL14.eglMakeCurrent((EGLDisplay)object, (EGLSurface)eGLDisplay2, (EGLSurface)eGLDisplay2, (EGLContext)eGLContext);
            }
            if ((object = this.zzf) != null && !(bl3 = object.equals((Object)(eGLDisplay2 = EGL14.EGL_NO_SURFACE)))) {
                object = this.zzd;
                eGLDisplay2 = this.zzf;
                EGL14.eglDestroySurface((EGLDisplay)object, (EGLSurface)eGLDisplay2);
            }
            if ((object = this.zze) != null) {
                eGLDisplay2 = this.zzd;
                EGL14.eglDestroyContext((EGLDisplay)eGLDisplay2, (EGLContext)object);
            }
            EGL14.eglReleaseThread();
            object = this.zzd;
            if (object != null && !(bl3 = object.equals((Object)(eGLDisplay2 = EGL14.EGL_NO_DISPLAY)))) {
                object = this.zzd;
                EGL14.eglTerminate((EGLDisplay)object);
            }
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            return;
        }
        eGLDisplay2 = this.zzd;
        if (eGLDisplay2 != null && !(bl2 = eGLDisplay2.equals((Object)(eGLDisplay = EGL14.EGL_NO_DISPLAY)))) {
            eGLDisplay2 = this.zzd;
            eGLDisplay = EGL14.EGL_NO_SURFACE;
            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
            EGL14.eglMakeCurrent((EGLDisplay)eGLDisplay2, (EGLSurface)eGLDisplay, (EGLSurface)eGLDisplay, (EGLContext)eGLContext);
        }
        if ((eGLDisplay2 = this.zzf) != null && !(bl2 = eGLDisplay2.equals((Object)(eGLDisplay = EGL14.EGL_NO_SURFACE)))) {
            eGLDisplay2 = this.zzd;
            eGLDisplay = this.zzf;
            EGL14.eglDestroySurface((EGLDisplay)eGLDisplay2, (EGLSurface)eGLDisplay);
        }
        if ((eGLDisplay2 = this.zze) != null) {
            eGLDisplay = this.zzd;
            EGL14.eglDestroyContext((EGLDisplay)eGLDisplay, (EGLContext)eGLDisplay2);
        }
        EGL14.eglReleaseThread();
        eGLDisplay2 = this.zzd;
        if (eGLDisplay2 != null && !(bl2 = eGLDisplay2.equals((Object)(eGLDisplay = EGL14.EGL_NO_DISPLAY)))) {
            eGLDisplay2 = this.zzd;
            EGL14.eglTerminate((EGLDisplay)eGLDisplay2);
        }
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        throw throwable2;
    }
}

