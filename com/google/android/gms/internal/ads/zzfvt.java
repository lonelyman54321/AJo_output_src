/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfvs;
import com.google.android.gms.internal.ads.zzfwe;

final class zzfvt
extends zzfwe {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfvt(String string2, String string3, zzfvs zzfvs2) {
        this.zza = string2;
        this.zzb = string3;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                String string2;
                block5: {
                    String string3;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    boolean bl3 = object instanceof zzfwe;
                    if (!bl3) break block4;
                    object = (zzfwe)object;
                    string2 = this.zza;
                    if (!(string2 == null ? (string2 = ((zzfwe)object).zzb()) == null : (bl3 = string2.equals(string3 = ((zzfwe)object).zzb())))) break block4;
                    string2 = this.zzb;
                    if (string2 != null) break block5;
                    if ((object = ((zzfwe)object).zza()) != null) break block4;
                    break block6;
                }
                boolean bl4 = string2.equals(object = ((zzfwe)object).zza());
                if (!bl4) break block4;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.zza;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        String string3 = this.zzb;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        int n7 = 1000003;
        return (n3 ^ n7) * n7 ^ n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        String string2 = this.zza;
        stringBuilder.append(string2);
        stringBuilder.append(", appId=");
        string2 = this.zzb;
        return h30_0.a(stringBuilder, string2, "}");
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}

