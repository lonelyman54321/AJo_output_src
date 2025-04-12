/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzhy;
import java.util.Comparator;

final class zzhv
implements Comparator {
    public final /* synthetic */ int compare(Object object, Object object2) {
        int n3;
        object = (zzht)object;
        object2 = (zzht)object2;
        zzhy zzhy2 = (zzhy)((zzht)object).iterator();
        zzhy zzhy3 = (zzhy)((zzht)object2).iterator();
        while ((n3 = zzhy2.hasNext()) != 0 && (n3 = zzhy3.hasNext()) != 0) {
            n3 = zzht.zza(zzhy2.zza());
            int n4 = zzht.zza(zzhy3.zza());
            if ((n3 = Integer.compare(n3, n4)) == 0) continue;
            return n3;
        }
        int n7 = ((zzht)object).zza();
        int n8 = ((zzht)object2).zza();
        return Integer.compare(n7, n8);
    }
}

