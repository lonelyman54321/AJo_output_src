/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.List;

public final class zzm {
    private Bundle zza;
    private List zzb;
    private boolean zzc;
    private int zzd;
    private final Bundle zze;
    private final Bundle zzf;
    private final List zzg;
    private int zzh;
    private String zzi;
    private final List zzj;
    private int zzk;
    private final int zzl;
    private long zzm;

    public zzm() {
        Object object;
        int n3;
        Object object2;
        this.zza = object2 = new Bundle();
        this.zzb = object2;
        this.zzc = false;
        this.zzd = n3 = -1;
        this.zze = object = new Bundle();
        this.zzf = object = new Bundle();
        super();
        this.zzg = object;
        this.zzh = n3;
        this.zzi = null;
        super();
        this.zzj = object2;
        this.zzk = 60000;
        this.zzl = n3 = RequestConfiguration$PublisherPrivacyPersonalizationState.DEFAULT.getValue();
        this.zzm = 0L;
    }

    public final zzl zza() {
        Bundle bundle = this.zze;
        Bundle bundle2 = this.zza;
        Bundle bundle3 = this.zzf;
        List list = this.zzb;
        boolean bl2 = this.zzc;
        int n3 = this.zzd;
        int n4 = this.zzh;
        String string2 = this.zzi;
        List list2 = this.zzj;
        int n7 = this.zzl;
        List list3 = this.zzg;
        int n8 = this.zzk;
        long l2 = this.zzm;
        zzl zzl2 = new zzl(8, -1, bundle2, -1, list, bl2, n3, false, null, null, null, null, bundle, bundle3, list3, null, null, false, null, n4, string2, list2, n8, null, n7, l2);
        return zzl2;
    }

    public final zzm zzb(Bundle bundle) {
        this.zza = bundle;
        return this;
    }

    public final zzm zzc(int n3) {
        this.zzk = n3;
        return this;
    }

    public final zzm zzd(boolean bl2) {
        this.zzc = bl2;
        return this;
    }

    public final zzm zze(List list) {
        this.zzb = list;
        return this;
    }

    public final zzm zzf(String string2) {
        this.zzi = string2;
        return this;
    }

    public final zzm zzg(long l2) {
        this.zzm = l2;
        return this;
    }

    public final zzm zzh(int n3) {
        this.zzd = n3;
        return this;
    }

    public final zzm zzi(int n3) {
        this.zzh = n3;
        return this;
    }
}

