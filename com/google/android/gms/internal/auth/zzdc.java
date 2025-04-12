/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.auth.zzcd;
import com.google.android.gms.internal.auth.zzcg;
import com.google.android.gms.internal.auth.zzci;
import com.google.android.gms.internal.auth.zzco;
import com.google.android.gms.internal.auth.zzcq;
import com.google.android.gms.internal.auth.zzcs;
import com.google.android.gms.internal.auth.zzct;
import com.google.android.gms.internal.auth.zzcu;
import com.google.android.gms.internal.auth.zzcz;
import com.google.android.gms.internal.auth.zzda;
import com.google.android.gms.internal.auth.zzdb;
import com.google.android.gms.internal.auth.zzdd;
import com.google.android.gms.internal.auth.zzde;
import com.google.android.gms.internal.auth.zzdh;
import com.google.android.gms.internal.auth.zzdj;
import com.google.android.gms.internal.auth.zzdn;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzdc {
    private static final Object zza;
    public static final /* synthetic */ int zzd = 0;
    private static volatile zzda zze;
    private static volatile boolean zzf = false;
    private static final AtomicReference zzg;
    private static final zzde zzh;
    private static final AtomicInteger zzi;
    final zzcz zzb;
    final String zzc;
    private final Object zzj;
    private volatile int zzk;
    private volatile Object zzl;
    private final boolean zzm;

    static {
        Object object;
        zza = object = new Object();
        object = new AtomicReference();
        zzg = object;
        zzcu zzcu2 = zzcu.zza;
        zzh = object = new zzde(zzcu2, null);
        zzi = object = new AtomicInteger();
    }

    public /* synthetic */ zzdc(zzcz object, String string2, Object object2, boolean bl2, zzdb zzdb2) {
        int n3;
        this.zzk = n3 = -1;
        Uri uri = ((zzcz)object).zzb;
        if (uri != null) {
            this.zzb = object;
            this.zzc = string2;
            this.zzj = object2;
            this.zzm = true;
            return;
        }
        object = new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        throw object;
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zze(Context object) {
        Object object2 = zze;
        if (object2 != null) {
            return;
        }
        object2 = zza;
        synchronized (object2) {
            Throwable throwable2;
            block12: {
                Object object3;
                try {
                    object3 = zze;
                    if (object3 != null) break block11;
                    synchronized (object2) {
                    }
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                {
                    block11: {
                        Throwable throwable32;
                        block13: {
                            Object object4;
                            try {
                                object3 = zze;
                                object4 = object.getApplicationContext();
                                if (object4 != null) {
                                    object = object4;
                                }
                                if (object3 == null || (object3 = ((zzda)object3).zza()) != object) {
                                }
                                break block11;
                            }
                            catch (Throwable throwable32) {
                                break block13;
                            }
                            {
                                zzcg.zzd();
                                zzdd.zzc();
                                zzco.zze();
                                object3 = new zzct((Context)object);
                                object3 = zzdn.zza((zzdj)object3);
                                object4 = new zzcd((Context)object, (zzdj)object3);
                                zze = object4;
                                object = zzi;
                                ((AtomicInteger)object).incrementAndGet();
                                break block11;
                            }
                        }
                        throw throwable32;
                    }
                    return;
                }
            }
            throw throwable2;
        }
    }

    public abstract Object zza(Object var1);

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzb() {
        var1_1 = this.zzm;
        if (var1_1 == 0 && (var2_2 = this.zzc) == null) {
            var2_2 = new NullPointerException("flagName must not be null");
            throw var2_2;
        }
        var3_4 = this.zzk;
        var2_2 = zzdc.zzi;
        var1_1 = var2_2.get();
        if (var3_4 >= var1_1) return this.zzl;
        synchronized (this) {
            block18: {
                block17: {
                    block20: {
                        try {
                            var3_4 = this.zzk;
                            if (var3_4 >= var1_1) return this.zzl;
                            var4_5 = zzdc.zze;
                            var5_6 = "Must call PhenotypeFlag.init() first";
                            if (var4_5 == null) break block17;
                            var5_6 = this.zzb;
                            var5_6.zzf;
                        }
                        catch (Throwable var2_3) {
                            break block18;
                        }
                        var5_6 = var5_6.zzb;
                        if (var5_6 != null) {
                            var5_6 = var4_5.zza();
                            var6_7 = this.zzb;
                            var6_7 = var6_7.zzb;
                            var7_8 = zzcq.zza((Context)var5_6, (Uri)var6_7);
                            if (var7_8) {
                                var5_6 = this.zzb;
                                var7_8 = var5_6.zzh;
                                var5_6 = var4_5.zza();
                                var5_6 = var5_6.getContentResolver();
                                var6_7 = this.zzb;
                                var6_7 = var6_7.zzb;
                                var8_9 = zzcs.zza;
                                var5_6 = zzcg.zza((ContentResolver)var5_6, (Uri)var6_7, (Runnable)var8_9);
                            } else {
                                var7_8 = false;
                                var5_6 = null;
                            }
                        } else {
                            var5_6 = var4_5.zza();
                            var6_7 = this.zzb;
                            var6_7 = var6_7.zza;
                            var6_7 = zzcs.zza;
                            var5_6 = zzdd.zza((Context)var5_6, null, (Runnable)var6_7);
                        }
                        if (var5_6 != null && (var5_6 = var5_6.zzb((String)(var6_7 = this.zzc()))) != null) {
                            var5_6 = this.zza(var5_6);
                        } else {
                            var7_8 = false;
                            var5_6 = null;
                        }
                        if (var5_6 != null) break block20;
                        var5_6 = this.zzb;
                        var7_8 = var5_6.zze;
                        if (var7_8) ** GOTO lbl-1000
                        var5_6 = var4_5.zza();
                        var5_6 = zzco.zza((Context)var5_6);
                        var6_7 = this.zzb;
                        var9_10 = var6_7.zze;
                        if (var9_10) {
                            var9_10 = false;
                            var6_7 = null;
                        } else {
                            var6_7 = this.zzc;
                        }
                        var5_6 = var5_6.zzc((String)var6_7);
                        if (var5_6 != null) {
                            var5_6 = this.zza(var5_6);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var7_8 = false;
                            var5_6 = null;
                        }
                        if (var5_6 == null) {
                            var5_6 = this.zzj;
                        }
                    }
                    var4_5 = var4_5.zzb();
                    var4_5 = var4_5.zza();
                    var4_5 = (zzdh)var4_5;
                    var9_10 = var4_5.zzb();
                    if (var9_10) {
                        var4_5 = var4_5.zza();
                        var4_5 = (zzci)var4_5;
                        var5_6 = this.zzb;
                        var6_7 = var5_6.zzb;
                        var5_6 = var5_6.zzd;
                        var8_9 = this.zzc;
                        var5_6 = (var4_5 = var4_5.zza((Uri)var6_7, null, (String)var5_6, (String)var8_9)) == null ? this.zzj : this.zza(var4_5);
                    }
                    this.zzl = var5_6;
                    this.zzk = var1_1;
                    return this.zzl;
                }
                var2_2 = new IllegalStateException((String)var5_6);
                throw var2_2;
            }
            throw var2_3;
        }
    }

    public final String zzc() {
        String cfr_ignored_0 = this.zzb.zzd;
        return this.zzc;
    }
}

