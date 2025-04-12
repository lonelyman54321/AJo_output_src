/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.internal.ads.zzbcx;
import com.google.android.gms.internal.ads.zzbcy;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccn;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

final class zzbdg
implements BaseGmsClient$BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd;
    final /* synthetic */ zzbcy zza;
    final /* synthetic */ zzccn zzb;
    final /* synthetic */ zzbdi zzc;

    public zzbdg(zzbdi zzbdi2, zzbcy zzbcy2, zzccn zzccn2) {
        this.zza = zzbcy2;
        this.zzb = zzccn2;
        this.zzc = zzbdi2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConnected(Bundle object) {
        object = zzbdi.zzb(this.zzc);
        synchronized (object) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                Object object2;
                try {
                    object2 = this.zzc;
                    bl2 = zzbdi.zzf((zzbdi)object2);
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                bl2 = true;
                zzbdi.zzd((zzbdi)object2, bl2);
                object2 = this.zzc;
                object2 = zzbdi.zza((zzbdi)object2);
                if (object2 == null) {
                    return;
                }
                Object object3 = zzcci.zza;
                Object object4 = this.zza;
                zzccn zzccn2 = this.zzb;
                zzbdd zzbdd2 = new zzbdd(this, (zzbcx)object2, (zzbcy)object4, zzccn2);
                object2 = object3.zza(zzbdd2);
                object3 = this.zzb;
                object4 = new zzbde((zzccn)object3, (Future)object2);
                object2 = zzcci.zzf;
                ((zzccn)object3).addListener((Runnable)object4, (Executor)object2);
                return;
            }
            throw throwable2;
        }
    }

    public final void onConnectionSuspended(int n3) {
    }
}

