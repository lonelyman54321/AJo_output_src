/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmn;
import java.util.regex.Pattern;

public final class zzeeh
implements zzfkw {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfmc zzc;
    private final zzfmn zzd;

    public zzeeh(String string2, zzfmn zzfmn2, zzfmc zzfmc2) {
        this.zzb = string2;
        this.zzd = zzfmn2;
        this.zzc = zzfmc2;
    }
}

