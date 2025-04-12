/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgwu;
import com.google.android.gms.internal.ads.zzhay;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class zzggz {
    private final InputStream zza;

    private zzggz(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzggz zzb(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        zzggz zzggz2 = new zzggz(byteArrayInputStream);
        return zzggz2;
    }

    public final zzgwu zza() {
        try {
            Object object = this.zza;
            zzhay zzhay2 = zzhay.zza();
            object = zzgwu.zzg((InputStream)object, zzhay2);
            return object;
        }
        finally {
            this.zza.close();
        }
    }
}

