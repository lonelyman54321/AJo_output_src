/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzcit;

public final class zzdrt
implements zzcit {
    public final /* synthetic */ zzccn zza;

    public /* synthetic */ zzdrt(zzccn zzccn2) {
        this.zza = zzccn2;
    }

    public final void zza(boolean bl2, int n3, String string2, String string3) {
        zzccn zzccn2 = this.zza;
        if (bl2) {
            zzccn2.zzc(null);
            return;
        }
        CharSequence charSequence = Fh3.a(n3, "Ad Web View failed to load. Error code: ", ", Description: ", string2, ", Failing URL: ");
        charSequence.append(string3);
        charSequence = charSequence.toString();
        Exception exception = new Exception((String)charSequence);
        zzccn2.zzd(exception);
    }
}

