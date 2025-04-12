/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.view.ViewGroup
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzcsf;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcze;
import com.google.android.gms.internal.ads.zzdak;
import com.google.android.gms.internal.ads.zzdcb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzeoh;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzfdf;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfiq;
import java.util.Collections;

public final class zzeoi
extends zzbt
implements zzdcb {
    private final Context zza;
    private final zzfdf zzb;
    private final String zzc;
    private final zzepc zzd;
    private zzq zze;
    private final zzfhm zzf;
    private final VersionInfoParcel zzg;
    private final zzdvc zzh;
    private zzcsf zzi;

    public zzeoi(Context object, zzq zzq2, String string2, zzfdf zzfdf2, zzepc zzepc2, VersionInfoParcel versionInfoParcel, zzdvc zzdvc2) {
        this.zza = object;
        this.zzb = zzfdf2;
        this.zze = zzq2;
        this.zzc = string2;
        this.zzd = zzepc2;
        object = zzfdf2.zzi();
        this.zzf = object;
        this.zzg = versionInfoParcel;
        this.zzh = zzdvc2;
        zzfdf2.zzp(this);
    }

    public static /* bridge */ /* synthetic */ zzcsf zzb(zzeoi zzeoi2) {
        return zzeoi2.zzi;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzeoi zzeoi2, zzcsf zzcsf2) {
        zzeoi2.zzi = zzcsf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zze(zzq zzq2) {
        synchronized (this) {
            zzfhm zzfhm2 = this.zzf;
            zzfhm2.zzs(zzq2);
            zzq2 = this.zze;
            boolean bl2 = zzq2.zzn;
            zzfhm2 = this.zzf;
            zzfhm2.zzy(bl2);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzf(zzl object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object2;
                int n3;
                block5: {
                    try {
                        n3 = this.zzh();
                        if (n3 == 0) break block5;
                        object2 = "loadAd must be called on the main UI thread.";
                        Preconditions.checkMainThread((String)object2);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                zzu.zzp();
                object2 = this.zza;
                n3 = zzt.zzH((Context)object2);
                if (n3 != 0 && (object2 = ((zzl)object).zzs) == null) {
                    object = "Failed to load the ad because app ID is missing.";
                    zzm.zzg((String)object);
                    object = this.zzd;
                    if (object == null) return false;
                    n3 = 4;
                    object2 = zzfiq.zzd(n3, null, null);
                    ((zzepc)object).zzdB((zze)object2);
                    return false;
                }
                object2 = this.zza;
                boolean bl2 = ((zzl)object).zzf;
                zzfil.zza((Context)object2, bl2);
                object2 = this.zzb;
                String string2 = this.zzc;
                zzeoh zzeoh2 = new zzeoh(this);
                return ((zzfdf)object2).zzb((zzl)object, string2, null, zzeoh2);
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     */
    private final boolean zzh() {
        var1_1 = (Boolean)zzbgi.zzf.zze();
        var2_2 = var1_1.booleanValue();
        var3_3 = true;
        if (!var2_2) ** GOTO lbl-1000
        var1_1 = zzbep.zzlg;
        var4_4 = zzba.zzc();
        var1_1 = (Boolean)var4_4.zza((zzbeg)var1_1);
        var2_2 = var1_1.booleanValue();
        if (var2_2) {
            var2_2 = true;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = false;
            var1_1 = null;
        }
        var4_4 = this.zzg;
        var5_5 = var4_4.clientJarVersion;
        var6_6 = zzbep.zzlh;
        var7_7 = zzba.zzc();
        var6_6 = (Integer)var7_7.zza((zzbeg)var6_6);
        var8_8 = var6_6.intValue();
        if (var5_5 >= var8_8 && var2_2) {
            return false;
        }
        return var3_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzA() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object = "recordManualImpression must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object);
                    object = this.zzi;
                    if (object != null) {
                        ((zzcsf)object).zzg();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzB() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                int n3;
                Object object;
                Object object2;
                block5: {
                    block4: {
                        try {
                            object2 = zzbgi.zzh;
                            object2 = ((zzbfv)object2).zze();
                            object2 = (Boolean)object2;
                            int n4 = ((Boolean)object2).booleanValue();
                            if (n4 == 0) break block4;
                            object2 = zzbep.zzlc;
                            object = zzba.zzc();
                            object2 = ((zzben)object).zza((zzbeg)object2);
                            n4 = ((Boolean)(object2 = (Boolean)object2)).booleanValue();
                            if (n4 == 0) break block4;
                            object2 = this.zzg;
                            n4 = ((VersionInfoParcel)object2).clientJarVersion;
                            object = zzbep.zzli;
                            zzben zzben2 = zzba.zzc();
                            object = zzben2.zza((zzbeg)object);
                            n3 = (Integer)(object = (Integer)object);
                            if (n4 >= n3) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object2 = "resume must be called on the main UI thread.";
                    Preconditions.checkMainThread((String)object2);
                }
                if ((object2 = this.zzi) != null) {
                    object2 = ((zzcup)object2).zzm();
                    n3 = 0;
                    object = null;
                    ((zzdak)object2).zzc(null);
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzC(zzbe zzbe2) {
        boolean bl2 = this.zzh();
        if (bl2) {
            String string2 = "setAdListener must be called on the main UI thread.";
            Preconditions.checkMainThread(string2);
        }
        this.zzb.zzo(zzbe2);
    }

    public final void zzD(zzbh zzbh2) {
        boolean bl2 = this.zzh();
        if (bl2) {
            String string2 = "setAdListener must be called on the main UI thread.";
            Preconditions.checkMainThread(string2);
        }
        this.zzd.zzj(zzbh2);
    }

    public final void zzE(zzby zzby2) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzF(zzq zzq2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object = "setAdSize must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object);
                    object = this.zzf;
                    ((zzfhm)object).zzs(zzq2);
                    this.zze = zzq2;
                    object = this.zzi;
                    if (object != null) {
                        zzfdf zzfdf2 = this.zzb;
                        zzfdf2 = zzfdf2.zzd();
                        ((zzcsf)object).zzh((ViewGroup)zzfdf2, zzq2);
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

    public final void zzG(zzcb zzcb2) {
        boolean bl2 = this.zzh();
        if (bl2) {
            String string2 = "setAppEventListener must be called on the main UI thread.";
            Preconditions.checkMainThread(string2);
        }
        this.zzd.zzm(zzcb2);
    }

    public final void zzH(zzbcj zzbcj2) {
    }

    public final void zzI(zzw zzw2) {
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzN(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                block3: {
                    try {
                        boolean bl3 = this.zzh();
                        if (!bl3) break block3;
                        object = "setManualImpressionsEnabled must be called from the main thread.";
                        Preconditions.checkMainThread((String)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = this.zzf;
                ((zzfhm)object).zzB(bl2);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzO(zzbfk zzbfk2) {
        synchronized (this) {
            Object object = "setOnCustomRenderedAdLoadedListener must be called on the main UI thread.";
            Preconditions.checkMainThread((String)object);
            object = this.zzb;
            ((zzfdf)object).zzq(zzbfk2);
            return;
        }
    }

    public final void zzP(zzdg zzdg2) {
        block5: {
            Object object;
            boolean bl2 = this.zzh();
            if (bl2) {
                object = "setPaidEventListener must be called on the main UI thread.";
                Preconditions.checkMainThread((String)object);
            }
            bl2 = zzdg2.zzf();
            if (bl2) break block5;
            object = this.zzh;
            try {
                ((zzdvc)object).zze();
            }
            catch (RemoteException remoteException) {
                String string2 = "Error in making CSI ping for reporting paid event callback";
                zzm.zzf(string2, remoteException);
            }
        }
        this.zzd.zzl(zzdg2);
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzU(zzfk zzfk2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                block3: {
                    try {
                        boolean bl2 = this.zzh();
                        if (!bl2) break block3;
                        object = "setVideoOptions must be called on the main UI thread.";
                        Preconditions.checkMainThread((String)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = this.zzf;
                ((zzfhm)object).zzI(zzfk2);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzY() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        boolean bl2;
                        zzcsf zzcsf2 = this.zzi;
                        if (zzcsf2 == null || !(bl2 = zzcsf2.zzr())) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzZ() {
        synchronized (this) {
            zzfdf zzfdf2 = this.zzb;
            return zzfdf2.zza();
        }
    }

    /*
     * Exception decompiling
     */
    public final void zza() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [13 : 94->102)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final boolean zzaa() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzab(zzl zzl2) {
        synchronized (this) {
            zzq zzq2 = this.zze;
            this.zze(zzq2);
            return this.zzf(zzl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzac(zzcf zzcf2) {
        synchronized (this) {
            Object object = "setCorrelationIdProvider must be called on the main UI thread";
            Preconditions.checkMainThread((String)object);
            object = this.zzf;
            ((zzfhm)object).zzU(zzcf2);
            return;
        }
    }

    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        Bundle bundle = new Bundle();
        return bundle;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzq zzg() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object = "getAdSize must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object);
                    object = this.zzi;
                    if (object != null) {
                        Context context = this.zza;
                        object = ((zzcsf)object).zze();
                        object = Collections.singletonList(object);
                        return zzfhu.zza(context, object);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    object = this.zzf;
                    return ((zzfhm)object).zzh();
                }
            }
            throw throwable2;
        }
    }

    public final zzbh zzi() {
        return this.zzd.zzg();
    }

    public final zzcb zzj() {
        return this.zzd.zzi();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzdn zzk() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = zzbep.zzgW;
                    zzben zzben2 = zzba.zzc();
                    object = zzben2.zza((zzbeg)object);
                    object = (Boolean)object;
                    boolean bl2 = (Boolean)object;
                    if (bl2) {
                        object = this.zzi;
                        if (object == null) return null;
                        return ((zzcup)object).zzl();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return null;
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
    public final zzdq zzl() {
        synchronized (this) {
            Object object = "getVideoController must be called from the main thread.";
            try {
                Preconditions.checkMainThread((String)object);
                object = this.zzi;
                if (object == null) return null;
                return ((zzcsf)object).zzd();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final IObjectWrapper zzn() {
        boolean bl2 = this.zzh();
        if (bl2) {
            String string2 = "getAdFrame must be called on the main UI thread.";
            Preconditions.checkMainThread(string2);
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzr() {
        synchronized (this) {
            return this.zzc;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzs() {
        synchronized (this) {
            try {
                Object object = this.zzi;
                if (object == null) return null;
                zzcze zzcze2 = ((zzcup)object).zzl();
                if (zzcze2 == null) return null;
                object = ((zzcup)object).zzl();
                return ((zzcze)object).zzg();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzt() {
        synchronized (this) {
            try {
                Object object = this.zzi;
                if (object == null) return null;
                zzcze zzcze2 = ((zzcup)object).zzl();
                if (zzcze2 == null) return null;
                object = ((zzcup)object).zzl();
                return ((zzcze)object).zzg();
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
    public final void zzx() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                block5: {
                    block4: {
                        try {
                            object = zzbgi.zze;
                            object = ((zzbfv)object).zze();
                            object = (Boolean)object;
                            int n3 = ((Boolean)object).booleanValue();
                            if (n3 == 0) break block4;
                            object = zzbep.zzld;
                            Object object2 = zzba.zzc();
                            object = ((zzben)object2).zza((zzbeg)object);
                            n3 = ((Boolean)(object = (Boolean)object)).booleanValue();
                            if (n3 == 0) break block4;
                            object = this.zzg;
                            n3 = ((VersionInfoParcel)object).clientJarVersion;
                            object2 = zzbep.zzli;
                            zzben zzben2 = zzba.zzc();
                            object2 = zzben2.zza((zzbeg)object2);
                            int n4 = (Integer)(object2 = (Integer)object2);
                            if (n3 >= n4) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object = "destroy must be called on the main UI thread.";
                    Preconditions.checkMainThread((String)object);
                }
                if ((object = this.zzi) != null) {
                    ((zzcup)object).zzb();
                    return;
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
            Throwable throwable2;
            block6: {
                int n3;
                Object object;
                Object object2;
                block5: {
                    block4: {
                        try {
                            object2 = zzbgi.zzg;
                            object2 = ((zzbfv)object2).zze();
                            object2 = (Boolean)object2;
                            int n4 = ((Boolean)object2).booleanValue();
                            if (n4 == 0) break block4;
                            object2 = zzbep.zzle;
                            object = zzba.zzc();
                            object2 = ((zzben)object).zza((zzbeg)object2);
                            n4 = ((Boolean)(object2 = (Boolean)object2)).booleanValue();
                            if (n4 == 0) break block4;
                            object2 = this.zzg;
                            n4 = ((VersionInfoParcel)object2).clientJarVersion;
                            object = zzbep.zzli;
                            zzben zzben2 = zzba.zzc();
                            object = zzben2.zza((zzbeg)object);
                            n3 = (Integer)(object = (Integer)object);
                            if (n4 >= n3) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object2 = "pause must be called on the main UI thread.";
                    Preconditions.checkMainThread((String)object2);
                }
                if ((object2 = this.zzi) != null) {
                    object2 = ((zzcup)object2).zzm();
                    n3 = 0;
                    object = null;
                    ((zzdak)object2).zzb(null);
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }
}

