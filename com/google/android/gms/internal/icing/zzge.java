/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzef;
import com.google.android.gms.internal.icing.zzgb;
import com.google.android.gms.internal.icing.zzgd;
import com.google.android.gms.internal.icing.zzgf;

public final class zzge
extends zzcx
implements zzef {
    private zzge() {
        zzgf zzgf2 = zzgf.zzb();
        super(zzgf2);
    }

    public /* synthetic */ zzge(zzgb object) {
        object = zzgf.zzb();
        super((zzda)object);
    }

    public final zzge zza(String string2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzgf.zzc((zzgf)this.zza, string2);
        return this;
    }

    public final zzge zzb(zzgd zzgd2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzgf.zzd((zzgf)this.zza, zzgd2);
        return this;
    }
}

