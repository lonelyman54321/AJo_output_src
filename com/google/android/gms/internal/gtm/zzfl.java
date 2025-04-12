/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzfh;
import com.google.android.gms.internal.gtm.zzfi;
import com.google.android.gms.internal.gtm.zzfk;
import com.google.android.gms.internal.gtm.zzfr;

final class zzfl
extends zzfr {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfl(String string2, boolean bl2, int n3, zzfh zzfh2, zzfi zzfi2, int n4, zzfk zzfk2) {
        this.zzb = string2;
        this.zzc = n3;
        this.zzd = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        String string2;
        String string3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n3 = object instanceof zzfr;
        if (n3 == 0 || (n3 = (string3 = this.zzb).equals(string2 = ((zzfr)(object = (zzfr)object)).zzc())) == 0) return false;
        ((zzfr)object).zzd();
        n3 = this.zzc;
        int n4 = ((zzfr)object).zze();
        if (n3 == 0) throw null;
        if (n3 != n4) return false;
        ((zzfr)object).zza();
        ((zzfr)object).zzb();
        n3 = this.zzd;
        boolean bl3 = ((zzfr)object).zzf();
        if (n3 == 0) throw null;
        if (bl3 != bl2) return false;
        return bl2;
    }

    public final int hashCode() {
        String string2 = this.zzb;
        int n3 = string2.hashCode();
        int n4 = 1000003;
        n3 ^= n4;
        int n7 = this.zzc;
        if (n7 != 0) {
            n3 = (n3 * n4 ^ 0x4D5) * n4 ^ n7;
            n4 = this.zzd;
            if (n4 != 0) {
                return n3 * 583896283 ^ 1;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        int n3;
        int n4 = this.zzc;
        String string2 = "null";
        int n7 = 1;
        String string3 = n4 != n7 ? (n4 != (n3 = 2) ? (n4 != (n3 = 3) ? (n4 != (n3 = 4) ? string2 : "NO_CHECKS") : "SKIP_SECURITY_CHECK") : "SKIP_COMPLIANCE_CHECK") : "ALL_CHECKS";
        n3 = this.zzd;
        if (n3 == n7) {
            string2 = "READ_AND_WRITE";
        }
        String string4 = this.zzb;
        return h30_0.a(og_1.a("FileComplianceOptions{fileOwner=", string4, ", hasDifferentDmaOwner=false, fileChecks=", string3, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="), string2, "}");
    }

    public final zzfh zza() {
        return null;
    }

    public final zzfi zzb() {
        return null;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return false;
    }

    public final int zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }
}

