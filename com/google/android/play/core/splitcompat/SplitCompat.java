/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.splitcompat.zza;
import com.google.android.play.core.splitcompat.zzd;
import com.google.android.play.core.splitcompat.zze;
import com.google.android.play.core.splitcompat.zzn;
import com.google.android.play.core.splitcompat.zzo;
import com.google.android.play.core.splitcompat.zzp;
import com.google.android.play.core.splitcompat.zzq;
import com.google.android.play.core.splitcompat.zzs;
import com.google.android.play.core.splitcompat.zzt;
import com.google.android.play.core.splitinstall.internal.zzah;
import com.google.android.play.core.splitinstall.internal.zzak;
import com.google.android.play.core.splitinstall.internal.zzam;
import com.google.android.play.core.splitinstall.internal.zzao;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.zzbe;
import com.google.android.play.core.splitinstall.zzh;
import com.google.android.play.core.splitinstall.zzr;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipFile;

public class SplitCompat {
    public static final /* synthetic */ int zza;
    private static final AtomicReference zzb;
    private final zze zzc;
    private final zzbe zzd;
    private final Set zze;
    private final zza zzf;

    static {
        AtomicReference<Object> atomicReference;
        zzb = atomicReference = new AtomicReference<Object>(null);
    }

    private SplitCompat(Context context) {
        zza zza2;
        Object object = new HashSet();
        this.zze = object;
        try {
            object = new zze(context);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = new zzbh("Failed to initialize FileStorage", nameNotFoundException);
            throw object;
        }
        this.zzc = object;
        this.zzf = zza2 = new zza((zze)object);
        this.zzd = object = new zzbe(context);
    }

    public static boolean install(Context context) {
        return SplitCompat.zzi(context, false);
    }

    public static boolean installActivity(Context context) {
        boolean bl2 = SplitCompat.zzj();
        if (bl2) {
            return false;
        }
        Object object = (SplitCompat)zzb.get();
        if (object == null) {
            object = context.getApplicationContext();
            if (object != null) {
                object = context.getApplicationContext();
                SplitCompat.install((Context)object);
            }
            return SplitCompat.install(context);
        }
        zza zza2 = ((SplitCompat)object).zzf;
        object = ((SplitCompat)object).zzf();
        return zza2.zzb(context, (Set)object);
    }

    public static /* bridge */ /* synthetic */ zze zza(SplitCompat splitCompat) {
        return splitCompat.zzc;
    }

    public static /* bridge */ /* synthetic */ Set zzb(SplitCompat splitCompat) {
        return splitCompat.zzf();
    }

    public static /* bridge */ /* synthetic */ void zzc(SplitCompat splitCompat, Set set) {
        splitCompat.zzg(set);
    }

    public static boolean zzd(Context context) {
        return SplitCompat.zzi(context, true);
    }

