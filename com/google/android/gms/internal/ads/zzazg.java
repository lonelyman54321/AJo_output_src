/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaxk;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import java.lang.reflect.Method;

public final class zzazg
extends zzazs {
    public zzazg(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "WfvM4SeNDVyFarUKUVpVTE2MRQkjnaN4GpgwC5lMrmyQkCennlTSSkgCAZvzOVXK", "Kq6mcF8LH4HqXGyg5/DR3VvLtDExNTPXoCRIPhkdOGM=", zzatp2, n3, 3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = zzbep.zzcI;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        ((Boolean)object).booleanValue();
        Object object2 = this.zzf;
        Object object3 = this.zzb.zzb();
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object3;
        int n4 = 1;
        objectArray[n4] = object;
        object = (String)((Method)object2).invoke(null, objectArray);
        object2 = new zzaxk((String)object);
        object = this.zze;
        synchronized (object) {
            object3 = this.zze;
            long l2 = ((zzaxk)object2).zza;
            ((zzatp)object3).zzk(l2);
            object3 = this.zze;
            l2 = ((zzaxk)object2).zzb;
            ((zzatp)object3).zzH(l2);
            return;
        }
    }
}

