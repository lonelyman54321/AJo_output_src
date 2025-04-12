/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfuc;
import com.google.android.gms.internal.ads.zzfud;
import com.google.android.gms.internal.ads.zzfup;
import com.google.android.gms.internal.ads.zzfuq;
import com.google.android.gms.internal.ads.zzfyw;
import java.io.Closeable;

public abstract class zzfue
implements Closeable {
    public static zzfuq zza() {
        zzfuq zzfuq2 = new zzfuq();
        return zzfuq2;
    }

    public static zzfuq zzb(int n3, zzfup zzfup2) {
        zzfuc zzfuc2 = new zzfuc(n3);
        zzfud zzfud2 = new zzfud();
        zzfuq zzfuq2 = new zzfuq(zzfuc2, zzfud2, zzfup2);
        return zzfuq2;
    }

    public static zzfuq zzc(zzfyw zzfyw2, zzfyw zzfyw3, zzfup zzfup2) {
        zzfuq zzfuq2 = new zzfuq(zzfyw2, zzfyw3, zzfup2);
        return zzfuq2;
    }

    public static /* synthetic */ Integer zzd(int n3) {
        return n3;
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}

