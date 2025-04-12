/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcid;
import com.google.android.gms.internal.ads.zzcie;
import com.google.android.gms.internal.ads.zzgge;
import java.util.HashMap;
import java.util.Map;

public final class zzcif
extends zzdp {
    private final zzcee zza;
    private final Object zzb;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private zzdt zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbjd zzn;

    public zzcif(zzcee zzcee2, float f5, boolean bl2, boolean bl3) {
        Object object;
        this.zzb = object = new Object();
        this.zzh = true;
        this.zza = zzcee2;
        this.zzi = f5;
        this.zzc = bl2;
        this.zzd = bl3;
    }

    private final void zzw(int n3, int n4, boolean bl2, boolean bl3) {
        zzgge zzgge2 = zzcci.zze;
        zzcie zzcie2 = new zzcie(this, n3, n4, bl2, bl3);
        zzgge2.execute(zzcie2);
    }

    private final void zzx(String object, Map hashMap) {
        Object object2;
        if (hashMap == null) {
            hashMap = new HashMap<String, String>();
        } else {
            object2 = new HashMap(hashMap);
            hashMap = object2;
        }
        hashMap.put("action", (String)object);
        object = zzcci.zze;
        object2 = new zzcid(this, hashMap);
        object.execute((Runnable)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzc(float f5, float f6, int n3, boolean bl2, float f7) {
        Object object;
        int n4;
        boolean bl3;
        boolean bl4;
        Object object2;
        block13: {
            float f8;
            object2 = this.zzb;
            // MONITORENTER : object2
            float f11 = this.zzi;
            bl4 = true;
            float f12 = f6 == f11 ? 0 : (f6 > f11 ? 1 : -1);
            if (f12 == false && (f12 = (f8 = f7 - (f11 = this.zzk)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) == false) {
                bl4 = false;
            }
            this.zzi = f6;
            this.zzj = f5;
            bl3 = this.zzh;
            this.zzh = bl2;
            n4 = this.zze;
            this.zze = n3;
            f11 = this.zzk;
            this.zzk = f7;
            f7 -= f11;
            f7 = Math.abs(f7);
            f12 = 953267991;
            f11 = 1.0E-4f;
            float f14 = f7 == f11 ? 0 : (f7 > f11 ? 1 : -1);
            if (f14 <= 0) break block13;
            object = this.zza;
            object = object.zzF();
            object.invalidate();
            // MONITOREXIT : object2
        }
        if (bl4) {
            try {
                object = this.zzn;
                if (object != null) {
                    ((zzbjd)object).zze();
                }
            }
            catch (RemoteException remoteException) {
                object2 = "#007 Could not call remote method.";
                com.google.android.gms.ads.internal.util.client.zzm.zzl((String)object2, remoteException);
            }
        }
        this.zzw(n4, n3, bl3, bl2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzd(int var1_1, int var2_2, boolean var3_3, boolean var4_4) {
        var5_5 = this.zzb;
        synchronized (var5_5) {
            block19: {
                block21: {
                    block20: {
                        block22: {
                            var6_6 = this.zzg;
                            var7_7 = false;
                            var8_8 = 1;
                            if (!var6_6 && var2_2 == var8_8) {
                                var2_2 = 1;
                                var9_9 = 1;
                                var10_10 = true;
                            } else {
                                var9_9 = var2_2;
                                var10_10 = false;
                            }
                            if (var1_1 != var2_2) {
                                var1_1 = 1;
                            } else {
                                var1_1 = 0;
                                var11_11 = null;
                            }
                            if (var1_1 != 0 && var9_9 == var8_8) {
                                var2_2 = 1;
                                var9_9 = 1;
                            } else {
                                var2_2 = 0;
                                var12_14 = null;
                            }
                            var13_15 = var1_1 != 0 && var9_9 == (var13_15 = 2) ? 1 : 0;
                            if (var1_1 != 0 && var9_9 == (var1_1 = 3)) {
                                var1_1 = 1;
                            } else {
                                var1_1 = 0;
                                var11_11 = null;
                            }
                            if (var6_6 || var10_10) {
                                var7_7 = true;
                            }
                            this.zzg = var7_7;
                            if (!var10_10) ** GOTO lbl44
                            var14_16 = this.zzf;
                            if (var14_16 == null) break block22;
                            var14_16.zzi();
                            break block22;
                            catch (Throwable var11_12) {
                                break block19;
                            }
                            catch (RemoteException var11_13) {
                                break block20;
                            }
                        }
                        if (var2_2 != 0 && (var12_14 = this.zzf) != null) {
                            var12_14.zzh();
                        }
                        if (var13_15 != 0 && (var12_14 = this.zzf) != null) {
                            var12_14.zzg();
                        }
                        if (var1_1 != 0) {
                            var11_11 = this.zzf;
                            if (var11_11 != null) {
                                var11_11.zze();
                            }
                            var11_11 = this.zza;
                            var11_11.zzw();
                        }
                        if (var3_3 != var4_4 && (var11_11 = this.zzf) != null) {
                            var11_11.zzf(var4_4);
                        }
                        break block21;
                    }
                    var12_14 = "#007 Could not call remote method.";
                    com.google.android.gms.ads.internal.util.client.zzm.zzl((String)var12_14, var11_13);
                }
                return;
            }
            throw var11_12;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final float zze() {
        Object object = this.zzb;
        synchronized (object) {
            return this.zzk;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final float zzf() {
        Object object = this.zzb;
        synchronized (object) {
            return this.zzj;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final float zzg() {
        Object object = this.zzb;
        synchronized (object) {
            return this.zzi;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzh() {
        Object object = this.zzb;
        synchronized (object) {
            return this.zze;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzdt zzi() {
        Object object = this.zzb;
        synchronized (object) {
            return this.zzf;
        }
    }

    public final void zzj(boolean bl2) {
        boolean bl3 = true;
        String string2 = bl3 != bl2 ? "unmute" : "mute";
        this.zzx(string2, null);
    }

    public final void zzk() {
        this.zzx("pause", null);
    }

    public final void zzl() {
        this.zzx("play", null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm(zzdt zzdt2) {
        Object object = this.zzb;
        synchronized (object) {
            this.zzf = zzdt2;
            return;
        }
    }

    public final void zzn() {
        this.zzx("stop", null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzo() {
        Object object = this.zzb;
        boolean bl2 = this.zzp();
        synchronized (object) {
            boolean bl3 = false;
            if (bl2) return bl3;
            try {
                bl2 = this.zzm;
                if (!bl2) return bl3;
                bl2 = this.zzd;
                if (!bl2) return bl3;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzp() {
        Object object = this.zzb;
        synchronized (object) {
            try {
                boolean bl2 = this.zzc;
                boolean bl3 = false;
                if (!bl2) return bl3;
                bl2 = this.zzl;
                if (!bl2) return bl3;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzq() {
        Object object = this.zzb;
        synchronized (object) {
            return this.zzh;
        }
    }

    public final /* synthetic */ void zzr(Map map2) {
        this.zza.zzd("pubVideoCmd", map2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzs(zzfk object) {
        Object object2 = this.zzb;
        boolean bl2 = ((zzfk)object).zza;
        boolean bl3 = ((zzfk)object).zzb;
        boolean bl4 = ((zzfk)object).zzc;
        synchronized (object2) {
            this.zzl = bl3;
            this.zzm = bl4;
        }
        boolean bl5 = true;
        String string2 = bl5 != bl2 ? "0" : "1";
        String string3 = string2;
        string2 = bl5 != bl3 ? "0" : "1";
        String string4 = string2;
        object = bl5 != bl4 ? "0" : "1";
        object2 = CollectionUtils.mapOf("muteStart", string3, "customControlsRequested", string4, "clickToExpandRequested", object);
        this.zzx("initialState", (Map)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzt(float f5) {
        Object object = this.zzb;
        synchronized (object) {
            this.zzj = f5;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzu() {
        int n3;
        int n4;
        boolean bl2;
        Object object = this.zzb;
        synchronized (object) {
            bl2 = this.zzh;
            n4 = this.zze;
            this.zze = n3 = 3;
        }
        this.zzw(n4, n3, bl2, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzv(zzbjd zzbjd2) {
        Object object = this.zzb;
        synchronized (object) {
            this.zzn = zzbjd2;
            return;
        }
    }
}

