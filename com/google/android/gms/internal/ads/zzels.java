/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfim;
import java.util.concurrent.Executor;

public final class zzels
implements zzehr {
    private final Context zza;
    private final Executor zzb;
    private final zzdrm zzc;

    public zzels(Context context, Executor executor, zzdrm zzdrm2) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdrm2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzfhf object, zzfgt object2, zzeho zzeho2) {
        Exception exception2;
        block3: {
            Object object3;
            try {
                object = ((zzfhf)object).zza;
                object = ((zzfhc)object).zza;
                object3 = ((zzfho)object).zzo;
                int n3 = ((zzfhb)object3).zza;
                int n4 = 3;
                if (n3 == n4) {
                    object3 = zzeho2.zzb;
                    object3 = (zzfim)object3;
                    Context context = this.zza;
                    object = ((zzfho)object).zzd;
                    object2 = ((zzfgt)object2).zzw;
                    object2 = object2.toString();
                    Object object4 = zzeho2.zzc;
                    object4 = (zzbrl)object4;
                    ((zzfim)object3).zzr(context, (zzl)object, (String)object2, (zzbrl)object4);
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object3 = zzeho2.zzb;
            object3 = (zzfim)object3;
            Context context = this.zza;
            object = ((zzfho)object).zzd;
            object2 = ((zzfgt)object2).zzw;
            object2 = object2.toString();
            Object object5 = zzeho2.zzc;
            object5 = (zzbrl)object5;
            ((zzfim)object3).zzq(context, (zzl)object, (String)object2, (zzbrl)object5);
            return;
        }
        object2 = String.valueOf(zzeho2.zza);
        zzm.zzk("Fail to load ad from adapter ".concat((String)object2), exception2);
    }
}

