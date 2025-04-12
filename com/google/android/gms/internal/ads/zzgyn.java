/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgod;
import com.google.android.gms.internal.ads.zzgyh;
import com.google.android.gms.internal.ads.zzgyj;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzgym;
import com.google.android.gms.internal.ads.zzgyo;
import com.google.android.gms.internal.ads.zzgyp;
import com.google.android.gms.internal.ads.zzgyq;
import com.google.android.gms.internal.ads.zzgyr;
import com.google.android.gms.internal.ads.zzgys;
import com.google.android.gms.internal.ads.zzgyt;
import com.google.android.gms.internal.ads.zzgyu;
import com.google.android.gms.internal.ads.zzgyv;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

public final class zzgyn {
    public static final zzgyn zza;
    public static final zzgyn zzb;
    public static final zzgyn zzc;
    public static final zzgyn zzd;
    public static final zzgyn zze;
    public static final zzgyn zzf;
    public static final zzgyn zzg;
    private final zzgym zzh;

    static {
        zzgyn zzgyn2;
        zzgyv zzgyv2 = new zzgyo();
        zza = zzgyn2 = new zzgyn(zzgyv2);
        zzgyv2 = new zzgys();
        zzb = zzgyn2 = new zzgyn(zzgyv2);
        zzgyv2 = new zzgyu();
        zzc = zzgyn2 = new zzgyn(zzgyv2);
        zzgyv2 = new zzgyt();
        zzd = zzgyn2 = new zzgyn(zzgyv2);
        zzgyv2 = new zzgyp();
        zze = zzgyn2 = new zzgyn(zzgyv2);
        zzgyv2 = new zzgyr();
        zzf = zzgyn2 = new zzgyn(zzgyv2);
        zzgyv2 = new zzgyq();
        zzg = zzgyn2 = new zzgyn(zzgyv2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public zzgyn(zzgyv zzgyv2) {
        String string2;
        Object object;
        boolean bl2 = zzgod.zzb();
        object = !bl2 ? ((bl2 = ((String)(object = "The Android Project")).equals(string2 = System.getProperty("java.vendor"))) ? new zzgyh(zzgyv2, null) : new zzgyj(zzgyv2, null)) : new zzgyl(zzgyv2, null);
        this.zzh = object;
    }

    public static List zzb(String ... stringArray) {
        int n3;
        ArrayList<Provider> arrayList = new ArrayList<Provider>();
        for (int i3 = 0; i3 < (n3 = stringArray.length); ++i3) {
            Provider provider = Security.getProvider(stringArray[i3]);
            if (provider == null) continue;
            arrayList.add(provider);
        }
        return arrayList;
    }

    public final Object zza(String string2) {
        return this.zzh.zza(string2);
    }
}

