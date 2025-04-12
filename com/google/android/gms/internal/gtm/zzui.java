/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzwe;

public class zzui {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzui(String string2, Class clazz, boolean bl2) {
        this(string2, clazz, bl2, true);
    }

    private zzui(String string2, Class clazz, boolean bl2, boolean bl3) {
        int n3;
        zzwe.zzb(string2);
        this.zza = string2;
        this.zzb = clazz;
        this.zzc = bl2;
        System.identityHashCode(this);
        string2 = null;
        for (int i3 = 0; i3 < (n3 = 5); ++i3) {
        }
    }

    public static zzui zza(String string2, Class clazz) {
        zzui zzui2 = new zzui(string2, clazz, false, false);
        return zzui2;
    }

    public final String toString() {
        Object object = this.zzb;
        CharSequence charSequence = this.getClass().getName();
        object = ((Class)object).getName();
        charSequence = nn_2.a(charSequence, "/");
        String string2 = this.zza;
        return ko_0.a((StringBuilder)charSequence, string2, "[", (String)object, "]");
    }

    public final boolean zzb() {
        return this.zzc;
    }
}

