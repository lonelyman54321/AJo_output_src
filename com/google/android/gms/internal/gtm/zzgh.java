/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzgg;
import com.google.android.gms.internal.gtm.zzgk;
import com.google.android.gms.internal.gtm.zzgl;
import com.google.android.gms.internal.gtm.zzgm;
import com.google.android.gms.internal.gtm.zzgo;
import com.google.android.gms.internal.gtm.zzhp;
import com.google.android.gms.internal.gtm.zzpb;
import com.google.android.gms.internal.gtm.zzpe;
import com.google.android.gms.internal.gtm.zzpl;
import java.util.ArrayList;

final class zzgh
implements Runnable,
zzpb {
    final /* synthetic */ zzgm zza;

    public /* synthetic */ zzgh(zzgm zzgm2, zzgl zzgl2) {
        this.zza = zzgm2;
    }

    public final void run() {
        Object object = this.zza;
        boolean n3 = zzgm.zza((zzgm)object);
        boolean bl2 = false;
        Object object2 = null;
        Integer n4 = 0;
        boolean bl3 = true;
        Integer n7 = (int)(bl3 ? 1 : 0);
        if (n3 != bl3) {
            bl3 = false;
        }
        Preconditions.checkState(bl3);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        zzgm.zzn(this.zza, false);
        object = this.zza;
        object2 = zzhp.zza();
        object = zzgm.zzi((zzgm)object);
        boolean bl4 = ((zzhp)object2).zze((String)object);
        if (bl4) {
            arrayList.add(n4);
        } else {
            object = this.zza;
            object2 = zzgm.zze((zzgm)object);
            bl2 = ((zzgo)object2).zzf();
            zzgm.zzn((zzgm)object, bl2);
            object = this.zza;
            boolean bl5 = zzgm.zzu((zzgm)object);
            if (!bl5) {
                arrayList.add(n4);
                arrayList.add(n7);
            } else {
                arrayList.add(n7);
                arrayList.add(n4);
            }
            int n8 = 2;
            object = n8;
            arrayList.add(object);
        }
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
            object3 = this.zza;
            object2 = zzgm.zzm((zzgm)object3);
            zzgk zzgk2 = new zzgk((zzgm)object3, (zzpl)object);
            object2.execute(zzgk2);
            return;
        }
        object = this.zza;
        object3 = zzgm.zzm((zzgm)object);
        object2 = new zzgg((zzgm)object, null);
        object3.execute((Runnable)object2);
    }
}

