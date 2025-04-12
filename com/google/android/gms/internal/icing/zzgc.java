/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzef;
import com.google.android.gms.internal.icing.zzgb;
import com.google.android.gms.internal.icing.zzgd;
import com.google.android.gms.internal.icing.zzgh;

public final class zzgc
extends zzcx
implements zzef {
    private zzgc() {
        zzgd zzgd2 = zzgd.zzb();
        super(zzgd2);
    }

    public /* synthetic */ zzgc(zzgb object) {
        object = zzgd.zzb();
        super((zzda)object);
    }

    public final zzgc zza(String string2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzgd.zzc((zzgd)this.zza, string2);
        return this;
    }

    public final zzgc zzb(zzgh zzgh2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzgd.zzd((zzgd)this.zza, zzgh2);
        return this;
    }
}

