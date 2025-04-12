/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzfw;
import java.io.IOException;

public final class zzfa
extends IOException {
    private zzfw zza;

    public zzfa(IOException iOException) {
        String string2 = iOException.getMessage();
        super(string2, iOException);
        this.zza = null;
    }

    public zzfa(String string2) {
        super(string2);
        this.zza = null;
    }

    public static zzfa zza() {
        zzfa zzfa2 = new zzfa("Protocol message contained an invalid tag (zero).");
        return zzfa2;
    }

    public static zzfa zzb() {
        zzfa zzfa2 = new zzfa("Protocol message had invalid UTF-8.");
        return zzfa2;
    }

    public static zzfa zzc() {
        zzfa zzfa2 = new zzfa("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return zzfa2;
    }

    public static zzfa zzd() {
        zzfa zzfa2 = new zzfa("Failed to parse the message.");
        return zzfa2;
    }

    public static zzfa zzf() {
        zzfa zzfa2 = new zzfa("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return zzfa2;
    }

    public final zzfa zze(zzfw zzfw2) {
        this.zza = zzfw2;
        return this;
    }
}

