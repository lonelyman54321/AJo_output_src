/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzgo;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzox;
import com.google.android.gms.internal.gtm.zzpa;
import com.google.android.gms.internal.gtm.zzpb;
import com.google.android.gms.internal.gtm.zzpe;
import com.google.android.gms.internal.gtm.zzpf;
import com.google.android.gms.internal.gtm.zzpj;
import com.google.android.gms.internal.gtm.zzpk;
import com.google.android.gms.internal.gtm.zzpl;
import com.google.android.gms.internal.gtm.zzpq;
import java.util.List;

final class zzpc
extends zzpa {
    final /* synthetic */ zzpe zze;
    private final zzpb zzf;
    private final List zzg;
    private final int zzh;

    public zzpc(zzpe zzpe2, int n3, zzpj zzpj2, zzpf zzpf2, List list, int n4, zzpb zzpb2, zzgo zzgo2) {
        this.zze = zzpe2;
        Clock clock = DefaultClock.getInstance();
        super(n3, zzpj2, zzpf2, zzgo2, clock);
        this.zzf = zzpb2;
        this.zzg = list;
        this.zzh = n4;
    }

    public final void zza(zzpl object) {
        int n4;
        Object object2;
        Object object3;
        block4: {
            block5: {
                int n3;
                boolean n32;
                object3 = ((zzpl)object).getStatus();
                if (object3 != (object2 = Status.RESULT_SUCCESS)) break block4;
                object3 = ((zzpl)object).zzd();
                object2 = "Container resource successfully loaded from ";
                object3 = ((String)object2).concat((String)object3);
                zzhi.zzd((String)object3);
                n4 = ((zzpl)object).zza();
                if (n4 != 0 || (n32 = ((zzox)(object2 = ((zzpk)(object3 = ((zzpl)object).zzb())).zzb())).zzg())) break block5;
                object2 = this.zze;
                Object object4 = ((zzpl)object).getStatus();
                ((zzpe)object2).zzd((Status)object4, (zzpk)object3);
                object2 = ((zzpk)object3).zzd();
                if (object2 == null || (n3 = ((Object)(object2 = (Object)((zzpk)object3).zzd())).length) <= 0) break block4;
                object2 = zzpe.zza(this.zze);
                object4 = ((zzpk)object3).zzb().zzd();
                object3 = ((zzpk)object3).zzd();
                ((zzpq)object2).zzg((String)object4, (byte[])object3);
            }
            this.zzf.zza((zzpl)object);
            return;
        }
        object3 = ((zzpl)object).zzd();
        boolean bl2 = true;
        object2 = ((zzpl)object).getStatus();
        boolean bl3 = ((Status)object2).isSuccess();
        object2 = bl2 != bl3 ? "FAILURE" : "SUCCESS";
        Object object5 = "Cannot fetch a valid resource from ";
        Object object6 = new StringBuilder((String)object5);
        ((StringBuilder)object6).append((String)object3);
        ((StringBuilder)object6).append(". Response status: ");
        ((StringBuilder)object6).append((String)object2);
        zzhi.zzd(((StringBuilder)object6).toString());
        object3 = ((zzpl)object).getStatus();
        n4 = (int)(((Status)object3).isSuccess() ? 1 : 0);
        if (n4 != 0) {
            object3 = ((zzpl)object).zzd();
            zzhi.zzd("Response source: ".concat((String)object3));
            int n7 = ((zzpl)object).zzb().zzd().length;
            object2 = "Response size: ";
            object3 = new StringBuilder((String)object2);
            ((StringBuilder)object3).append(n7);
            object = ((StringBuilder)object3).toString();
            zzhi.zzd((String)object);
        }
        object6 = this.zze;
        object5 = this.zza;
        List list = this.zzg;
        int n8 = this.zzh + 1;
        zzpb zzpb2 = this.zzf;
        zzgo zzgo2 = this.zzd;
        ((zzpe)object6).zzb((zzpj)object5, list, n8, zzpb2, zzgo2);
    }
}

