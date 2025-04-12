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
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Message
 */
package androidx.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import java.util.Locale;

class PlaceholderSurface$PlaceholderSurfaceThread
extends HandlerThread
implements Handler.Callback {
    public EGLSurfaceTexture a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public PlaceholderSurface e;

    public PlaceholderSurface$PlaceholderSurfaceThread() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /*
     * WARNING - void declaration
     */
    public final void a(int n3) {
        SurfaceTexture surfaceTexture;
        Object object;
        void var24_27;
        Object object2;
        boolean bl2;
        PlaceholderSurface$PlaceholderSurfaceThread placeholderSurface$PlaceholderSurfaceThread = this;
        int n4 = n3;
        Object object3 = 3;
        int n7 = 2;
        int n8 = 1;
        this.a.getClass();
        EGLSurfaceTexture eGLSurfaceTexture = this.a;
        eGLSurfaceTexture.getClass();
        Object object4 = EGL14.eglGetDisplay((int)0);
        if (object4 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        GlUtil.c("eglGetDisplay failed", bl2);
        object2 = new int[n7];
        bl2 = EGL14.eglInitialize((EGLDisplay)object4, (int[])object2, (int)0, (int[])object2, (int)n8);
        GlUtil.c("eglInitialize failed", bl2);
        eGLSurfaceTexture.c = object4;
        EGLConfig eGLConfig = new EGLConfig[n8];
        Object object5 = new int[n8];
        object2 = EGLSurfaceTexture.g;
        int n10 = 0;
        Object object6 = null;
        int n14 = 0;
        Object[] objectArray = null;
        int n15 = 1;
        EGLConfig eGLConfig2 = eGLConfig;
        Object object7 = object5;
        int[] nArray = object5;
        int n16 = 0;
        object5 = null;
        int n17 = EGL14.eglChooseConfig((EGLDisplay)object4, (int[])object2, (int)0, (EGLConfig[])eGLConfig, (int)0, (int)n15, (int[])object7, (int)0);
        if (n17 != 0 && (bl2 = object7[0]) > false && (object2 = (Object)eGLConfig[0]) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        object4 = n17 != 0;
        object6 = nArray[0];
        eGLConfig2 = eGLConfig[0];
        objectArray = new Object[object3];
        objectArray[0] = object4;
        objectArray[n8] = object6;
        objectArray[n7] = eGLConfig2;
        n17 = gz3.a;
        object4 = Locale.US;
        object6 = "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s";
        GlUtil.c(String.format((Locale)object4, (String)object6, objectArray), bl2);
        object4 = eGLConfig[0];
        object2 = eGLSurfaceTexture.c;
        n10 = 4;
        int n18 = 12992;
        n14 = 5;
        n15 = 12344;
        int bl3 = 12440;
        if (n4 == 0) {
            object5 = new int[object3];
            object5[0] = bl3;
            object5[n8] = n7;
            object5[n7] = n15;
        } else {
            object5 = new int[n14];
            object5[0] = bl3;
            object5[n8] = n7;
            object5[n7] = n18;
            object5[object3] = n8;
            object5[n10] = n15;
        }
        object7 = EGL14.EGL_NO_CONTEXT;
        object2 = EGL14.eglCreateContext((EGLDisplay)object2, (EGLConfig)object4, (EGLContext)object7, (int[])object5, (int)0);
        if (object2 != null) {
            boolean bl4 = true;
        } else {
            boolean bl5 = false;
            object7 = null;
        }
        object5 = "eglCreateContext failed";
        GlUtil.c((String)object5, (boolean)var24_27);
        eGLSurfaceTexture.d = (EGLContext)object2;
        object7 = eGLSurfaceTexture.c;
        if (n4 == n8) {
            object = EGL14.EGL_NO_SURFACE;
        } else {
            int[] nArray2;
            n16 = 12374;
            int n19 = 12375;
            if (n4 == n7) {
                n15 = 7;
                nArray2 = new int[n15];
                nArray2[0] = n19;
                nArray2[n8] = n8;
                nArray2[n7] = n16;
                nArray2[object3] = n8;
                nArray2[n10] = n18;
                nArray2[n14] = n8;
                object3 = 6;
                nArray2[object3] = n18 = 12344;
            } else {
                n18 = 12344;
                nArray2 = new int[n14];
                nArray2[0] = n19;
                nArray2[n8] = n8;
                nArray2[n7] = n16;
                nArray2[object3] = n8;
                nArray2[n10] = n18;
            }
            object = EGL14.eglCreatePbufferSurface((EGLDisplay)object7, (EGLConfig)object4, (int[])nArray2, (int)0);
            if (object != null) {
                n7 = 1;
            } else {
                n7 = 0;
                surfaceTexture = null;
            }
            object4 = "eglCreatePbufferSurface failed";
            GlUtil.c((String)object4, n7 != 0);
        }
        n7 = (int)(EGL14.eglMakeCurrent((EGLDisplay)object7, (EGLSurface)object, (EGLSurface)object, (EGLContext)object2) ? 1 : 0);
        object4 = "eglMakeCurrent failed";
        GlUtil.c((String)object4, n7 != 0);
        eGLSurfaceTexture.e = object;
        object = eGLSurfaceTexture.b;
        GLES20.glGenTextures((int)n8, (int[])object, (int)0);
        GlUtil.b();
        object3 = object[0];
        eGLSurfaceTexture.f = surfaceTexture = new SurfaceTexture(object3);
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener)eGLSurfaceTexture);
        surfaceTexture = placeholderSurface$PlaceholderSurfaceThread.a.f;
        surfaceTexture.getClass();
        if (n4 == 0) {
            n8 = 0;
        }
        object = new PlaceholderSurface(placeholderSurface$PlaceholderSurfaceThread, surfaceTexture, n8 != 0);
        placeholderSurface$PlaceholderSurfaceThread.e = object;
    }

    public final void b() {
        EGLDisplay eGLDisplay;
        EGLDisplay eGLDisplay2;
        boolean bl2;
        Throwable throwable2;
        EGLSurfaceTexture eGLSurfaceTexture;
        block13: {
            boolean bl3;
            Object object;
            block12: {
                this.a.getClass();
                eGLSurfaceTexture = this.a;
                eGLSurfaceTexture.a.removeCallbacks((Runnable)eGLSurfaceTexture);
                try {
                    object = eGLSurfaceTexture.f;
                    if (object == null) break block12;
                }
                catch (Throwable throwable2) {}
                object.release();
                object = eGLSurfaceTexture.b;
                bl2 = false;
                eGLDisplay2 = null;
                int n3 = 1;
                GLES20.glDeleteTextures((int)n3, (int[])object, (int)0);
                break block13;
            }
            if ((object = eGLSurfaceTexture.c) != null && !(bl3 = object.equals((Object)(eGLDisplay2 = EGL14.EGL_NO_DISPLAY)))) {
                object = eGLSurfaceTexture.c;
                eGLDisplay2 = EGL14.EGL_NO_SURFACE;
                EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                EGL14.eglMakeCurrent((EGLDisplay)object, (EGLSurface)eGLDisplay2, (EGLSurface)eGLDisplay2, (EGLContext)eGLContext);
            }
            if ((object = eGLSurfaceTexture.e) != null && !(bl3 = object.equals((Object)(eGLDisplay2 = EGL14.EGL_NO_SURFACE)))) {
                object = eGLSurfaceTexture.c;
                eGLDisplay2 = eGLSurfaceTexture.e;
                EGL14.eglDestroySurface((EGLDisplay)object, (EGLSurface)eGLDisplay2);
            }
            if ((object = eGLSurfaceTexture.d) != null) {
                eGLDisplay2 = eGLSurfaceTexture.c;
                EGL14.eglDestroyContext((EGLDisplay)eGLDisplay2, (EGLContext)object);
            }
            EGL14.eglReleaseThread();
            object = eGLSurfaceTexture.c;
            if (object != null && !(bl3 = object.equals((Object)(eGLDisplay2 = EGL14.EGL_NO_DISPLAY)))) {
                object = eGLSurfaceTexture.c;
                EGL14.eglTerminate((EGLDisplay)object);
            }
            eGLSurfaceTexture.c = null;
            eGLSurfaceTexture.d = null;
            eGLSurfaceTexture.e = null;
            eGLSurfaceTexture.f = null;
            return;
        }
        eGLDisplay2 = eGLSurfaceTexture.c;
        if (eGLDisplay2 != null && !(bl2 = eGLDisplay2.equals((Object)(eGLDisplay = EGL14.EGL_NO_DISPLAY)))) {
            eGLDisplay2 = eGLSurfaceTexture.c;
            eGLDisplay = EGL14.EGL_NO_SURFACE;
            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
            EGL14.eglMakeCurrent((EGLDisplay)eGLDisplay2, (EGLSurface)eGLDisplay, (EGLSurface)eGLDisplay, (EGLContext)eGLContext);
        }
        if ((eGLDisplay2 = eGLSurfaceTexture.e) != null && !(bl2 = eGLDisplay2.equals((Object)(eGLDisplay = EGL14.EGL_NO_SURFACE)))) {
            eGLDisplay2 = eGLSurfaceTexture.c;
            eGLDisplay = eGLSurfaceTexture.e;
            EGL14.eglDestroySurface((EGLDisplay)eGLDisplay2, (EGLSurface)eGLDisplay);
        }
        if ((eGLDisplay2 = eGLSurfaceTexture.d) != null) {
            eGLDisplay = eGLSurfaceTexture.c;
            EGL14.eglDestroyContext((EGLDisplay)eGLDisplay, (EGLContext)eGLDisplay2);
        }
        EGL14.eglReleaseThread();
        eGLDisplay2 = eGLSurfaceTexture.c;
        if (eGLDisplay2 != null && !(bl2 = eGLDisplay2.equals((Object)(eGLDisplay = EGL14.EGL_NO_DISPLAY)))) {
            eGLDisplay2 = eGLSurfaceTexture.c;
            EGL14.eglTerminate((EGLDisplay)eGLDisplay2);
        }
        eGLSurfaceTexture.c = null;
        eGLSurfaceTexture.d = null;
        eGLSurfaceTexture.e = null;
        eGLSurfaceTexture.f = null;
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message message) {
        Throwable throwable3;
        block26: {
            RuntimeException runtimeException2;
            int n3;
            block29: {
                GlUtil$GlException glUtil$GlException2;
                block28: {
                    Error error2;
                    block27: {
                        int n4 = message.what;
                        n3 = 1;
                        if (n4 != n3) {
                            int n7 = 2;
                            if (n4 != n7) {
                                return n3 != 0;
                            }
                            try {
                                this.b();
                                return n3 != 0;
                            }
                            catch (Throwable throwable2) {
                                String string2 = "Failed to release placeholder surface";
                                try {
                                    Cx.d(string2, throwable2);
                                    return n3 != 0;
                                }
                                finally {
                                    this.quit();
                                }
                            }
                        }
                        try {
                            int n8 = message.arg1;
                            this.a(n8);
                        }
                        catch (Throwable throwable3) {
                            break block26;
                        }
                        catch (Error error2) {
                            break block27;
                        }
                        catch (GlUtil$GlException glUtil$GlException2) {
                            break block28;
                        }
                        catch (RuntimeException runtimeException2) {
                            break block29;
                        }
                        synchronized (this) {
                            ((Object)((Object)this)).notify();
                            return n3 != 0;
                        }
                    }
                    String string3 = "Failed to initialize placeholder surface";
                    {
                        Cx.d(string3, error2);
                        this.c = error2;
                    }
                    synchronized (this) {
                        ((Object)((Object)this)).notify();
                        return n3 != 0;
                    }
                }
                Object object = "Failed to initialize placeholder surface";
                {
                    Cx.d((String)object, glUtil$GlException2);
                    this.d = object = new IllegalStateException(glUtil$GlException2);
                }
                synchronized (this) {
                    ((Object)((Object)this)).notify();
                    return n3 != 0;
                }
            }
            String string4 = "Failed to initialize placeholder surface";
            {
                Cx.d(string4, runtimeException2);
                this.d = runtimeException2;
            }
            synchronized (this) {
                ((Object)((Object)this)).notify();
                return n3 != 0;
            }
        }
        synchronized (this) {
            ((Object)((Object)this)).notify();
            throw throwable3;
        }
    }
}

