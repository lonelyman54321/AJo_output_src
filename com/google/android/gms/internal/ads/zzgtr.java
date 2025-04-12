/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgtk;
import com.google.android.gms.internal.ads.zzgtq;
import java.util.List;
import java.util.Objects;

public final class zzgtr {
    private final zzgtk zza;
    private final List zzb;
    private final Integer zzc;

    public /* synthetic */ zzgtr(zzgtk zzgtk2, List list, Integer n3, zzgtq zzgtq2) {
        this.zza = zzgtk2;
        this.zzb = list;
        this.zzc = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzgtr;
        if (!bl3) {
            return false;
        }
        object = (zzgtr)object;
        Object object2 = this.zza;
        Object object3 = ((zzgtr)object).zza;
        bl3 = ((zzgtk)object2).equals(object3);
        return bl3 && (bl3 = (object2 = this.zzb).equals(object3 = ((zzgtr)object).zzb)) && (bl2 = Objects.equals(object2 = this.zzc, object = ((zzgtr)object).zzc));
    }

    public final int hashCode() {
        zzgtk zzgtk2 = this.zza;
        List list = this.zzb;
        Object[] objectArray = new Object[]{zzgtk2, list};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        zzgtk zzgtk2 = this.zza;
        List list = this.zzb;
        Integer n3 = this.zzc;
        Object[] objectArray = new Object[]{zzgtk2, list, n3};
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", objectArray);
    }
}

