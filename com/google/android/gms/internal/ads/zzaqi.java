/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaqj;
import java.security.cert.X509Certificate;

final class zzaqi
extends zzaqj {
    private final byte[] zza;

    public zzaqi(X509Certificate x509Certificate, byte[] byArray) {
        super(x509Certificate);
        this.zza = byArray;
    }

    public final byte[] getEncoded() {
        return this.zza;
    }
}

