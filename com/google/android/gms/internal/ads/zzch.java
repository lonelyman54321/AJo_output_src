/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzch
extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzch(String string2, Throwable throwable, boolean bl2, int n3) {
        super(string2, throwable);
        this.zza = bl2;
        this.zzb = n3;
    }

    public static zzch zza(String string2, Throwable throwable) {
        int n3 = 1;
        zzch zzch2 = new zzch(string2, throwable, n3 != 0, n3);
        return zzch2;
    }

    public static zzch zzb(String string2, Throwable throwable) {
        zzch zzch2 = new zzch(string2, throwable, true, 0);
        return zzch2;
    }

    public static zzch zzc(String string2) {
        zzch zzch2 = new zzch(string2, null, false, 1);
        return zzch2;
    }

    public final String getMessage() {
        StringBuilder stringBuilder = nn_2.a(super.getMessage(), "{contentIsMalformed=");
        boolean bl2 = this.zza;
        stringBuilder.append(bl2);
        stringBuilder.append(", dataType=");
        return g30.a(this.zzb, "}", stringBuilder);
    }
}

