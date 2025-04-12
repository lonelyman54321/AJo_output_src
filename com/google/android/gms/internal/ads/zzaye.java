/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.Pair
 *  dalvik.system.DexClassLoader
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzauw;
import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzawy;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxj;
import com.google.android.gms.internal.ads.zzaxx;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzazr;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbi;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzaye {
    private static final String zzd = "zzaye";
    protected final Context zza;
    protected boolean zzb;
    protected boolean zzc;
    private ExecutorService zze;
    private DexClassLoader zzf;
    private zzaxj zzg;
    private byte[] zzh;
    private volatile AdvertisingIdClient zzi = null;
    private volatile boolean zzj;
    private Future zzk;
    private final boolean zzl;
    private volatile zzaus zzm;
    private Future zzn;
    private zzawy zzo;
    private final Map zzp;
    private boolean zzq;
    private zzaxx zzr;

    private zzaye(Context context) {
        boolean bl2 = false;
        this.zzj = false;
        this.zzk = null;
        this.zzm = null;
        this.zzn = null;
        this.zzb = false;
        this.zzc = false;
        this.zzq = false;
        Object object = context.getApplicationContext();
        if (object != null) {
            bl2 = true;
        }
        this.zzl = bl2;
        if (object != null) {
            context = object;
        }
        this.zza = context;
        this.zzp = object;
        object = this.zzr;
        if (object != null) {
            return;
        }
        super(context);
        this.zzr = object;
    }

    /*
     * Exception decompiling
     */
    public static zzaye zzg(Context var0, String var1_6, String var2_8, boolean var3_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 36[TRYBLOCK] [55 : 389->394)] com.google.android.gms.internal.ads.zzaxi
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

    public static /* bridge */ /* synthetic */ void zzm(zzaye zzaye2, zzaus zzaus2) {
        zzaye2.zzm = zzaus2;
    }

    public static /* bridge */ /* synthetic */ void zzn(zzaye zzaye2) {
        zzaye2.zzv();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void zzv() {
        AdvertisingIdClient advertisingIdClient = this.zzi;
        if (advertisingIdClient != null) return;
        boolean bl2 = this.zzl;
        if (!bl2) return;
        Context context = this.zza;
        advertisingIdClient = new AdvertisingIdClient(context);
        advertisingIdClient.start();
        try {
            this.zzi = advertisingIdClient;
            return;
        }
        catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException exception) {
            this.zzi = null;
            return;
        }
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzw(File object, String object2) {
        Object object3;
        block37: {
            block36: {
                block30: {
                    block29: {
                        void var10_18;
                        block39: {
                            Object object4;
                            block35: {
                                void var10_17;
                                block38: {
                                    FileInputStream fileInputStream;
                                    block32: {
                                        block34: {
                                            block31: {
                                                block33: {
                                                    int n3;
                                                    File file;
                                                    Object object5;
                                                    Object object6;
                                                    block28: {
                                                        long l2;
                                                        object2 = "test";
                                                        object6 = "1708042440713";
                                                        int n4 = 2;
                                                        object3 = new Object[n4];
                                                        object3[0] = object;
                                                        int n7 = 1;
                                                        object3[n7] = object6;
                                                        object5 = "%s/%s.tmp";
                                                        file = new File((String)(object3 = String.format((String)object5, (Object[])object3)));
                                                        boolean bl2 = file.exists();
                                                        if (bl2) {
                                                            return;
                                                        }
                                                        Object[] objectArray = new Object[n4];
                                                        objectArray[0] = object;
                                                        objectArray[n7] = object6;
                                                        object = String.format("%s/%s.dex", objectArray);
                                                        object3 = new File((String)object);
                                                        object4 = ((File)object3).exists();
                                                        if (object4 == 0) return;
                                                        long l3 = ((File)object3).length();
                                                        long l4 = l3 - (l2 = 0L);
                                                        object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                                        if (object4 <= 0) return;
                                                        object4 = (int)l3;
                                                        object = new byte[object4];
                                                        n4 = 0;
                                                        Object var10_14 = null;
                                                        fileInputStream = new FileInputStream((File)object3);
                                                        n3 = fileInputStream.read((byte[])object);
                                                        if (n3 > 0) break block28;
                                                        try {
                                                            fileInputStream.close();
                                                            break block29;
                                                        }
                                                        catch (IOException iOException) {}
                                                    }
                                                    object5 = System.out;
                                                    ((PrintStream)object5).print((String)object2);
                                                    ((PrintStream)object5).print((String)object2);
                                                    ((PrintStream)object5).print((String)object2);
                                                    object2 = zzauw.zza();
                                                    object5 = Build.VERSION.SDK;
                                                    object5 = ((String)object5).getBytes();
                                                    int n8 = ((Object)object5).length;
                                                    object5 = zzhac.zzv((byte[])object5, 0, n8);
                                                    ((zzauv)object2).zzc((zzhac)object5);
                                                    object6 = ((String)object6).getBytes();
                                                    n3 = ((Object)object6).length;
                                                    object6 = zzhac.zzv((byte[])object6, 0, n3);
                                                    ((zzauv)object2).zzd((zzhac)object6);
                                                    object6 = this.zzg;
                                                    object5 = this.zzh;
                                                    object = ((zzaxj)object6).zza((byte[])object5, (byte[])object);
                                                    object = ((String)object).getBytes();
                                                    int n10 = ((Object)object).length;
                                                    object6 = zzhac.zzv((byte[])object, 0, n10);
                                                    ((zzauv)object2).zza((zzhac)object6);
                                                    object = zzavs.zzf((byte[])object);
                                                    n10 = ((Object)object).length;
                                                    object = zzhac.zzv((byte[])object, 0, n10);
                                                    ((zzauv)object2).zzb((zzhac)object);
                                                    file.createNewFile();
                                                    object = new FileOutputStream(file);
                                                    object2 = ((zzhbi)object2).zzbn();
                                                    object2 = (zzauw)object2;
                                                    object2 = ((zzgzi)object2).zzaV();
                                                    int n14 = ((Object)object2).length;
                                                    ((FileOutputStream)object).write((byte[])object2, 0, n14);
                                                    ((FileOutputStream)object).close();
                                                    try {
                                                        fileInputStream.close();
                                                        break block30;
                                                    }
                                                    catch (IOException iOException) {}
                                                    catch (Throwable throwable) {
                                                        break block31;
                                                    }
                                                    catch (zzaxi | IOException | NoSuchAlgorithmException exception) {
                                                        break block32;
                                                    }
                                                    catch (Throwable throwable) {
                                                        object2 = throwable;
                                                        break block33;
                                                    }
                                                    catch (zzaxi | IOException | NoSuchAlgorithmException exception) {
                                                        break block34;
                                                    }
                                                }
                                                object4 = 0;
                                                object = null;
                                            }
                                            FileInputStream fileInputStream2 = fileInputStream;
                                            break block38;
                                        }
                                        object4 = 0;
                                        object = null;
                                    }
                                    FileInputStream fileInputStream3 = fileInputStream;
                                    break block39;
                                    catch (Throwable throwable) {
                                        object2 = throwable;
                                    }
                                    catch (zzaxi | IOException | NoSuchAlgorithmException exception) {
                                        break block35;
                                    }
                                    object4 = 0;
                                    object = null;
                                }
                                if (var10_17 != null) {
                                    try {
                                        var10_17.close();
                                    }
                                    catch (IOException iOException) {}
                                }
                                if (object == null) break block36;
                                try {
                                    ((FileOutputStream)object).close();
                                    break block36;
                                }
                                catch (IOException iOException) {}
                            }
                            object4 = 0;
                            object = null;
                        }
                        if (var10_18 != null) {
                            try {
                                var10_18.close();
                            }
                            catch (IOException iOException) {}
                        }
                        if (object == null) break block37;
                        try {
                            ((FileOutputStream)object).close();
                            break block37;
                        }
                        catch (IOException iOException) {}
                    }
                    zzaye.zzy((File)object3);
                    return;
                }
                try {
                    ((FileOutputStream)object).close();
                }
                catch (IOException iOException) {}
                zzaye.zzy((File)object3);
                return;
            }
            zzaye.zzy((File)object3);
            throw object2;
        }
        zzaye.zzy((File)object3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzx(File var1_1, String var2_3) {
        block40: {
            var3_6 = "1708042440713";
            var4_7 = 2;
            var5_8 = new Object[var4_7];
            var5_8[0] = var1_1;
            var6_9 = true;
            var5_8[var6_9] = var3_6;
            var7_10 = "%s/%s.tmp";
            var2_3 = new File((String)(var5_8 = String.format((String)var7_10, (Object[])var5_8)));
            var8_11 = var2_3.exists();
            if (!var8_11) {
                return false;
            }
            var9_12 /* !! */  = new Object[var4_7];
            var9_12 /* !! */ [0] = var1_1;
            var9_12 /* !! */ [var6_9] = var3_6;
            var1_1 = String.format("%s/%s.dex", var9_12 /* !! */ );
            var5_8 = new File((String)var1_1);
            var10_13 = var5_8.exists();
            if (var10_13 != 0) return false;
            var10_13 = 0;
            var1_1 = null;
            try {
                var11_14 = var2_3.length();
                var13_15 = 0L;
                var4_7 = (int)(var11_14 == var13_15 ? 0 : (var11_14 < var13_15 ? -1 : 1));
                if (var4_7 <= 0) {
                    zzaye.zzy((File)var2_3);
                    return false;
                }
            }
            catch (Throwable var2_4) {
                ** GOTO lbl114
            }
            catch (zzaxi | IOException | NoSuchAlgorithmException v0) {
                ** GOTO lbl127
            }
            var4_7 = (int)var11_14;
            {
                var9_12 /* !! */  = new byte[var4_7];
                var7_10 = new FileInputStream((File)var2_3);
            }
            var15_16 = var7_10.read((byte[])var9_12 /* !! */ );
            if (var15_16 > 0) ** GOTO lbl-1000
            zzaye.zzy((File)var2_3);
            var7_10.close();
            return false;
            catch (Throwable var2_5) {
                ** GOTO lbl108
            }
            catch (zzaxi | IOException | NoSuchAlgorithmException v1) {
                ** GOTO lbl111
            }
lbl-1000:
            // 1 sources

            {
                block39: {
                    var16_20 = zzhay.zza();
                    var9_12 /* !! */  = zzauw.zzd((byte[])var9_12 /* !! */ , (zzhay)var16_20);
                    var17_21 = var9_12 /* !! */ .zzh();
                    var17_21 = var17_21.zzB();
                    var16_20 = new String((byte[])var17_21);
                    var18_17 = var3_6.equals(var16_20);
                    if (!var18_17) ** GOTO lbl-1000
                    var3_6 = var9_12 /* !! */ .zzf();
                    var3_6 = var3_6.zzB();
                    var16_20 = var9_12 /* !! */ .zze();
                    var16_20 = var16_20.zzB();
                    var18_17 = Arrays.equals((byte[])var3_6, (byte[])(var16_20 = (Object)zzavs.zzf((byte[])var16_20)));
                    if (!var18_17) ** GOTO lbl-1000
                    var3_6 = var9_12 /* !! */ .zzg();
                    var3_6 = var3_6.zzB();
                    var16_20 = Build.VERSION.SDK;
                    var18_17 = Arrays.equals((byte[])var3_6, (byte[])(var16_20 = (Object)var16_20.getBytes()));
                    if (!var18_17) ** GOTO lbl-1000
                    var2_3 = this.zzg;
                    var3_6 = this.zzh;
                    var9_12 /* !! */  = var9_12 /* !! */ .zze();
                    var9_12 /* !! */  = var9_12 /* !! */ .zzB();
                    var16_20 = new String((byte[])var9_12 /* !! */ );
                    var2_3 = var2_3.zzb((byte[])var3_6, (String)var16_20);
                    var5_8.createNewFile();
                    var3_6 = new FileOutputStream((File)var5_8);
                    var10_13 = ((Object)var2_3).length;
                    var3_6.write((byte[])var2_3, 0, var10_13);
                    var7_10.close();
lbl80:
                    // 2 sources

                    while (true) {
                        var3_6.close();
                        return var6_9;
                        break;
                    }
                    catch (Throwable var1_2) {
                    }
                    catch (zzaxi | IOException | NoSuchAlgorithmException v2) {
                        break block39;
                    }
                    var2_3 = var1_2;
lbl89:
                    // 2 sources

                    while (true) {
                        var1_1 = var7_10;
                        ** GOTO lbl116
                        break;
                    }
                }
lbl93:
                // 2 sources

                while (true) {
                    var1_1 = var7_10;
                    ** GOTO lbl129
                    break;
                }
lbl-1000:
                // 3 sources

                {
                    zzaye.zzy((File)var2_3);
                }
                var7_10.close();
                return false;
            }
            catch (IOException v3) {
                return false;
            }
            {
                catch (NullPointerException v4) {
                    try {
                        var7_10.close();
                        return false;
                    }
                    catch (IOException v5) {
                        return false;
                    }
lbl108:
                    // 1 sources

                    var18_17 = false;
                    var3_6 = null;
                    ** continue;
lbl111:
                    // 1 sources

                    var18_17 = false;
                    var3_6 = null;
                    ** continue;
lbl114:
                    // 1 sources

                    var18_18 = false;
                    var3_6 = null;
lbl116:
                    // 2 sources

                    if (var1_1 != null) {
                        try {
                            var1_1.close();
                        }
                        catch (IOException v6) {}
                    }
                    if (var3_6 == null) throw var2_3;
                    try {
                        var3_6.close();
                    }
                    catch (IOException v7) {
                        throw var2_3;
                    }
                    throw var2_3;
lbl127:
                    // 1 sources

                    var18_19 = false;
                    var3_6 = null;
lbl129:
                    // 2 sources

                    if (var1_1 != null) {
                        try {
                            var1_1.close();
                        }
                        catch (IOException v8) {}
                    }
                    if (var3_6 == null) return false;
                    try {}
                    catch (IOException v9) {
                        return false;
                    }
                    break block40;
                }
            }
            catch (IOException v10) {
                ** continue;
            }
            catch (IOException v11) {
                return false;
            }
        }
        var3_6.close();
        return false;
        catch (IOException v12) {
            return var6_9;
        }
    }

    private static final void zzy(File object) {
        boolean bl2 = ((File)object).exists();
        if (!bl2) {
            object = ((File)object).getAbsolutePath();
            StringBuilder stringBuilder = new StringBuilder("File ");
            stringBuilder.append((String)object);
            stringBuilder.append(" not found. No need for deletion");
            return;
        }
        ((File)object).delete();
    }

    private static final void zzz(String string2) {
        File file = new File(string2);
        zzaye.zzy(file);
    }

    public final int zza() {
        zzawy zzawy2 = this.zzo;
        if (zzawy2 != null) {
            return zzawy.zzd();
        }
        return -1 << -1;
    }

    public final Context zzb() {
        return this.zza;
    }

    public final zzaus zzc() {
        return this.zzm;
    }

    public final zzawy zzd() {
        return this.zzo;
    }

    public final zzaxj zze() {
        return this.zzg;
    }

    public final zzaxx zzf() {
        return this.zzr;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AdvertisingIdClient zzh() {
        boolean bl2 = this.zzj;
        boolean bl3 = false;
        if (!bl2) {
            return null;
        }
        Object object = this.zzi;
        if (object != null) {
            return this.zzi;
        }
        object = this.zzk;
        if (object == null) return this.zzi;
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long l2 = 2000L;
            object.get(l2, timeUnit);
            this.zzk = null;
            return this.zzi;
        }
        catch (TimeoutException timeoutException) {
            object = this.zzk;
            bl3 = true;
            object.cancel(bl3);
            return this.zzi;
        }
        catch (InterruptedException | ExecutionException exception) {
            return this.zzi;
        }
    }

    public final DexClassLoader zzi() {
        return this.zzf;
    }

    public final Method zzj(String object, String string2) {
        Pair pair = new Pair(object, (Object)string2);
        if ((object = (zzazr)this.zzp.get(pair)) == null) {
            return null;
        }
        return ((zzazr)object).zza();
    }

    public final ExecutorService zzk() {
        return this.zze;
    }

    public final Future zzl() {
        return this.zzn;
    }

    public final void zzo(int n3, boolean bl2) {
        bl2 = this.zzc;
        if (bl2) {
            Object object = this.zze;
            boolean bl3 = true;
            zzayc zzayc2 = new zzayc(this, n3, bl3);
            object = object.submit(zzayc2);
            if (n3 == 0) {
                this.zzn = object;
            }
        }
    }

    public final boolean zzp() {
        return this.zzc;
    }

    public final boolean zzq() {
        return this.zzb;
    }

    public final boolean zzr() {
        return this.zzq;
    }

    public final boolean zzs() {
        return this.zzr.zza();
    }

    public final boolean zzt(String string2, String string3, Class ... classArray) {
        Map map2 = this.zzp;
        Pair pair = new Pair((Object)string2, (Object)string3);
        boolean bl2 = map2.containsKey(pair);
        if (!bl2) {
            map2 = this.zzp;
            zzazr zzazr2 = new zzazr(this, string2, string3, classArray);
            map2.put(pair, zzazr2);
            return true;
        }
        return false;
    }

    public final byte[] zzu() {
        return this.zzh;
    }
}

