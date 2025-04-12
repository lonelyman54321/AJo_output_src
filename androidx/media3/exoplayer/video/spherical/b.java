/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.opengl.Matrix
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$a;
import androidx.media3.exoplayer.video.spherical.a$a;
import androidx.media3.exoplayer.video.spherical.b$a;

public final class b
extends GestureDetector.SimpleOnGestureListener
implements View.OnTouchListener,
a$a {
    public final PointF a;
    public final PointF b;
    public final b$a c;
    public final float d;
    public final GestureDetector e;
    public volatile float f;

    public b(Context context, SphericalGLSurfaceView$a sphericalGLSurfaceView$a) {
        PointF pointF;
        this.a = pointF = new PointF();
        this.b = pointF = new PointF();
        this.c = sphericalGLSurfaceView$a;
        this.d = 25.0f;
        super(context, (GestureDetector.OnGestureListener)this);
        this.e = sphericalGLSurfaceView$a;
        this.f = (float)Math.PI;
    }

    public final void a(float f5, float[] fArray) {
        this.f = f5 = -f5;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        PointF pointF = this.a;
        float f5 = motionEvent.getX();
        float f6 = motionEvent.getY();
        pointF.set(f5, f6);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        float f7 = motionEvent2.getX();
        float f8 = this.a.x;
        f7 -= f8;
        f8 = this.d;
        f7 /= f8;
        f8 = motionEvent2.getY();
        Object object = this.a;
        float f11 = object.y;
        f8 -= f11;
        f11 = this.d;
        f8 /= f11;
        f11 = motionEvent2.getX();
        float f12 = motionEvent2.getY();
        object.set(f11, f12);
        double d2 = this.f;
        double d5 = Math.cos(d2);
        f12 = (float)d5;
        d2 = Math.sin(d2);
        float f14 = (float)d2;
        Object object2 = this.b;
        float f15 = object2.x;
        float f16 = f12 * f7;
        float f17 = f14 * f8;
        object2.x = f15 -= (f16 -= f17);
        f15 = object2.y;
        object2.y = f12 = f12 * f8 + (f14 *= f7) + f15;
        f7 = Math.min(45.0f, f12);
        f8 = -45.0f;
        object2.y = f7 = Math.max(f8, f7);
        b$a b$a = this.c;
        PointF pointF = this.b;
        object = b$a;
        object = (SphericalGLSurfaceView$a)b$a;
        synchronized (object) {
            object.g = f7 = pointF.y;
            f15 = -f7;
            f7 = object.h;
            double d7 = f7;
            d7 = Math.cos(d7);
            f16 = (float)d7;
            f7 = object.h;
            d7 = f7;
            d7 = Math.sin(d7);
            f17 = (float)d7;
            object2 = object.e;
            f12 = 0.0f;
            Matrix.setRotateM((float[])object2, (int)0, (float)f15, (float)f16, (float)f17, (float)0.0f);
            float[] fArray = object.f;
            f7 = pointF.x;
            float f18 = -f7;
            float f19 = 1.0f;
            Matrix.setRotateM((float[])fArray, (int)0, (float)f18, (float)0.0f, (float)f19, (float)0.0f);
            return true;
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((SphericalGLSurfaceView$a)this.c).k.performClick();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }
}

