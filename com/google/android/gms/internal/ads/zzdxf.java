/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzdgh;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzdvm;
import com.google.android.gms.internal.ads.zzdwu;
import com.google.android.gms.internal.ads.zzdwv;
import com.google.android.gms.internal.ads.zzdwy;
import com.google.android.gms.internal.ads.zzdwz;
import com.google.android.gms.internal.ads.zzdxb;
import com.google.android.gms.internal.ads.zzdxd;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfim;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfzb;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzdxf {
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final long zzd;
    private final zzccn zze;
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdst zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdvm zzl;
    private final VersionInfoParcel zzm;
    private final Map zzn;
    private final zzdgh zzo;
    private final zzfmq zzp;
    private boolean zzq;

    public zzdxf(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdst zzdst2, ScheduledExecutorService scheduledExecutorService, zzdvm zzdvm2, VersionInfoParcel versionInfoParcel, zzdgh zzdgh2, zzfmq zzfmq2) {
        long l2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.zze = concurrentHashMap;
        this.zzn = concurrentHashMap = new ConcurrentHashMap();
        this.zzq = true;
        this.zzh = zzdst2;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdvm2;
        this.zzm = versionInfoParcel;
        this.zzo = zzdgh2;
        this.zzp = zzfmq2;
        this.zzd = l2 = zzu.zzB().elapsedRealtime();
        this.zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ long zza(zzdxf zzdxf2) {
        return zzdxf2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzccn zzb(zzdxf zzdxf2) {
        return zzdxf2.zze;
    }

    public static /* bridge */ /* synthetic */ zzdgh zzc(zzdxf zzdxf2) {
        return zzdxf2.zzo;
    }

    public static /* bridge */ /* synthetic */ zzdvm zzd(zzdxf zzdxf2) {
        return zzdxf2.zzl;
    }

    public static /* bridge */ /* synthetic */ zzfmq zze(zzdxf zzdxf2) {
        return zzdxf2.zzp;
    }

    public static /* bridge */ /* synthetic */ Executor zzh(zzdxf zzdxf2) {
        return zzdxf2.zzi;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzdxf zzdxf2, boolean bl2) {
        zzdxf2.zzc = true;
    }

    /*
     * Exception decompiling
     */
    public static /* bridge */ /* synthetic */ void zzj(zzdxf var0, String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 60[TRYBLOCK] [77, 76 : 711->721)] org.json.JSONException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* bridge */ /* synthetic */ void zzk(zzdxf zzdxf2, String string2, boolean bl2, String string3, int n3) {
        zzdxf2.zzv(string2, bl2, string3, n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final ListenableFuture zzu() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                try {
                    object = zzu.zzo();
                    object = ((zzcby)object).zzi();
                    object = object.zzh();
                    object = ((zzcbs)object).zzc();
                    boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                    if (!bl2) {
                        return zzgft.zzh(object);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    object = new zzccn();
                    Object object2 = zzu.zzo();
                    object2 = ((zzcby)object2).zzi();
                    zzdwy zzdwy2 = new zzdwy(this, (zzccn)object);
                    object2.zzr(zzdwy2);
                    return object;
                }
            }
            throw throwable2;
        }
    }

    private final void zzv(String string2, boolean bl2, String string3, int n3) {
        zzbnn zzbnn2 = new zzbnn(string2, bl2, n3, string3);
        this.zzn.put(string2, zzbnn2);
    }

    public final /* synthetic */ Object zzf(zzfmc object) {
        Object object2 = this.zze;
        Boolean bl2 = Boolean.TRUE;
        ((zzccn)object2).zzc(bl2);
        object.zzh(true);
        object2 = this.zzp;
        object = object.zzn();
        ((zzfmq)object2).zzb((zzfmg)object);
        return null;
    }

    public final List zzg() {
        boolean bl2;
        ArrayList<zzbnn> arrayList = new ArrayList<zzbnn>();
        Iterator iterator = this.zzn.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = (zzbnn)this.zzn.get(string2);
            boolean bl3 = ((zzbnn)object).zzb;
            int n3 = ((zzbnn)object).zzc;
            object = ((zzbnn)object).zzd;
            zzbnn zzbnn2 = new zzbnn(string2, bl3, n3, (String)object);
            arrayList.add(zzbnn2);
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzm() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.zzc;
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                Object object = "com.google.android.gms.ads.MobileAds";
                Object object2 = "Timeout.";
                Object object3 = zzu.zzB();
                long l2 = object3.elapsedRealtime();
                long l3 = this.zzd;
                int n3 = (int)(l2 -= l3);
                object3 = null;
                {
                    this.zzv((String)object, false, (String)object2, n3);
                    object = this.zzl;
                    object2 = "com.google.android.gms.ads.MobileAds";
                    object3 = "timeout";
                    ((zzdvm)object).zzb((String)object2, (String)object3);
                    object = this.zzo;
                    object2 = "com.google.android.gms.ads.MobileAds";
                    object3 = "timeout";
                    ((zzdgh)object).zzb((String)object2, (String)object3);
                    object = this.zze;
                    object2 = new Exception();
                    ((zzccn)object).zzd((Throwable)object2);
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzn(String string2, zzbnr object, zzfim object2, List list) {
        String string3 = "Failed to initialize adapter. ";
        Object object3 = "com.google.ads.mediation.admob.AdMobAdapter";
        try {
            boolean bl2 = Objects.equals(string2, object3);
            if (bl2) {
                object.zzf();
                return;
            }
        }
        catch (RemoteException remoteException2222) {
        }
        object3 = this.zzg;
        object3 = ((Reference)object3).get();
        if ((object3 = (Context)object3) == null) {
            object3 = this.zzf;
        }
        ((zzfim)object2).zzi((Context)object3, (zzbnr)object, list);
        return;
        catch (zzfhv zzfhv2) {
            try {
                object2 = new StringBuilder(string3);
                ((StringBuilder)object2).append(string2);
                string2 = " does not implement the initialize() method.";
                ((StringBuilder)object2).append(string2);
                string2 = ((StringBuilder)object2).toString();
                object.zze(string2);
                return;
            }
            catch (RemoteException remoteException3) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", remoteException3);
                return;
            }
        }
        object = new zzfzb(remoteException2222);
        throw object;
    }

    public final /* synthetic */ void zzo(zzccn zzccn2) {
        zzdwv zzdwv2 = new zzdwv(this, zzccn2);
        this.zzi.execute(zzdwv2);
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzq(Object object, zzccn zzccn2, String object2, long l2, zzfmc zzfmc2) {
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    long l3;
                    String string2;
                    try {
                        boolean bl2 = zzccn2.isDone();
                        if (bl2) break block4;
                        string2 = "Timeout.";
                        Clock clock = zzu.zzB();
                        l3 = clock.elapsedRealtime() - l2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    int n3 = (int)l3;
                    this.zzv((String)object2, false, string2, n3);
                    Object object3 = this.zzl;
                    string2 = "timeout";
                    ((zzdvm)object3).zzb((String)object2, string2);
                    object3 = this.zzo;
                    string2 = "timeout";
                    ((zzdgh)object3).zzb((String)object2, string2);
                    object2 = this.zzp;
                    object3 = "Timeout";
                    zzfmc2.zzc((String)object3);
                    zzfmc2.zzh(false);
                    object3 = zzfmc2.zzn();
                    ((zzfmq)object2).zzb((zzfmg)object3);
                    object2 = Boolean.FALSE;
                    zzccn2.zzc(object2);
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
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzr() {
        Object object;
        Object object2;
        Object object3 = (Boolean)zzbgq.zza.zze();
        int n3 = ((Boolean)object3).booleanValue();
        boolean bl2 = true;
        if (n3 == 0) {
            object3 = this.zzm;
            n3 = ((VersionInfoParcel)object3).clientJarVersion;
            object2 = zzbep.zzbO;
            object = zzba.zzc();
            object2 = (Integer)((zzben)object).zza((zzbeg)object2);
            int n4 = (Integer)object2;
            if (n3 >= n4 && (n3 = (int)(this.zzq ? 1 : 0)) != 0) {
                n3 = (int)(this.zza ? 1 : 0);
                if (n3 != 0) return;
                // MONITORENTER : this
                n3 = (int)(this.zza ? 1 : 0);
                if (n3 != 0) {
                    // MONITOREXIT : this
                    return;
                }
                object3 = this.zzl;
                ((zzdvm)object3).zzf();
                object3 = this.zzo;
                ((zzdgh)object3).zzf();
                object3 = this.zze;
                object2 = new zzdxb(this);
                object = this.zzi;
                ((zzccn)object3).addListener((Runnable)object2, (Executor)object);
                this.zza = bl2;
                object3 = this.zzu();
                Object object4 = this.zzk;
                object2 = new zzdwu(this);
                object = zzbep.zzbQ;
                zzben zzben2 = zzba.zzc();
                object = zzben2.zza((zzbeg)object);
                object = (Long)object;
                long l2 = (Long)object;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                object4.schedule((Runnable)object2, l2, timeUnit);
                object4 = new zzdxd(this);
                object2 = this.zzi;
                zzgft.zzr((ListenableFuture)object3, (zzgfp)object4, (Executor)object2);
                // MONITOREXIT : this
                return;
            }
        }
        if ((n3 = this.zza) != 0) return;
        object = null;
        this.zzv("com.google.android.gms.ads.MobileAds", bl2, "", 0);
        object3 = this.zze;
        object2 = Boolean.FALSE;
        ((zzccn)object3).zzc(object2);
        this.zza = bl2;
        this.zzb = bl2;
    }

    public final void zzs(zzbnu object) {
        zzdwz zzdwz2 = new zzdwz(this, (zzbnu)object);
        object = this.zzj;
        this.zze.addListener(zzdwz2, (Executor)object);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}

