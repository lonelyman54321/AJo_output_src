/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.testing.zzb;
import com.google.android.play.core.splitinstall.testing.zzv;
import java.util.Map;

final class zzc
extends zzv {
    private final Integer zzb;
    private final Map zzc;

    public /* synthetic */ zzc(Integer n3, Map map2, zzb zzb2) {
        this.zzb = n3;
        this.zzc = map2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof zzv;
        if (bl3) {
            boolean bl4;
            Integer n3;
            object = (zzv)object;
            Object object2 = this.zzb;
            if ((object2 == null ? (object2 = ((zzv)object).zza()) == null : (bl3 = ((Integer)object2).equals(n3 = ((zzv)object).zza()))) && (bl4 = (object2 = this.zzc).equals(object = ((zzv)object).zzb()))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        Integer n4 = this.zzb;
        if (n4 == null) {
            n3 = 0;
            n4 = null;
        } else {
            n3 = n4.hashCode();
        }
        Map map2 = this.zzc;
        int n7 = 1000003;
        n3 = (n3 ^ n7) * n7;
        int n8 = ((Object)map2).hashCode();
        return n3 ^ n8;
    }

    public final String toString() {
        Integer n3 = this.zzb;
        String string2 = String.valueOf(this.zzc);
        StringBuilder stringBuilder = new StringBuilder("LocalTestingConfig{defaultSplitInstallErrorCode=");
        stringBuilder.append(n3);
        stringBuilder.append(", splitInstallErrorCodeByModule=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Integer zza() {
        return this.zzb;
    }

    public final Map zzb() {
        return this.zzc;
    }
}

