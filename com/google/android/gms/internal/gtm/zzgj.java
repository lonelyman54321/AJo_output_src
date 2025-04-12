/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzgk;
import com.google.android.gms.internal.gtm.zzgl;
import com.google.android.gms.internal.gtm.zzgm;
import com.google.android.gms.internal.gtm.zzgo;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhp;
import com.google.android.gms.internal.gtm.zzpb;
import com.google.android.gms.internal.gtm.zzpe;
import com.google.android.gms.internal.gtm.zzpl;
import java.util.ArrayList;

final class zzgj
implements Runnable,
zzpb {
    final /* synthetic */ zzgm zza;

    public /* synthetic */ zzgj(zzgm zzgm2, zzgl zzgl2) {
        this.zza = zzgm2;
    }

    /*
     * WARNING - void declaration
     */
    public final void run() {
        void var2_5;
        int n3;
        Object object = this.zza;
        int n4 = zzgm.zza((zzgm)object);
        if (n4 == (n3 = 2)) {
            boolean bl2 = true;
        } else {
            boolean bl3 = false;
            object = null;
        }
        Preconditions.checkState((boolean)var2_5);
        object = this.zza;
        Object object2 = zzhp.zza();
        object = zzgm.zzi((zzgm)object);
        boolean bl4 = ((zzhp)object2).zze((String)object);
        if (bl4) {
            return;
        }
        object = zzgm.zzi(this.zza);
        object2 = new StringBuilder("Refreshing container ");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("...");
        zzhi.zzd(((StringBuilder)object2).toString());
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = 0;
        arrayList.add(object);
        object = this.zza;
        zzpe zzpe2 = zzgm.zzh((zzgm)object);
        String string2 = zzgm.zzi((zzgm)object);
        String string3 = zzgm.zzk((zzgm)object);
        String string4 = zzgm.zzj((zzgm)object);
        zzgo zzgo2 = zzgm.zze((zzgm)object);
        zzpe2.zzc(string2, string3, string4, arrayList, this, zzgo2);
    }

    public final void zza(zzpl object) {
        Object object2;
        Object object3 = ((zzpl)object).getStatus();
        if (object3 == (object2 = Status.RESULT_SUCCESS)) {
            object3 = zzgm.zzi(this.zza);
            object2 = new StringBuilder("Refreshed container ");
            ((StringBuilder)object2).append((String)object3);
            ((StringBuilder)object2).append(". Reinitializing runtime...");
            zzhi.zzd(((StringBuilder)object2).toString());
            object3 = this.zza;
            object2 = zzgm.zzm((zzgm)object3);
            zzgk zzgk2 = new zzgk((zzgm)object3, (zzpl)object);
            object2.execute(zzgk2);
            return;
        }
        object = this.zza;
        long l2 = zzgm.zze((zzgm)object).zzc();
        zzgm.zzr((zzgm)object, l2);
    }
}

