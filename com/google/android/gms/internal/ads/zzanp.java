/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzalq;
import com.google.android.gms.internal.ads.zzane;
import com.google.android.gms.internal.ads.zzano;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzei;
import com.google.android.gms.internal.ads.zzeq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class zzanp
implements zzalq {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzanp(List object) {
        int n3;
        Object object2 = new ArrayList(object);
        object2 = Collections.unmodifiableList(object2);
        this.zza = object2;
        int n4 = object.size();
        object2 = new long[n4 + n4];
        this.zzb = (long[])object2;
        object2 = null;
        for (n4 = 0; n4 < (n3 = object.size()); ++n4) {
            zzane zzane2 = (zzane)object.get(n4);
            long[] lArray = this.zzb;
            long l2 = zzane2.zzb;
            int n7 = n4 + n4;
            lArray[n7] = l2;
            lArray[++n7] = l2 = zzane2.zzc;
        }
        object = this.zzb;
        n4 = ((Object)object).length;
        object = Arrays.copyOf((long[])object, n4);
        this.zzc = (long[])object;
        Arrays.sort((long[])object);
    }

    public final int zza() {
        return this.zzc.length;
    }

    public final long zzb(int n3) {
        long[] lArray;
        int n4;
        boolean bl2 = false;
        if (n3 >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            lArray = null;
        }
        zzeq.zzd(n4 != 0);
        lArray = this.zzc;
        n4 = lArray.length;
        if (n3 < n4) {
            bl2 = true;
        }
        zzeq.zzd(bl2);
        return this.zzc[n3];
    }

    public final List zzc(long l2) {
        int n3;
        Object object;
        int n4;
        int n7;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        int n8 = 0;
        for (n7 = 0; n7 < (n4 = (object = this.zza).size()); ++n7) {
            Object object2;
            long l3;
            object = this.zzb;
            int n10 = n7 + n7;
            reference var10_9 = object[n10];
            reference cfr_temp_0 = var10_9 - l2;
            Object object3 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
            if (object3 > 0 || (n4 = (int)((l3 = l2 - (object2 = object[++n10])) == 0L ? 0 : (l3 < 0L ? -1 : 1))) >= 0) continue;
            object = (zzane)this.zza.get(n7);
            zzei zzei2 = ((zzane)object).zza;
            float f5 = zzei2.zzg;
            float f6 = -3.4028235E38f;
            float f7 = f5 - f6;
            Object object4 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object4 == false) {
                arrayList2.add(object);
                continue;
            }
            arrayList.add(zzei2);
        }
        Object object5 = new zzano();
        Collections.sort(arrayList2, object5);
        while (n8 < (n3 = arrayList2.size())) {
            object5 = ((zzane)arrayList2.get((int)n8)).zza.zzb();
            int n14 = -1 - n8;
            float f8 = n14;
            n7 = 1;
            ((zzeg)object5).zze(f8, n7);
            object5 = ((zzeg)object5).zzp();
            arrayList.add(object5);
            ++n8;
        }
        return arrayList;
    }
}

