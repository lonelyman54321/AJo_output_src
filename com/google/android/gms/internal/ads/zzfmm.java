/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmj;
import com.google.android.gms.internal.ads.zzfmk;
import com.google.android.gms.internal.ads.zzfml;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public final class zzfmm {
    public static zzfmu zza(zzfho zzfho2) {
        int n3;
        int n4 = zzp.zzf(zzfho2) + -1;
        if (n4 != 0 && n4 != (n3 = 1)) {
            return zzfmu.zzO;
        }
        return zzfmu.zzn;
    }

    public static void zzb(ListenableFuture listenableFuture, zzfmn zzfmn2, zzfmc zzfmc2) {
        zzfmm.zzg(listenableFuture, zzfmn2, zzfmc2, false);
    }

    public static void zzc(ListenableFuture listenableFuture, zzfmn zzfmn2, zzfmc zzfmc2) {
        zzfmm.zzg(listenableFuture, zzfmn2, zzfmc2, true);
    }

    public static void zzd(ListenableFuture listenableFuture, zzfmn object, zzfmc zzfmc2) {
        Object object2 = (Boolean)zzbgd.zzc.zze();
        boolean bl2 = (Boolean)object2;
        if (!bl2) {
            return;
        }
        listenableFuture = zzgfk.zzu(listenableFuture);
        object2 = new zzfml((zzfmn)object, zzfmc2);
        object = zzcci.zzf;
        zzgft.zzr(listenableFuture, (zzgfp)object2, (Executor)object);
    }

    public static void zze(ListenableFuture listenableFuture, zzfmc object) {
        Object object2 = (Boolean)zzbgd.zzc.zze();
        boolean bl2 = (Boolean)object2;
        if (!bl2) {
            return;
        }
        listenableFuture = zzgfk.zzu(listenableFuture);
        object2 = new zzfmj((zzfmc)object);
        object = zzcci.zzf;
        zzgft.zzr(listenableFuture, (zzgfp)object2, (Executor)object);
    }

    public static boolean zzf(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return false;
        }
        zzbeg zzbeg2 = zzbep.zziO;
        return Pattern.matches((String)zzba.zzc().zza(zzbeg2), string2);
    }

    private static void zzg(ListenableFuture listenableFuture, zzfmn object, zzfmc zzfmc2, boolean bl2) {
        Object object2 = (Boolean)zzbgd.zzc.zze();
        boolean bl3 = (Boolean)object2;
        if (!bl3) {
            return;
        }
        listenableFuture = zzgfk.zzu(listenableFuture);
        object2 = new zzfmk((zzfmn)object, zzfmc2, bl2);
        object = zzcci.zzf;
        zzgft.zzr(listenableFuture, (zzgfp)object2, (Executor)object);
    }
}

