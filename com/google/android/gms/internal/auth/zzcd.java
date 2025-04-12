/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.internal.auth.zzda;
import com.google.android.gms.internal.auth.zzdj;

final class zzcd
extends zzda {
    private final Context zza;
    private final zzdj zzb;

    public zzcd(Context object, zzdj zzdj2) {
        if (object != null) {
            this.zza = object;
            this.zzb = zzdj2;
            return;
        }
        super("Null context");
        throw object;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                Object object2;
                block5: {
                    Context context;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    boolean bl3 = object instanceof zzda;
                    if (!bl3 || !(bl3 = (object2 = this.zza).equals(context = ((zzda)(object = (zzda)object)).zza()))) break block4;
                    object2 = this.zzb;
                    if (object2 != null) break block5;
                    if ((object = ((zzda)object).zzb()) != null) break block4;
                    break block6;
                }
                boolean bl4 = object2.equals(object = ((zzda)object).zzb());
                if (!bl4) break block4;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Context context = this.zza;
        int n3 = context.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        zzdj zzdj2 = this.zzb;
        if (zzdj2 == null) {
            n4 = 0;
            zzdj2 = null;
        } else {
            n4 = zzdj2.hashCode();
        }
        return n3 ^ n4;
    }

    public final String toString() {
        String string2 = this.zza.toString();
        String string3 = String.valueOf(this.zzb);
        return uc0_0.a("FlagsContext{context=", string2, ", hermeticFileOverrides=", string3, "}");
    }

    public final Context zza() {
        return this.zza;
    }

    public final zzdj zzb() {
        return this.zzb;
    }
}

