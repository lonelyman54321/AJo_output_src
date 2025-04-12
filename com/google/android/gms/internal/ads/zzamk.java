/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfxm;

final class zzamk {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzamk(int n3, int n4, int n7, int n8, int n10) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = n8;
        this.zze = n10;
    }

    public static zzamk zza(String object) {
        Object object2;
        int n3;
        zzeq.zzd(((String)object).startsWith("Format:"));
        object = TextUtils.split((String)((String)object).substring(7), (String)",");
        int n4 = -1;
        int n7 = -1;
        int n8 = -1;
        int n10 = -1;
        int n14 = -1;
        for (int i3 = 0; i3 < (n3 = ((String[])object).length); ++i3) {
            int n15;
            int n16;
            int n17;
            int n18;
            block11: {
                object2 = zzfxm.zza(object[i3].trim());
                n3 = ((String)object2).hashCode();
                n18 = 3;
                n17 = 2;
                n16 = 1;
                switch (n3) {
                    default: {
                        break;
                    }
                    case 109780401: {
                        String string2 = "style";
                        n15 = (int)(((String)object2).equals(string2) ? 1 : 0);
                        if (n15 == 0) break;
                        n15 = 2;
                        break block11;
                    }
                    case 109757538: {
                        String string2 = "start";
                        n15 = (int)(((String)object2).equals(string2) ? 1 : 0);
                        if (n15 == 0) break;
                        n15 = 0;
                        object2 = null;
                        break block11;
                    }
                    case 3556653: {
                        String string2 = "text";
                        n15 = (int)(((String)object2).equals(string2) ? 1 : 0);
                        if (n15 == 0) break;
                        n15 = 3;
                        break block11;
                    }
                    case 100571: {
                        String string2 = "end";
                        n15 = (int)(((String)object2).equals(string2) ? 1 : 0);
                        if (n15 == 0) break;
                        n15 = 1;
                        break block11;
                    }
                }
                n15 = -1;
            }
            if (n15 != 0) {
                if (n15 != n16) {
                    if (n15 != n17) {
                        if (n15 != n18) continue;
                        n14 = i3;
                        continue;
                    }
                    n10 = i3;
                    continue;
                }
                n8 = i3;
                continue;
            }
            n7 = i3;
        }
        if (n7 != n4 && n8 != n4 && n14 != n4) {
            object2 = object;
            object = new zzamk(n7, n8, n10, n14, n3);
            return object;
        }
        return null;
    }
}

