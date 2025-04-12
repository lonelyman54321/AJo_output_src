/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzawt;
import com.google.android.gms.internal.ads.zzawv;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzaxh;
import com.google.android.gms.internal.ads.zzaxw;
import com.google.android.gms.internal.ads.zzaxx;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzayf;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfqx;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrf;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrx;
import com.google.android.gms.internal.ads.zzfsk;
import com.google.android.gms.internal.ads.zzfsl;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzfsx;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzftf;
import com.google.android.gms.internal.ads.zzftg;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class zzaww
implements zzawz {
    private static zzaww zzb;
    volatile long zza = 0L;
    private final Context zzc;
    private final zzfsx zzd;
    private final zzfte zze;
    private final zzftg zzf;
    private final zzaxy zzg;
    private final zzfre zzh;
    private final Executor zzi;
    private final zzazw zzj;
    private final zzftd zzk;
    private final CountDownLatch zzl;
    private final zzayn zzm;
    private final zzayf zzn;
    private final zzaxw zzo;
    private final Object zzp;
    private volatile boolean zzq;
    private volatile boolean zzr;

    public zzaww(Context object, zzfre zzfre2, zzfsx zzfsx2, zzfte zzfte2, zzftg zzftg2, zzaxy zzaxy2, Executor executor, zzfqx zzfqx2, zzazw zzazw2, zzayn zzayn2, zzayf zzayf2, zzaxw zzaxw2) {
        Object object2;
        this.zzp = object2 = new Object();
        this.zzr = false;
        this.zzc = object;
        this.zzh = zzfre2;
        this.zzd = zzfsx2;
        this.zze = zzfte2;
        this.zzf = zzftg2;
        this.zzg = zzaxy2;
        this.zzi = executor;
        this.zzj = zzazw2;
        this.zzm = zzayn2;
        this.zzn = zzayf2;
        this.zzo = zzaxw2;
        this.zzr = false;
        super(1);
        this.zzl = object;
        super(this, zzfqx2);
        this.zzk = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzaww zza(String object, Context context, boolean bl2, boolean bl3) {
        Class<zzaww> clazz = zzaww.class;
        synchronized (clazz) {
            ExecutorService executorService = Executors.newCachedThreadPool();
            return zzaww.zzb((String)object, context, executorService, bl2, bl3);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzaww zzb(String string2, Context context, Executor executor, boolean bl2, boolean bl3) {
        Object object = context;
        Executor executor2 = executor;
        Class<zzaww> clazz = zzaww.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                zzaxy zzaxy2;
                Object object2;
                Object object3;
                zzfre zzfre2;
                boolean bl4;
                Object object4;
                Object object5;
                try {
                    object5 = zzb;
                    if (object5 != null) return zzb;
                    object5 = zzfrg.zza();
                    object4 = string2;
                    ((zzfrf)object5).zza(string2);
                    bl4 = bl2;
                    ((zzfrf)object5).zzc(bl2);
                    object5 = ((zzfrf)object5).zzd();
                    bl4 = bl3;
                    zzfre2 = zzfre.zza(context, executor, bl3);
                    object4 = zzbep.zzdq;
                    object3 = zzba.zzc();
                    object4 = ((zzben)object3).zza((zzbeg)object4);
                    object4 = (Boolean)object4;
                    bl4 = (Boolean)object4;
                    object3 = null;
                    object2 = bl4 ? (object4 = zzaxh.zzc(context)) : null;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object4 = zzbep.zzdr;
                Object object6 = zzba.zzc();
                object4 = ((zzben)object6).zza((zzbeg)object4);
                object4 = (Boolean)object4;
                bl4 = (Boolean)object4;
                Object object7 = bl4 ? (object4 = zzayn.zzd(context, executor)) : null;
                object4 = zzbep.zzcF;
                object6 = zzba.zzc();
                object4 = ((zzben)object6).zza((zzbeg)object4);
                object4 = (Boolean)object4;
                bl4 = (Boolean)object4;
                Object object8 = bl4 ? (object4 = new zzayf()) : null;
                object4 = zzbep.zzcH;
                object6 = zzba.zzc();
                object4 = ((zzben)object6).zza((zzbeg)object4);
                object4 = (Boolean)object4;
                bl4 = (Boolean)object4;
                Object object9 = bl4 ? (object4 = new zzaxw()) : null;
                zzfrx zzfrx2 = zzfrx.zze((Context)object, executor2, zzfre2, (zzfrg)object5);
                object4 = new zzaxx((Context)object);
                object3 = new zzayl((Context)object, (zzaxx)((Object)object4));
                Object object10 = zzaxy2;
                zzaxy2 = new zzaxy((zzfrg)object5, zzfrx2, (zzayl)object3, (zzaxx)((Object)object4), (zzaxh)object2, (zzayn)object7, (zzayf)object8, (zzaxw)object9);
                zzazw zzazw2 = zzfsk.zzb((Context)object, zzfre2);
                zzfqx zzfqx2 = new zzfqx();
                object3 = new zzfsx((Context)object, zzazw2);
                object5 = new zzawt(zzfre2);
                object4 = zzbep.zzco;
                Object object11 = zzba.zzc();
                object4 = ((zzben)object11).zza((zzbeg)object4);
                object4 = (Boolean)object4;
                bl4 = (Boolean)object4;
                object6 = new zzfte((Context)object, zzazw2, (zzfsl)object5, bl4);
                object11 = new zzftg((Context)object, zzaxy2, zzfre2, zzfqx2);
                object5 = object10;
                object4 = context;
                executor2 = executor;
                zzb = object10 = new zzaww(context, zzfre2, (zzfsx)object3, (zzfte)object6, (zzftg)object11, zzaxy2, executor, zzfqx2, zzazw2, (zzayn)object7, (zzayf)object8, (zzaxw)object9);
                ((zzaww)object10).zzm();
                object = zzb;
                ((zzaww)object).zzp();
                return zzb;
            }
            throw throwable2;
        }
    }

    public static /* bridge */ /* synthetic */ zzfre zzc(zzaww zzaww2) {
        return zzaww2.zzh;
    }

    public static /* bridge */ /* synthetic */ Object zzd(zzaww zzaww2) {
        return zzaww2.zzp;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzaww zzaww2, boolean bl2) {
        zzaww2.zzq = bl2;
    }

    /*
     * Exception decompiling
     */
    public static /* bridge */ /* synthetic */ void zzj(zzaww var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 28[TRYBLOCK] [60, 59 : 341->345)] java.lang.Throwable
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

    public static /* bridge */ /* synthetic */ boolean zzq(zzaww zzaww2) {
        return zzaww2.zzq;
    }

    private final void zzs() {
        zzayn zzayn2 = this.zzm;
        if (zzayn2 != null) {
            zzayn2.zzh();
        }
    }

    private final zzfsw zzt(int n3) {
        Object object = this.zzj;
        n3 = (int)(zzfsk.zza((zzazw)object) ? 1 : 0);
        if (n3 == 0) {
            return null;
        }
        object = zzbep.zzcm;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        int n4 = 1;
        if (n3 != 0) {
            return this.zze.zzc(n4);
        }
        return this.zzd.zzc(n4);
    }

    public final String zze(Context context, String string2, View view) {
        return this.zzf(context, string2, view, null);
    }

    public final String zzf(Context context, String string2, View view, Activity activity) {
        zzaww zzaww2 = this;
        this.zzs();
        Object object = zzbep.zzcF;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzn;
            ((zzayf)object).zzi();
        }
        this.zzp();
        object = zzaww2.zzf;
        object2 = ((zzftg)object).zza();
        if (object2 != null) {
            long l2 = System.currentTimeMillis();
            object = object2.zza(context, null, string2, view, activity);
            zzfre zzfre2 = zzaww2.zzh;
            long l3 = System.currentTimeMillis() - l2;
            zzfre2.zzf(5000, l3, (String)object, null);
            return object;
        }
        return "";
    }

    public final String zzg(Context object) {
        this.zzs();
        Object object2 = zzbep.zzcF;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = this.zzn;
            ((zzayf)object2).zzj();
        }
        this.zzp();
        object2 = this.zzf.zza();
        if (object2 != null) {
            long l2 = System.currentTimeMillis();
            object = object2.zzc((Context)object, null);
            zzfre zzfre2 = this.zzh;
            long l3 = System.currentTimeMillis() - l2;
            zzfre2.zzf(5001, l3, (String)object, null);
            return object;
        }
        return "";
    }

    public final String zzh(Context object, View view, Activity activity) {
        this.zzs();
        Object object2 = zzbep.zzcF;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = this.zzn;
            ((zzayf)object2).zzk((Context)object, view);
        }
        this.zzp();
        object2 = this.zzf.zza();
        if (object2 != null) {
            long l2 = System.currentTimeMillis();
            object = object2.zzb((Context)object, null, view, activity);
            zzfre zzfre2 = this.zzh;
            long l3 = System.currentTimeMillis() - l2;
            zzfre2.zzf(5002, l3, (String)object, null);
            return object;
        }
        return "";
    }

    public final void zzk(MotionEvent motionEvent) {
        Object object = this.zzf.zza();
        if (object != null) {
            int n3 = 0;
            try {
                object.zzd(null, motionEvent);
                return;
            }
            catch (zzftf zzftf2) {
                object = this.zzh;
                n3 = zzftf2.zza();
                long l2 = -1;
                ((zzfre)object).zzc(n3, l2, zzftf2);
            }
        }
    }

    public final void zzl(int n3, int n4, int n7) {
        Object object = zzbep.zzlU;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (object = this.zzc.getResources().getDisplayMetrics()) != null) {
            float f5 = n3;
            float f6 = ((DisplayMetrics)object).density;
            float f7 = f5 * f6;
            float f8 = n4;
            float f11 = f8 * f6;
            long l2 = 0L;
            long l3 = 0L;
            MotionEvent motionEvent = MotionEvent.obtain((long)l2, (long)l3, (int)0, (float)f7, (float)f11, (float)0.0f, (float)0.0f, (int)0, (float)0.0f, (float)0.0f, (int)0, (int)0);
            this.zzk(motionEvent);
            motionEvent.recycle();
            f6 = ((DisplayMetrics)object).density;
            f7 = f5 * f6;
            f11 = f8 * f6;
            int n8 = 2;
            motionEvent = MotionEvent.obtain((long)l2, (long)l3, (int)n8, (float)f7, (float)f11, (float)0.0f, (float)0.0f, (int)0, (float)0.0f, (float)0.0f, (int)0, (int)0);
            this.zzk(motionEvent);
            motionEvent.recycle();
            long l4 = n7;
            float f12 = ((DisplayMetrics)object).density;
            float f14 = f5 * f12;
            f7 = f8 * f12;
            f8 = 0.0f;
            long l7 = 0L;
            int n10 = 1;
            f11 = 0.0f;
            object = MotionEvent.obtain((long)l7, (long)l4, (int)n10, (float)f14, (float)f7, (float)0.0f, (float)0.0f, (int)0, (float)0.0f, (float)0.0f, (int)0, (int)0);
            this.zzk((MotionEvent)object);
            object.recycle();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm() {
        synchronized (this) {
            Throwable throwable2;
            long l2;
            block5: {
                block6: {
                    try {
                        l2 = System.currentTimeMillis();
                        int n3 = 1;
                        zzfsw zzfsw2 = this.zzt(n3);
                        if (zzfsw2 == null) break block5;
                        Object object = this.zzf;
                        boolean bl2 = ((zzftg)object).zzc(zzfsw2);
                        if (!bl2) break block6;
                        this.zzr = n3;
                        object = this.zzl;
                        ((CountDownLatch)object).countDown();
                        return;
                    }
                    catch (Throwable throwable2) {}
                }
                return;
            }
            zzfre zzfre2 = this.zzh;
            long l3 = System.currentTimeMillis() - l2;
            int n4 = 4013;
            zzfre2.zzd(n4, l3);
            return;
            throw throwable2;
        }
    }

    public final void zzn(StackTraceElement[] object) {
        zzaxw zzaxw2 = this.zzo;
        if (zzaxw2 != null) {
            object = Arrays.asList(object);
            zzaxw2.zzb((List)object);
        }
    }

    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzp() {
        boolean bl2 = this.zzq;
        if (bl2) {
            return;
        }
        Object object = this.zzp;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                block6: {
                    long l2;
                    boolean bl3;
                    block7: {
                        try {
                            bl3 = this.zzq;
                            if (bl3) break block6;
                            long l3 = System.currentTimeMillis();
                            l2 = 1000L;
                            l3 /= l2;
                            l2 = this.zza;
                            long l4 = (l3 -= l2) - (l2 = 3600L);
                            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                            if (object2 >= 0) break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                        return;
                    }
                    Object object3 = this.zzf;
                    if (((object3 = ((zzftg)object3).zzb()) == null || (bl3 = ((zzfsw)object3).zzd(l2))) && (bl3 = zzfsk.zza((zzazw)(object3 = this.zzj)))) {
                        object3 = this.zzi;
                        zzawv zzawv2 = new zzawv(this);
                        object3.execute(zzawv2);
                    }
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
    public final boolean zzr() {
        synchronized (this) {
            return this.zzr;
        }
    }
}

