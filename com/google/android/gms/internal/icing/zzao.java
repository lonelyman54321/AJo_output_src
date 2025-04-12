/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzam;
import com.google.android.gms.internal.icing.zzap;
import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzef;

public final class zzao
extends zzcx
implements zzef {
    private zzao() {
        zzap zzap2 = zzap.zzb();
        super(zzap2);
    }

    public /* synthetic */ zzao(zzam object) {
        object = zzap.zzb();
        super((zzda)object);
    }

    public final zzao zza(String string2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzap.zzc((zzap)this.zza, string2);
        return this;
    }

    public final zzao zzb(String string2) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzap.zzd((zzap)this.zza, string2);
        return this;
    }

    public final zzao zzc(int n3) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzap.zze((zzap)this.zza, n3);
        return this;
    }
}

