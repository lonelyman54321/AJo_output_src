/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.view.Display
 *  android.view.WindowManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcea;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzfvc;

final class zzceb
extends zzfvc {
    private final SensorManager zzb;
    private final Object zzc;
    private final Display zzd;
    private final float[] zze;
    private final float[] zzf;
    private float[] zzg;
    private Handler zzh;
    private zzcea zzi;

    public zzceb(Context object) {
        super("OrientationMonitor", "ads");
        Object object2;
        this.zzb = object2 = (SensorManager)object.getSystemService("sensor");
        object = ((WindowManager)object.getSystemService("window")).getDefaultDisplay();
        this.zzd = object;
        int n3 = 9;
        object2 = new float[n3];
        this.zze = (float[])object2;
        object = new float[n3];
        this.zzf = (float[])object;
        super();
        this.zzc = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zza(SensorEvent object) {
        Object object2;
        int n3;
        Object object3;
        Object object4;
        Object object5;
        int n4;
        int n7;
        Object object6;
        int n8;
        SensorEvent sensorEvent;
        block13: {
            block14: {
                SensorEvent sensorEvent2;
                object = ((SensorEvent)object).values;
                Object var2_3 = null;
                sensorEvent = object[0];
                n8 = 2;
                object6 = 2.8E-45f;
                n7 = 1;
                n4 = 0;
                object5 = 0.0f;
                float[] fArray = null;
                SensorEvent sensorEvent3 = sensorEvent - 0.0f;
                object4 = sensorEvent3 == 0 ? 0 : (sensorEvent3 > 0 ? 1 : -1);
                if (object4 == false && (object4 = (sensorEvent2 = (sensorEvent = object[n7]) - 0.0f) == 0 ? 0 : (sensorEvent2 > 0 ? 1 : -1)) == false) {
                    sensorEvent = object[n8];
                    SensorEvent sensorEvent4 = sensorEvent - 0.0f;
                    object4 = sensorEvent4 == 0 ? 0 : (sensorEvent4 > 0 ? 1 : -1);
                    if (object4 == false) return;
                }
                object3 = this.zzc;
                // MONITORENTER : object3
                fArray = this.zzg;
                n3 = 9;
                if (fArray == null) {
                    this.zzg = fArray = new float[n3];
                }
                object3 = this.zze;
                SensorManager.getRotationMatrixFromVector((float[])object3, (float[])object);
                object = this.zzd;
                int n10 = object.getRotation();
                object4 = 129;
                sensorEvent = (SensorEvent)1.81E-43f;
                n4 = 3;
                object5 = 4.2E-45f;
                if (n10 == n7) break block14;
                int n14 = 130;
                object2 = 1.82E-43f;
                if (n10 != n8) {
                    if (n10 != n4) {
                        object = this.zze;
                        object3 = this.zzf;
                        System.arraycopy(object, 0, object3, 0, n3);
                        break block13;
                    } else {
                        object = this.zze;
                        object3 = this.zzf;
                        SensorManager.remapCoordinateSystem((float[])object, (int)n14, (int)n7, (float[])object3);
                    }
                    break block13;
                } else {
                    object = this.zze;
                    float[] fArray2 = this.zzf;
                    SensorManager.remapCoordinateSystem((float[])object, (int)object4, (int)n14, (float[])fArray2);
                }
                break block13;
            }
            object = this.zze;
            float[] fArray = this.zzf;
            SensorManager.remapCoordinateSystem((float[])object, (int)n8, (int)object4, (float[])fArray);
        }
        object = this.zzf;
        sensorEvent = object[n7];
        object2 = object[n4];
        object[n7] = (SensorEvent)object2;
        object[n4] = sensorEvent;
        sensorEvent = object[n8];
        n7 = 6;
        object5 = object[n7];
        object[n8] = (SensorEvent)object5;
        object[n7] = sensorEvent;
        object4 = 5;
        sensorEvent = (SensorEvent)7.0E-45f;
        object6 = object[object4];
        n7 = 7;
        object5 = object[n7];
        object[object4] = (SensorEvent)object5;
        object[n7] = (SensorEvent)object6;
        object = this.zzc;
        // MONITORENTER : object
        object3 = this.zzf;
        float[] fArray = this.zzg;
        System.arraycopy(object3, 0, fArray, 0, n3);
        // MONITOREXIT : object
        object = this.zzi;
        if (object == null) return;
        object.zza();
    }

    public final void zzb(zzcea zzcea2) {
        this.zzi = zzcea2;
    }

    public final void zzc() {
        Object object = this.zzh;
        if (object == null) {
            object = this.zzb;
            int n3 = 11;
            if ((object = object.getDefaultSensor(n3)) == null) {
                zzm.zzg("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            handlerThread = handlerThread.getLooper();
            zzfuv zzfuv2 = new zzfuv((Looper)handlerThread);
            this.zzh = zzfuv2;
            handlerThread = this.zzb;
            boolean bl2 = handlerThread.registerListener((SensorEventListener)this, (Sensor)object, 0, (Handler)zzfuv2);
            if (!bl2) {
                object = "SensorManager.registerListener failed.";
                zzm.zzg((String)object);
                this.zzd();
            }
        }
    }

    public final void zzd() {
        Handler handler = this.zzh;
        if (handler == null) {
            return;
        }
        this.zzb.unregisterListener((SensorEventListener)this);
        handler = this.zzh;
        zzcdz zzcdz2 = new zzcdz(this);
        handler.post((Runnable)zzcdz2);
        this.zzh = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zze(float[] fArray) {
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                float[] fArray2;
                try {
                    fArray2 = this.zzg;
                    if (fArray2 == null) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                int n3 = 9;
                System.arraycopy(fArray2, 0, fArray, 0, n3);
                return true;
            }
            throw throwable2;
        }
    }
}

