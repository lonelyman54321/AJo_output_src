/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabv;
import com.google.android.gms.internal.gtm.zzaca;
import com.google.android.gms.internal.gtm.zzacc;
import com.google.android.gms.internal.gtm.zzadm;

public class zzacb
extends zzaca
implements zzadm {
    public zzacb(zzacc zzacc2) {
        super(zzacc2);
    }

    public final void zzH() {
        super.zzH();
        Object object = ((zzacc)this.zza).zza;
        zzabv zzabv2 = zzabv.zze();
        if (object != zzabv2) {
            object = (zzacc)this.zza;
            ((zzacc)object).zza = zzabv2 = ((zzacc)object).zza.zzd();
        }
    }

    public final zzacc zzJ() {
        zzacc zzacc2 = (zzacc)this.zza;
        boolean bl2 = zzacc2.zzar();
        if (!bl2) {
            return (zzacc)this.zza;
        }
        ((zzacc)this.zza).zza.zzi();
        return (zzacc)super.zzC();
    }
}

