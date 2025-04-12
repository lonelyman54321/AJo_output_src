/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbhn;
import java.util.ArrayList;
import java.util.List;

public final class zzbhf
extends zzbhn {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze;
    private final List zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int n3;
        zzc = n3 = Color.rgb((int)12, (int)174, (int)206);
        int n4 = 204;
        zza = Color.rgb((int)n4, (int)n4, (int)n4);
        zzb = n3;
    }

    public zzbhf(String string2, List list, Integer n3, Integer n4, Integer n7, int n8, int n10, boolean n14) {
        int n15;
        Object object = new ArrayList();
        this.zze = object;
        object = new ArrayList();
        this.zzf = object;
        this.zzd = string2;
        string2 = null;
        for (n15 = 0; n15 < (n14 = list.size()); ++n15) {
            object = (zzbhi)list.get(n15);
            this.zze.add(object);
            List list2 = this.zzf;
            list2.add(object);
        }
        n15 = n3 != null ? n3 : zza;
        this.zzg = n15;
        n15 = n4 != null ? n4 : zzb;
        this.zzh = n15;
        n15 = n7 != null ? n7 : 12;
        this.zzi = n15;
        this.zzj = n8;
        this.zzk = n10;
    }

    public final int zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }
}

