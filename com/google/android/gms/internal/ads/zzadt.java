/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzaez;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzu;
import java.io.EOFException;

public final class zzadt
implements zzafa {
    private final byte[] zza;

    public zzadt() {
        byte[] byArray = new byte[4096];
        this.zza = byArray;
    }

    public final /* synthetic */ int zzf(zzu zzu2, int n3, boolean bl2) {
        return zzaey.zza(this, zzu2, n3, bl2);
    }

    public final int zzg(zzu object, int n3, boolean bl2, int n4) {
        byte[] byArray = this.zza;
        n3 = Math.min(4096, n3);
        int n7 = object.zza(byArray, 0, n3);
        if (n7 == (n3 = -1)) {
            if (bl2) {
                return n3;
            }
            object = new EOFException();
            throw object;
        }
        return n7;
    }

    public final void zzl(zzan zzan2) {
    }

    public final /* synthetic */ void zzq(zzfu zzfu2, int n3) {
        zzaey.zzb(this, zzfu2, n3);
    }

    public final void zzr(zzfu zzfu2, int n3, int n4) {
        zzfu2.zzL(n3);
    }

    public final void zzs(long l2, int n3, int n4, int n7, zzaez zzaez2) {
    }
}

