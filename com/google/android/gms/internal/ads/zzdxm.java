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
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzfvc;

public final class zzdxm
extends zzfvc {
    private final SensorManager zzb;
    private final Sensor zzc;
    private float zzd = 0.0f;
    private Float zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private zzdxl zzj;
    private boolean zzk;

    public zzdxm(Context context) {
        super("FlickDetector", "ads");
        long l2;
        Object object = Float.valueOf(0.0f);
        this.zze = object;
        this.zzf = l2 = zzu.zzB().currentTimeMillis();
        this.zzg = 0;
        this.zzh = false;
        this.zzi = false;
        this.zzj = null;
        this.zzk = false;
        object = "sensor";
        context = (SensorManager)context.getSystemService((String)object);
        this.zzb = context;
        if (context != null) {
            context = context.getDefaultSensor(4);
            this.zzc = context;
            return;
        }
        this.zzc = null;
    }

    public final void zza(SensorEvent object) {
        Object object2 = zzbep.zzjd;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            float f5;
            Object object4;
            object2 = zzu.zzB();
            long l2 = object2.currentTimeMillis();
            long l3 = this.zzf;
            zzbeg zzbeg2 = zzbep.zzjf;
            Object object5 = zzba.zzc();
            long l4 = ((Integer)((zzben)object5).zza(zzbeg2)).intValue();
            zzbeg2 = null;
            long l7 = (l3 += l4) - l2;
            Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object6 < 0) {
                this.zzg = 0;
                this.zzf = l2;
                this.zzh = false;
                this.zzi = false;
                object4 = this.zze;
                this.zzd = f5 = ((Float)object4).floatValue();
            }
            object = ((SensorEvent)object).values;
            int n3 = 1;
            f5 = Float.MIN_VALUE;
            reference var17_14 = object[n3] * 4.0f;
            Float f6 = this.zze;
            object = Float.valueOf(f6.floatValue() + var17_14);
            this.zze = object;
            var17_14 = (reference)((Float)object).floatValue();
            float f7 = this.zzd;
            object5 = zzbep.zzje;
            Object object7 = (Float)zzba.zzc().zza((zzbeg)object5);
            float f8 = ((Float)object7).floatValue() + f7;
            reference cfr_temp_1 = var17_14 - f8;
            Object object8 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
            if (object8 > 0) {
                object = this.zze;
                var17_14 = (reference)((Float)object).floatValue();
                this.zzd = (float)var17_14;
                this.zzi = n3;
            } else {
                object = this.zze;
                var17_14 = (reference)((Float)object).floatValue();
                f7 = this.zzd;
                object7 = zzba.zzc();
                object5 = (Float)((zzben)object7).zza((zzbeg)object5);
                float f11 = ((Float)object5).floatValue();
                reference cfr_temp_2 = var17_14 - (f7 -= f11);
                object8 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                if (object8 < 0) {
                    object = this.zze;
                    var17_14 = (reference)((Float)object).floatValue();
                    this.zzd = (float)var17_14;
                    this.zzh = n3;
                }
            }
            object = this.zze;
            object8 = ((Float)object).isInfinite();
            if (object8 != false) {
                object8 = false;
                var17_14 = (reference)0.0f;
                object = null;
                this.zze = f6 = Float.valueOf(0.0f);
                this.zzd = 0.0f;
            }
            if ((object8 = (Object)this.zzh) != false && (object8 = (Object)this.zzi) != false) {
                object = "Flick detected.";
                com.google.android.gms.ads.internal.util.zze.zza((String)object);
                this.zzf = l2;
                object8 = this.zzg + n3;
                this.zzg = (int)object8;
                this.zzh = false;
                this.zzi = false;
                object2 = this.zzj;
                if (object2 != null) {
                    object3 = zzbep.zzjg;
                    object4 = zzba.zzc();
                    object3 = (Integer)((zzben)object4).zza((zzbeg)object3);
                    int n4 = (Integer)object3;
                    if (object8 == n4) {
                        object2 = (zzdya)object2;
                        object = new zzdxy((zzdya)object2);
                        object3 = zzdxz.zzc;
                        ((zzdya)object2).zzh((zzda)object, (zzdxz)((Object)object3));
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
            block4: {
                block3: {
                    try {
                        Sensor sensor;
                        Object object;
                        boolean bl2 = this.zzk;
                        if (!bl2 || (object = this.zzb) == null || (sensor = this.zzc) == null) break block3;
                        object.unregisterListener((SensorEventListener)this, sensor);
                        bl2 = false;
                        object = null;
                        this.zzk = false;
                        object = "Stopped listening for flick gestures.";
                        com.google.android.gms.ads.internal.util.zze.zza((String)object);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzc() {
        // MONITORENTER : this
        Object object = zzbep.zzjd;
        zzben zzben2 = zzba.zzc();
        object = zzben2.zza((zzbeg)object);
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            // MONITOREXIT : this
            return;
        }
        bl2 = this.zzk;
        if (!bl2 && (object = this.zzb) != null && (zzben2 = this.zzc) != null) {
            int n3 = 2;
            object.registerListener((SensorEventListener)this, (Sensor)zzben2, n3);
            this.zzk = bl2 = true;
            object = "Listening for flick gestures.";
            com.google.android.gms.ads.internal.util.zze.zza((String)object);
        }
        // MONITOREXIT : this
        object = this.zzb;
        if (object != null) {
            object = this.zzc;
            if (object != null) return;
        }
        zzm.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
    }

    public final void zzd(zzdxl zzdxl2) {
        this.zzj = zzdxl2;
    }
}

