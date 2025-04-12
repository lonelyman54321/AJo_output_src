/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdxx;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzdzb;
import com.google.android.gms.internal.ads.zzfvc;

public final class zzdzc
extends zzfvc {
    private final Context zzb;
    private SensorManager zzc;
    private Sensor zzd;
    private long zze;
    private int zzf;
    private zzdzb zzg;
    private boolean zzh;

    public zzdzc(Context context) {
        super("ShakeDetector", "ads");
        this.zzb = context;
    }

    public final void zza(SensorEvent object) {
        Object object2 = zzbep.zziY;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object = ((SensorEvent)object).values;
            bl2 = false;
            object2 = null;
            Object object4 = object[0];
            int n3 = 1;
            reference var7_7 = object[n3];
            reference var8_8 = object[2];
            float f5 = 9.80665f;
            object4 /= f5;
            var7_7 /= f5;
            object4 *= object4;
            var7_7 = var7_7 * var7_7 + object4;
            double d2 = Math.sqrt((double)((var8_8 /= f5) * var8_8 + var7_7));
            var8_8 = (reference)d2;
            object3 = zzbep.zziZ;
            zzben zzben2 = zzba.zzc();
            object3 = (Float)zzben2.zza((zzbeg)object3);
            object4 = ((Float)object3).floatValue();
            reference cfr_temp_0 = var8_8 - object4;
            Object object5 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
            if (object5 >= 0) {
                long l2 = zzu.zzB().currentTimeMillis();
                long l3 = this.zze;
                object = zzbep.zzja;
                object3 = zzba.zzc();
                object = (Integer)((zzben)object3).zza((zzbeg)object);
                long l4 = ((Integer)object).intValue();
                long l7 = (l3 += l4) - l2;
                object5 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object5 <= 0) {
                    l3 = this.zze;
                    object = zzbep.zzjb;
                    object3 = zzba.zzc();
                    object = (Integer)((zzben)object3).zza((zzbeg)object);
                    l4 = ((Integer)object).intValue();
                    long l8 = (l3 += l4) - l2;
                    object5 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object5 < 0) {
                        this.zzf = 0;
                    }
                    object = "Shake detected.";
                    com.google.android.gms.ads.internal.util.zze.zza((String)object);
                    this.zze = l2;
                    object5 = this.zzf + n3;
                    this.zzf = (int)object5;
                    object2 = this.zzg;
                    if (object2 != null) {
                        object3 = zzbep.zzjc;
                        zzben zzben3 = zzba.zzc();
                        object3 = (Integer)zzben3.zza((zzbeg)object3);
                        int n4 = (Integer)object3;
                        if (object5 == n4) {
                            object2 = (zzdya)object2;
                            object = new zzdxx((zzdya)object2);
                            object3 = zzdxz.zzc;
                            ((zzdya)object2).zzh((zzda)object, (zzdxz)((Object)object3));
                        }
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block3: {
                    Object object;
                    boolean bl2;
                    block4: {
                        try {
                            bl2 = this.zzh;
                            if (!bl2) break block3;
                            object = this.zzc;
                            if (object == null) break block4;
                            Sensor sensor = this.zzd;
                            object.unregisterListener((SensorEventListener)this, sensor);
                            object = "Stopped listening for shake gestures.";
                            com.google.android.gms.ads.internal.util.zze.zza((String)object);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    bl2 = false;
                    object = null;
                    this.zzh = false;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    long l2;
                    int n3;
                    int n4;
                    Object object;
                    try {
                        String string2;
                        object = zzbep.zziY;
                        zzben zzben2 = zzba.zzc();
                        object = zzben2.zza((zzbeg)object);
                        object = (Boolean)object;
                        n4 = ((Boolean)object).booleanValue();
                        if (n4 == 0) {
                            return;
                        }
                        object = this.zzc;
                        n3 = 1;
                        if (object == null) {
                            object = this.zzb;
                            string2 = "sensor";
                            object = object.getSystemService(string2);
                            object = (SensorManager)object;
                            this.zzc = object;
                            if (object == null) {
                                object = "Shake detection failed to initialize. Failed to obtain accelerometer.";
                                zzm.zzj((String)object);
                                return;
                            }
                            object = object.getDefaultSensor(n3);
                            this.zzd = object;
                        }
                        if ((n4 = this.zzh) != 0 || (object = this.zzc) == null || (string2 = this.zzd) == null) break block7;
                        int n7 = 2;
                        object.registerListener((SensorEventListener)this, (Sensor)string2, n7);
                        object = zzu.zzB();
                        l2 = object.currentTimeMillis();
                        object = zzbep.zzja;
                        zzben zzben3 = zzba.zzc();
                        object = zzben3.zza((zzbeg)object);
                        object = (Integer)object;
                        n4 = (Integer)object;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    long l3 = n4;
                    l2 -= l3;
                    this.zze = l2;
                    this.zzh = n3;
                    object = "Listening for shake gestures.";
                    com.google.android.gms.ads.internal.util.zze.zza((String)object);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzd(zzdzb zzdzb2) {
        this.zzg = zzdzb2;
    }
}

