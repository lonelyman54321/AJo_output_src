/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzaf;
import com.google.android.gms.internal.fido.zzah;
import com.google.android.gms.internal.fido.zzai;
import java.util.Arrays;

public final class zzaj {
    private final String zza;
    private final zzah zzb;
    private zzah zzc;

    public /* synthetic */ zzaj(String string2, zzai object) {
        this.zzb = object = new zzah(null);
        this.zzc = object;
        string2.getClass();
        this.zza = string2;
    }

    public final String toString() {
        int n3 = 1;
        StringBuilder stringBuilder = new StringBuilder(32);
        Object object = this.zza;
        stringBuilder.append((String)object);
        char c2 = '{';
        stringBuilder.append(c2);
        object = this.zzb.zzc;
        Object object2 = "";
        while (object != null) {
            char c3;
            Object object3 = ((zzah)object).zzb;
            boolean cfr_ignored_0 = object instanceof zzaf;
            stringBuilder.append((String)object2);
            object2 = ((zzah)object).zza;
            if (object2 != null) {
                stringBuilder.append((String)object2);
                c3 = '=';
                stringBuilder.append(c3);
            }
            if (object3 != null && (c3 = (char)(((Class)(object2 = object3.getClass())).isArray() ? 1 : 0)) != '\u0000') {
                object2 = new Object[n3];
                object2[0] = object3;
                object2 = Arrays.deepToString((Object[])object2);
                int n4 = ((String)object2).length() + -1;
                stringBuilder.append((CharSequence)object2, n3, n4);
            } else {
                stringBuilder.append(object3);
            }
            object = ((zzah)object).zzc;
            object2 = ", ";
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final zzaj zza(String string2, int n3) {
        string2 = String.valueOf(n3);
        zzaf zzaf2 = new zzaf(null);
        this.zzc.zzc = zzaf2;
        this.zzc = zzaf2;
        zzaf2.zzb = string2;
        zzaf2.zza = "errorCode";
        return this;
    }

    public final zzaj zzb(String string2, Object object) {
        zzah zzah2;
        this.zzc.zzc = zzah2 = new zzah(null);
        this.zzc = zzah2;
        zzah2.zzb = object;
        zzah2.zza = string2;
        return this;
    }
}

