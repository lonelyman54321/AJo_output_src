/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyk;
import com.google.android.gms.internal.ads.zzgym;
import com.google.android.gms.internal.ads.zzgyn;
import com.google.android.gms.internal.ads.zzgyv;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

final class zzgyl
implements zzgym {
    private final zzgyv zza;

    public /* synthetic */ zzgyl(zzgyv zzgyv2, zzgyk zzgyk2) {
        this.zza = zzgyv2;
    }

    public final Object zza(String object) {
        boolean bl2;
        Object object2 = "GmsCore_OpenSSL";
        Iterator iterator = zzgyn.zzb(new String[]{object2, "AndroidOpenSSL", "Conscrypt"}).iterator();
        Exception exception = null;
        while (bl2 = iterator.hasNext()) {
            zzgyv zzgyv2;
            object2 = (Provider)iterator.next();
            try {
                zzgyv2 = this.zza;
            }
            catch (Exception exception2) {
                if (exception != null) continue;
                exception = exception2;
                continue;
            }
            return zzgyv2.zza((String)object, (Provider)object2);
        }
        object = new GeneralSecurityException("No good Provider found.", exception);
        throw object;
    }
}

