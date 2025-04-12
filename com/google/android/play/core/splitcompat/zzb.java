/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitcompat;

import com.google.android.play.core.splitcompat.zzt;
import java.io.File;

final class zzb
extends zzt {
    private final File zza;
    private final String zzb;

    public zzb(File serializable, String string2) {
        if (serializable != null) {
            this.zza = serializable;
            if (string2 != null) {
                this.zzb = string2;
                return;
            }
            super("Null splitId");
            throw serializable;
        }
        super("Null splitFile");
        throw serializable;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        File file;
        Object object2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof zzt;
        if (bl4 && (bl4 = ((File)(object2 = this.zza)).equals(file = ((zzt)(object = (zzt)object)).zza())) && (bl2 = ((String)(object2 = this.zzb)).equals(object = ((zzt)object).zzb()))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zza.hashCode();
        int n4 = 1000003;
        int n7 = this.zzb.hashCode();
        return (n3 ^= n4) * n4 ^ n7;
    }

    public final String toString() {
        String string2 = ((Object)this.zza).toString();
        String string3 = this.zzb;
        return uc0_0.a("SplitFileInfo{splitFile=", string2, ", splitId=", string3, "}");
    }

    public final File zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}

