/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzamy;
import java.util.Map;

final class zzamx {
    public static zzamy zza(zzamy object, String[] object2, Map map2) {
        int n3;
        int n4 = 1;
        if (object == null) {
            if (object2 == null) {
                return null;
            }
            int n7 = ((String[])object2).length;
            if (n7 == n4) {
                object = object2[0];
                return (zzamy)map2.get(object);
            }
            if (n7 > n4) {
                object = new zzamy();
                for (n3 = 0; n3 < n7; ++n3) {
                    Object object3 = object2[n3];
                    object3 = (zzamy)map2.get(object3);
                    ((zzamy)object).zzl((zzamy)object3);
                }
                return object;
            }
        } else {
            int n8;
            if (object2 != null && (n8 = ((String[])object2).length) == n4) {
                object2 = object2[0];
                object2 = (zzamy)map2.get(object2);
                ((zzamy)object).zzl((zzamy)object2);
                return object;
            }
            if (object2 != null && (n8 = ((String[])object2).length) > n4) {
                while (n3 < n8) {
                    Object object4 = object2[n3];
                    object4 = (zzamy)map2.get(object4);
                    ((zzamy)object).zzl((zzamy)object4);
                    ++n3;
                }
            }
        }
        return object;
    }
}

