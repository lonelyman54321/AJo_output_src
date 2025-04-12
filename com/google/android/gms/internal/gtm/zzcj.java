/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteException
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.analytics.zzh;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzay;
import com.google.android.gms.internal.gtm.zzbd;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbw;
import com.google.android.gms.internal.gtm.zzcb;
import com.google.android.gms.internal.gtm.zzcd;
import com.google.android.gms.internal.gtm.zzch;
import com.google.android.gms.internal.gtm.zzci;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzcv;
import com.google.android.gms.internal.gtm.zzcx;
import com.google.android.gms.internal.gtm.zzcy;
import com.google.android.gms.internal.gtm.zzeg;
import com.google.android.gms.internal.gtm.zzeh;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzep;
import com.google.android.gms.internal.gtm.zzer;
import com.google.android.gms.internal.gtm.zzeu;
import com.google.android.gms.internal.gtm.zzev;
import com.google.android.gms.internal.gtm.zzfa;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzff;
import com.google.android.gms.internal.gtm.zzfg;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzcj
extends zzbr {
    private boolean zza;
    private final zzcd zzb;
    private final zzer zzc;
    private final zzep zzd;
    private final zzcb zze;
    private long zzf;
    private final zzcv zzg;
    private final zzcv zzh;
    private final zzfb zzi;
    private long zzj;
    private boolean zzk;

    public zzcj(zzbu zzbu2, zzbv object) {
        super(zzbu2);
        Preconditions.checkNotNull(object);
        this.zzf = Long.MIN_VALUE;
        super(zzbu2);
        this.zzd = object;
        super(zzbu2);
        this.zzb = object;
        super(zzbu2);
        this.zzc = object;
        super(zzbu2);
        this.zze = object;
        Clock clock = this.zzC();
        super(clock);
        this.zzi = object;
        super(this, zzbu2);
        this.zzg = object;
        super(this, zzbu2);
        this.zzh = object;
    }

    private final void zzaf() {
        zzcx zzcx2 = this.zzy();
        boolean bl2 = zzcx2.zze();
        if (bl2) {
            zzcx2.zza();
        }
    }

    private final void zzag() {
        Object object = this.zzg;
        boolean bl2 = ((zzcv)object).zzh();
        if (bl2) {
            object = "All hits dispatched or no network/service. Going to power save mode";
            this.zzN((String)object);
        }
        this.zzg.zzf();
    }

    private final void zzah() {
        zzcx zzcx2 = this.zzy();
        boolean bl2 = zzcx2.zzc();
        if (bl2 && !(bl2 = zzcx2.zze())) {
            long l2;
            zzr.zzh();
            this.zzV();
            long l3 = 0L;
            Object object = this.zzb;
            try {
                l2 = ((zzcd)object).zzc();
            }
            catch (SQLiteException sQLiteException) {
                String string2 = "Failed to get min/max hit times from local store";
                this.zzJ(string2, (Object)sQLiteException);
                l2 = l3;
            }
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 != false) {
                Object object2 = this.zzC();
                l3 = Math.abs(object2.currentTimeMillis() - l2);
                this.zzw();
                object = (Long)zzeh.zzh.zzb();
                l2 = (Long)object;
                l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                if (l4 <= 0) {
                    this.zzw();
                    l3 = zzcs.zzd();
                    object2 = l3;
                    String string3 = "Dispatch alarm scheduled (ms)";
                    this.zzO(string3, object2);
                    zzcx2.zzb();
                }
            }
        }
    }

    private final void zzai(zzbw object, zzav zzav2) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(zzav2);
        Object object2 = this.zzt();
        Object object3 = new zza((zzbu)object2);
        object2 = ((zzbw)object).zzc();
        ((zza)object3).zzc((String)object2);
        boolean bl3 = ((zzbw)object).zzf();
        ((zza)object3).zzd(bl3);
        object3 = ((zza)object3).zza();
        object2 = (zzbd)((zzh)object3).zzb(zzbd.class);
        ((zzbd)object2).zzk("data");
        boolean bl4 = true;
        ((zzbd)object2).zzl(bl4);
        ((zzh)object3).zzg(zzav2);
        zzay zzay2 = (zzay)((zzh)object3).zzb(zzay.class);
        zzau zzau2 = (zzau)((zzh)object3).zzb(zzau.class);
        Iterator iterator = ((zzbw)object).zzd().entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object4 = iterator.next();
            String string2 = (String)object4.getKey();
            object4 = (String)object4.getValue();
            String string3 = "an";
            boolean bl5 = string3.equals(string2);
            if (bl5) {
                zzau2.zzk((String)object4);
                continue;
            }
            string3 = "av";
            bl5 = string3.equals(string2);
            if (bl5) {
                zzau2.zzl((String)object4);
                continue;
            }
            string3 = "aid";
            bl5 = string3.equals(string2);
            if (bl5) {
                zzau2.zzi((String)object4);
                continue;
            }
            string3 = "aiid";
            bl5 = string3.equals(string2);
            if (bl5) {
                zzau2.zzj((String)object4);
                continue;
            }
            string3 = "uid";
            bl5 = string3.equals(string2);
            if (bl5) {
                ((zzbd)object2).zzm((String)object4);
                continue;
            }
            zzay2.zze(string2, (String)object4);
        }
        object = ((zzbw)object).zzc();
        this.zzG("Sending installation campaign to", object, zzav2);
        long l2 = this.zzA().zza();
        ((zzh)object3).zzj(l2);
        ((zzh)object3).zzk();
    }

    private final boolean zzaj(String string2) {
        PackageManagerWrapper packageManagerWrapper = Wrappers.packageManager(this.zzo());
        int n3 = packageManagerWrapper.checkCallingOrSelfPermission(string2);
        return n3 == 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzcj zzcj2) {
        Object object = zzcj2.zzb;
        try {
            ((zzcd)object).zza();
            zzcj2.zzad();
        }
        catch (SQLiteException sQLiteException) {
            String string2 = "Failed to delete stale hits";
            zzcj2.zzR(string2, (Object)sQLiteException);
        }
        object = zzcj2.zzh;
        zzcj2.zzw();
        ((zzcv)object).zzg(86400000L);
    }

    public static /* bridge */ /* synthetic */ void zze(zzcj zzcj2) {
        zzci zzci2 = new zzci(zzcj2);
        long l2 = zzcj2.zzj;
        zzcj2.zzg(zzci2, l2);
    }

    public final void zzY(long l2) {
        zzr.zzh();
        this.zzV();
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 < 0) {
            l2 = l3;
        }
        this.zzf = l2;
        this.zzad();
    }

    public final void zzZ() {
        this.zzV();
        boolean bl2 = this.zza;
        boolean bl3 = true;
        Preconditions.checkState(bl2 ^ bl3, "Analytics backend already started");
        this.zza = bl3;
        zzr zzr2 = this.zzq();
        zzch zzch2 = new zzch(this);
        zzr2.zzi(zzch2);
    }

    public final long zza() {
        long l2 = this.zzf;
        long l3 = Long.MIN_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            return l2;
        }
        this.zzw();
        Object object2 = (Long)zzeh.zze.zzb();
        l2 = (Long)object2;
        zzfg zzfg2 = this.zzB();
        zzfg2.zzV();
        boolean bl2 = zzfg2.zzc;
        if (bl2) {
            object2 = this.zzB();
            ((zzbr)object2).zzV();
            int n3 = ((zzfg)object2).zzd;
            l2 = n3;
            l3 = 1000L;
            l2 *= l3;
        }
        return l2;
    }

    public final void zzaa() {
        this.zzV();
        this.zzw();
        zzr.zzh();
        Object object = this.zzt().zza();
        boolean bl2 = zzev.zzb((Context)object);
        if (!bl2) {
            String string2 = "AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.";
            this.zzQ(string2);
        } else {
            bl2 = zzfa.zzh((Context)object);
            if (!bl2) {
                String string3 = "AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.";
                this.zzI(string3);
            }
        }
        boolean bl3 = CampaignTrackingReceiver.zzb((Context)object);
        if (!bl3) {
            object = "CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.";
            this.zzQ((String)object);
        }
        this.zzA().zza();
        object = "android.permission.ACCESS_NETWORK_STATE";
        bl3 = this.zzaj((String)object);
        if (!bl3) {
            object = "Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions";
            this.zzI((String)object);
            this.zzac();
        }
        if (!(bl3 = this.zzaj((String)(object = "android.permission.INTERNET")))) {
            object = "Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions";
            this.zzI((String)object);
            this.zzac();
        }
        if (bl3 = zzfa.zzh((Context)(object = this.zzo()))) {
            object = "AnalyticsService registered in the app manifest and enabled";
            this.zzN((String)object);
        } else {
            this.zzw();
            object = "AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.";
            this.zzQ((String)object);
        }
        bl3 = this.zzk;
        if (!bl3) {
            this.zzw();
            object = this.zzb;
            bl3 = ((zzcd)object).zzab();
            if (!bl3) {
                this.zzi();
            }
        }
        this.zzad();
    }

    public final void zzab() {
        Exception exception2;
        block6: {
            block5: {
                zzeu zzeu2;
                zzr.zzh();
                this.zzV();
                Object object = "Sync dispatching local hits";
                this.zzE((String)object);
                long l2 = this.zzj;
                this.zzw();
                this.zzi();
                try {
                    this.zzae();
                    zzeu2 = this.zzA();
                }
                catch (Exception exception2) {}
                zzeu2.zzi();
                this.zzad();
                long l3 = this.zzj;
                long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                if (l4 == false) break block5;
                object = this.zzd;
                ((zzep)((Object)object)).zzb();
                return;
                break block6;
            }
            return;
        }
        this.zzJ("Sync local dispatch failed", exception2);
        this.zzad();
    }

    public final void zzac() {
        this.zzV();
        zzr.zzh();
        this.zzk = true;
        this.zze.zzc();
        this.zzad();
    }

    public final void zzad() {
        zzr.zzh();
        this.zzV();
        boolean bl2 = this.zzk;
        if (!bl2) {
            this.zzw();
            long l2 = this.zza();
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 > 0) {
                Object object = this.zzb;
                bl2 = ((zzcd)object).zzab();
                if (bl2) {
                    this.zzd.zzc();
                    this.zzag();
                    this.zzaf();
                    return;
                }
                object = (Boolean)zzeh.zzz.zzb();
                bl2 = (Boolean)object;
                if (!bl2) {
                    this.zzd.zza();
                    object = this.zzd;
                    bl2 = ((zzep)((Object)object)).zzd();
                    if (!bl2) {
                        this.zzag();
                        this.zzaf();
                        this.zzah();
                        return;
                    }
                }
                this.zzah();
                l2 = this.zza();
                zzeu zzeu2 = this.zzA();
                long l7 = zzeu2.zzb();
                Object object2 = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
                if (object2 != false) {
                    Clock clock = this.zzC();
                    long l8 = clock.currentTimeMillis() - l7;
                    l7 = Math.abs(l8);
                    long l12 = (l7 = l2 - l7) - l3;
                    object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object2 <= 0) {
                        this.zzw();
                        l3 = zzcs.zze();
                        l7 = Math.min(l3, l2);
                    }
                } else {
                    this.zzw();
                    l3 = zzcs.zze();
                    l7 = Math.min(l3, l2);
                }
                object = l7;
                String string2 = "Dispatch scheduled (ms)";
                this.zzO(string2, object);
                object = this.zzg;
                bl2 = ((zzcv)object).zzh();
                if (bl2) {
                    l2 = this.zzg.zzb();
                    object = this.zzg;
                    long l14 = Math.max(1L, l7 += l2);
                    ((zzcv)object).zze(l14);
                    return;
                }
                this.zzg.zzg(l7);
                return;
            }
        }
        this.zzd.zzc();
        this.zzag();
        this.zzaf();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzae() {
        SQLiteException sQLiteException5;
        block24: {
            Throwable throwable2;
            Object object;
            block23: {
                Object object2;
                block22: {
                    SQLiteException sQLiteException22;
                    zzr.zzh();
                    this.zzV();
                    this.zzN("Dispatching a batch of local hits");
                    object2 = this.zze;
                    int n3 = ((zzcb)object2).zzg();
                    int n4 = 1;
                    if (n3 == 0) {
                        this.zzw();
                        n3 = 1;
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    Serializable serializable = this.zzc;
                    int n7 = ((zzer)((Object)serializable)).zze();
                    if (n3 != 0 && (n4 ^= n7) != 0) {
                        this.zzN("No network or service available. Will retry later");
                        return false;
                    }
                    this.zzw();
                    n3 = zzcs.zzh();
                    this.zzw();
                    n4 = zzcs.zzg();
                    n3 = Math.max(n3, n4);
                    long l2 = n3;
                    serializable = new ArrayList();
                    long l3 = 0L;
                    while (true) {
                        boolean bl2;
                        long l4;
                        boolean bl3;
                        Object object3;
                        block21: {
                            object3 = this.zzb;
                            ((zzcd)object3).zzm();
                            ((ArrayList)serializable).clear();
                            try {
                                object3 = this.zzb;
                                object3 = ((zzcd)object3).zzj(l2);
                                bl3 = object3.isEmpty();
                                if (!bl3) break block21;
                                object2 = "Store is empty, nothing to dispatch";
                                this.zzN((String)object2);
                                this.zzag();
                                this.zzaf();
                                break block22;
                            }
                            catch (SQLiteException sQLiteException22) {
                                break;
                            }
                        }
                        Object object4 = "Hits loaded from store. count";
                        int n8 = object3.size();
                        Object object5 = n8;
                        this.zzO((String)object4, object5);
                        object4 = object3.iterator();
                        while ((n8 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                            object5 = object4.next();
                            l4 = ((zzek)(object5 = (zzek)object5)).zzb();
                            long l7 = l4 - l3;
                            Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                            if (object6 != false) continue;
                            object2 = "Database contains successfully uploaded hit";
                            Long l8 = l3;
                            n7 = object3.size();
                            serializable = Integer.valueOf(n7);
                            this.zzK((String)object2, l8, serializable);
                            this.zzag();
                            this.zzaf();
                            break block22;
                        }
                        object4 = this.zze;
                        bl3 = ((zzcb)object4).zzg();
                        if (bl3) {
                            this.zzw();
                            object4 = "Service connected, sending hits to the service";
                            this.zzN((String)object4);
                            while (!(bl3 = object3.isEmpty())) {
                                object4 = object3.get(0);
                                object5 = this.zze;
                                n8 = (int)(((zzcb)object5).zzh((zzek)(object4 = (zzek)object4)) ? 1 : 0);
                                if (n8 == 0) break;
                                l4 = ((zzek)object4).zzb();
                                l3 = Math.max(l3, l4);
                                object3.remove(object4);
                                object5 = "Hit sent do device AnalyticsService for delivery";
                                this.zzF((String)object5, object4);
                                try {
                                    object5 = this.zzb;
                                    long l12 = ((zzek)object4).zzb();
                                    ((zzcd)object5).zzn(l12);
                                    long l14 = ((zzek)object4).zzb();
                                    object4 = l14;
                                    ((ArrayList)serializable).add(object4);
                                }
                                catch (SQLiteException sQLiteException3) {
                                    String string2 = "Failed to remove hit that was send for delivery";
                                    this.zzJ(string2, (Object)sQLiteException3);
                                    this.zzag();
                                    this.zzaf();
                                    break block22;
                                }
                            }
                        }
                        if (bl3 = ((zzer)(object4 = this.zzc)).zze()) {
                            object4 = this.zzc;
                            object3 = ((zzer)object4).zzc((List)object3);
                            object4 = object3.iterator();
                            while ((n8 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                                object5 = object4.next();
                                object5 = (Long)object5;
                                l4 = (Long)object5;
                                l3 = Math.max(l3, l4);
                            }
                            try {
                                object4 = this.zzb;
                                ((zzcd)object4).zzY((List)object3);
                                ((ArrayList)serializable).addAll(object3);
                            }
                            catch (SQLiteException sQLiteException4) {
                                String string3 = "Failed to remove successfully uploaded hits";
                                this.zzJ(string3, (Object)sQLiteException4);
                                this.zzag();
                                this.zzaf();
                                break block22;
                            }
                        }
                        if (bl2 = ((ArrayList)serializable).isEmpty()) break block22;
                        object3 = this.zzb;
                        ((zzcd)object3).zzaa();
                        object3 = this.zzb;
                        ((zzcd)object3).zzZ();
                        continue;
                        break;
                    }
                    object = "Failed to read hits from persisted store";
                    try {
                        this.zzR((String)object, (Object)sQLiteException22);
                        this.zzag();
                        this.zzaf();
                    }
                    catch (Throwable throwable2) {
                        break block23;
                    }
                }
                try {
                    object2 = this.zzb;
                    ((zzcd)object2).zzaa();
                    object2 = this.zzb;
                    ((zzcd)object2).zzZ();
                    return false;
                }
                catch (SQLiteException sQLiteException5) {}
                break block24;
            }
            object = this.zzb;
            ((zzcd)object).zzaa();
            object = this.zzb;
            ((zzcd)object).zzZ();
            throw throwable2;
        }
        this.zzJ("Failed to commit local dispatch transaction", (Object)sQLiteException5);
        this.zzag();
        this.zzaf();
        return false;
    }

    /*
     * Exception decompiling
     */
    public final long zzb(zzbw var1_1, boolean var2_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [25, 24 : 145->149)] java.lang.Throwable
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

    public final void zzd() {
        this.zzb.zzW();
        this.zzc.zzW();
        this.zze.zzW();
    }

    public final void zzf(zzcy zzcy2) {
        long l2 = this.zzj;
        this.zzg(zzcy2, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(zzcy zzcy2, long l2) {
        Exception exception2;
        block7: {
            long l3;
            long l4;
            long l7;
            block6: {
                zzr.zzh();
                this.zzV();
                Object object = this.zzA();
                l7 = ((zzeu)object).zzb();
                long l8 = 0L;
                long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
                if (l12 != false) {
                    Clock clock = this.zzC();
                    l8 = clock.currentTimeMillis() - l7;
                    l7 = Math.abs(l8);
                } else {
                    l7 = -1;
                }
                object = l7;
                String string2 = "Dispatching local hits. Elapsed time since last dispatch (ms)";
                this.zzF(string2, object);
                this.zzw();
                this.zzi();
                try {
                    this.zzae();
                    object = this.zzA();
                    ((zzeu)object).zzi();
                    this.zzad();
                    if (zzcy2 == null) break block6;
                    object = null;
                    zzcy2.zza(null);
                }
                catch (Exception exception2) {
                    break block7;
                }
            }
            if ((l4 = (l3 = (l7 = this.zzj) - l2) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) return;
            zzep zzep2 = this.zzd;
            zzep2.zzb();
            return;
        }
        this.zzJ("Local dispatch failed", exception2);
        zzeu zzeu2 = this.zzA();
        zzeu2.zzi();
        this.zzad();
        if (zzcy2 == null) return;
        zzcy2.zza(exception2);
    }

    public final void zzh() {
        zzr.zzh();
        this.zzV();
        this.zzw();
        Object object = "Delete all hits from local store";
        this.zzN((String)object);
        object = this.zzb;
        zzr.zzh();
        ((zzbr)object).zzV();
        object = ((zzcd)object).zzf();
        String string2 = "hits2";
        object.delete(string2, null, null);
        object = this.zzb;
        zzr.zzh();
        ((zzbr)object).zzV();
        object = ((zzcd)object).zzf();
        string2 = "properties";
        try {
            object.delete(string2, null, null);
            this.zzad();
        }
        catch (SQLiteException sQLiteException) {
            string2 = "Failed to delete hits from store";
            this.zzR(string2, (Object)sQLiteException);
        }
        this.zzi();
        object = this.zze;
        boolean bl2 = ((zzcb)object).zze();
        if (bl2) {
            object = "Device service unavailable. Can't clear hits stored on the device service.";
            this.zzN((String)object);
        }
    }

    public final void zzi() {
        boolean bl2 = this.zzk;
        if (!bl2) {
            Object object;
            this.zzw();
            bl2 = zzcs.zzl();
            if (bl2 && !(bl2 = ((zzcb)(object = this.zze)).zzg())) {
                this.zzw();
                object = (Long)zzeh.zzC.zzb();
                long l2 = (Long)object;
                zzfb zzfb2 = this.zzi;
                bl2 = zzfb2.zzc(l2);
                if (bl2) {
                    this.zzi.zzb();
                    this.zzN("Connecting to service");
                    object = this.zze;
                    bl2 = ((zzcb)object).zzf();
                    if (bl2) {
                        this.zzN("Connected to service");
                        object = this.zzi;
                        ((zzfb)object).zza();
                        this.zzm();
                    }
                }
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(zzek var1_1) {
        block30: {
            var2_2 = this;
            var3_3 = var1_1;
            var4_11 = "hit_id";
            Preconditions.checkNotNull(var1_1);
            zzr.zzh();
            this.zzV();
            var5_12 = this.zzk;
            if (var5_12) {
                var6_13 = "Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions";
                this.zzE((String)var6_13);
            } else {
                var6_13 = "Delivering hit";
                this.zzO((String)var6_13, var1_1);
            }
            var6_13 = var1_1.zzf();
            var5_12 = TextUtils.isEmpty((CharSequence)var6_13);
            if (var5_12 && (var6_13 = this.zzA().zze().zza()) != null) {
                var7_14 = (Long)var6_13.second;
                var6_13 = (String)var6_13.first;
                var8_15 = new StringBuilder();
                var8_15.append(var7_14);
                var8_15.append(":");
                var8_15.append((String)var6_13);
                var6_13 = var8_15.toString();
                var8_15 = var1_1.zzg();
                var7_14 = new HashMap<Object, Object>((Map<Object, Object>)var8_15);
                var8_15 = "_m";
                var7_14.put(var8_15, var6_13);
                var3_3 = zzek.zze(var2_2, (zzek)var3_3, var7_14);
            }
            var6_13 = var3_3;
            this.zzi();
            var3_3 = var2_2.zze;
            var9_16 = var3_3.zzh((zzek)var6_13);
            if (var9_16 != 0) {
                var2_2.zzE("Hit sent to the device AnalyticsService for delivery");
                return;
            }
            this.zzw();
            try {
                var7_14 = var2_2.zzb;
                Preconditions.checkNotNull(var6_13);
                zzr.zzh();
                var7_14.zzV();
                Preconditions.checkNotNull(var6_13);
                var3_3 = new Uri.Builder();
                var8_15 = var6_13.zzg();
                var8_15 = var8_15.entrySet();
                var8_15 = var8_15.iterator();
                while ((var10_17 = var8_15.hasNext()) != 0) {
                    var11_18 /* !! */  = var8_15.next();
                    var11_18 /* !! */  = (Map.Entry)var11_18 /* !! */ ;
                    var12_19 /* !! */  = var11_18 /* !! */ .getKey();
                    var13_20 = "ht";
                    var14_21 = var13_20.equals(var12_19 /* !! */  = (String)var12_19 /* !! */ );
                    if (var14_21 != 0 || (var14_21 = (var13_20 = "qt").equals(var12_19 /* !! */ )) != 0 || (var14_21 = (var13_20 = "AppUID").equals(var12_19 /* !! */ )) != 0) continue;
                    var11_18 /* !! */  = var11_18 /* !! */ .getValue();
                    var11_18 /* !! */  = (String)var11_18 /* !! */ ;
                    var3_3.appendQueryParameter(var12_19 /* !! */ , var11_18 /* !! */ );
                }
                var3_3 = var3_3.build();
                if ((var3_3 = var3_3.getEncodedQuery()) == null) {
                    var3_3 = "";
                }
                var8_15 = var3_3;
                var9_16 = var3_3.length();
                if (var9_16 > (var10_17 = 8192)) {
                    var3_3 = var7_14.zzz();
                    var4_11 = "Hit length exceeds the maximum allowed size";
                    var3_3.zzb((zzek)var6_13, (String)var4_11);
lbl76:
                    // 4 sources

                    while (true) {
                        this.zzad();
                        return;
                    }
                }
                var7_14.zzw();
                var3_3 = zzeh.zzc;
                var3_3 = var3_3.zzb();
                var3_3 = (Integer)var3_3;
                var9_16 = var3_3.intValue();
                var15_22 = var7_14.zzb();
                var14_21 = var9_16 + -1;
            }
            catch (SQLiteException var3_4) {
                break block30;
            }
            var17_23 = var14_21;
            var19_24 = null;
            var20_25 = var15_22 == var17_23 ? 0 : (var15_22 < var17_23 ? -1 : 1);
            if (var20_25 <= 0) ** GOTO lbl125
            var17_23 = var9_16;
            var15_22 -= var17_23;
            {
                block37: {
                    zzr.zzh();
                    var7_14.zzV();
                    var17_23 = 0L;
                    var9_16 = (int)((cfr_temp_0 = ++var15_22 - var17_23) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var9_16 > 0) break block37;
                    var3_3 = Collections.emptyList();
                    ** GOTO lbl-1000
                }
                var21_26 = var7_14.zzf();
                var13_20 = new Object();
                var22_27 = "hits2";
            }
            var23_28 = new String[]{var4_11};
            var3_3 = new StringBuilder();
            var3_3.append((String)var4_11);
            var4_11 = " ASC";
            var3_3.append((String)var4_11);
            var24_29 = var3_3.toString();
            var25_30 = Long.toString(var15_22);
            var4_11 = var21_26.query(var22_27, var23_28, null, null, null, null, var24_29, var25_30);
            ** GOTO lbl-1000
lbl-1000:
            // 2 sources

            {
                block35: {
                    block36: {
                        block34: {
                            block33: {
                                while (true) {
                                    block32: {
                                        block31: {
                                            var26_31 = var3_3.size();
                                            var4_11 = var26_31;
                                            var11_18 /* !! */  = "Store full, deleting hits to make room, count";
                                            var7_14.zzR((String)var11_18 /* !! */ , var4_11);
                                            var7_14.zzY((List)var3_3);
lbl125:
                                            // 2 sources

                                            var3_3 = var7_14.zzf();
                                            var4_11 = new ContentValues();
                                            var11_18 /* !! */  = "hit_string";
                                            var4_11.put(var11_18 /* !! */ , (String)var8_15);
                                            var27_32 = var6_13.zzd();
                                            var8_15 = var27_32;
                                            var11_18 /* !! */  = "hit_time";
                                            var4_11.put(var11_18 /* !! */ , (Long)var8_15);
                                            var29_33 = var6_13.zza();
                                            var8_15 = var29_33;
                                            var11_18 /* !! */  = "hit_app_id";
                                            var4_11.put(var11_18 /* !! */ , (Integer)var8_15);
                                            var29_33 = (int)var6_13.zzh();
                                            if (var29_33 != 0) {
                                                var7_14.zzw();
                                                var8_15 = zzcs.zzi();
                                            } else {
                                                var7_14.zzw();
                                                var8_15 = zzcs.zzk();
                                            }
                                            var11_18 /* !! */  = "hit_url";
                                            var4_11.put(var11_18 /* !! */ , (String)var8_15);
                                            var8_15 = "hits2";
                                            try {
                                                var27_32 = var3_3.insert((String)var8_15, null, (ContentValues)var4_11);
                                                var30_34 = -1;
                                                var9_16 = (int)(var27_32 == var30_34 ? 0 : (var27_32 < var30_34 ? -1 : 1));
                                                if (var9_16 != 0) break block31;
                                                var3_3 = "Failed to insert a hit (got -1)";
                                                var7_14.zzI((String)var3_3);
                                                ** GOTO lbl76
                                            }
                                            catch (SQLiteException var3_10) {
                                                break block32;
                                            }
                                        }
                                        var3_3 = "Hit saved to database. db-id, hit";
                                        var4_11 = var27_32;
                                        var7_14.zzG((String)var3_3, var4_11, var6_13);
                                        ** GOTO lbl76
                                    }
                                    var4_11 = "Error storing a hit";
                                    var7_14.zzJ((String)var4_11, (Object)var3_10);
                                    ** continue;
                                    break;
                                }
lbl-1000:
                                // 1 sources

                                try {}
                                catch (SQLiteException var3_6) {}
                                finally {
                                    break block33;
                                }
                                catch (SQLiteException var3_7) {
                                    break block34;
                                }
                                catch (Throwable var3_8) {
                                    break block35;
                                }
                            }
                            var9_16 = (int)var4_11.moveToFirst();
                            if (var9_16 == 0) ** GOTO lbl-1000
                            do {
                                var9_16 = 0;
                                var3_3 = null;
                                var15_22 = var4_11.getLong(0);
                                var3_3 = var15_22;
                                var13_20.add(var3_3);
                            } while ((var9_16 = (int)var4_11.moveToNext()) != 0);
lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    var4_11.close();
                                    break block36;
                                    break;
                                }
                            }
                        }
                        var26_31 = 0;
                        var4_11 = null;
                        var11_18 /* !! */  = "Error selecting hit ids";
                        {
                            var7_14.zzR((String)var11_18 /* !! */ , var3_3);
                            if (var4_11 != null) ** continue;
                        }
                    }
                    var3_3 = var13_20;
                    ** continue;
                }
                if (var19_24 != null) {
                    var19_24.close();
                }
                throw var3_9;
            }
        }
        var2_2.zzJ("Delivery failed to save hit to a database", (Object)var3_4);
        this.zzz().zzb((zzek)var6_13, "deliver: failed to insert hit to database");
    }

    public final void zzk(zzbw zzbw2) {
        boolean bl2;
        zzr.zzh();
        Object object = zzbw2.zzc();
        String string2 = "Sending first hit to property";
        this.zzF(string2, object);
        object = this.zzA().zzf();
        this.zzw();
        long l2 = zzcs.zzc();
        boolean bl3 = ((zzfb)object).zzc(l2);
        if (!bl3 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.zzA().zzg())))) {
            object = zzff.zzb(this.zzz(), (String)object);
            string2 = "Found relevant installation campaign";
            this.zzF(string2, object);
            this.zzai(zzbw2, (zzav)object);
        }
    }

    public final void zzl() {
        long l2;
        zzr.zzh();
        this.zzj = l2 = this.zzC().currentTimeMillis();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm() {
        Object object;
        zzr.zzh();
        this.zzw();
        zzr.zzh();
        this.zzV();
        this.zzw();
        this.zzw();
        boolean bl2 = zzcs.zzl();
        if (!bl2) {
            object = "Service client disabled. Can't dispatch local hits to device AnalyticsService";
            this.zzQ((String)object);
        }
        if (!(bl2 = ((zzcb)(object = this.zze)).zzg())) {
            this.zzN("Service not connected");
            return;
        }
        object = this.zzb;
        bl2 = ((zzcd)object).zzab();
        if (bl2) {
            return;
        }
        object = "Dispatching local hits to device AnalyticsService";
        this.zzN((String)object);
        block5: while (true) {
            int n3;
            try {
                object = this.zzb;
                this.zzw();
                n3 = zzcs.zzh();
                long l2 = n3;
                object = ((zzcd)object).zzj(l2);
                n3 = (int)(object.isEmpty() ? 1 : 0);
                if (n3 != 0) {
                    this.zzad();
                    return;
                }
            }
            catch (SQLiteException sQLiteException) {
                this.zzJ("Failed to read hits from store", (Object)sQLiteException);
                this.zzag();
                this.zzaf();
                return;
            }
            while (true) {
                if ((n3 = (int)(object.isEmpty() ? 1 : 0)) != 0) continue block5;
                n3 = 0;
                zzbr zzbr2 = this.zze;
                zzek zzek2 = (zzek)object.get(0);
                boolean bl3 = ((zzcb)zzbr2).zzh(zzek2);
                if (!bl3) {
                    this.zzad();
                    return;
                }
                object.remove(zzek2);
                try {
                    zzbr2 = this.zzb;
                    long l3 = zzek2.zzb();
                    ((zzcd)zzbr2).zzn(l3);
                }
                catch (SQLiteException sQLiteException) {
                    this.zzJ("Failed to remove hit that was send for delivery", (Object)sQLiteException);
                    this.zzag();
                    this.zzaf();
                    return;
                }
            }
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn(String string2) {
        Throwable throwable2;
        Cursor cursor;
        block15: {
            SQLiteException sQLiteException2;
            Object object;
            Object object2;
            Object object3;
            Iterator iterator;
            zzcj zzcj2;
            block14: {
                zzcj2 = this;
                iterator = string2;
                Preconditions.checkNotEmpty(string2);
                zzr.zzh();
                this.zzw();
                object3 = zzff.zzb(this.zzz(), string2);
                object2 = "0";
                if (object3 == null) {
                    this.zzR("Parsing failed. Ignoring invalid campaign data", string2);
                    return;
                }
                object = this.zzA().zzg();
                int n3 = string2.equals(object);
                if (n3 != 0) {
                    this.zzQ("Ignoring duplicate install campaign");
                    return;
                }
                n3 = TextUtils.isEmpty((CharSequence)object);
                if (n3 == 0) {
                    this.zzK("Ignoring multiple install campaigns. original, new", object, string2);
                    return;
                }
                object = this.zzA();
                ((zzeu)object).zzh(string2);
                iterator = this.zzA().zzf();
                this.zzw();
                long l2 = zzcs.zzc();
                int n4 = ((zzfb)((Object)iterator)).zzc(l2);
                if (n4 != 0) {
                    this.zzR("Campaign received too late, ignoring", object3);
                    return;
                }
                this.zzF("Received installation campaign", object3);
                object = this.zzb;
                ((zzbr)object).zzV();
                zzr.zzh();
                Object object4 = ((zzcd)object).zzf();
                cursor = null;
                iterator = "cid";
                String string3 = "tid";
                String[] stringArray = "adid";
                String string4 = "hits_count";
                String[] stringArray2 = "params";
                try {
                    stringArray = new String[]{iterator, string3, stringArray, string4, stringArray2};
                    ((zzbq)object).zzw();
                    iterator = zzeh.zzd;
                    iterator = ((zzeg)((Object)iterator)).zzb();
                    iterator = (Integer)((Object)iterator);
                    n4 = (Integer)((Object)iterator);
                    String string5 = String.valueOf(n4);
                    string4 = "app_uid=?";
                    stringArray2 = new String[]{object2};
                    string3 = "properties";
                    cursor = object4.query(string3, stringArray, string4, stringArray2, null, null, null, string5);
                    object2 = new ArrayList();
                    n3 = cursor.moveToFirst();
                    if (n3 != 0) {
                        do {
                            n3 = 0;
                            object4 = null;
                            string3 = cursor.getString(0);
                            int n7 = 1;
                            string4 = cursor.getString(n7);
                            int n8 = 2;
                            boolean bl2 = (n8 = cursor.getInt(n8)) != 0;
                            n3 = 3;
                            long l3 = cursor.getInt(n3);
                            n3 = 4;
                            object4 = cursor.getString(n3);
                            Map map2 = ((zzcd)object).zzl((String)object4);
                            n3 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0);
                            if (n3 == 0 && (n3 = (int)(TextUtils.isEmpty((CharSequence)string4) ? 1 : 0)) == 0) {
                                long l4 = 0L;
                                object4 = new zzbw(l4, string3, string4, bl2, l3, map2);
                                ((ArrayList)object2).add(object4);
                                continue;
                            }
                            object4 = "Read property with empty client id or tracker id";
                            ((zzbq)object).zzS((String)object4, string3, string4);
                        } while ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0);
                    }
                    if ((n3 = ((ArrayList)object2).size()) < n4) break block14;
                    iterator = "Sending hits to too many properties. Campaign report might be incorrect";
                    ((zzbq)object).zzQ((String)((Object)iterator));
                }
                catch (Throwable throwable2) {
                    break block15;
                }
                catch (SQLiteException sQLiteException2) {}
            }
            cursor.close();
            iterator = ((ArrayList)object2).iterator();
            while (true) {
                boolean bl3;
                if (!(bl3 = iterator.hasNext())) {
                    return;
                }
                object2 = (zzbw)iterator.next();
                zzcj2.zzai((zzbw)object2, (zzav)object3);
            }
            object3 = "Error loading hits from the database";
            {
                ((zzbq)object).zzJ((String)object3, (Object)sQLiteException2);
                throw sQLiteException2;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }
}

