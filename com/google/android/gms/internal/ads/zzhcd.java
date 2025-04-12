/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhcc;
import com.google.android.gms.internal.ads.zzhde;
import java.io.IOException;

public class zzhcd
extends IOException {
    private zzhde zza;
    private boolean zzb;

    public zzhcd(IOException iOException) {
        String string2 = iOException.getMessage();
        super(string2, iOException);
        this.zza = null;
    }

    public zzhcd(String string2) {
        super(string2);
        this.zza = null;
    }

    public static zzhcc zza() {
        zzhcc zzhcc2 = new zzhcc("Protocol message tag had invalid wire type.");
        return zzhcc2;
    }

    public static zzhcd zzb() {
        zzhcd zzhcd2 = new zzhcd("Protocol message end-group tag did not match expected tag.");
        return zzhcd2;
    }

    public static zzhcd zzc() {
        zzhcd zzhcd2 = new zzhcd("Protocol message contained an invalid tag (zero).");
        return zzhcd2;
    }

    public static zzhcd zzd() {
        zzhcd zzhcd2 = new zzhcd("Protocol message had invalid UTF-8.");
        return zzhcd2;
    }

    public static zzhcd zze() {
        zzhcd zzhcd2 = new zzhcd("CodedInputStream encountered a malformed varint.");
        return zzhcd2;
    }

    public static zzhcd zzf() {
        zzhcd zzhcd2 = new zzhcd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return zzhcd2;
    }

    public static zzhcd zzg() {
        zzhcd zzhcd2 = new zzhcd("Failed to parse the message.");
        return zzhcd2;
    }

    public static zzhcd zzi() {
        zzhcd zzhcd2 = new zzhcd("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        return zzhcd2;
    }

    public static zzhcd zzj() {
        zzhcd zzhcd2 = new zzhcd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return zzhcd2;
    }

    public final zzhcd zzh(zzhde zzhde2) {
        this.zza = zzhde2;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }
}

