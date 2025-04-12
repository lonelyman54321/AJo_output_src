/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfu;
import com.google.android.gms.measurement.internal.zzfv;
import com.google.android.gms.measurement.internal.zzfw;

public final class zzfx {
    private static final Object zza;
    private final String zzb;
    private final zzfv zzc;
    private final Object zzd;
    private final Object zze;
    private volatile Object zzf;
    private volatile Object zzg;

    static {
        Object object;
        zza = object = new Object();
    }

    private zzfx(String string2, Object object, Object object2, zzfv zzfv2) {
        this.zze = object2 = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = string2;
        this.zzd = object;
        this.zzc = zzfv2;
    }

    public /* synthetic */ zzfx(String string2, Object object, Object object2, zzfv zzfv2, zzfw zzfw2) {
        this(string2, object, object2, zzfv2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza(Object var1_1) {
        block26: {
            block24: {
                block25: {
                    var2_2 = this.zze;
                    ** synchronized (var2_2)
lbl3:
                    // 1 sources

                    if (var1_1 != null) {
                        return var1_1;
                    }
                    var1_1 = zzfu.zza;
                    if (var1_1 == null) {
                        return this.zzd;
                    }
                    var1_1 = zzfx.zza;
                    synchronized (var1_1) {
                        try {
                            var3_4 = zzaf.zza();
                            if (var3_4) {
                                var2_2 = this.zzg;
                                if (var2_2 != null) return this.zzg;
                                return this.zzd;
                            }
                        }
                        catch (Throwable var2_3) {
                            ** break block27
                        }
                    }
                    try {
                        var1_1 = zzbn.zzdc();
                        var1_1 = var1_1.iterator();
lbl22:
                        // 2 sources

                        while (var3_4 = var1_1.hasNext()) {
                            var2_2 = var1_1.next();
                            var2_2 = (zzfx)var2_2;
                            var4_5 = zzaf.zza();
                            if (var4_5) break block24;
                            var4_5 = false;
                            var5_6 = null;
                            var6_7 = var2_2.zzc;
                            if (var6_7 != null) {
                                var5_6 = var6_7.zza();
                            }
                            break block25;
                        }
                        break block26;
                    }
                    catch (SecurityException v0) {
                        break block26;
                    }
                    catch (IllegalStateException v1) {}
                }
                var6_7 = zzfx.zza;
                synchronized (var6_7) {
                    var2_2.zzg = var5_6;
                    ** GOTO lbl22
                }
            }
            var2_2 = "Refreshing flag cache must be done on a worker thread.";
            var1_1 = new IllegalStateException((String)var2_2);
            throw var1_1;
        }
        if ((var1_1 = this.zzc) == null) {
            return this.zzd;
        }
        try {
            return var1_1.zza();
        }
        catch (IllegalStateException v2) {
            return this.zzd;
        }
        catch (SecurityException v3) {
            return this.zzd;
        }
lbl-1000:
        // 1 sources

        {
            throw var2_3;
        }
    }

    public final String zza() {
        return this.zzb;
    }
}

