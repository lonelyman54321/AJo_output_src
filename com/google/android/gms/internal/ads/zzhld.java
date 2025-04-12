/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkq;
import com.google.android.gms.internal.ads.zzhky;
import com.google.android.gms.internal.ads.zzhlb;
import com.google.android.gms.internal.ads.zzhlc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class zzhld
implements zzhkp {
    private static final zzhkp zza = zzhkq.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    public /* synthetic */ zzhld(List list, List list2, zzhlb zzhlb2) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzhlc zza(int n3, int n4) {
        zzhlc zzhlc2 = new zzhlc(n3, n4, null);
        return zzhlc2;
    }

    public final Set zzc() {
        Object object;
        int n3;
        Collection<Object> collection = this.zzb;
        int n4 = collection.size();
        int n7 = this.zzc.size();
        ArrayList<Collection> arrayList = new ArrayList<Collection>(n7);
        List list = this.zzc;
        n7 = list.size();
        int n8 = 0;
        Iterator iterator = null;
        for (n3 = 0; n3 < n7; ++n3) {
            object = (Collection)((zzhky)this.zzc.get(n3)).zzb();
            int n10 = object.size();
            n4 += n10;
            arrayList.add((Collection)object);
        }
        collection = zzhkm.zza(n4);
        list = this.zzb;
        n7 = list.size();
        iterator = null;
        for (n3 = 0; n3 < n7; ++n3) {
            object = ((zzhky)this.zzb.get(n3)).zzb();
            object.getClass();
            collection.add(object);
        }
        n7 = arrayList.size();
        while (n8 < n7) {
            boolean bl2;
            iterator = ((Collection)arrayList.get(n8)).iterator();
            while (bl2 = iterator.hasNext()) {
                object = iterator.next();
                object.getClass();
                collection.add(object);
            }
            ++n8;
        }
        return Collections.unmodifiableSet(collection);
    }
}

