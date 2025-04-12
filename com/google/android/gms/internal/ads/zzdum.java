/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzgbc;

public final class zzdum {
    public static final zzgbc zza;
    public static final zzgbc zzb;
    private final String zzc;
    private final zzdul zzd;
    private final zzdul zze;

    static {
        Object object = zzdul.zza;
        zzdul zzdul2 = zzdul.zzn;
        zzdum zzdum2 = new zzdum("tqgt", (zzdul)((Object)object), zzdul2);
        zzdul zzdul3 = zzdul.zzb;
        String string2 = "l.dl";
        zzdum zzdum3 = new zzdum(string2, (zzdul)((Object)object), zzdul3);
        Object object2 = zzdul.zzc;
        Object object3 = "l.rcc";
        zzdum zzdum4 = new zzdum((String)object3, zzdul3, (zzdul)((Object)object2));
        zzdul zzdul4 = zzdul.zzd;
        Object object4 = "l.cs";
        Object object5 = new zzdum((String)object4, (zzdul)((Object)object2), zzdul4);
        Object object6 = zzdul.zze;
        Object object7 = "l.cts";
        Object object8 = new zzdum((String)object7, zzdul4, (zzdul)((Object)object6));
        zzdul zzdul5 = zzdul4;
        zzdul4 = zzdul.zzf;
        zzdul zzdul6 = object2;
        object2 = zzdul.zzg;
        String string3 = object3;
        object3 = "l.gs";
        Object object9 = new zzdum((String)object3, zzdul4, (zzdul)((Object)object2));
        Object object10 = object7;
        Object object11 = object6;
        object6 = zzdul.zzh;
        String string4 = object3;
        object3 = "l.jse";
        object7 = new zzdum((String)object3, (zzdul)((Object)object2), (zzdul)((Object)object6));
        String string5 = object4;
        String string6 = object3;
        object3 = zzdul.zzi;
        zzdul zzdul7 = object2;
        object4 = new zzdum("l.gs-sdkcore", (zzdul)((Object)object6), (zzdul)((Object)object3));
        object2 = new zzdum("l.gs-pp", (zzdul)((Object)object3), zzdul2);
        object3 = object10;
        object10 = zzdul4;
        zzdul4 = object11;
        object6 = object4;
        object11 = object3;
        object3 = string5;
        object4 = object2;
        zza = zzgbc.zzs(zzdum2, zzdum3, zzdum4, object5, object8, object9, object7, object6, object2);
        zzdum2 = new zzdum("l.al", (zzdul)((Object)object), zzdul2);
        zzdum3 = new zzdum(string2, (zzdul)((Object)object), zzdul3);
        object5 = zzdul6;
        object8 = string3;
        zzdum4 = new zzdum(string3, zzdul3, zzdul6);
        object9 = zzdul5;
        object8 = new zzdum(string5, zzdul6, zzdul5);
        object7 = object11;
        object5 = new zzdum((String)object11, zzdul5, zzdul4);
        object7 = object10;
        object4 = string4;
        object6 = zzdul7;
        object9 = new zzdum(string4, (zzdul)((Object)object10), zzdul7);
        object4 = zzdul.zzj;
        object = string6;
        object7 = new zzdum(string6, zzdul7, (zzdul)((Object)object4));
        object = zzdul.zzk;
        object6 = new zzdum("l.gad-js", (zzdul)((Object)object4), (zzdul)((Object)object));
        zzdul2 = zzdul.zzl;
        object4 = new zzdum("l.http", (zzdul)((Object)object), zzdul2);
        zzdul3 = zzdul.zzm;
        object = new zzdum("l.nml-js", zzdul2, zzdul3);
        zzb = zzgbc.zzt(zzdum2, zzdum3, zzdum4, object8, object5, object9, object7, object6, object4, object);
    }

    public zzdum(String string2, zzdul zzdul2, zzdul zzdul3) {
        this.zzc = string2;
        this.zzd = zzdul2;
        this.zze = zzdul3;
    }

    public final zzdul zza() {
        return this.zzd;
    }

    public final zzdul zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}

