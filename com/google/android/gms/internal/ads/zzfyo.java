/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyp;
import com.google.android.gms.internal.ads.zzfyr;
import com.google.android.gms.internal.ads.zzfyt;

final class zzfyo
extends zzfyr {
    final /* synthetic */ zzfyp zza;

    public zzfyo(zzfyp zzfyp2, zzfyt zzfyt2, CharSequence charSequence) {
        this.zza = zzfyp2;
        super(zzfyt2, charSequence);
    }

    public final int zzc(int n3) {
        return n3;
    }

    public final int zzd(int n3) {
        CharSequence charSequence = this.zzb;
        int n4 = charSequence.length();
        if ((n3 += 4000) < n4) {
            return n3;
        }
        return -1;
    }
}

