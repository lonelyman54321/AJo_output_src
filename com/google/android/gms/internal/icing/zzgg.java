/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzef;
import com.google.android.gms.internal.icing.zzgb;
import com.google.android.gms.internal.icing.zzgf;
import com.google.android.gms.internal.icing.zzgh;

public final class zzgg
extends zzcx
implements zzef {
    private zzgg() {
        zzgh zzgh2 = zzgh.zzb();
        super(zzgh2);
    }

    public /* synthetic */ zzgg(zzgb object) {
        object = zzgh.zzb();
        super((zzda)object);
    }

    public final zzgg zza(boolean bl2) {
        boolean bl3 = this.zzb;
        if (bl3) {
            this.zzg();
            bl3 = false;
            this.zzb = false;
        }
        zzgh.zzc((zzgh)this.zza, bl2);
        return this;
    }

    public final zzgg zzb(String string2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzgh.zzd((zzgh)this.zza, string2);
        return this;
    }

    public final zzgg zzc(zzgf zzgf2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzgh.zze((zzgh)this.zza, zzgf2);
        return this;
    }
}

