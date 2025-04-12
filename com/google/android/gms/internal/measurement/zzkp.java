/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzko;
import java.io.IOException;

public class zzkp
extends IOException {
    public zzkp(String string2) {
        super(string2);
    }

    public static zzko zza() {
        zzko zzko2 = new zzko("Protocol message tag had invalid wire type.");
        return zzko2;
    }

    public static zzkp zzb() {
        zzkp zzkp2 = new zzkp("Protocol message end-group tag did not match expected tag.");
        return zzkp2;
    }

    public static zzkp zzc() {
        zzkp zzkp2 = new zzkp("Protocol message contained an invalid tag (zero).");
        return zzkp2;
    }

    public static zzkp zzd() {
        zzkp zzkp2 = new zzkp("Protocol message had invalid UTF-8.");
        return zzkp2;
    }

    public static zzkp zze() {
        zzkp zzkp2 = new zzkp("CodedInputStream encountered a malformed varint.");
        return zzkp2;
    }

    public static zzkp zzf() {
        zzkp zzkp2 = new zzkp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return zzkp2;
    }

    public static zzkp zzg() {
        zzkp zzkp2 = new zzkp("Failed to parse the message.");
        return zzkp2;
    }

    public static zzkp zzh() {
        zzkp zzkp2 = new zzkp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return zzkp2;
    }

    public static zzkp zzi() {
        zzkp zzkp2 = new zzkp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return zzkp2;
    }
}

