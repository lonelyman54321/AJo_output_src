/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzre;
import com.google.android.gms.internal.gtm.zzrg;
import com.google.android.gms.internal.gtm.zzri;
import com.google.android.gms.internal.gtm.zzrl;
import com.google.android.gms.tagmanager.zzfp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzrh {
    private final List zza;
    private final Map zzb;
    private String zzc;
    private int zzd;

    private zzrh() {
        Cloneable cloneable;
        this.zza = cloneable = new Cloneable();
        this.zzb = cloneable;
        this.zzc = "";
        this.zzd = 0;
    }

    public /* synthetic */ zzrh(zzrl cloneable) {
        this.zza = cloneable = new Cloneable();
        this.zzb = cloneable;
        this.zzc = "";
        this.zzd = 0;
    }

    public final zzrg zza() {
        List list = this.zza;
        Map map2 = this.zzb;
        String string2 = this.zzc;
        int n3 = this.zzd;
        zzrg zzrg2 = new zzrg(list, map2, string2, n3, null);
        return zzrg2;
    }

    public final zzrh zzb(zzre zzre2) {
        Object object = zzre2.zzc();
        ArrayList<zzre> arrayList = com.google.android.gms.internal.gtm.zzb.zzbA.toString();
        if ((arrayList = (List)this.zzb.get(object = zzfp.zzm(zzfp.zzk((zzap)object.get(arrayList))))) == null) {
            arrayList = new ArrayList<zzre>();
            Map map2 = this.zzb;
            map2.put(object, arrayList);
        }
        arrayList.add(zzre2);
        return this;
    }

    public final zzrh zzc(zzri zzri2) {
        this.zza.add(zzri2);
        return this;
    }

    public final zzrh zzd(int n3) {
        this.zzd = n3;
        return this;
    }

    public final zzrh zze(String string2) {
        this.zzc = string2;
        return this;
    }
}

