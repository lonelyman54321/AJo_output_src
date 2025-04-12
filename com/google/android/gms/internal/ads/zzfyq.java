/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxv;
import com.google.android.gms.internal.ads.zzfyt;
import java.util.Iterator;

final class zzfyq
implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfyt zzb;

    public zzfyq(zzfyt zzfyt2, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfyt2;
    }

    public final Iterator iterator() {
        zzfyt zzfyt2 = this.zzb;
        CharSequence charSequence = this.zza;
        return zzfyt.zze(zzfyt2, charSequence);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        zzfxv.zzb(stringBuilder, this, ", ");
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

