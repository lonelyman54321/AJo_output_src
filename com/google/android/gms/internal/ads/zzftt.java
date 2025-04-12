/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfts;
import com.google.android.gms.internal.ads.zzftz;

final class zzftt
extends zzftz {
    private final String zzb;
    private final int zzc;

    public /* synthetic */ zzftt(String string2, boolean bl2, boolean bl3, zzftp zzftp2, zzftq zzftq2, int n3, zzfts zzfts2) {
        this.zzb = string2;
        this.zzc = n3;
    }

    public final boolean equals(Object object) {
        String string2;
        String string3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof zzftz;
        if (n3 != 0 && (n3 = (string3 = this.zzb).equals(string2 = ((zzftz)(object = (zzftz)object)).zzc())) != 0) {
            ((zzftz)object).zzd();
            ((zzftz)object).zze();
            ((zzftz)object).zza();
            ((zzftz)object).zzb();
            n3 = this.zzc;
            boolean bl3 = ((zzftz)object).zzf();
            if (n3 != 0) {
                if (bl3 == bl2) {
                    return bl2;
                }
            } else {
                throw null;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.zzb;
        int n3 = string2.hashCode();
        int n4 = 1000003;
        n3 ^= n4;
        int n7 = this.zzc;
        if (n7 != 0) {
            return ((n3 * n4 ^ 0x4D5) * n4 ^ 0x4D5) * 583896283 ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int n3 = this.zzc;
        int n4 = 1;
        String string2 = n3 != n4 ? "null" : "READ_AND_WRITE";
        String string3 = this.zzb;
        return uc0_0.a("FileComplianceOptions{fileOwner=", string3, ", hasDifferentDmaOwner=false, skipChecks=false, dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", string2, "}");
    }

    public final zzftp zza() {
        return null;
    }

    public final zzftq zzb() {
        return null;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return false;
    }

    public final boolean zze() {
        return false;
    }

    public final int zzf() {
        return this.zzc;
    }
}

