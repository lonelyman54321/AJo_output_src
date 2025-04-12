/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzgn;
import com.google.android.gms.internal.gtm.zzgt;
import com.google.android.gms.internal.gtm.zzhd;
import com.google.android.gms.internal.gtm.zzhf;
import com.google.android.gms.internal.gtm.zziy;
import com.google.android.gms.internal.gtm.zziz;
import com.google.android.gms.internal.gtm.zzja;
import com.google.android.gms.internal.gtm.zzjd;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzck;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class zzjb
extends zzhf {
    private final Map zza;
    private final ExecutorService zzb;
    private final zzgn zzc;
    private final zzck zzd;
    private final Context zze;

    public zzjb(Context context, zzck zzck2, zzcb object) {
        HashMap hashMap;
        zzgn zzgn2 = new zzgn(context, zzck2, (zzcb)object);
        object = zzjd.zza(context);
        this.zza = hashMap = new HashMap(1);
        Preconditions.checkNotNull(zzck2);
        this.zzd = zzck2;
        this.zzc = zzgn2;
        this.zzb = object;
        this.zze = context;
    }

    public static /* bridge */ /* synthetic */ Context zzc(zzjb zzjb2) {
        return zzjb2.zze;
    }

    public static /* bridge */ /* synthetic */ zzgn zzd(zzjb zzjb2) {
        return zzjb2.zzc;
    }

    public static /* bridge */ /* synthetic */ Map zzj(zzjb zzjb2) {
        return zzjb2.zza;
    }

    public final void zze() {
        zzja zzja2 = new zzja(this);
        this.zzb.execute(zzja2);
    }

    public final void zzf(String object, Bundle bundle, String string2, long l2, boolean bl2) {
        Date date = new Date(l2);
        zzck zzck2 = this.zzd;
        zzgt zzgt2 = new zzgt((String)object, bundle, string2, date, bl2, zzck2);
        object = new zziz(this, zzgt2);
        this.zzb.execute((Runnable)object);
    }

    public final void zzg(String string2, String string3, String string4) {
        this.zzh(string2, string3, string4, null);
    }

    public final void zzh(String string2, String string3, String string4, zzhd zzhd2) {
        zziy zziy2 = new zziy(this, string2, string3, string4, zzhd2);
        this.zzb.execute(zziy2);
    }

    public final void zzi() {
        this.zza.clear();
    }
}

