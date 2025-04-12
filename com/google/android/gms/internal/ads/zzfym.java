/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfyr;
import com.google.android.gms.internal.ads.zzfyt;

final class zzfym
extends zzfyr {
    final /* synthetic */ zzfyn zza;

    public zzfym(zzfyn zzfyn2, zzfyt zzfyt2, CharSequence charSequence) {
        this.zza = zzfyn2;
        super(zzfyt2, charSequence);
    }

    public final int zzc(int n3) {
        return n3 + 1;
    }

    public final int zzd(int n3) {
        block2: {
            CharSequence charSequence = this.zzb;
            int n4 = charSequence.length();
            Object object = "index";
            zzfyg.zzb(n3, n4, (String)object);
            while (n3 < n4) {
                object = this.zza;
                object = ((zzfyn)object).zza;
                char c2 = charSequence.charAt(n3);
                boolean bl2 = ((zzfxr)object).zzb(c2);
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

