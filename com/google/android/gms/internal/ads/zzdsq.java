/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfim;
import java.util.HashMap;
import java.util.Map;

public final class zzdsq {
    private final Map zza;

    public zzdsq() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzdsp zza(String object) {
        synchronized (this) {
            Map map2 = this.zza;
            object = map2.get(object);
            return (zzdsp)object;
        }
    }

    public final String zzb(String object) {
        if ((object = this.zza((String)object)) != null && (object = ((zzdsp)object).zzb) != null) {
            return ((zzbtt)object).toString();
        }
        return "";
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(String var1_1, zzfim var2_3) {
        synchronized (this) {
            block19: {
                block18: {
                    var3_4 = this.zza;
                    var4_5 = var3_4.containsKey(var1_1);
                    if (!var4_5) break block18;
                    return;
                }
                try {
                    var5_6 = null;
                    if (var2_3 == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var6_7 = null;
                            break block19;
                            break;
                        }
                    }
                    var6_7 = var2_3.zze();
                    break block19;
                }
                catch (Throwable var1_2) {
                    ** GOTO lbl50
                }
                catch (zzfhv v0) {
                    ** continue;
                }
            }
            if (var2_3 == null) ** GOTO lbl25
            {
                try {
                    var5_6 = var2_3.zzf();
                }
                catch (zzfhv v1) {
                    ** continue;
                }
lbl25:
                // 3 sources

                while (true) {
                    var7_8 = zzbep.zzjr;
                    var8_9 = zzba.zzc();
                    var7_8 = var8_9.zza((zzbeg)var7_8);
                    var7_8 = (Boolean)var7_8;
                    var9_10 = var7_8.booleanValue();
                    var10_11 = true;
                    if (var9_10) {
                        var9_10 = false;
                        var7_8 = null;
                        if (var2_3 == null) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var10_11 = false;
                                var8_9 = null;
                                break;
                            }
                        } else {
                            var2_3.zzC();
                        }
                    }
                    var3_4 = new zzdsp(var1_1, var6_7, var5_6, var10_11);
                    var2_3 = this.zza;
                    var2_3.put(var1_1, var3_4);
                    return;
                }
lbl50:
                // 1 sources

                throw var1_2;
                catch (zzfhv v2) {
                    ** continue;
                }
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(String string2, zzbte object) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object2;
                block7: {
                    try {
                        object2 = this.zza;
                        boolean bl2 = object2.containsKey(string2);
                        if (!bl2) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    return;
                }
                try {
                    object2 = object.zzf();
                    object = object.zzg();
                }
                catch (Throwable throwable3) {
                    return;
                }
                {
                    boolean bl3 = true;
                    zzdsp zzdsp2 = new zzdsp(string2, (zzbtt)object2, (zzbtt)object, bl3);
                    object = this.zza;
                    object.put(string2, zzdsp2);
                    return;
                }
            }
            throw throwable2;
        }
    }
}

