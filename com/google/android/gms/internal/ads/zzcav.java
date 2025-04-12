/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzcax;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcby;
import java.util.Map;

public abstract class zzcav {
    static zzcav zza;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzcav zzd(Context object) {
        Class<zzcav> clazz = zzcav.class;
        synchronized (clazz) {
            Throwable throwable2;
            block8: {
                Object object2;
                block7: {
                    try {
                        object2 = zza;
                        if (object2 == null) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    return object2;
                }
                object = object.getApplicationContext();
                zzbep.zza((Context)object);
                object2 = zzu.zzo();
                object2 = ((zzcby)object2).zzi();
                object2.zzs((Context)object);
                boolean bl2 = false;
                String string2 = null;
                Object object3 = new zzcan(null);
                ((zzcan)object3).zzb((Context)object);
                object = zzu.zzB();
                ((zzcan)object3).zzc((Clock)object);
                ((zzcan)object3).zza((zzg)object2);
                object = zzu.zzn();
                ((zzcan)object3).zzd((zzcau)object);
                object = ((zzcan)object3).zze();
                zza = object;
                object = ((zzcav)object).zza();
                ((zzcag)object).zza();
                object = zza;
                object = ((zzcav)object).zzc();
                object2 = zzbep.zzar;
                object3 = zzba.zzc();
                object2 = ((zzben)object3).zza((zzbeg)object2);
                object2 = (Boolean)object2;
                boolean bl3 = (Boolean)object2;
                if (bl3) {
                    zzu.zzp();
                    object2 = zzbep.zzat;
                    object3 = zzba.zzc();
                    object2 = ((zzben)object3).zza((zzbeg)object2);
                    object2 = (String)object2;
                    object2 = zzt.zzv((String)object2);
                    object3 = object2.keySet();
                    object3 = object3.iterator();
                    while (bl2 = object3.hasNext()) {
                        string2 = (String)object3.next();
                        string2 = string2;
                        ((zzcaz)object).zzc(string2);
                    }
                    object3 = new zzcax((zzcaz)object, (Map)object2);
                    ((zzcaz)object).zzd((zzcax)object3);
                }
                return zza;
            }
            throw throwable2;
        }
    }

    public abstract zzcag zza();

    public abstract zzcak zzb();

    public abstract zzcaz zzc();
}

