/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzbcx;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdh;
import java.util.concurrent.Future;

public final class zzbdi {
    private zzbcx zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd;

    public zzbdi(Context context) {
        Object object;
        this.zzd = object = new Object();
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ zzbcx zza(zzbdi zzbdi2) {
        return zzbdi2.zza;
    }

    public static /* bridge */ /* synthetic */ Object zzb(zzbdi zzbdi2) {
        return zzbdi2.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbdi zzbdi2, boolean bl2) {
        zzbdi2.zzb = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ void zze(zzbdi zzbdi2) {
        Object object = zzbdi2.zzd;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                zzbcx zzbcx2;
                try {
                    zzbcx2 = zzbdi2.zza;
                    if (zzbcx2 == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                zzbcx2.disconnect();
                zzbcx2 = null;
                zzbdi2.zza = null;
                Binder.flushPendingCommands();
                return;
            }
            throw throwable2;
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzf(zzbdi zzbdi2) {
        return zzbdi2.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Future zzc(zzbcy object) {
        zzbdc zzbdc2 = new zzbdc(this);
        zzbdg zzbdg2 = new zzbdg(this, (zzbcy)object, zzbdc2);
        object = new zzbdh(this, zzbdc2);
        Object object2 = this.zzd;
        synchronized (object2) {
            zzbcx zzbcx2;
            Context context = this.zzc;
            zzbx zzbx2 = zzu.zzt();
            zzbx2 = zzbx2.zzb();
            this.zza = zzbcx2 = new zzbcx(context, (Looper)zzbx2, zzbdg2, (BaseGmsClient$BaseOnConnectionFailedListener)object);
            zzbcx2.checkAvailabilityAndConnect();
            return zzbdc2;
        }
    }
}

