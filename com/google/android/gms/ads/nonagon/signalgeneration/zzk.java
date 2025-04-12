/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Pair
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzi;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzdvk;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzk {
    private final int zza;
    private final long zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final Map zze;
    private final ArrayDeque zzf;
    private final ArrayDeque zzg;
    private final zzdvh zzh;
    private Map zzi;

    public zzk(zzdvh map2) {
        long l2;
        int n3;
        ArrayDeque arrayDeque;
        this.zzf = arrayDeque = new ArrayDeque();
        this.zzg = arrayDeque = new ArrayDeque();
        this.zzh = map2;
        map2 = zzbep.zzhh;
        this.zza = n3 = ((Integer)zzba.zzc().zza((zzbeg)((Object)map2))).intValue();
        map2 = zzbep.zzhi;
        this.zzb = l2 = ((Long)zzba.zzc().zza((zzbeg)((Object)map2))).longValue();
        map2 = zzbep.zzhn;
        n3 = (int)(((Boolean)zzba.zzc().zza((zzbeg)((Object)map2))).booleanValue() ? 1 : 0);
        this.zzc = n3;
        map2 = zzbep.zzhl;
        n3 = (int)(((Boolean)zzba.zzc().zza((zzbeg)((Object)map2))).booleanValue() ? 1 : 0);
        this.zzd = n3;
        map2 = new Map(this);
        this.zze = map2 = Collections.synchronizedMap(map2);
    }

    public static /* bridge */ /* synthetic */ int zza(zzk zzk2) {
        return zzk2.zza;
    }

    public static /* bridge */ /* synthetic */ ArrayDeque zzc(zzk zzk2) {
        return zzk2.zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzg(zzdux zzdux2) {
        synchronized (this) {
            boolean bl2 = this.zzc;
            if (!bl2) {
                return;
            }
            Object object = this.zzg;
            Object object2 = ((ArrayDeque)object).clone();
            ((ArrayDeque)object).clear();
            object = this.zzf;
            Object object3 = ((ArrayDeque)object).clone();
            ((ArrayDeque)object).clear();
            object = zzcci.zza;
            zzi zzi2 = new zzi(this, zzdux2, (ArrayDeque)object2, (ArrayDeque)object3);
            object.execute(zzi2);
            return;
        }
    }

    private final void zzh(zzdux zzdux2, ArrayDeque arrayDeque, String string2) {
        boolean bl2;
        while (!(bl2 = arrayDeque.isEmpty())) {
            Object object = (Pair)arrayDeque.poll();
            Object object2 = zzdux2.zzb();
            Object object3 = new ConcurrentHashMap(object2);
            this.zzi = object3;
            object3.put("action", "ev");
            this.zzi.put("e_r", string2);
            object3 = this.zzi;
            object2 = (String)((Pair)object).first;
            String string3 = "e_id";
            object3.put(string3, object2);
            boolean bl3 = this.zzd;
            if (bl3) {
                object = (String)((Pair)object).second;
                object3 = new JSONObject((String)object);
                object = "request_agent";
                object = object3.getString((String)object);
                object2 = "extras";
                object3 = object3.getJSONObject((String)object2);
                object2 = "query_info_type";
                object3 = object3.getString((String)object2);
                object3 = zzp.zzb((String)object3);
                try {
                    object2 = new Pair(object3, object);
                }
                catch (JSONException jSONException) {
                    object = "";
                    object2 = new Pair(object, object);
                }
                object = this.zzi;
                object3 = (String)((Pair)object2).first;
                string3 = "e_type";
                zzk.zzj((Map)object, string3, (String)object3);
                object = this.zzi;
                object3 = (String)((Pair)object2).second;
                object2 = "e_agent";
                zzk.zzj((Map)object, (String)object2, (String)object3);
            }
            object = this.zzh;
            object3 = this.zzi;
            ((zzdvk)object).zzf((Map)object3);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzi() {
        synchronized (this) {
            block10: {
                block9: {
                    block8: {
                        try {
                            var1_1 = zzu.zzB();
                            var2_4 = var1_1.currentTimeMillis();
                            var4_5 = this.zze;
                            var4_5 = var4_5.entrySet();
                            try {
                                var4_5 = var4_5.iterator();
lbl9:
                                // 2 sources

                                while (var5_6 = var4_5.hasNext()) {
                                    var6_7 /* !! */  = var4_5.next();
                                    var6_7 /* !! */  = (Map.Entry)var6_7 /* !! */ ;
                                    var7_8 = var6_7 /* !! */ .getValue();
                                    var7_8 = (Pair)var7_8;
                                    var7_8 = var7_8.first;
                                    var7_8 = (Long)var7_8;
                                    var8_9 = var7_8.longValue();
                                    var8_9 = var2_4 - var8_9;
                                    ** GOTO lbl-1000
                                }
                                break block8;
                            }
                            catch (ConcurrentModificationException var1_3) {
                                break block9;
                            }
                        }
                        catch (Throwable var1_2) {
                            break block10;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var10_10 = this.zzb;
                            var12_11 = var8_9 == var10_10 ? 0 : (var8_9 < var10_10 ? -1 : 1);
                            if (var12_11 <= 0) break block8;
                            var7_8 = this.zzg;
                            var14_13 /* !! */  = var6_7 /* !! */ .getKey();
                            var14_13 /* !! */  = (String)var14_13 /* !! */ ;
                            var6_7 /* !! */  = var6_7 /* !! */ .getValue();
                            var6_7 /* !! */  = (Pair)var6_7 /* !! */ ;
                            var6_7 /* !! */  = var6_7 /* !! */ .second;
                            var6_7 /* !! */  = (String)var6_7 /* !! */ ;
                            var13_12 = new Pair(var14_13 /* !! */ , var6_7 /* !! */ );
                            var7_8.add(var13_12);
                            var4_5.remove();
                            ** GOTO lbl9
                        }
                    }
                    return;
                }
                var15_14 = "QueryJsonMap.removeExpiredEntries";
                {
                    var4_5 = zzu.zzo();
                    var4_5.zzw(var1_3, var15_14);
                    return;
                }
            }
            throw var1_2;
        }
    }

    private static final void zzj(Map map2, String string2, String string3) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl2) {
            map2.put(string2, string3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzb(String object, zzdux object2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object3;
                try {
                    object3 = this.zze;
                    object3 = object3.get(object);
                    object3 = (Pair)object3;
                    Object object4 = ((zzdux)object2).zzb();
                    String string2 = "request_id";
                    object4.put(string2, object);
                    if (object3 != null) {
                        object3 = ((Pair)object3).second;
                        object3 = (String)object3;
                        object4 = this.zze;
                        object4.remove(object);
                        object = ((zzdux)object2).zzb();
                        object2 = "mhit";
                        object4 = "true";
                        object.put(object2, object4);
                        return object3;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = ((zzdux)object2).zzb();
                object2 = "mhit";
                object3 = "false";
                object.put(object2, object3);
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(String string2, String object, zzdux zzdux2) {
        synchronized (this) {
            Object object2 = zzu.zzB();
            long l2 = object2.currentTimeMillis();
            object2 = l2;
            Pair pair = new Pair(object2, object);
            object = this.zze;
            object.put(string2, pair);
            this.zzi();
            this.zzg(zzdux2);
            return;
        }
    }

    public final /* synthetic */ void zze(zzdux zzdux2, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.zzh(zzdux2, arrayDeque, "to");
        this.zzh(zzdux2, arrayDeque2, "of");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(String string2) {
        synchronized (this) {
            Map map2 = this.zze;
            map2.remove(string2);
            return;
        }
    }
}

