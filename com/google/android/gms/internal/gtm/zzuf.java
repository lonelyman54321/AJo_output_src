/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzuc;
import com.google.android.gms.internal.gtm.zzud;
import com.google.android.gms.internal.gtm.zzue;
import com.google.android.gms.internal.gtm.zzui;
import com.google.android.gms.internal.gtm.zzuj;
import com.google.android.gms.internal.gtm.zzwc;

public final class zzuf {
    public static final zzui zza = zzui.zza("cause", Throwable.class);

    static {
        Class<Integer> clazz = Integer.class;
        zzui.zza("ratelimit_count", clazz);
        zzui.zza("sampling_count", clazz);
        zzui.zza("ratelimit_period", zzuc.class);
        zzui.zza("skipped", clazz);
        new zzud("group_by", Object.class, true);
        zzui.zza("forced", Boolean.class);
        new zzue("tags", zzwc.class, false);
        zzui.zza("stack_size", zzuj.class);
    }
}

