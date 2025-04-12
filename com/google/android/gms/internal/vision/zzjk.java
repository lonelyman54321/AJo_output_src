/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjn;
import com.google.android.gms.internal.vision.zzkk;
import java.io.IOException;

public class zzjk
extends IOException {
    private zzkk zza = null;

    public zzjk(String string2) {
        super(string2);
    }

    public static zzjk zza() {
        zzjk zzjk2 = new zzjk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return zzjk2;
    }

    public static zzjk zzb() {
        zzjk zzjk2 = new zzjk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return zzjk2;
    }

    public static zzjk zzc() {
        zzjk zzjk2 = new zzjk("CodedInputStream encountered a malformed varint.");
        return zzjk2;
    }

    public static zzjk zzd() {
        zzjk zzjk2 = new zzjk("Protocol message contained an invalid tag (zero).");
        return zzjk2;
    }

    public static zzjk zze() {
        zzjk zzjk2 = new zzjk("Protocol message end-group tag did not match expected tag.");
        return zzjk2;
    }

    public static zzjn zzf() {
        zzjn zzjn2 = new zzjn("Protocol message tag had invalid wire type.");
        return zzjn2;
    }

    public static zzjk zzg() {
        zzjk zzjk2 = new zzjk("Failed to parse the message.");
        return zzjk2;
    }

    public static zzjk zzh() {
        zzjk zzjk2 = new zzjk("Protocol message had invalid UTF-8.");
        return zzjk2;
    }

    public final zzjk zza(zzkk zzkk2) {
        this.zza = zzkk2;
        return this;
    }
}

