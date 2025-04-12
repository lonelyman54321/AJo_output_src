/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.CookieManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzdzl;
import com.google.android.gms.internal.ads.zzdzm;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzfle;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.TimeUnit;

public final class zzdzo
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzdzo(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final /* synthetic */ Object zzb() {
        Object object = (zzflt)this.zza.zzb();
        Object object2 = (Context)this.zzb.zzb();
        object2 = zzu.zzq().zza((Context)object2);
        Object object3 = zzfln.zzv;
        Object object4 = new zzdzl((CookieManager)object2);
        object = zzfld.zza(object4, object3, (zzfll)object);
        object4 = TimeUnit.SECONDS;
        object = ((zzflk)object).zzi(1L, (TimeUnit)((Object)object4));
        object2 = new zzdzm();
        object3 = new zzfle((zzfkw)object2);
        return ((zzflk)object).zzc(Exception.class, (zzgfa)object3).zza();
    }
}

