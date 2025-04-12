/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Iterator;
import java.util.List;

public final class zzaj
implements zzaq {
    private final zzaq zza;
    private final String zzb;

    public zzaj() {
        zzaq zzaq2;
        this.zza = zzaq2 = zzaq.zzc;
        this.zzb = "return";
    }

    public zzaj(String string2) {
        zzaq zzaq2;
        this.zza = zzaq2 = zzaq.zzc;
        this.zzb = string2;
    }

    public zzaj(String string2, zzaq zzaq2) {
        this.zza = zzaq2;
        this.zzb = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof zzaj;
        if (!bl4) {
            return false;
        }
        Object object2 = this.zzb;
        object = (zzaj)object;
        String string2 = ((zzaj)object).zzb;
        bl4 = ((String)object2).equals(string2);
        if (bl4 && (bl2 = (object2 = this.zza).equals(object = ((zzaj)object).zza))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzb.hashCode() * 31;
        return this.zza.hashCode() + n3;
    }

    public final zzaq zza() {
        return this.zza;
    }

    public final zzaq zza(String object, zzh zzh2, List list) {
        object = new IllegalStateException("Control does not have functions");
        throw object;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzaq zzc() {
        String string2 = this.zzb;
        zzaq zzaq2 = this.zza.zzc();
        zzaj zzaj2 = new zzaj(string2, zzaq2);
        return zzaj2;
    }

    public final Boolean zzd() {
        IllegalStateException illegalStateException = new IllegalStateException("Control is not a boolean");
        throw illegalStateException;
    }

    public final Double zze() {
        IllegalStateException illegalStateException = new IllegalStateException("Control is not a double");
        throw illegalStateException;
    }

    public final String zzf() {
        IllegalStateException illegalStateException = new IllegalStateException("Control is not a String");
        throw illegalStateException;
    }

    public final Iterator zzh() {
        return null;
    }
}

