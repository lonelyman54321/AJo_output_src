/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 *  android.opengl.GLES20
 *  javax.microedition.khronos.egl.EGL10
 *  javax.microedition.khronos.egl.EGLContext
 *  javax.microedition.khronos.egl.EGLDisplay
 *  javax.microedition.khronos.egl.EGLSurface
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.google.android.gms.internal.ads.zzcea;
import com.google.android.gms.internal.ads.zzceb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class zzcec
extends Thread
implements SurfaceTexture.OnFrameAvailableListener,
zzcea {
    private static final float[] zza;
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final zzceb zzb;
    private final float[] zzc;
    private final float[] zzd;
    private final float[] zze;
    private final float[] zzf;
    private final float[] zzg;
    private final float[] zzh;
    private final float[] zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private SurfaceTexture zzo;
    private SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final FloatBuffer zzt;
    private final CountDownLatch zzu;
    private final Object zzv;
    private EGL10 zzw;
    private EGLDisplay zzx;
    private EGLContext zzy;
    private EGLSurface zzz;

    static {
        float[] fArray;
        float[] fArray2 = fArray = new float[12];
        float[] fArray3 = fArray;
        fArray2[0] = -1.0f;
        fArray3[1] = -1.0f;
        fArray2[2] = -1.0f;
        fArray3[3] = 1.0f;
        fArray2[4] = -1.0f;
        fArray3[5] = -1.0f;
        fArray2[6] = -1.0f;
        fArray3[7] = 1.0f;
        fArray2[8] = -1.0f;
        fArray3[9] = 1.0f;
        fArray2[10] = 1.0f;
        fArray3[11] = -1.0f;
        zza = fArray;
    }

    public zzcec(Context object) {
        super("SphericalVideoProcessor");
        Object object2 = zza;
        int cfr_ignored_0 = ((float[])object2).length;
        Object object3 = ByteBuffer.allocateDirect(48);
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        object3 = ((ByteBuffer)object3).order(byteOrder).asFloatBuffer();
        this.zzt = object3;
        ((FloatBuffer)object3).put((float[])object2).position(0);
        int n3 = 9;
        object3 = new float[n3];
        this.zzc = (float[])object3;
        object3 = new float[n3];
        this.zzd = (float[])object3;
        object3 = new float[n3];
        this.zze = (float[])object3;
        object3 = new float[n3];
        this.zzf = (float[])object3;
        object3 = new float[n3];
        this.zzg = (float[])object3;
        object3 = new float[n3];
        this.zzh = (float[])object3;
        object2 = new float[n3];
        this.zzi = object2;
        this.zzj = 0.0f / 0.0f;
        object2 = new zzceb;
        super((Context)object);
        this.zzb = object2;
        ((zzceb)object2).zzb(this);
        super(1);
        this.zzu = object;
        super();
        this.zzv = object;
    }

    private static final void zzh(String string2) {
        GLES20.glGetError();
    }

    private static final void zzi(float[] fArray, float[] fArray2, float[] fArray3) {
        float f5 = fArray2[0];
        float f6 = fArray3[0];
        f5 *= f6;
        int n3 = 1;
        float f7 = fArray2[n3];
        int n4 = 3;
        float f8 = fArray3[n4];
        float f11 = f7 * f8;
        int n7 = 2;
        float f12 = fArray2[n7];
        int n8 = 6;
        float f14 = fArray3[n8];
        float f15 = f12 * f14;
        fArray[0] = f5 = f5 + f11 + f15;
        f5 = fArray2[0];
        f11 = fArray3[n3] * f5;
        int n10 = 4;
        float f16 = fArray3[n10];
        int n14 = 7;
        float f17 = fArray3[n14];
        float f18 = f12 * f17;
        fArray[n3] = f11 = f11 + (f7 *= f16) + f18;
        f7 = fArray3[n7];
        f5 *= f7;
        f7 = fArray2[n3];
        int n15 = 5;
        f18 = fArray3[n15];
        int n16 = 8;
        float f19 = fArray3[n16];
        fArray[n7] = f5 = f5 + (f7 *= f18) + (f12 *= f19);
        f5 = fArray2[n4];
        float f20 = fArray3[0];
        f5 *= f20;
        f7 = fArray2[n10];
        f12 = fArray2[n15];
        float f22 = f12 * f14;
        fArray[n4] = f5 = f5 + (f8 *= f7) + f22;
        f5 = fArray2[n4];
        f6 = fArray3[n3];
        f8 = f5 * f6;
        f7 *= f16;
        f16 = f12 * f17;
        fArray[n10] = f8 = f8 + f7 + f16;
        f7 = fArray3[n7];
        f5 *= f7;
        f8 = fArray2[n10] * f18;
        fArray[n15] = f5 = f5 + f8 + (f12 *= f19);
        f5 = fArray2[n8] * f20;
        f20 = fArray2[n14];
        float f23 = fArray3[n4] * f20;
        f8 = fArray2[n16];
        fArray[n8] = f5 = f5 + f23 + (f14 *= f8);
        f5 = fArray2[n8];
        f23 = fArray3[n10];
        f20 = f20 * f23 + (f6 *= f5);
        fArray[n14] = f17 = f17 * f8 + f20;
        f5 *= f7;
        f20 = fArray2[n14];
        f6 = fArray3[n15];
        fArray[n16] = f5 = f5 + (f20 *= f6) + (f8 *= f19);
    }

    private static final void zzj(float[] fArray, float f5) {
        fArray[0] = 1.0f;
        fArray[1] = 0.0f;
        fArray[2] = 0.0f;
        fArray[3] = 0.0f;
        double d2 = f5;
        fArray[4] = f5 = (float)Math.cos(d2);
        fArray[5] = f5 = (float)(-Math.sin(d2));
        fArray[6] = 0.0f;
        fArray[7] = f5 = (float)Math.sin(d2);
        fArray[8] = f5 = (float)Math.cos(d2);
    }

    private static final void zzk(float[] fArray, float f5) {
        double d2 = f5;
        fArray[0] = f5 = (float)Math.cos(d2);
        fArray[1] = f5 = (float)(-Math.sin(d2));
        fArray[2] = 0.0f;
        fArray[3] = f5 = (float)Math.sin(d2);
        fArray[4] = f5 = (float)Math.cos(d2);
        fArray[5] = 0.0f;
        fArray[6] = 0.0f;
        fArray[7] = 0.0f;
        fArray[8] = 1.0f;
    }

    private static final int zzl(int n3, String object) {
        n3 = GLES20.glCreateShader((int)n3);
        String string2 = "createShader";
        zzcec.zzh(string2);
        if (n3 != 0) {
            GLES20.glShaderSource((int)n3, (String)object);
            zzcec.zzh("shaderSource");
            GLES20.glCompileShader((int)n3);
            zzcec.zzh("compileShader");
            object = new int[1];
            int n4 = 35713;
            GLES20.glGetShaderiv((int)n3, (int)n4, (int[])object, (int)0);
            string2 = "getShaderiv";
            zzcec.zzh(string2);
            Object object2 = object[0];
            if (object2 == false) {
                GLES20.glGetShaderInfoLog((int)n3);
                GLES20.glDeleteShader((int)n3);
                zzcec.zzh("deleteShader");
                return 0;
            }
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onFrameAvailable(SurfaceTexture object) {
        int n3;
        this.zzs = n3 = this.zzs + 1;
        object = this.zzv;
        synchronized (object) {
            Object object2 = this.zzv;
            object2.notifyAll();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [15, 14 : 1252->1256)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zzv;
        synchronized (object) {
            Object object2 = this.zzv;
            object2.notifyAll();
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final SurfaceTexture zzb() {
        Object object = this.zzp;
        if (object == null) {
            return null;
        }
        try {
            object = this.zzu;
        }
        catch (InterruptedException interruptedException) {
            return this.zzo;
        }
        ((CountDownLatch)object).await();
        return this.zzo;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(int n3, int n4) {
        Object object = this.zzv;
        synchronized (object) {
            this.zzn = n3;
            this.zzm = n4;
            n3 = 1;
            this.zzA = n3;
            Object object2 = this.zzv;
            object2.notifyAll();
            return;
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture, int n3, int n4) {
        this.zzn = n3;
        this.zzm = n4;
        this.zzp = surfaceTexture;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze() {
        Object object = this.zzv;
        synchronized (object) {
            boolean bl2;
            this.zzB = bl2 = true;
            bl2 = false;
            Object object2 = null;
            this.zzp = null;
            object2 = this.zzv;
            object2.notifyAll();
            return;
        }
    }

    public final void zzf(float f5, float f6) {
        float f7;
        int n3;
        int n4 = this.zzn;
        int n7 = this.zzm;
        if (n4 <= n7) {
            n4 = n7;
        }
        float f8 = this.zzk;
        float f11 = 1.7453293f;
        f5 *= f11;
        float f12 = n4;
        this.zzk = f8 -= (f5 /= f12);
        f5 = this.zzl;
        f6 = f6 * f11 / f12;
        this.zzl = f5 -= f6;
        f6 = -1.5707964f;
        float f14 = f5 - f6;
        n4 = (int)(f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1));
        if (n4 < 0) {
            this.zzl = f6;
            n3 = -1077342245;
            f5 = -1.5707964f;
        }
        if ((n3 = (int)((f7 = f5 - (f6 = 1.5707964f)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) > 0) {
            this.zzl = f6;
        }
    }

    public final boolean zzg() {
        boolean bl2;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.zzz;
        boolean bl3 = false;
        EGLDisplay eGLDisplay2 = null;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            eGLSurface2 = this.zzw;
            eGLDisplay2 = this.zzx;
            eGLDisplay = EGL10.EGL_NO_CONTEXT;
            bl2 = eGLSurface2.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, (EGLContext)eGLDisplay);
            eGLDisplay2 = this.zzw;
            eGLSurface = this.zzx;
            eGLDisplay = this.zzz;
            bl3 = eGLDisplay2.eglDestroySurface((EGLDisplay)eGLSurface, (EGLSurface)eGLDisplay) | bl2;
            this.zzz = null;
        }
        if ((eGLSurface2 = this.zzy) != null) {
            eGLSurface = this.zzw;
            eGLDisplay = this.zzx;
            bl2 = eGLSurface.eglDestroyContext(eGLDisplay, (EGLContext)eGLSurface2);
            bl3 |= bl2;
            this.zzy = null;
        }
        if ((eGLSurface2 = this.zzx) != null) {
            bl2 = this.zzw.eglTerminate((EGLDisplay)eGLSurface2) | bl3;
            this.zzx = null;
            return bl2;
        }
        return bl3;
    }
}

