/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzji;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzbf
extends zzji {
    private long zza;
    private String zzb;

    public zzbf(zzic zzic2) {
        super(zzic2);
    }

    public final long zzc() {
        this.zzad();
        return this.zza;
    }

    public final String zzg() {
        this.zzad();
        return this.zzb;
    }

    public final boolean zzh() {
        long l2;
        Object object = Calendar.getInstance();
        Object object2 = TimeUnit.MINUTES;
        int n3 = ((Calendar)object).get(15);
        long l3 = ((Calendar)object).get(16) + n3;
        object = TimeUnit.MILLISECONDS;
        this.zza = l2 = ((TimeUnit)((Object)object2)).convert(l3, (TimeUnit)((Object)object));
        object = Locale.getDefault();
        object2 = ((Locale)object).getLanguage();
        Locale locale = Locale.ENGLISH;
        object2 = ((String)object2).toLowerCase(locale);
        object = ((Locale)object).getCountry().toLowerCase(locale);
        this.zzb = object = n1.a((String)object2, "-", (String)object);
        return false;
    }
}

