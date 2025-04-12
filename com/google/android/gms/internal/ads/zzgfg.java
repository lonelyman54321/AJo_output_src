/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzges;
import com.google.android.gms.internal.ads.zzgff;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class zzgfg
extends zzges {
    private zzgff zza;

    public zzgfg(zzgax serializable, boolean bl2, Executor executor, Callable callable) {
        super((zzgax)serializable, bl2, false);
        super(this, callable, executor);
        this.zza = serializable;
        this.zzv();
    }

    public static /* bridge */ /* synthetic */ void zzG(zzgfg zzgfg2, zzgff zzgff2) {
        zzgfg2.zza = null;
    }

    public final void zzf(int n3, Object object) {
    }

    public final void zzq() {
        zzgff zzgff2 = this.zza;
        if (zzgff2 != null) {
            zzgff2.zzh();
        }
    }

    public final void zzu() {
        zzgff zzgff2 = this.zza;
        if (zzgff2 != null) {
            zzgff2.zzf();
        }
    }

    public final void zzy(int n3) {
        super.zzy(n3);
        int n4 = 1;
        if (n3 == n4) {
            n3 = 0;
            this.zza = null;
        }
    }
}

