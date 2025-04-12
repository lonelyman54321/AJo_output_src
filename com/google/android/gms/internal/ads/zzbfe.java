/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzcby;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class zzbfe {
    private final List zza;
    private final Map zzb;
    private final Object zzc;

    public zzbfe(boolean bl2, String object, String string2) {
        Cloneable cloneable = new LinkedList();
        this.zza = cloneable;
        this.zzb = cloneable;
        this.zzc = object = new Object();
        cloneable.put("action", "make_wv");
        cloneable.put("ad_format", string2);
    }

    public static final zzbfb zzf() {
        long l2 = zzu.zzB().elapsedRealtime();
        zzbfb zzbfb2 = new zzbfb(l2, null, null);
        return zzbfb2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbfd zza() {
        var1_1 = zzbep.zzbR;
        var1_1 = (Boolean)zzba.zzc().zza((zzbeg)var1_1);
        var2_3 = var1_1.booleanValue();
        var3_4 = new StringBuilder();
        var4_5 = new HashMap();
        var5_6 = this.zzc;
        synchronized (var5_6) {
            try {
                var6_7 = this.zza;
                var6_7 = var6_7.iterator();
                while (true) {
                    var7_8 = var6_7.hasNext();
                    var8_9 = ',';
                    var9_10 = '.';
                    if (var7_8 == 0) break;
                    var10_11 = var6_7.next();
                    var10_11 = (zzbfb)var10_11;
                    var11_12 = var10_11.zza();
                    var13_13 = var10_11.zzc();
                    if ((var10_11 = var10_11.zzb()) == null || (var16_15 = (cfr_temp_0 = var11_12 - (var14_14 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) <= 0) continue;
                    var14_14 = var10_11.zza();
                    var3_4.append(var13_13);
                    var3_4.append(var9_10);
                    var3_4.append(var11_12 -= var14_14);
                    var3_4.append(var8_9);
                    if (var2_3 == 0) continue;
                    var17_16 = var10_11.zza();
                    var19_17 /* !! */  = var17_16;
                    var8_9 = (char)var4_5.containsKey(var19_17 /* !! */ );
                    if (var8_9 == '\u0000') {
                        var20_18 = var10_11.zza();
                        var10_11 = var20_18;
                        var19_17 /* !! */  = new StringBuilder(var13_13);
                        var4_5.put(var10_11, var19_17 /* !! */ );
                        continue;
                    }
                    var20_18 = var10_11.zza();
                    var10_11 = var20_18;
                    var10_11 = var4_5.get(var10_11);
                    var10_11 = (StringBuilder)var10_11;
                    var8_9 = '+';
                    var10_11.append(var8_9);
                    var10_11.append(var13_13);
                }
                var6_7 = this.zza;
                var6_7.clear();
                var6_7 = null;
                var7_8 = TextUtils.isEmpty(null);
                if (var7_8 == 0) {
                    var3_4.append(null);
                } else {
                    var7_8 = var3_4.length();
                    if (var7_8 > 0) {
                        var7_8 = var3_4.length() + -1;
                        var3_4.setLength(var7_8);
                    }
                }
                var10_11 = new StringBuilder();
                if (var2_3 != 0) {
                    var1_1 = var4_5.entrySet();
                    var1_1 = var1_1.iterator();
                }
                ** GOTO lbl97
            }
            catch (Throwable var1_2) {}
            {
                throw var1_2;
                while (var22_19 = var1_1.hasNext()) {
                    var4_5 = var1_1.next();
                    var4_5 = (Map.Entry)var4_5;
                    var6_7 = var4_5.getValue();
                    var6_7 = (CharSequence)var6_7;
                    var10_11.append((CharSequence)var6_7);
                    var10_11.append(var9_10);
                    var4_5 = var4_5.getKey();
                    var4_5 = (Long)var4_5;
                    var11_12 = var4_5.longValue();
                    var4_5 = zzu.zzB();
                    var23_20 = var4_5.currentTimeMillis();
                    var4_5 = zzu.zzB();
                    var25_21 = var4_5.elapsedRealtime();
                    var10_11.append(var23_20 += (var11_12 -= var25_21));
                    var10_11.append(var8_9);
                }
                var2_3 = var10_11.length();
                if (var2_3 > 0) {
                    var2_3 = var10_11.length() + -1;
                    var10_11.setLength(var2_3);
                }
                var6_7 = var10_11.toString();
lbl97:
                // 2 sources

                var3_4 = var3_4.toString();
                return new zzbfd((String)var3_4, (String)var6_7);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzb() {
        Object object = this.zzc;
        synchronized (object) {
            zzcby zzcby2 = zzu.zzo();
            zzcby2.zzg();
            return this.zzb;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzc(zzbfe object) {
        object = this.zzc;
        // MONITORENTER : object
        // MONITOREXIT : object
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(String string2, String string3) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (bl2) {
            return;
        }
        Object object = zzu.zzo().zzg();
        if (object == null) return;
        Object object2 = this.zzc;
        synchronized (object2) {
            object = ((zzbeu)object).zza(string2);
            Map map2 = this.zzb;
            Object object3 = map2.get(string2);
            object3 = (String)object3;
            string3 = ((zzbfa)object).zza((String)object3, string3);
            map2.put(string2, string3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zze(zzbfb object, long l2, String ... object2) {
        Object object3 = this.zzc;
        synchronized (object3) {
            zzbfb zzbfb2 = null;
            object2 = object2[0];
            zzbfb2 = new zzbfb(l2, (String)object2, (zzbfb)object);
            object = this.zza;
            object.add(zzbfb2);
            return true;
        }
    }
}

