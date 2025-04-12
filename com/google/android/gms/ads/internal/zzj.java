/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzaww;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfsk;
import com.google.android.gms.internal.ads.zzfte;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

public final class zzj
implements Runnable,
zzawz {
    protected boolean zza;
    final CountDownLatch zzb;
    private final List zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfre zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;

    public zzj(Context object, VersionInfoParcel object2) {
        int n3;
        boolean bl2;
        boolean n32;
        boolean bl22;
        Object object3 = new Vector();
        this.zzc = object3;
        this.zzd = object3;
        super();
        this.zze = object3;
        int n4 = 1;
        this.zzb = object3 = new CountDownLatch(n4);
        this.zzj = object;
        this.zzk = object;
        this.zzl = object2;
        this.zzm = object2;
        this.zzh = object2 = Executors.newCachedThreadPool();
        object3 = zzbep.zzcr;
        zzben zzben2 = zzba.zzc();
        object3 = (Boolean)zzben2.zza((zzbeg)object3);
        this.zzn = bl22 = ((Boolean)object3).booleanValue();
        this.zzi = object = zzfre.zza((Context)object, (Executor)object2, bl22);
        object = zzbep.zzcn;
        this.zzf = n32 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        object = zzbep.zzcs;
        this.zzg = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        object = zzbep.zzcq;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        this.zzo = bl3 ? (n3 = 2) : n4;
        object = zzbep.zzdu;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl4 = (Boolean)object;
        if (!bl4) {
            boolean bl5;
            this.zza = bl5 = this.zzc();
        }
        object = zzbep.zzdn;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl6 = (Boolean)object;
        if (bl6) {
            zzcci.zza.execute(this);
            return;
        }
        zzay.zzb();
        boolean bl7 = com.google.android.gms.ads.internal.util.client.zzf.zzv();
        if (bl7) {
            zzcci.zza.execute(this);
            return;
        }
        this.run();
    }

    public static /* bridge */ /* synthetic */ zzfre zza(zzj zzj2) {
        return zzj2.zzi;
    }

    private final zzawz zzm() {
        int n3;
        int n4 = this.zzi();
        if (n4 == (n3 = 2)) {
            return (zzawz)this.zze.get();
        }
        return (zzawz)this.zzd.get();
    }

    private final void zzp() {
        Object object = this.zzc;
        zzawz zzawz2 = this.zzm();
        boolean bl2 = object.isEmpty();
        if (!bl2 && zzawz2 != null) {
            int n3;
            object = this.zzc.iterator();
            while ((n3 = object.hasNext()) != 0) {
                Object object2 = (MotionEvent)object.next();
                int n4 = ((Object[])object2).length;
                int n7 = 0;
                Integer n8 = null;
                int n10 = 1;
                if (n4 == n10) {
                    object2 = (MotionEvent)object2[0];
                    zzawz2.zzk((MotionEvent)object2);
                    continue;
                }
                int n14 = 3;
                if (n4 != n14) continue;
                Integer n15 = (Integer)object2[0];
                n4 = n15;
                n8 = (Integer)object2[n10];
                n7 = n8;
                n10 = 2;
                object2 = (Integer)object2[n10];
                n3 = (Integer)object2;
                zzawz2.zzl(n4, n7, n3);
            }
            object = this.zzc;
            object.clear();
        }
    }

    private final void zzq(boolean bl2) {
        String string2 = this.zzl.afmaVersion;
        Context context = com.google.android.gms.ads.internal.zzj.zzr(this.zzj);
        int n3 = this.zzo;
        zzaxc zzaxc2 = zzaxc.zzu(string2, context, bl2, n3);
        this.zzd.set(zzaxc2);
    }

    private static final Context zzr(Context context) {
        Context context2 = context.getApplicationContext();
        if (context2 == null) {
            return context;
        }
        return context2;
    }

    /*
     * Exception decompiling
     */
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 45->49)] java.lang.Throwable
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

    public final /* synthetic */ void zzb(boolean bl2) {
        Object object;
        long l2 = System.currentTimeMillis();
        try {
            object = this.zzm;
        }
        catch (NullPointerException nullPointerException) {
            object = this.zzi;
            long l3 = System.currentTimeMillis() - l2;
            ((zzfre)object).zzc(2027, l3, nullPointerException);
            return;
        }
        object = ((VersionInfoParcel)object).afmaVersion;
        Context context = this.zzk;
        context = com.google.android.gms.ads.internal.zzj.zzr(context);
        boolean bl3 = this.zzn;
        zzaww zzaww2 = zzaww.zza((String)object, context, bl2, bl3);
        zzaww2.zzp();
    }

    public final boolean zzc() {
        Object object = this.zzj;
        zzi zzi2 = new zzi(this);
        Object object2 = this.zzi;
        Context context = this.zzj;
        object = zzfsk.zzb(object, (zzfre)object2);
        object2 = zzbep.zzco;
        boolean bl2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        zzfte zzfte2 = new zzfte(context, (zzazw)object, zzi2, bl2);
        return zzfte2.zzd(1);
    }

    public final boolean zzd() {
        CountDownLatch countDownLatch;
        try {
            countDownLatch = this.zzb;
        }
        catch (InterruptedException interruptedException) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted during GADSignals creation.", interruptedException);
            return false;
        }
        countDownLatch.await();
        return true;
    }

    public final String zze(Context context, String string2, View view) {
        return this.zzf(context, string2, view, null);
    }

    public final String zzf(Context context, String string2, View view, Activity activity) {
        boolean bl2 = this.zzd();
        if (bl2) {
            zzawz zzawz2 = this.zzm();
            Object object = zzbep.zzkH;
            zzben zzben2 = zzba.zzc();
            object = (Boolean)zzben2.zza((zzbeg)object);
            boolean n3 = (Boolean)object;
            if (n3) {
                zzu.zzp();
                int n4 = 4;
                zzben2 = null;
                zzt.zzJ(view, n4, null);
            }
            if (zzawz2 != null) {
                this.zzp();
                context = com.google.android.gms.ads.internal.zzj.zzr(context);
                return zzawz2.zzf(context, string2, view, activity);
            }
        }
        return "";
    }

    public final String zzg(Context object) {
        zzawz zzawz2;
        boolean bl2 = this.zzd();
        if (bl2 && (zzawz2 = this.zzm()) != null) {
            this.zzp();
            object = com.google.android.gms.ads.internal.zzj.zzr(object);
            object = zzawz2.zzg((Context)object);
        } else {
            object = "";
        }
        return object;
    }

    public final String zzh(Context context, View view, Activity activity) {
        Object object = zzbep.zzkG;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        int n3 = 2;
        if (bl2) {
            bl2 = this.zzd();
            if (bl2) {
                object = this.zzm();
                Object object2 = zzbep.zzkH;
                zzben zzben2 = zzba.zzc();
                object2 = (Boolean)zzben2.zza((zzbeg)object2);
                boolean bl3 = (Boolean)object2;
                if (bl3) {
                    zzu.zzp();
                    zzt.zzJ(view, n3, null);
                }
                if (object != null) {
                    return object.zzh(context, view, activity);
                }
            }
        } else {
            object = this.zzm();
            Object object3 = zzbep.zzkH;
            zzben zzben3 = zzba.zzc();
            object3 = (Boolean)zzben3.zza((zzbeg)object3);
            boolean bl4 = (Boolean)object3;
            if (bl4) {
                zzu.zzp();
                zzt.zzJ(view, n3, null);
            }
            if (object != null) {
                return object.zzh(context, view, activity);
            }
        }
        return "";
    }

    public final int zzi() {
        boolean bl2 = this.zzf;
        if (bl2 && !(bl2 = this.zza)) {
            return 1;
        }
        return this.zzo;
    }

    public final int zzj() {
        return this.zzo;
    }

    public final void zzk(MotionEvent motionEvent) {
        Object object = this.zzm();
        if (object != null) {
            this.zzp();
            object.zzk(motionEvent);
            return;
        }
        object = this.zzc;
        Object[] objectArray = new Object[]{motionEvent};
        object.add(objectArray);
    }

    public final void zzl(int n3, int n4, int n7) {
        Object object = this.zzm();
        if (object != null) {
            this.zzp();
            object.zzl(n3, n4, n7);
            return;
        }
        object = this.zzc;
        Integer n8 = n3;
        Integer n10 = n4;
        Integer n14 = n7;
        Object[] objectArray = new Object[]{n8, n10, n14};
        object.add(objectArray);
    }

    public final void zzn(StackTraceElement[] stackTraceElementArray) {
        zzawz zzawz2;
        boolean bl2 = this.zzd();
        if (bl2 && (zzawz2 = this.zzm()) != null) {
            zzawz2.zzn(stackTraceElementArray);
        }
    }

    public final void zzo(View view) {
        zzawz zzawz2 = this.zzm();
        if (zzawz2 != null) {
            zzawz2.zzo(view);
        }
    }
}

