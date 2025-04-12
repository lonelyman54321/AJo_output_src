/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzum;
import com.google.android.gms.internal.gtm.zzuo;
import com.google.android.gms.internal.gtm.zzva;
import com.google.android.gms.internal.gtm.zzvb;
import com.google.android.gms.internal.gtm.zzvq;
import com.google.android.gms.internal.gtm.zzwc;
import com.google.android.gms.internal.gtm.zzwg;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public abstract class zzvc {
    private static String zza = "com.google.android.gms.internal.gtm.zzvg";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = new String[]{"com.google.android.gms.internal.gtm.zzvg", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzwg.zza();
    }

    public static long zzb() {
        return zzva.zza().zzc();
    }

    public static zzum zzd(String string2) {
        return zzva.zza().zze(string2);
    }

    public static zzuo zzf() {
        return zzvc.zzi().zza();
    }

    public static zzvb zzg() {
        return zzva.zza().zzh();
    }

    public static zzvq zzi() {
        return zzva.zza().zzj();
    }

    public static zzwc zzk() {
        return zzvc.zzi().zzc();
    }

    public static String zzl() {
        return zzva.zza().zzm();
    }

    public static boolean zzn(String string2, Level level, boolean bl2) {
        zzvc.zzi().zzd(string2, level, bl2);
        return false;
    }

    public static /* bridge */ /* synthetic */ String[] zzo() {
        return zzd;
    }

    public long zzc() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long l2 = System.currentTimeMillis();
        return timeUnit.toNanos(l2);
    }

    public abstract zzum zze(String var1);

    public abstract zzvb zzh();

    public zzvq zzj() {
        return zzvq.zze();
    }

    public abstract String zzm();
}

