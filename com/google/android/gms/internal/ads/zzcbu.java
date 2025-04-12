/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzcby;

final class zzcbu
extends zzb {
    final /* synthetic */ zzcby zza;

    public zzcbu(zzcby zzcby2) {
        this.zza = zzcby2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zza;
        Object object2 = zzcby.zzc((zzcby)object);
        object = zzcby.zzj((zzcby)object).afmaVersion;
        zzbes zzbes2 = new zzbes((Context)object2, (String)object);
        object = zzcby.zzm(this.zza);
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    try {
                        zzu.zze();
                        object2 = this.zza;
                        object2 = zzcby.zzf((zzcby)object2);
                        zzbev.zza((zzbeu)object2, zzbes2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        object2 = "Cannot config CSI reporter.";
                        zzm.zzk((String)object2, illegalArgumentException);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

