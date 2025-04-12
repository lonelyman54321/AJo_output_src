/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzcg;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcp;
import com.google.android.gms.internal.measurement.zzcq;

final class zzce
extends zzco {
    private final String zzc;
    private final boolean zzd;
    private final zzcq zze;
    private final zzcc zzf;
    private final zzcb zzg;
    private final zzcp zzh;

    private zzce(String string2, boolean bl2, zzcq zzcq2, zzcc zzcc2, zzcb zzcb2, zzcp zzcp2) {
        this.zzc = string2;
        this.zzd = bl2;
        this.zze = zzcq2;
        this.zzf = null;
        this.zzg = null;
        this.zzh = zzcp2;
    }

    public /* synthetic */ zzce(String string2, boolean bl2, zzcq zzcq2, zzcc zzcc2, zzcb zzcb2, zzcp zzcp2, zzcg zzcg2) {
        this(string2, false, zzcq2, null, null, zzcp2);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        Object object3;
        boolean bl4 = true;
        if (object == this) {
            return bl4;
        }
        boolean bl5 = object instanceof zzco;
        if (bl5 && (bl5 = ((String)(object3 = this.zzc)).equals(object2 = ((zzco)(object = (zzco)object)).zze())) && (bl5 = this.zzd) == (bl3 = ((zzco)object).zzf()) && (bl5 = (object3 = this.zze).equals(object2 = ((zzco)object).zzc())) && ((object3 = this.zzf) == null ? (object3 = ((zzco)object).zza()) == null : (bl5 = object3.equals(object2 = ((zzco)object).zza()))) && ((object3 = this.zzg) == null ? (object3 = ((zzco)object).zzb()) == null : (bl5 = object3.equals(object2 = ((zzco)object).zzb()))) && (bl2 = (object3 = this.zzh).equals(object = ((zzco)object).zzd()))) {
            return bl4;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.zzc;
        int n3 = string2.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.zzd;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 ^ n7) * n4;
        n7 = ((Object)((Object)this.zze)).hashCode();
        n3 = (n3 ^ n7) * n4;
        Object object = this.zzf;
        int n8 = 0;
        if (object == null) {
            n7 = 0;
            object = null;
        } else {
            n7 = object.hashCode();
        }
        n3 = (n3 ^ n7) * n4;
        object = this.zzg;
        if (object != null) {
            n8 = object.hashCode();
        }
        n3 = (n3 ^ n8) * n4;
        n4 = ((Object)((Object)this.zzh)).hashCode();
        return n3 ^ n4;
    }

    public final String toString() {
        String string2 = this.zzc;
        boolean bl2 = this.zzd;
        String string3 = String.valueOf((Object)this.zze);
        String string4 = String.valueOf(this.zzf);
        String string5 = String.valueOf(this.zzg);
        String string6 = String.valueOf((Object)this.zzh);
        StringBuilder stringBuilder = new StringBuilder("FileComplianceOptions{fileOwner=");
        stringBuilder.append(string2);
        stringBuilder.append(", hasDifferentDmaOwner=");
        stringBuilder.append(bl2);
        stringBuilder.append(", fileChecks=");
        X50.a(stringBuilder, string3, ", dataForwardingNotAllowedResolver=", string4, ", multipleProductIdGroupsResolver=");
        return ko_0.a(stringBuilder, string5, ", filePurpose=", string6, "}");
    }

    public final zzcc zza() {
        return this.zzf;
    }

    public final zzcb zzb() {
        return this.zzg;
    }

    public final zzcq zzc() {
        return this.zze;
    }

    public final zzcp zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzd;
    }
}

