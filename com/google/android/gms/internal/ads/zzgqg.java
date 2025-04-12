/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghd;
import com.google.android.gms.internal.ads.zzghi;
import com.google.android.gms.internal.ads.zzgpm;
import com.google.android.gms.internal.ads.zzgqf;
import com.google.android.gms.internal.ads.zzgqi;
import com.google.android.gms.internal.ads.zzgqk;
import com.google.android.gms.internal.ads.zzgtk;
import com.google.android.gms.internal.ads.zzgwj;
import com.google.android.gms.internal.ads.zzgwt;
import com.google.android.gms.internal.ads.zzgxn;
import com.google.android.gms.internal.ads.zzgze;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzgqg {
    private final Class zza;
    private Map zzb;
    private final List zzc;
    private zzgqi zzd;
    private zzgtk zze;

    public /* synthetic */ zzgqg(Class object, zzgqf cloneable) {
        this.zzb = cloneable = new Cloneable();
        this.zzc = cloneable;
        this.zza = object;
        this.zze = object = zzgtk.zza;
    }

    /*
     * Unable to fully structure code
     */
    private final zzgqg zze(Object var1_1, zzghi var2_2, zzgwt var3_3, boolean var4_4) {
        block7: {
            block8: {
                block10: {
                    block9: {
                        var5_5 = this.zzb;
                        if (var5_5 == null) break block7;
                        var5_5 = var3_3.zzd();
                        if (var5_5 != (var6_6 = zzgwj.zzb)) break block8;
                        var6_6 = zzgxn.zza;
                        var6_6 = var3_3.zzg();
                        var7_7 = var6_6.ordinal();
                        if (var7_7 == (var8_8 = 1)) break block9;
                        var8_8 = 2;
                        if (var7_7 == var8_8) ** GOTO lbl19
                        var8_8 = 3;
                        if (var7_7 == var8_8) {
                            var6_6 = zzghd.zza;
                        } else {
                            var8_8 = 4;
                            if (var7_7 != var8_8) {
                                var1_1 = new GeneralSecurityException("unknown output prefix type");
                                throw var1_1;
                            }
lbl19:
                            // 3 sources

                            var7_7 = var3_3.zza();
                            var6_6 = zzgpm.zza(var7_7).zzc();
                        }
                        break block10;
                    }
                    var7_7 = var3_3.zza();
                    var6_6 = zzgpm.zzb(var7_7).zzc();
                }
                var9_9 = zzgze.zzb((byte[])var6_6);
                var10_10 = var3_3.zzd();
                var11_11 = var3_3.zzg();
                var12_12 = var3_3.zza();
                var13_13 = var3_3.zzc().zzg();
                var5_5 = new zzgqi(var1_1, var9_9, var10_10, var11_11, var12_12, var13_13, (zzghi)var2_2, null);
                var1_1 = this.zzb;
                var2_2 = this.zzc;
                var3_3 = new ArrayList();
                var3_3.add(var5_5);
                var6_6 = zzgqi.zzd((zzgqi)var5_5);
                var3_3 = Collections.unmodifiableList(var3_3);
                var3_3 = var1_1.put(var6_6, var3_3);
                if (var3_3 != null) {
                    var6_6 = new Object();
                    var6_6.addAll(var3_3);
                    var6_6.add(var5_5);
                    var3_3 = zzgqi.zzd((zzgqi)var5_5);
                    var6_6 = Collections.unmodifiableList(var6_6);
                    var1_1.put(var3_3, var6_6);
                }
                var2_2.add(var5_5);
                if (var4_4) {
                    var1_1 = this.zzd;
                    if (var1_1 == null) {
                        this.zzd = var5_5;
                    } else {
                        var1_1 = new IllegalStateException("you cannot set two primary primitives");
                        throw var1_1;
                    }
                }
                return this;
            }
            var1_1 = new GeneralSecurityException("only ENABLED key is allowed");
            throw var1_1;
        }
        var1_1 = new IllegalStateException("addEntry cannot be called after build");
        throw var1_1;
    }

    public final zzgqg zza(Object object, zzghi zzghi2, zzgwt zzgwt2) {
        this.zze(object, zzghi2, zzgwt2, false);
        return this;
    }

    public final zzgqg zzb(Object object, zzghi zzghi2, zzgwt zzgwt2) {
        this.zze(object, zzghi2, zzgwt2, true);
        return this;
    }

    public final zzgqg zzc(zzgtk object) {
        Map map2 = this.zzb;
        if (map2 != null) {
            this.zze = object;
            return this;
        }
        object = new IllegalStateException("setAnnotations cannot be called after build");
        throw object;
    }

    public final zzgqk zzd() {
        Map map2 = this.zzb;
        if (map2 != null) {
            zzgqk zzgqk2;
            List list = this.zzc;
            zzgqi zzgqi2 = this.zzd;
            zzgtk zzgtk2 = this.zze;
            Class clazz = this.zza;
            zzgqk zzgqk3 = zzgqk2;
            zzgqk2 = new zzgqk(map2, list, zzgqi2, zzgtk2, clazz, null);
            this.zzb = null;
            return zzgqk2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("build cannot be called twice");
        throw illegalStateException;
    }
}