    public static boolean zze() {
        Object v4 = zzb.get();
        return v4 != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Set zzf() {
        Set set = this.zze;
        synchronized (set) {
            Set set2 = this.zze;
            return new HashSet(set2);
        }
    }

    private final void zzg(Set object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (String)object.next();
            zze zze2 = this.zzc;
            object2 = zze2.zzg((String)object2);
            com.google.android.play.core.splitcompat.zze.zzl((File)object2);
        }
        this.zzd.zzb();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzh(Context var1_1, boolean var2_7) {
        var3_8 = 1;
        var4_9 = false;
        var5_10 = null;
        var6_11 = "Cannot load data for application '";
        synchronized (this) {
            block32: {
                block35: {
                    if (!var2_7) break block35;
                    try {
                        var7_12 = this.zzc;
                        var7_12.zzk();
                        break block32;
                    }
                    catch (Throwable var1_2) {
                        ** GOTO lbl164
                    }
                }
                var7_12 = com.google.android.play.core.splitcompat.zzd.zza();
                var8_13 = new zzq(this);
                var7_12.execute((Runnable)var8_13);
            }
            var7_12 = var1_1.getPackageName();
            try {
                var8_13 = var1_1.getPackageManager();
                var8_13 = var8_13.getPackageInfo((String)var7_12, 0);
                var8_13 = var8_13.splitNames;
                var8_13 = var8_13 == null ? new ArrayList() : Arrays.asList(var8_13);
            }
            catch (PackageManager.NameNotFoundException var1_3) {
                ** GOTO lbl155
            }
            var6_11 = this.zzc;
            var6_11 = var6_11.zzj();
            var7_12 = this.zzd;
            var7_12 = var7_12.zza();
            var9_14 = new Class<Throwable>();
            var10_15 = var6_11.iterator();
            while ((var11_16 = var10_15.hasNext()) != 0) {
                var12_17 = var10_15.next();
                var12_17 = (zzt)var12_17;
                var13_18 = var8_13.contains(var12_17 = var12_17.zzb());
                if (!var13_18 && !(var13_18 = var7_12.contains(var14_19 = com.google.android.play.core.splitinstall.zzs.zzb((String)var12_17)))) continue;
                var9_14.add((Throwable)var12_17);
                var10_15.remove();
            }
            if (var2_7) {
                this.zzg((Set)var9_14);
            } else {
                var15_20 = var9_14.isEmpty();
                if (!var15_20) {
                    var7_12 = com.google.android.play.core.splitcompat.zzd.zza();
                    var10_15 = new Iterator<E>(this, (Set)var9_14);
                    var7_12.execute((Runnable)var10_15);
                }
            }
            var7_12 = new HashSet();
            var9_14 = var6_11.iterator();
            while (var16_21 = var9_14.hasNext()) {
                var10_15 = var9_14.next();
                var10_15 = (zzt)var10_15;
                var11_16 = com.google.android.play.core.splitinstall.zzs.zze((String)(var10_15 = var10_15.zzb()));
                if (var11_16 != 0) continue;
                var7_12.add(var10_15);
            }
            var8_13 = var8_13.iterator();
            while ((var17_22 = var8_13.hasNext()) != 0) {
                var9_14 = var8_13.next();
                var16_21 = com.google.android.play.core.splitinstall.zzs.zze((String)(var9_14 = (String)var9_14));
                if (var16_21) continue;
                var7_12.add(var9_14);
            }
            var17_22 = var6_11.size();
            var8_13 = new HashSet(var17_22);
            var6_11 = var6_11.iterator();
            while ((var17_22 = (int)var6_11.hasNext()) != 0) {
                var9_14 = var6_11.next();
                var9_14 = (zzt)var9_14;
                var10_15 = var9_14.zzb();
                var11_16 = com.google.android.play.core.splitinstall.zzs.zza;
                var12_17 = "config.";
                var16_21 = var10_15.startsWith((String)var12_17);
                if (!var16_21) {
                    var10_15 = var9_14.zzb();
                    var16_21 = var7_12.contains(var10_15 = com.google.android.play.core.splitinstall.zzs.zzb((String)var10_15));
                    if (!var16_21) continue;
                }
                var8_13.add(var9_14);
            }
            var7_12 = this.zzc;
            var6_11 = new zzn((zze)var7_12);
            var7_12 = zzao.zza();
            var9_14 = var1_1.getClassLoader();
            if (var2_7) {
                var6_11 = var6_11.zzc();
                var7_12.zza((ClassLoader)var9_14, (Set)var6_11);
            } else {
                var10_15 = var8_13.iterator();
                while ((var11_16 = (int)var10_15.hasNext()) != 0) {
                    var12_17 = var10_15.next();
                    var12_17 = (zzt)var12_17;
                    if ((var12_17 = var6_11.zzb((zzt)var12_17)) == null) {
                        var10_15.remove();
                        continue;
                    }
                    var7_12.zza((ClassLoader)var9_14, (Set)var12_17);
                }
            }
            var6_11 = new HashSet();
            var10_15 = var8_13.iterator();
            while ((var11_16 = (int)var10_15.hasNext()) != 0) {
                block33: {
                    block34: {
                        var12_17 = var10_15.next();
                        var12_17 = (zzt)var12_17;
                        try {
                            var18_23 = var12_17.zza();
                            var14_19 = new ZipFile((File)var18_23);
                            var18_23 = "classes.dex";
                        }
                        catch (IOException var1_5) {
                            var13_18 = false;
                            var14_19 = null;
                            break block33;
                        }
                        try {
                            var18_23 = var14_19.getEntry((String)var18_23);
                            var14_19.close();
                            if (var18_23 == null) break block34;
                            var14_19 = this.zzc;
                            var18_23 = var12_17.zzb();
                            var13_18 = var7_12.zzb((ClassLoader)var9_14, (File)(var14_19 = var14_19.zza((String)var18_23)), (File)(var18_23 = var12_17.zza()), var2_7);
                            if (!var13_18) {
                                var12_17 = var12_17.zza();
                                var12_17 = var12_17.toString();
                                var14_19 = "split was not installed ";
                                var14_19.concat((String)var12_17);
                                continue;
                            }
                        }
                        catch (IOException var1_4) {
                            break block33;
                        }
                    }
                    var12_17 = var12_17.zza();
                    var6_11.add(var12_17);
                    continue;
                }
                if (var14_19 == null) throw var1_6;
                try {
                    var14_19.close();
                    throw var1_6;
                }
                catch (IOException var19_24) {
                    var6_11 = Throwable.class;
                    var7_12 = "addSuppressed";
                    try {
                        var8_13 = new Class[var3_8];
                        var8_13[0] = var9_14 = Throwable.class;
                        var6_11 = var6_11.getDeclaredMethod((String)var7_12, (Class<?>)var8_13);
                        var20_27 = new Object[var3_8];
                        var20_27[0] = var19_24;
                        var6_11.invoke((Object)var1_6, var20_27);
                        throw var1_6;
                    }
                    catch (Exception v0) {
                        throw var1_6;
                    }
lbl155:
                    // 1 sources

                    var20_29 /* !! */  = new StringBuilder((String)var6_11);
                    var20_29 /* !! */ .append((String)var7_12);
                    var5_10 = "'";
                    var20_29 /* !! */ .append((String)var5_10);
                    var20_29 /* !! */  = var20_29 /* !! */ .toString();
                    var19_26 = new IOException((String)var20_29 /* !! */ , var1_3);
                    throw var19_26;
lbl164:
                    // 1 sources

                    throw var1_2;
                }
            }
            var19_25 = this.zzf;
            var19_25.zza((Context)var1_1, (Set)var6_11);
            var1_1 = new HashSet();
            var19_25 = var8_13.iterator();
            while ((var3_8 = var19_25.hasNext()) != 0) {
                var20_28 = var19_25.next();
                var5_10 = (var20_28 = (zzt)var20_28).zza();
                var4_9 = var6_11.contains(var5_10);
                if (var4_9) {
                    var20_28.zzb();
                    var20_28 = var20_28.zzb();
                    var1_1.add(var20_28);
                    continue;
                }
                var20_28.zzb();
            }
            var19_25 = this.zze;
            synchronized (var19_25) {
                var20_28 = this.zze;
                var20_28.addAll(var1_1);
                return;
            }
        }
    }

    private static boolean zzi(Context context, boolean bl2) {
        boolean bl3;
        Object object;
        SplitCompat splitCompat;
        Object object2;
        boolean bl4;
        block5: {
            bl4 = SplitCompat.zzj();
            if (bl4) {
                return false;
            }
            object2 = zzb;
            splitCompat = new SplitCompat(context);
            do {
                object = null;
                boolean bl5 = ((AtomicReference)object2).compareAndSet(null, splitCompat);
                bl3 = true;
                if (!bl5) continue;
                bl4 = true;
                break block5;
            } while ((object = (Object)((AtomicReference)object2).get()) == null || (object = (Object)((AtomicReference)object2).get()) == null);
            bl4 = false;
            object2 = null;
        }
        splitCompat = (SplitCompat)zzb.get();
        if (bl4) {
            object2 = com.google.android.play.core.splitinstall.zzo.zza;
            Executor executor = com.google.android.play.core.splitcompat.zzd.zza();
            Object object3 = splitCompat.zzc;
            zzah zzah2 = new zzah();
            zzam zzam2 = new zzam(context, (zze)object3, zzah2);
            zze zze2 = splitCompat.zzc;
            zzs zzs2 = new zzs();
            object3 = object;
            zzah2 = context;
            object = new zzak(context, executor, zzam2, zze2, zzs2);
            ((com.google.android.play.core.splitinstall.zzo)object2).zzb((zzh)object);
            object2 = new zzp(splitCompat);
            zzr.zzb((com.google.android.play.core.splitinstall.zzq)object2);
            object2 = com.google.android.play.core.splitcompat.zzd.zza();
            object = new zzo(context);
            object2.execute((Runnable)object);
        }
        try {
            splitCompat.zzh(context, bl2);
            return bl3;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private static boolean zzj() {
        return false;
    }
}

