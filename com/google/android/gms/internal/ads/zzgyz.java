/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyn;
import com.google.android.gms.internal.ads.zzgza;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

final class zzgyz
extends ThreadLocal {
    final /* synthetic */ zzgza zza;

    public zzgyz(zzgza zzgza2) {
        this.zza = zzgza2;
    }

    public final Mac zza() {
        Object object;
        Object object2;
        try {
            object2 = zzgyn.zzb;
        }
        catch (GeneralSecurityException generalSecurityException) {
            object = new IllegalStateException(generalSecurityException);
            throw object;
        }
        object = this.zza;
        object = zzgza.zzb((zzgza)object);
        object2 = ((zzgyn)object2).zza((String)object);
        object2 = (Mac)object2;
        object = this.zza;
        object = zzgza.zzc((zzgza)object);
        ((Mac)object2).init((Key)object);
        return object2;
    }
}

