/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;

final class zzap {
    public final String zza;
    public final Object zzb;

    public zzap(String string2, Object object) {
        this.zza = string2;
        this.zzb = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzap;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object = (zzap)object;
        Object object2 = this.zza;
        String string2 = ((zzap)object).zza;
        bl2 = ((String)object2).equals(string2);
        if (bl2) {
            boolean bl4;
            Object object3;
            object2 = this.zzb;
            boolean bl5 = true;
            if (object2 == null && (object3 = ((zzap)object).zzb) == null) {
                bl3 = true;
            } else if (object2 != null && (bl4 = object2.equals(object = ((zzap)object).zzb))) {
                return bl5;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        Preconditions.checkNotNull(this.zzb);
        Integer n3 = this.zza.hashCode();
        Integer n4 = this.zzb.hashCode();
        Object[] objectArray = new Integer[]{n3, n4};
        return Arrays.hashCode(objectArray);
    }

    public final String toString() {
        String string2 = String.valueOf(this.zzb);
        StringBuilder stringBuilder = new StringBuilder("Key: ");
        String string3 = this.zza;
        return BW0.b(stringBuilder, string3, " value: ", string2);
    }
}

