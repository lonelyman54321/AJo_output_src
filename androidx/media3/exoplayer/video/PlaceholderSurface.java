/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.opengl.EGL14
 *  android.opengl.EGLDisplay
 *  android.os.Handler
 *  android.view.Surface
 */
package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.video.PlaceholderSurface$PlaceholderSurfaceThread;

public final class PlaceholderSurface
extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final PlaceholderSurface$PlaceholderSurfaceThread b;
    public boolean c;

    public PlaceholderSurface(PlaceholderSurface$PlaceholderSurfaceThread placeholderSurface$PlaceholderSurfaceThread, SurfaceTexture surfaceTexture, boolean bl2) {
        super(surfaceTexture);
        this.b = placeholderSurface$PlaceholderSurfaceThread;
        this.a = bl2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context var0) {
        var1_2 = PlaceholderSurface.class;
        synchronized (var1_2) {
            block9: {
                block8: {
                    try {
                        var2_3 = PlaceholderSurface.e;
                        var3_4 = true;
                        if (var2_3 != 0) break block8;
                        var2_3 = gz3.a;
                        var4_5 = 24;
                        if (var2_3 < var4_5 || var2_3 < (var4_5 = 26) && ((var7_8 = (var5_6 = "samsung").equals(var6_7 = gz3.c)) || (var7_8 = (var5_6 = "XT1650").equals(var6_7 = gz3.d))) || var2_3 < var4_5 && (var9_10 = (int)(var0 /* !! */  = var0 /* !! */ .getPackageManager()).hasSystemFeature(var8_9 = "android.hardware.vr.high_performance")) == 0) ** GOTO lbl-1000
                        var0 /* !! */  = "EGL_EXT_protected_content";
                        var8_9 = EGL14.eglGetDisplay((int)0);
                        var4_5 = 12373;
                        if ((var8_9 = EGL14.eglQueryString((EGLDisplay)var8_9, (int)var4_5)) != null && (var9_10 = (int)var8_9.contains((CharSequence)var0 /* !! */ )) != 0) {
                            var0 /* !! */  = "EGL_KHR_surfaceless_context";
                            var8_9 = EGL14.eglGetDisplay((int)0);
                            if ((var8_9 = EGL14.eglQueryString((EGLDisplay)var8_9, (int)var4_5)) != null && (var9_10 = (int)var8_9.contains((CharSequence)var0 /* !! */ )) != 0) {
                                var9_10 = 1;
                            } else {
                                var9_10 = 0;
                                var0 /* !! */  = null;
                            }
                            var9_10 = var9_10 != 0 ? 1 : 2;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var9_10 = 0;
                            var0 /* !! */  = null;
                        }
                        PlaceholderSurface.d = var9_10;
                        PlaceholderSurface.e = var3_4;
                    }
                    catch (Throwable var0_1) {
                        break block9;
                    }
                }
                if ((var9_10 = PlaceholderSurface.d) == 0) return false;
                return var3_4;
            }
            throw var0_1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        super.release();
        PlaceholderSurface$PlaceholderSurfaceThread placeholderSurface$PlaceholderSurfaceThread = this.b;
        synchronized (placeholderSurface$PlaceholderSurfaceThread) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        boolean bl2 = this.c;
                        if (bl2) break block3;
                        PlaceholderSurface$PlaceholderSurfaceThread placeholderSurface$PlaceholderSurfaceThread2 = this.b;
                        Handler handler = placeholderSurface$PlaceholderSurfaceThread2.b;
                        handler.getClass();
                        placeholderSurface$PlaceholderSurfaceThread2 = placeholderSurface$PlaceholderSurfaceThread2.b;
                        int n3 = 2;
                        placeholderSurface$PlaceholderSurfaceThread2.sendEmptyMessage(n3);
                        this.c = bl2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

