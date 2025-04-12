/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdv;
import com.google.android.gms.internal.auth.zzee;
import java.util.Comparator;

final class zzdw
implements Comparator {
    public final /* synthetic */ int compare(Object object, Object object2) {
        int n3;
        block1: {
            object = (zzee)object;
            object2 = (zzee)object2;
            zzdv zzdv2 = new zzdv((zzee)object);
            zzdv zzdv3 = new zzdv((zzee)object2);
            while ((n3 = zzdv2.hasNext()) != 0 && (n3 = zzdv3.hasNext()) != 0) {
                int n4;
                Integer n7;
                Integer n8 = zzdv2.zza() & 0xFF;
                n3 = n8.compareTo(n7 = Integer.valueOf(n4 = zzdv3.zza() & 0xFF));
                if (n3 == 0) continue;
                break block1;
            }
            int n10 = ((zzee)object).zzd();
            object = n10;
            int n14 = ((zzee)object2).zzd();
            object2 = n14;
            n3 = ((Integer)object).compareTo((Integer)object2);
        }
        return n3;
    }
}

