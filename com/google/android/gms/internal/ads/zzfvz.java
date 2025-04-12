/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfvy;
import com.google.android.gms.internal.ads.zzfwr;

final class zzfvz
extends zzfwr {
    private final int zza;
    private final String zzb;

    public /* synthetic */ zzfvz(int n3, String string2, zzfvy zzfvy2) {
        this.zza = n3;
        this.zzb = string2;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                String string2;
                block5: {
                    int n3;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    int n4 = object instanceof zzfwr;
                    if (n4 == 0 || (n4 = this.zza) != (n3 = ((zzfwr)(object = (zzfwr)object)).zza())) break block4;
                    string2 = this.zzb;
                    if (string2 != null) break block5;
                    if ((object = ((zzfwr)object).zzb()) != null) break block4;
                    break block6;
                }
                boolean bl3 = string2.equals(object = ((zzfwr)object).zzb());
                if (!bl3) break block4;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.zzb;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        int n4 = this.zza;
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        return n3 ^ n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OverlayDisplayState{statusCode=");
        int n3 = this.zza;
        stringBuilder.append(n3);
        stringBuilder.append(", sessionToken=");
        String string2 = this.zzb;
        return h30_0.a(stringBuilder, string2, "}");
    }

    public final int zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}

