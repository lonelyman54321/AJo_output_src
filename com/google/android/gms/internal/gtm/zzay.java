/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzay
extends zzj {
    private final Map zza;

    public zzay() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public final String toString() {
        return zzj.zza(this.zza);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zze(String string2, String string3) {
        String string4;
        int n3;
        Preconditions.checkNotEmpty(string2);
        if (string2 != null && (n3 = string2.startsWith(string4 = "&")) != 0) {
            n3 = 1;
            string2 = string2.substring(n3);
        }
        Preconditions.checkNotEmpty(string2, "Name can not be empty or \"&\"");
        this.zza.put(string2, string3);
    }
}

