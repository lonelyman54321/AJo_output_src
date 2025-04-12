/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 */
package com.google.android.play.core.splitinstall.testing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzbs;
import com.google.android.play.core.splitinstall.internal.zzbw;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.google.android.play.core.splitinstall.internal.zzby;
import com.google.android.play.core.splitinstall.internal.zzt;
import com.google.android.play.core.splitinstall.testing.zzd;
import com.google.android.play.core.splitinstall.testing.zze;
import com.google.android.play.core.splitinstall.testing.zzf;
import com.google.android.play.core.splitinstall.testing.zzg;
import com.google.android.play.core.splitinstall.testing.zzh;
import com.google.android.play.core.splitinstall.testing.zzi;
import com.google.android.play.core.splitinstall.testing.zzj;
import com.google.android.play.core.splitinstall.testing.zzk;
import com.google.android.play.core.splitinstall.testing.zzl;
import com.google.android.play.core.splitinstall.testing.zzm;
import com.google.android.play.core.splitinstall.testing.zzp;
import com.google.android.play.core.splitinstall.testing.zzq;
import com.google.android.play.core.splitinstall.testing.zzr;
import com.google.android.play.core.splitinstall.testing.zzv;
import com.google.android.play.core.splitinstall.zzo;
import com.google.android.play.core.splitinstall.zzs;
import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class FakeSplitInstallManager
implements SplitInstallManager {
    public static final /* synthetic */ int zza;
    private static final long zzb = TimeUnit.SECONDS.toMillis(1L);
    private final Handler zzc;
    private final Context zzd;
    private final zzs zze;
    private final zzby zzf;
    private final zzbs zzg;
    private final zzt zzh;
    private final zzt zzi;
    private final Executor zzj;
    private final com.google.android.play.core.splitinstall.zzg zzk;
    private final File zzl;
    private final AtomicReference zzm;
    private final Set zzn;
    private final Set zzo;
    private final AtomicBoolean zzp;
    private final zzj zzq;

    public FakeSplitInstallManager(Context context, File file) {
        Object object = context.getPackageName();
        zzs zzs2 = new zzs(context, (String)object);
        object = com.google.android.play.core.splitinstall.testing.zze.zza;
        this(context, file, zzs2, (zzby)object);
    }

    public FakeSplitInstallManager(Context object, File file, zzs zzs2, zzby zzby2) {
        Object object2;
        Executor executor = com.google.android.play.core.splitcompat.zzd.zza();
        zzbs zzbs2 = new zzbs((Context)object);
        zzj zzj2 = com.google.android.play.core.splitinstall.testing.zzj.zza;
        Looper looper = Looper.getMainLooper();
        this.zzc = object2 = new Handler(looper);
        this.zzm = object2;
        super();
        object2 = Collections.synchronizedSet(object2);
        this.zzn = object2;
        super();
        object2 = Collections.synchronizedSet(object2);
        this.zzo = object2;
        super(false);
        this.zzp = object2;
        this.zzd = object;
        this.zzl = file;
        this.zze = zzs2;
        this.zzf = zzby2;
        this.zzj = executor;
        this.zzg = zzbs2;
        this.zzq = zzj2;
        super();
        this.zzi = object;
        super();
        this.zzh = object;
        object = com.google.android.play.core.splitinstall.zzo.zza;
        this.zzk = object;
    }

    public static /* bridge */ /* synthetic */ void zzd(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, List list3, long l2, boolean bl2) {
        fakeSplitInstallManager.zzp(list, list2, list3, l2, true);
    }

    public static /* bridge */ /* synthetic */ void zze(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, long l2) {
        fakeSplitInstallManager.zzr(list, list2, l2);
    }

    public static /* synthetic */ boolean zzj(FakeSplitInstallManager fakeSplitInstallManager, int n3, int n4) {
        return fakeSplitInstallManager.zzs(6, n4, null, null, null, null, null);
    }

    private final Task zzk(int n3) {
        Object object = new zzp(n3);
        this.zzn((zzr)object);
        object = new SplitInstallException(n3);
        return Tasks.forException((Exception)object);
    }

    private final com.google.android.play.core.splitinstall.zzk zzl() {
        Object object;
        Object object2;
        try {
            object2 = this.zzd;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = new IllegalStateException("App is not found in PackageManager", nameNotFoundException);
            throw object;
        }
        object2 = object2.getPackageManager();
        object = this.zzd;
        object = object.getPackageName();
        int n3 = 128;
        object2 = object2.getPackageInfo((String)object, n3);
        object = this.zze;
        object2 = object2.applicationInfo.metaData;
        object2 = ((zzs)object).zza((Bundle)object2);
        if (object2 != null) {
            return object2;
        }
        object2 = new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        throw object2;
    }

    private final SplitInstallSessionState zzm() {
        return (SplitInstallSessionState)this.zzm.get();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final SplitInstallSessionState zzn(zzr var1_1) {
        synchronized (this) {
            var2_2 = this.zzm();
            var1_1 = var1_1.zza(var2_2);
            var3_3 = this.zzm;
            do lbl-1000:
            // 3 sources

            {
                block6: {
                    block5: {
                        if (!(var4_4 = var3_3.compareAndSet(var2_2, var1_1))) break block5;
                        var4_4 = true;
                        break block6;
                    }
                    var5_5 = var3_3.get();
                    if (var5_5 == var2_2) ** GOTO lbl-1000
                    var4_4 = false;
                    var5_5 = null;
                }
                if (!var4_4) continue;
                return var1_1;
            } while ((var5_5 = var3_3.get()) == var2_2);
            return null;
        }
    }

    private static String zzo(String string2) {
        return string2.split("\\.config\\.", 2)[0];
    }

    private final void zzp(List list, List list2, List list3, long l2, boolean bl2) {
        com.google.android.play.core.splitinstall.zzh zzh2 = this.zzk.zza();
        zzq zzq2 = new zzq(this, list2, list3, l2, bl2, list);
        zzh2.zzd(list, zzq2);
    }

    private final void zzq(SplitInstallSessionState splitInstallSessionState) {
        Handler handler = this.zzc;
        zzf zzf2 = new zzf(this, splitInstallSessionState);
        handler.post((Runnable)zzf2);
    }

    private final void zzr(List list, List list2, long l2) {
        this.zzn.addAll(list);
        this.zzo.addAll(list2);
        Long l3 = l2;
        this.zzs(5, 0, l3, l3, null, null, null);
    }

    private final boolean zzs(int n3, int n4, Long l2, Long l3, List list, Integer n7, List list2) {
        zzg zzg2;
        Object object = zzg2;
        zzg2 = new zzg(n7, n3, n4, l2, l3, list, list2);
        object = this.zzn(zzg2);
        if (object != null) {
            this.zzq((SplitInstallSessionState)object);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Task cancelInstall(int n3) {
        try {
            zzh zzh2 = new zzh(n3);
            SplitInstallSessionState splitInstallSessionState = this.zzn(zzh2);
            if (splitInstallSessionState != null) {
                this.zzq(splitInstallSessionState);
            }
        }
        catch (zzbx zzbx2) {
            return Tasks.forException(zzbx2.zzb(SplitInstallException.class));
        }
        n3 = 0;
        return Tasks.forResult(null);
    }

    public final Task deferredInstall(List object) {
        object = new SplitInstallException(-5);
        return Tasks.forException((Exception)object);
    }

    public final Task deferredLanguageInstall(List object) {
        object = new SplitInstallException(-5);
        return Tasks.forException((Exception)object);
    }

    public final Task deferredLanguageUninstall(List object) {
        object = new SplitInstallException(-5);
        return Tasks.forException((Exception)object);
    }

    public final Task deferredUninstall(List object) {
        object = new SplitInstallException(-5);
        return Tasks.forException((Exception)object);
    }

    public final Set getInstalledLanguages() {
        HashSet hashSet = new HashSet();
        Set set = this.zze.zzd();
        if (set != null) {
            set = this.zze.zzd();
            hashSet.addAll(set);
        }
        set = this.zzo;
        hashSet.addAll(set);
        return hashSet;
    }

    public final Set getInstalledModules() {
        HashSet hashSet = new HashSet();
        Set set = this.zze.zzc();
        hashSet.addAll(set);
        set = this.zzn;
        hashSet.addAll(set);
        return hashSet;
    }

    public final Task getSessionState(int n3) {
        int n4;
        SplitInstallSessionState splitInstallSessionState = this.zzm();
        if (splitInstallSessionState != null && (n4 = splitInstallSessionState.sessionId()) == n3) {
            return Tasks.forResult(splitInstallSessionState);
        }
        SplitInstallException splitInstallException = new SplitInstallException(-4);
        return Tasks.forException(splitInstallException);
    }

    public final Task getSessionStates() {
        Object object = this.zzm();
        object = object != null ? Collections.singletonList(object) : Collections.emptyList();
        return Tasks.forResult(object);
    }

    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zza(splitInstallStateUpdatedListener);
    }

    public void setShouldNetworkError(boolean bl2) {
        this.zzp.set(bl2);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, I3 i3) {
        return false;
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int n3) {
        return false;
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int n3) {
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Task startInstall(SplitInstallRequest var1_1) {
        block18: {
            block17: {
                block22: {
                    block21: {
                        var2_2 = this;
                        try {
                            var4_5 = var1_1;
                            var3_3 = new zzk(var1_1);
                            var3_3 = this.zzn((zzr)var3_3);
                            if (var3_3 == null) break block17;
                            var5_6 = var3_3.sessionId();
                        }
                        catch (zzbx var3_4) {
                            break block18;
                        }
                        var6_8 = new ArrayList<String>();
                        var7_9 = var1_1.getLanguages().iterator();
                        while ((var8_10 = var7_9.hasNext()) != 0) {
                            var9_11 = ((Locale)var7_9.next()).getLanguage();
                            var6_8.add((String)var9_11);
                        }
                        var7_9 = new HashSet();
                        var10_12 = new ArrayList<Serializable>();
                        var9_11 = var2_2.zzl;
                        var11_13 = com.google.android.play.core.splitinstall.testing.zzl.zza;
                        if ((var9_11 = var9_11.listFiles((FileFilter)var11_13)) == null) {
                            return var2_2.zzk(-5);
                        }
                        var13_15 = 0L;
                        for (var12_14 = 0; var12_14 < (var15_16 = ((File[])var9_11).length); ++var12_14) {
                            block20: {
                                block19: {
                                    var16_17 = var9_11[var12_14];
                                    var17_18 = zzbw.zza((File)var16_17);
                                    var18_19 = FakeSplitInstallManager.zzo(var17_18);
                                    var7_9.add(var17_18);
                                    var11_13 = var1_1.getModuleNames();
                                    var19_20 = var11_13.contains(var18_19);
                                    if (!var19_20) break block19;
                                    var11_13 = FakeSplitInstallManager.zzo(var17_18);
                                    var18_19 = var2_2.zzg.zza();
                                    var20_21 = new HashSet(var18_19);
                                    var18_19 = this.zzl();
                                    var11_13 = Arrays.asList(new String[]{var11_13});
                                    var11_13 = var18_19.zza((Collection)var11_13);
                                    var18_19 = new HashSet<E>();
                                    var21_22 /* !! */  = var11_13.values().iterator();
                                    while (var22_23 = var21_22 /* !! */ .hasNext()) {
                                        var23_24 /* !! */  = var21_22 /* !! */ .next();
                                        var24_25 = var23_24 /* !! */ ;
                                        var24_25 = (Set)var23_24 /* !! */ ;
                                        var18_19.addAll(var24_25);
                                    }
                                    var24_25 = new Collection<Object>();
                                    var20_21 = var20_21.iterator();
                                    while (var25_26 = var20_21.hasNext()) {
                                        var21_22 /* !! */  = var20_21.next();
                                        var4_5 = var21_22 /* !! */ ;
                                        var4_5 = (String)var21_22 /* !! */ ;
                                        var21_22 /* !! */  = var9_11;
                                        var9_11 = "_";
                                        var22_23 = var4_5.contains((CharSequence)var9_11);
                                        if (var22_23) {
                                            var23_24 /* !! */  = var20_21;
                                            var26_27 = -1;
                                            var4_5 = var4_5.split((String)var9_11, var26_27);
                                            var8_10 = 0;
                                            var9_11 = null;
                                            var4_5 = var4_5[0];
                                        } else {
                                            var23_24 /* !! */  = var20_21;
                                        }
                                        var24_25.add(var4_5);
                                        var4_5 = var1_1;
                                        var9_11 = var21_22 /* !! */ ;
                                        var20_21 = var23_24 /* !! */ ;
                                    }
                                    var21_22 /* !! */  = var9_11;
                                    var4_5 = var2_2.zzo;
                                    var24_25.addAll((Collection<Object>)var4_5);
                                    var24_25.addAll(var6_8);
                                    var4_5 = new HashSet();
                                    var9_11 = var11_13.entrySet().iterator();
                                    while (var19_20 = var9_11.hasNext()) {
                                        var11_13 = (Map.Entry)var9_11.next();
                                        var20_21 = var11_13.getKey();
                                        var26_27 = (int)var24_25.contains(var20_21);
                                        if (var26_27 == 0) continue;
                                        var11_13 = (Collection)var11_13.getValue();
                                        var4_5.addAll(var11_13);
                                    }
                                    var8_10 = (int)var18_19.contains(var17_18);
                                    if (var8_10 != 0 && (var27_28 = (int)var4_5.contains(var17_18)) == 0) break block20;
                                    ** GOTO lbl114
                                }
                                var21_22 /* !! */  = var9_11;
                            }
                            var4_5 = var1_1.getLanguages();
                            var11_13 = var2_2.zzn;
                            var9_11 = new ArrayList(var11_13);
                            var20_21 = "base";
                            var11_13 = Arrays.asList(new String[]{"", var20_21});
                            var9_11.addAll(var11_13);
                            var11_13 = this.zzl();
                            var9_11 = var11_13.zza((Collection)var9_11);
                            var4_5 = var4_5.iterator();
                            while (var19_20 = var4_5.hasNext()) {
                                var11_13 = (Locale)var4_5.next();
                                var20_21 = var11_13.getLanguage();
                                var26_27 = var9_11.containsKey(var20_21);
                                if (var26_27 == 0) continue;
                                var11_13 = var11_13.getLanguage();
                                var19_20 = (var11_13 = (Set)var9_11.get(var11_13)).contains(var17_18);
                                if (!var19_20) continue;
lbl114:
                                // 2 sources

                                var28_29 = var16_17.length();
                                var13_15 += var28_29;
                                var10_12.add(var16_17);
                                break;
                            }
                            var4_5 = var1_1;
                            var9_11 = var21_22 /* !! */ ;
                        }
                        var7_9.toString();
                        String.valueOf(var1_1.getModuleNames());
                        var4_5 = var1_1.getModuleNames();
                        var27_28 = var4_5.size();
                        var8_10 = 1;
                        if (var27_28 != var8_10) break block21;
                        var4_5 = ((zzv)var2_2.zzf.zza()).zzb();
                        var9_11 = var1_1.getModuleNames();
                        var19_20 = false;
                        var11_13 = null;
                        if ((var4_5 = (Integer)var4_5.get(var9_11 = var9_11.get(0))) != null) break block22;
                    }
                    var4_5 = ((zzv)var2_2.zzf.zza()).zza();
                }
                if (var4_5 != null) {
                    var5_6 = var4_5.intValue();
                    return var2_2.zzk(var5_6);
                }
                var9_11 = var1_1.getModuleNames();
                var4_5 = new HashSet(var9_11);
                var27_28 = (int)var7_9.containsAll((Collection<?>)var4_5);
                if (var27_28 == 0) {
                    return var2_2.zzk(-2);
                }
                var11_13 = 0L;
                var20_21 = var13_15;
                var24_25 = var1_1.getModuleNames();
                var3_3 = var5_6;
                var4_5 = this;
                var16_17 = var6_8;
                this.zzs(1, 0, (Long)var11_13, (Long)var20_21, (List)var24_25, (Integer)var3_3, var6_8);
                var4_5 = var2_2.zzj;
                var7_9 = new zzm(var2_2, var10_12, var6_8);
                var4_5.execute((Runnable)var7_9);
                return Tasks.forResult(var3_3);
            }
            var5_7 = -100;
            return this.zzk(var5_7);
        }
        var5_7 = ((SplitInstallException)var3_4.zzb(SplitInstallException.class)).getErrorCode();
        return var2_2.zzk(var5_7);
    }

    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zzb(splitInstallStateUpdatedListener);
    }

    public final void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzh.zza(splitInstallStateUpdatedListener);
    }

    public final void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzh.zzb(splitInstallStateUpdatedListener);
    }

    public final File zzc() {
        return this.zzl;
    }

    public final /* synthetic */ void zzf(long l2, List list, List list2, List list3) {
        Object object;
        zzd zzd2;
        int n3;
        long l3 = l2;
        long l4 = 0L;
        for (int i3 = 0; i3 < (n3 = 3); ++i3) {
            long l7 = l3 / (long)3 + l4;
            l4 = Math.min(l3, l7);
            Long l8 = l4;
            Long l12 = l2;
            int n4 = 2;
            zzd2 = null;
            this.zzs(n4, 0, l8, l12, null, null, null);
            l7 = zzb;
            SystemClock.sleep((long)l7);
            object = this.zzm();
            int n7 = ((SplitInstallSessionState)object).status();
            int n8 = 9;
            if (n7 != n8 && (n7 = ((SplitInstallSessionState)object).status()) != (n8 = 7) && (n3 = ((SplitInstallSessionState)object).status()) != (n7 = 6)) {
                continue;
            }
            return;
        }
        Executor executor = this.zzj;
        object = list2;
        l3 = l2;
        zzd2 = new zzd(this, list, list2, list3, l2);
        executor.execute(zzd2);
    }

    public final /* synthetic */ void zzg(SplitInstallSessionState splitInstallSessionState) {
        this.zzh.zzc(splitInstallSessionState);
        this.zzi.zzc(splitInstallSessionState);
    }

    public final /* synthetic */ void zzh(List list, List list2, List list3, long l2) {
        Object object = this.zzp;
        boolean bl2 = ((AtomicBoolean)object).get();
        if (bl2) {
            this.zzs(6, -6, null, null, null, null, null);
            return;
        }
        object = this.zzk.zza();
        if (object != null) {
            this.zzp(list, list2, list3, l2, false);
            return;
        }
        this.zzr(list2, list3, l2);
    }

    public final /* synthetic */ void zzi(List object, List list) {
        zzi zzi2;
        Object object2;
        Object object3;
        Object object4;
        boolean bl2;
        ArrayList<Intent> arrayList = new ArrayList<Intent>();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object4 = (File)object.next();
            object3 = zzbw.zza((File)object4);
            Object object5 = Uri.fromFile((File)object4);
            Intent intent = new Intent("android.intent.action.VIEW");
            object2 = this.zzd.getContentResolver().getType(object5);
            intent.setDataAndType(object5, (String)object2);
            int n3 = 1;
            intent.addFlags(n3);
            object5 = FakeSplitInstallManager.zzo((String)object3);
            object2 = "module_name";
            intent.putExtra((String)object2, (String)object5);
            object5 = "split_id";
            intent.putExtra((String)object5, (String)object3);
            arrayList.add(intent);
            object4 = FakeSplitInstallManager.zzo(zzbw.zza((File)object4));
            arrayList2.add(object4);
        }
        object = this.zzm();
        if (object == null) {
            return;
        }
        long l2 = ((SplitInstallSessionState)object).totalBytesToDownload();
        object = this.zzj;
        object4 = zzi2;
        object3 = this;
        object2 = list;
        zzi2 = new zzi(this, l2, arrayList, arrayList2, list);
        object.execute(zzi2);
    }
}

