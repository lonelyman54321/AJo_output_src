/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  android.opengl.Matrix
 *  android.view.Display
 */
package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.media3.exoplayer.video.spherical.a$a;

public final class a
implements SensorEventListener {
    public final float[] a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final Display e;
    public final a$a[] f;
    public boolean g;

    public a(Display display, a$a ... a$aArray) {
        int n3 = 16;
        float[] fArray = new float[n3];
        this.a = fArray;
        fArray = new float[n3];
        this.b = fArray;
        float[] fArray2 = new float[n3];
        this.c = fArray2;
        fArray2 = new float[3];
        this.d = fArray2;
        this.e = display;
        this.f = a$aArray;
    }

    public final void onAccuracyChanged(Sensor sensor, int n3) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onSensorChanged(SensorEvent object) {
        Object[] objectArray;
        int n3;
        object = object.values;
        float[] fArray = this.a;
        SensorManager.getRotationMatrixFromVector((float[])fArray, (float[])object);
        object = this.e;
        int n4 = object.getRotation();
        int n7 = 2;
        int n8 = 0;
        float[] fArray2 = this.b;
        int n10 = 1;
        if (n4 != 0) {
            int n14 = 129;
            if (n4 != n10) {
                n3 = 130;
                if (n4 != n7) {
                    n14 = 3;
                    if (n4 != n14) {
                        object = new IllegalStateException();
                        throw object;
                    }
                    n14 = 130;
                    n3 = 1;
                }
            } else {
                n14 = 2;
                n3 = 129;
            }
            n4 = fArray2.length;
            System.arraycopy(fArray, 0, fArray2, 0, n4);
            SensorManager.remapCoordinateSystem((float[])fArray2, (int)n14, (int)n3, (float[])fArray);
        }
        n4 = 131;
        SensorManager.remapCoordinateSystem((float[])fArray, (int)n10, (int)n4, (float[])fArray2);
        object = this.d;
        SensorManager.getOrientation((float[])fArray2, (float[])object);
        SensorEvent sensorEvent = object[n7];
        float f5 = 90.0f;
        float f6 = 1.0f;
        float[] fArray3 = this.a;
        n3 = 0;
        float[] fArray4 = null;
        Matrix.rotateM((float[])fArray3, (int)0, (float)f5, (float)f6, (float)0.0f, (float)0.0f);
        n7 = (int)(this.g ? 1 : 0);
        fArray3 = this.a;
        if (n7 == 0) {
            objectArray = this.c;
            SW0.a(objectArray, fArray3);
            this.g = n10;
        }
        n7 = fArray2.length;
        System.arraycopy(fArray3, 0, fArray2, 0, n7);
        float[] fArray5 = this.b;
        f6 = 0.0f;
        n3 = 0;
        fArray4 = this.c;
        Matrix.multiplyMM((float[])fArray3, (int)0, (float[])fArray5, (int)0, (float[])fArray4, (int)0);
        objectArray = this.f;
        int n15 = objectArray.length;
        while (n8 < n15) {
            float f7 = objectArray[n8];
            f7.a((float)sensorEvent, fArray);
            ++n8;
        }
        return;
    }
}

