/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

import com.google.android.gms.internal.common.zzaa;
import com.google.android.gms.internal.common.zzr;
import com.google.android.gms.internal.common.zzv;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzz;

final class zzw
extends zzz {
    final /* synthetic */ zzr zza;

    public zzw(zzx zzx2, zzaa zzaa2, CharSequence charSequence, zzr zzr2) {
        this.zza = zzr2;
        super(zzaa2, charSequence);
    }

    public final int zzc(int n3) {
        return n3 + 1;
    }

    public final int zzd(int n3) {
        block2: {
            CharSequence charSequence = this.zzb;
            int n4 = charSequence.length();
            Object object = "index";
            zzv.zzb(n3, n4, (String)object);
            while (n3 < n4) {
                object = this.zza;
                char c2 = charSequence.charAt(n3);
                boolean bl2 = ((zzr)object).zza(c2);
                if (!bl2) {
                    ++n3;
                    continue;
                }
                break block2;
            }
            n3 = -1;
        }
        return n3;
    }
}

