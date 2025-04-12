/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyg;
import com.google.android.gms.internal.ads.zzgym;
import com.google.android.gms.internal.ads.zzgyn;
import com.google.android.gms.internal.ads.zzgyv;
import java.security.Provider;
import java.util.Iterator;

final class zzgyh
implements zzgym {
    private final zzgyv zza;

    public /* synthetic */ zzgyh(zzgyv zzgyv2, zzgyg zzgyg2) {
        this.zza = zzgyv2;
    }

    public final Object zza(String string2) {
        boolean bl2;
        Object object = "AndroidOpenSSL";
        Iterator iterator = zzgyn.zzb(new String[]{"GmsCore_OpenSSL", object}).iterator();
        while (bl2 = iterator.hasNext()) {
            zzgyv zzgyv2;
            object = (Provider)iterator.next();
            try {
                zzgyv2 = this.zza;
            }
            catch (Exception exception) {
                continue;
            }
            return zzgyv2.zza(string2, (Provider)object);
        }
        return this.zza.zza(string2, null);
    }
}

