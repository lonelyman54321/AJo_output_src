/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzam;
import com.google.android.gms.internal.icing.zzaq;
import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzef;

public final class zzan
extends zzcx
implements zzef {
    private zzan() {
        zzaq zzaq2 = zzaq.zzb();
        super(zzaq2);
    }

    public /* synthetic */ zzan(zzam object) {
        object = zzaq.zzb();
        super((zzda)object);
    }

    public final zzan zza(Iterable iterable) {
        boolean bl2 = this.zzb;
        if (bl2) {
            this.zzg();
            bl2 = false;
            this.zzb = false;
        }
        zzaq.zzc((zzaq)this.zza, iterable);
        return this;
    }
}

