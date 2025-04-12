/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzh;
import java.security.cert.X509Certificate;

final class zzg
extends zzh {
    private final byte[] zza;

    public zzg(X509Certificate x509Certificate, byte[] byArray) {
        super(x509Certificate);
        this.zza = byArray;
    }

    public final byte[] getEncoded() {
        return this.zza;
    }
}

