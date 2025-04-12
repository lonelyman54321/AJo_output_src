/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzfmq;

public final class zzbpy {
    private final Object zza;
    private final Object zzb;
    private zzbqh zzc;
    private zzbqh zzd;

    public zzbpy() {
        Object object;
        this.zza = object = new Object();
        this.zzb = object = new Object();
    }

    private static final Context zzc(Context context) {
        Context context2 = context.getApplicationContext();
        if (context2 == null) {
            return context;
        }
        return context2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbqh zza(Context object, VersionInfoParcel versionInfoParcel, zzfmq zzfmq2) {
        Object object2 = this.zza;
        synchronized (object2) {
            try {
                zzbqh zzbqh2 = this.zzc;
                if (zzbqh2 != null) return this.zzc;
                object = zzbpy.zzc(object);
                Object object3 = zzbep.zza;
                zzben zzben2 = zzba.zzc();
                object3 = zzben2.zza((zzbeg)object3);
                object3 = (String)object3;
                this.zzc = zzbqh2 = new zzbqh((Context)object, versionInfoParcel, (String)object3, zzfmq2);
                return this.zzc;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbqh zzb(Context object, VersionInfoParcel versionInfoParcel, zzfmq zzfmq2) {
        Object object2 = this.zzb;
        synchronized (object2) {
            try {
                zzbqh zzbqh2 = this.zzd;
                if (zzbqh2 != null) return this.zzd;
                object = zzbpy.zzc(object);
                Object object3 = zzbgu.zzb;
                object3 = ((zzbfv)object3).zze();
                object3 = (String)object3;
                this.zzd = zzbqh2 = new zzbqh((Context)object, versionInfoParcel, (String)object3, zzfmq2);
                return this.zzd;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

