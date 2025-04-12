/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzary;
import com.google.android.gms.internal.ads.zzasa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzarx {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public zzarx(String string2, zzaqn iterator) {
        void var12_9;
        zzaqw zzaqw2;
        Object object;
        String string3 = ((zzaqn)((Object)iterator)).zzb;
        long l2 = ((zzaqn)((Object)iterator)).zzc;
        long l3 = ((zzaqn)((Object)iterator)).zzd;
        long l4 = ((zzaqn)((Object)iterator)).zze;
        long l7 = ((zzaqn)((Object)iterator)).zzf;
        List list = ((zzaqn)((Object)iterator)).zzh;
        if (list == null) {
            iterator = ((zzaqn)((Object)iterator)).zzg;
            int n3 = iterator.size();
            ArrayList<zzaqw> arrayList = new ArrayList<zzaqw>(n3);
            iterator = iterator.entrySet().iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object = iterator.next();
                String string4 = (String)object.getKey();
                object = (String)object.getValue();
                zzaqw2 = new zzaqw(string4, (String)object);
                arrayList.add(zzaqw2);
            }
        }
        zzaqw2 = var12_9;
        zzarx zzarx2 = this;
        object = string2;
        this(string2, string3, l2, l3, l4, l7, (List)((Object)zzaqw2));
    }

    private zzarx(String string2, String string3, long l2, long l3, long l4, long l7, List list) {
        this.zzb = string2;
        string2 = "";
        boolean bl2 = string2.equals(string3);
        boolean bl3 = true;
        if (bl3 == bl2) {
            string3 = null;
        }
        this.zzc = string3;
        this.zzd = l2;
        this.zze = l3;
        this.zzf = l4;
        this.zzg = l7;
        this.zzh = list;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static zzarx zza(zzary zzary2) {
        int n3;
        int n4 = zzasa.zze(zzary2);
        if (n4 != (n3 = 538247942)) {
            IOException iOException = new IOException();
            throw iOException;
        }
        String string2 = zzasa.zzh(zzary2);
        String string3 = zzasa.zzh(zzary2);
        long l2 = zzasa.zzf(zzary2);
        long l3 = zzasa.zzf(zzary2);
        long l4 = zzasa.zzf(zzary2);
        long l7 = zzasa.zzf(zzary2);
        n4 = zzasa.zze(zzary2);
        if (n4 < 0) {
            String string4 = hj0_0.a(n4, "readHeaderList size=");
            IOException iOException = new IOException(string4);
            throw iOException;
        }
        ArrayList<zzaqw> arrayList = n4 == 0 ? Collections.emptyList() : new ArrayList<zzaqw>();
        ArrayList<zzaqw> arrayList2 = arrayList;
        n3 = 0;
        arrayList = null;
        while (true) {
            Object object;
            if (n3 >= n4) {
                zzarx zzarx2;
                object = zzarx2;
                return new zzarx(string2, string3, l2, l3, l4, l7, arrayList2);
            }
            object = zzasa.zzh(zzary2).intern();
            String string5 = zzasa.zzh(zzary2).intern();
            zzaqw zzaqw2 = new zzaqw((String)object, string5);
            arrayList2.add(zzaqw2);
            ++n3;
        }
    }
}

