/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaeu;

public final class zzaer {
    public final zzaeu zza;
    public final zzaeu zzb;

    public zzaer(zzaeu zzaeu2, zzaeu zzaeu3) {
        this.zza = zzaeu2;
        this.zzb = zzaeu3;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzaer.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzaer)object;
            object2 = this.zza;
            object3 = ((zzaer)object).zza;
            boolean bl4 = ((zzaeu)object2).equals(object3);
            if (bl4 && (bl3 = ((zzaeu)(object2 = this.zzb)).equals(object = ((zzaer)object).zzb))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza.hashCode() * 31;
        return this.zzb.hashCode() + n3;
    }

    public final String toString() {
        Object object = this.zza;
        Object object2 = this.zzb;
        String string2 = ((zzaeu)object).toString();
        boolean bl2 = ((zzaeu)object).equals(object2);
        if (bl2) {
            object = "";
        } else {
            object = this.zzb;
            object2 = ", ";
            object = ((zzaeu)object).toString();
            object = ((String)object2).concat((String)object);
        }
        return UX.c("[", string2, (String)object, "]");
    }
}

