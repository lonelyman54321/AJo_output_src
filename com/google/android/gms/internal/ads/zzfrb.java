/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzftj;
import com.google.android.gms.internal.ads.zzftk;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzfrb
implements Continuation {
    public final /* synthetic */ zzasx zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzfrb(zzasx zzasx2, int n3) {
        this.zza = zzasx2;
        this.zzb = n3;
    }

    public final Object then(Task object) {
        int n3 = zzfre.zza;
        n3 = (int)(((Task)object).isSuccessful() ? 1 : 0);
        if (n3 != 0) {
            n3 = this.zzb;
            Object object2 = this.zza;
            object = (zzftk)((Task)object).getResult();
            object2 = ((zzatd)((zzhbi)object2).zzbn()).zzaV();
            object = ((zzftk)object).zza((byte[])object2);
            ((zzftj)object).zza(n3);
            ((zzftj)object).zzc();
            object = Boolean.TRUE;
        } else {
            object = Boolean.FALSE;
        }
        return object;
    }
}

