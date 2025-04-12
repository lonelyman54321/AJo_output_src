/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.opengl.GLES20
 *  android.opengl.GLSurfaceView$Renderer
 *  android.opengl.Matrix
 *  android.os.Handler
 *  javax.microedition.khronos.egl.EGLConfig
 *  javax.microedition.khronos.opengles.GL10
 */
package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.a$a;
import androidx.media3.exoplayer.video.spherical.b$a;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class SphericalGLSurfaceView$a
implements GLSurfaceView.Renderer,
b$a,
a$a {
    public final kt2_1 a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final float[] i;
    public final float[] j;
    public final /* synthetic */ SphericalGLSurfaceView k;

    public SphericalGLSurfaceView$a(SphericalGLSurfaceView object, kt2_1 kt2_12) {
        this.k = object;
        int n3 = 16;
        float[] fArray = new float[n3];
        this.b = fArray;
        fArray = new float[n3];
        this.c = fArray;
        fArray = new float[n3];
        this.d = fArray;
        float[] fArray2 = new float[n3];
        this.e = fArray2;
        float[] fArray3 = new float[n3];
        this.f = fArray3;
        float[] fArray4 = new float[n3];
        this.i = fArray4;
        object = new float[n3];
        this.j = (float[])object;
        this.a = kt2_12;
        Matrix.setIdentityM((float[])fArray, (int)0);
        Matrix.setIdentityM((float[])fArray2, (int)0);
        Matrix.setIdentityM((float[])fArray3, (int)0);
        this.h = (float)Math.PI;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(float f5, float[] fArray) {
        synchronized (this) {
            float[] fArray2 = this.d;
            int n3 = fArray2.length;
            float f6 = 0.0f;
            System.arraycopy(fArray, 0, fArray2, 0, n3);
            this.h = f5 = -f5;
            float f7 = this.g;
            f6 = -f7;
            double d2 = f5;
            d2 = Math.cos(d2);
            float f8 = (float)d2;
            f5 = this.h;
            d2 = f5;
            d2 = Math.sin(d2);
            float f11 = (float)d2;
            fArray2 = this.e;
            n3 = 0;
            Matrix.setRotateM((float[])fArray2, (int)0, (float)f6, (float)f8, (float)f11, (float)0.0f);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDrawFrame(GL10 object) {
        float[] fArray;
        float[] fArray2;
        float[] fArray3;
        synchronized (this) {
            fArray3 = this.j;
            fArray2 = this.d;
            fArray = this.f;
            Matrix.multiplyMM((float[])fArray3, (int)0, (float[])fArray2, (int)0, (float[])fArray, (int)0);
            float[] fArray4 = this.i;
            float[] fArray5 = this.e;
            float[] fArray6 = this.j;
            Matrix.multiplyMM((float[])fArray4, (int)0, (float[])fArray5, (int)0, (float[])fArray6, (int)0);
        }
        fArray3 = this.c;
        fArray2 = this.b;
        fArray = this.i;
        Matrix.multiplyMM((float[])fArray3, (int)0, (float[])fArray2, (int)0, (float[])fArray, (int)0);
        object = this.a;
        fArray3 = this.c;
        ((kt2_1)object).b(fArray3);
    }

    public final void onSurfaceChanged(GL10 gL10, int n3, int n4) {
        float f5;
        GLES20.glViewport((int)0, (int)0, (int)n3, (int)n4);
        float f6 = n3;
        float f7 = n4;
        float f8 = f6 / f7;
        f6 = 1.0f;
        float f11 = f8 == f6 ? 0 : (f8 > f6 ? 1 : -1);
        if (f11 > 0) {
            double d2 = Math.tan(Math.toRadians(45.0));
            double d5 = f8;
            d2 = Math.toDegrees(Math.atan(d2 / d5));
            d5 = 2.0;
            f5 = f6 = (float)(d2 *= d5);
        } else {
            f11 = 1119092736;
            f6 = 90.0f;
            f5 = 90.0f;
        }
        Matrix.perspectiveM((float[])this.b, (int)0, (float)f5, (float)f8, (float)0.1f, (float)100.0f);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSurfaceCreated(GL10 object, EGLConfig object2) {
        synchronized (this) {
            object = this.k;
            object2 = this.a;
            object2 = ((kt2_1)object2).c();
            Handler handler = object.e;
            int n3 = 1;
            i9 i92 = new i9(n3, object, object2);
            handler.post((Runnable)i92);
            return;
        }
    }
}

