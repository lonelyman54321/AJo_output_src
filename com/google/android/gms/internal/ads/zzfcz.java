/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcrm;
import com.google.android.gms.internal.ads.zzcrz;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzepq;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzfcr;
import com.google.android.gms.internal.ads.zzfct;
import com.google.android.gms.internal.ads.zzfcv;
import com.google.android.gms.internal.ads.zzfcw;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfcy;
import com.google.android.gms.internal.ads.zzfiq;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzfcz
extends zzbt
implements zzp,
zzbca {
    protected zzcrz zza;
    private final zzcjd zzb;
    private final Context zzc;
    private AtomicBoolean zzd;
    private final String zze;
    private final zzfct zzf;
    private final zzfcr zzg;
    private final VersionInfoParcel zzh;
    private final zzdvc zzi;
    private long zzj;
    private zzcrm zzk;

    public zzfcz(zzcjd zzcjd2, Context context, String string2, zzfct zzfct2, zzfcr zzfcr2, VersionInfoParcel versionInfoParcel, zzdvc zzdvc2) {
        AtomicBoolean atomicBoolean;
        this.zzd = atomicBoolean = new AtomicBoolean();
        this.zzj = -1;
        this.zzb = zzcjd2;
        this.zzc = context;
        this.zze = string2;
        this.zzf = zzfct2;
        this.zzg = zzfcr2;
        this.zzh = versionInfoParcel;
        this.zzi = zzdvc2;
        zzfcr2.zzm(this);
    }

    public static /* bridge */ /* synthetic */ zzdvc zzh(zzfcz zzfcz2) {
        return zzfcz2.zzi;
    }

    public static /* bridge */ /* synthetic */ zzfcr zzm(zzfcz zzfcz2) {
        return zzfcz2.zzg;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzq(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block6: {
                    Object object;
                    block7: {
                        try {
                            object = this.zzd;
                            zzbbh zzbbh2 = null;
                            boolean bl2 = true;
                            boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
                            if (!bl3) break block6;
                            object = this.zzg;
                            ((zzfcr)object).zzj();
                            object = this.zzk;
                            if (object == null) break block7;
                            zzbbh2 = zzu.zzb();
                            zzbbh2.zze((zzbbg)object);
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    if ((object = this.zza) != null) {
                        long l2 = this.zzj;
                        long l3 = -1;
                        long l4 = l2 - l3;
                        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (object2 != false) {
                            object = zzu.zzB();
                            l2 = object.elapsedRealtime();
                            l3 = this.zzj;
                            l3 = l2 - l3;
                        }
                        object = this.zza;
                        ((zzcrz)object).zze(l3, n3);
                    }
                    this.zzx();
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzA() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzB() {
        synchronized (this) {
            String string2 = "resume must be called on the main UI thread.";
            Preconditions.checkMainThread(string2);
            return;
        }
    }

    public final void zzC(zzbe zzbe2) {
    }

    public final void zzD(zzbh zzbh2) {
    }

    public final void zzE(zzby zzby2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzF(zzq object) {
        synchronized (this) {
            object = "setAdSize must be called on the main UI thread.";
            Preconditions.checkMainThread((String)object);
            return;
        }
    }

    public final void zzG(zzcb zzcb2) {
    }

    public final void zzH(zzbcj zzbcj2) {
        this.zzg.zzo(zzbcj2);
    }

    public final void zzI(zzw zzw2) {
        this.zzf.zzl(zzw2);
    }

    public final void zzJ(zzci zzci2) {
    }

    public final void zzK(zzdu zzdu2) {
    }

    public final void zzL(boolean bl2) {
    }

    public final void zzM(zzbvp zzbvp2) {
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzN(boolean bl2) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzO(zzbfk zzbfk2) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final void zzP(zzdg zzdg2) {
    }

    public final void zzQ(zzbvs zzbvs2, String string2) {
    }

    public final void zzR(String string2) {
    }

    public final void zzS(zzbyn zzbyn2) {
    }

    public final void zzT(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzU(zzfk zzfk2) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzX() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean zzY() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzZ() {
        synchronized (this) {
            zzfct zzfct2 = this.zzf;
            return zzfct2.zza();
        }
    }

    public final void zza() {
        this.zzq(3);
    }

    public final boolean zzaa() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzab(zzl var1_1) {
        synchronized (this) {
            block9: {
                try {
                    var2_3 = zzbgi.zzd;
                    var2_3 = var2_3.zze();
                    var2_3 = (Boolean)var2_3;
                    var3_4 = var2_3.booleanValue();
                    var4_5 = null;
                    if (var3_4 == 0) ** GOTO lbl-1000
                    var2_3 = zzbep.zzlg;
                    var5_6 = zzba.zzc();
                    var2_3 = var5_6.zza((zzbeg)var2_3);
                    var3_4 = (var2_3 = (Boolean)var2_3).booleanValue();
                    if (var3_4 != 0) {
                        var3_4 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_4 = 0;
                        var2_3 = null;
                    }
                    var5_6 = this.zzh;
                    var6_7 = var5_6.clientJarVersion;
                    var7_8 = zzbep.zzlh;
                    var8_9 = zzba.zzc();
                    var7_8 = var8_9.zza((zzbeg)var7_8);
                    var7_8 = (Integer)var7_8;
                    var9_10 = var7_8.intValue();
                    if (var6_7 < var9_10 || var3_4 == 0) {
                        var2_3 = "loadAd must be called on the main UI thread.";
                        Preconditions.checkMainThread((String)var2_3);
                    }
                    zzu.zzp();
                    var2_3 = this.zzc;
                    var3_4 = zzt.zzH((Context)var2_3);
                    if (var3_4 != 0 && (var2_3 = var1_1.zzs) == null) {
                        var1_1 = "Failed to load the ad because app ID is missing.";
                        zzm.zzg((String)var1_1);
                        var1_1 = this.zzg;
                        var3_4 = 4;
                        var6_7 = 0;
                        var5_6 = null;
                        var2_3 = zzfiq.zzd(var3_4, null, null);
                        var1_1.zzdB((zze)var2_3);
                        return false;
                    }
                    var3_4 = this.zzZ();
                    if (var3_4 == 0) break block9;
                }
                catch (Throwable var1_2) {}
                return false;
            }
            this.zzd = var2_3 = new AtomicBoolean();
            var2_3 = new zzfcx(this);
            var4_5 = this.zzf;
            var5_6 = this.zze;
            var7_8 = new zzfcy(this);
            return var4_5.zzb((zzl)var1_1, (String)var5_6, (zzepq)var2_3, (zzepr)var7_8);
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzac(zzcf zzcf2) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final Bundle zzd() {
        Bundle bundle = new Bundle();
        return bundle;
    }

    public final void zzdH() {
    }

    public final void zzdk() {
    }

    public final void zzdq() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdr() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        long l2;
                        Object object = this.zza;
                        if (object == null) break block5;
                        object = zzu.zzB();
                        this.zzj = l2 = object.elapsedRealtime();
                        object = this.zza;
                        int n3 = ((zzcrz)object).zza();
                        if (n3 > 0) {
                            zzcrm zzcrm2;
                            Object object2 = this.zzb;
                            object2 = ((zzcjd)object2).zzC();
                            Clock clock = zzu.zzB();
                            this.zzk = zzcrm2 = new zzcrm((ScheduledExecutorService)object2, clock);
                            object2 = new zzfcw(this);
                            zzcrm2.zzd(n3, (Runnable)object2);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdt() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    int n3;
                    long l2;
                    zzcrz zzcrz2;
                    try {
                        zzcrz2 = this.zza;
                        if (zzcrz2 == null) break block5;
                        Clock clock = zzu.zzB();
                        long l3 = clock.elapsedRealtime();
                        l2 = this.zzj;
                        n3 = 1;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    {
                        zzcrz2.zze(l3 -= l2, n3);
                        return;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzdu(int n3) {
        if (n3 != 0) {
            int n4 = 2;
            if ((n3 += -1) != 0) {
                int n7 = 1;
                if (n3 != n7) {
                    if (n3 != n4) {
                        this.zzq(6);
                        return;
                    }
                    this.zzq(3);
                    return;
                }
                this.zzq(4);
                return;
            }
            this.zzq(n4);
            return;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final zzq zzg() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return null;
    }

    public final zzbh zzi() {
        return null;
    }

    public final zzcb zzj() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final zzdn zzk() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final zzdq zzl() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return null;
    }

    public final IObjectWrapper zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        this.zzq(5);
    }

    public final void zzp() {
        Executor executor = this.zzb.zzB();
        zzfcv zzfcv2 = new zzfcv(this);
        executor.execute(zzfcv2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzr() {
        synchronized (this) {
            return this.zze;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final String zzs() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final String zzt() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzx() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object = "destroy must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object);
                    object = this.zza;
                    if (object != null) {
                        ((zzcrz)object).zzb();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzy(zzl zzl2, zzbk zzbk2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzz() {
        synchronized (this) {
            String string2 = "pause must be called on the main UI thread.";
            Preconditions.checkMainThread(string2);
            return;
        }
    }
}

