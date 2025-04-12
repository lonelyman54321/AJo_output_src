/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqw;
import java.io.Serializable;
import java.util.Map;

public final class zzlh
extends zzjo {
    public final zzqo zza(zzhx serializable, zzqo ... object) {
        int n3;
        boolean bl2 = true;
        Preconditions.checkArgument(bl2);
        serializable = new Serializable();
        for (int i3 = 0; i3 < (n3 = ((zzqo[])object).length + -1); i3 += 2) {
            zzqs zzqs2;
            String string2 = zzjn.zzd(object[i3]);
            int n4 = i3 + 1;
            zzqo zzqo2 = object[n4];
            boolean bl3 = zzqo2 instanceof zzqs;
            if (bl3 && zzqo2 != (zzqs2 = zzqs.zzd) && zzqo2 != (zzqs2 = zzqs.zze)) {
                serializable = new Serializable("Illegal InternalType found in CreateObject.");
                throw serializable;
            }
            serializable.put(string2, zzqo2);
        }
        object = new zzqw((Map)((Object)serializable));
        return object;
    }
}

