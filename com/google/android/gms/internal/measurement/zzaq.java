/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.internal.measurement.zzaj;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzax;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Iterator;
import java.util.List;

public interface zzaq {
    public static final zzaq zzc;
    public static final zzaq zzd;
    public static final zzaq zze;
    public static final zzaq zzf;
    public static final zzaq zzg;
    public static final zzaq zzh;
    public static final zzaq zzi;
    public static final zzaq zzj;

    static {
        zzaq zzaq2 = new zzax();
        zzc = zzaq2;
        zzaq2 = new zzao();
        zzd = zzaq2;
        zzaq2 = new zzaj("continue");
        zze = zzaq2;
        zzaq2 = new zzaj("break");
        zzf = zzaq2;
        zzaq2 = new zzaj("return");
        zzg = zzaq2;
        Boolean bl2 = Boolean.TRUE;
        zzaq2 = new zzag(bl2);
        zzh = zzaq2;
        bl2 = Boolean.FALSE;
        zzaq2 = new zzag(bl2);
        zzi = zzaq2;
        zzaq2 = new zzas("");
        zzj = zzaq2;
    }

    public zzaq zza(String var1, zzh var2, List var3);

    public zzaq zzc();

    public Boolean zzd();

    public Double zze();

    public String zzf();

    public Iterator zzh();
}

