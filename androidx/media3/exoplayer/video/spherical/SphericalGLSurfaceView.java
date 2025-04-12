/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.hardware.Sensor
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  android.opengl.GLSurfaceView
 *  android.opengl.GLSurfaceView$Renderer
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.Display
 *  android.view.Surface
 *  android.view.View$OnTouchListener
 *  android.view.WindowManager
 */
package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$a;
import androidx.media3.exoplayer.video.spherical.a;
import androidx.media3.exoplayer.video.spherical.a$a;
import androidx.media3.exoplayer.video.spherical.b;
import java.util.concurrent.CopyOnWriteArrayList;

public final class SphericalGLSurfaceView
extends GLSurfaceView {
    public static final /* synthetic */ int l;
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final a d;
    public final Handler e;
    public final kt2_1 f;
    public SurfaceTexture g;
    public Surface h;
    public boolean i;
    public boolean j;
    public boolean k;

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public SphericalGLSurfaceView(Context context, AttributeSet object) {
        a a2;
        int n3 = 1;
        int n4 = 2;
        super(context, (AttributeSet)object);
        super();
        this.a = object;
        Object object2 = Looper.getMainLooper();
        super(object2);
        this.e = object;
        object = context.getSystemService("sensor");
        object.getClass();
        object = (SensorManager)object;
        this.b = object;
        int n7 = 15;
        object2 = object.getDefaultSensor(n7);
        if (object2 == null) {
            n7 = 11;
            object2 = object.getDefaultSensor(n7);
        }
        this.c = object2;
        this.f = object = new kt2_1();
        super(this, (kt2_1)object);
        object = new b(context, (SphericalGLSurfaceView$a)object2);
        context = (WindowManager)context.getSystemService("window");
        context.getClass();
        context = context.getDefaultDisplay();
        a$a[] a$aArray = new a$a[n4];
        a$aArray[0] = object;
        a$aArray[n3] = object2;
        this.d = a2 = new a((Display)context, a$aArray);
        this.i = n3;
        this.setEGLContextClientVersion(n4);
        this.setRenderer((GLSurfaceView.Renderer)object2);
        this.setOnTouchListener((View.OnTouchListener)object);
    }

    public final void a() {
        boolean bl2;
        boolean bl3 = this.i;
        bl3 = bl3 && (bl3 = this.j);
        Sensor sensor = this.c;
        if (sensor != null && bl3 != (bl2 = this.k)) {
            a a2 = this.d;
            SensorManager sensorManager = this.b;
            if (bl3) {
                sensorManager.registerListener((SensorEventListener)a2, sensor, 0);
            } else {
                sensorManager.unregisterListener((SensorEventListener)a2);
            }
            this.k = bl3;
        }
    }

    public jk_0 getCameraMotionListener() {
        return this.f;
    }

    public LB3 getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.h;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.e;
        h9 h92 = new h9((Object)this, 1);
        handler.post((Runnable)h92);
    }

    public final void onPause() {
        this.j = false;
        this.a();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.j = true;
        this.a();
    }

    public void setDefaultStereoMode(int n3) {
        this.f.k = n3;
    }

    public void setUseSensorRotation(boolean bl2) {
        this.i = bl2;
        this.a();
    }
}

