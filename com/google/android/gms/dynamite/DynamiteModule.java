/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions;
import com.google.android.gms.dynamite.zzd;
import com.google.android.gms.dynamite.zze;
import com.google.android.gms.dynamite.zzf;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.dynamite.zzh;
import com.google.android.gms.dynamite.zzi;
import com.google.android.gms.dynamite.zzj;
import com.google.android.gms.dynamite.zzk;
import com.google.android.gms.dynamite.zzl;
import com.google.android.gms.dynamite.zzm;
import com.google.android.gms.dynamite.zzp;
import com.google.android.gms.dynamite.zzq;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final int LOCAL = 255;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION;
    public static final DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING;
    public static final DynamiteModule$VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION;
    public static final DynamiteModule$VersionPolicy PREFER_LOCAL;
    public static final DynamiteModule$VersionPolicy PREFER_REMOTE;
    public static final DynamiteModule$VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING;
    public static final int REMOTE = 1;
    public static final DynamiteModule$VersionPolicy zza;
    private static Boolean zzb;
    private static String zzc;
    private static boolean zzd = false;
    private static int zze = 255;
    private static Boolean zzf;
    private static final ThreadLocal zzg;
    private static final ThreadLocal zzh;
    private static final DynamiteModule$VersionPolicy$IVersions zzi;
    private static zzp zzk;
    private static zzq zzl;
    private final Context zzj;

    static {
        Object object = new ThreadLocal();
        zzg = object;
        object = new zzd();
        zzh = object;
        zzi = object = new zze();
        PREFER_REMOTE = object = new zzf();
        PREFER_LOCAL = object = new zzg();
        PREFER_REMOTE_VERSION_NO_FORCE_STAGING = object = new zzh();
        PREFER_HIGHEST_OR_LOCAL_VERSION = object = new zzi();
        PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = object = new zzj();
        PREFER_HIGHEST_OR_REMOTE_VERSION = object = new zzk();
        zza = object = new zzl();
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int getLocalVersion(Context object, String string2) {
        Exception exception2;
        block3: {
            Object object2 = "com.google.android.gms.dynamite.descriptors.";
            try {
                object = object.getApplicationContext();
                object = object.getClassLoader();
                CharSequence charSequence = new StringBuilder((String)object2);
                charSequence.append(string2);
                object2 = ".ModuleDescriptor";
                charSequence.append((String)object2);
                object2 = charSequence.toString();
                object = ((ClassLoader)object).loadClass((String)object2);
                object2 = "MODULE_ID";
                object2 = ((Class)object).getDeclaredField((String)object2);
                charSequence = "MODULE_VERSION";
                object = ((Class)object).getDeclaredField((String)charSequence);
                charSequence = null;
                Object object3 = ((Field)object2).get(null);
                boolean bl2 = Objects.equal(object3, string2);
                if (bl2) return ((Field)object).getInt(null);
                object = ((Field)object2).get(null);
                String.valueOf(object);
                return 0;
            }
            catch (Exception exception2) {}
            break block3;
            catch (ClassNotFoundException classNotFoundException) {
                return 0;
            }
        }
        String string3 = String.valueOf(exception2.getMessage());
        string2 = "Failed to load module descriptor class: ";
        string2.concat(string3);
        return 0;
    }

    public static int getRemoteVersion(Context context, String string2) {
        return DynamiteModule.zza(context, string2, false);
    }

    /*
     * Exception decompiling
     */
    public static DynamiteModule load(Context var0, DynamiteModule$VersionPolicy var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 28[TRYBLOCK] [57, 56, 55 : 425->430)] java.lang.Throwable
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

    /*
     * Exception decompiling
     */
    public static int zza(Context var0, String var1_1, boolean var2_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [35 : 124->132)] java.lang.Throwable
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int zzb(Context var0, String var1_7, boolean var2_9, boolean var3_10) {
        block44: {
            block45: {
                block43: {
                    block42: {
                        var4_11 = null;
                        var5_12 = DynamiteModule.zzh;
                        var5_12 = var5_12.get();
                        var5_12 = (Long)var5_12;
                        var6_14 = var5_12.longValue();
                        var8_15 = "api_force_staging";
                        var9_16 = "api";
                        var10_17 = 1;
                        if (var10_17 != var2_9) {
                            var8_15 = var9_16;
                        }
                        var11_18 = new Uri.Builder();
                        var9_16 = "content";
                        var11_18 = var11_18.scheme(var9_16);
                        var9_16 = "com.google.android.gms.chimera";
                        var11_18 = var11_18.authority(var9_16);
                        var11_18 = var11_18.path(var8_15);
                        var1_7 = var11_18.appendPath((String)var1_7);
                        var11_18 = "requestStartUptime";
                        var5_12 = String.valueOf(var6_14);
                        var1_7 = var1_7.appendQueryParameter(var11_18, (String)var5_12);
                        var12_19 = var1_7.build();
                        var0 = var0.getContentResolver();
                        var0 = var0.acquireUnstableContentProviderClient((Uri)var12_19);
                        var13_20 = 2;
                        var2_9 = 0;
                        var11_18 = null;
                        if (var0 == null) break block42;
                        var14_21 = 0;
                        var15_22 = 0;
                        var16_23 = 0;
                        var17_24 = null;
                        var18_25 = var0;
                        var5_12 = var0.query((Uri)var12_19, null, null, null, null);
                        if (var5_12 != null) break block43;
                        var0.release();
                    }
                    var9_16 = null;
                    ** GOTO lbl103
                }
                try {
                    var19_26 = var5_12.getCount();
                    var20_27 = var5_12.getColumnCount();
                    var18_25 = var5_12.getColumnNames();
                    var9_16 = new MatrixCursor(var18_25, var19_26);
                    var18_25 = null;
                    ** GOTO lbl64
                }
                catch (Throwable var23_30) {}
                try {
                    var5_12.close();
                    throw var23_30;
                }
                catch (Throwable var5_13) {
                    block47: {
                        var23_30.addSuppressed(var5_13);
                        throw var23_30;
                        catch (Throwable var0_1) {
                            break block44;
                        }
                        catch (Exception var0_2) {}
                        var9_16 = null;
                        break block45;
lbl64:
                        // 2 sources

                        for (var21_28 = 0; var21_28 < var19_26; ++var21_28) {
                            var22_29 = var5_12.moveToPosition(var21_28);
                            if (!var22_29) {
                                var8_15 = "Cursor read incomplete (ContentProvider dead?)";
                                var23_32 = new RemoteException(var8_15);
                                throw var23_32;
                            }
                            var12_19 = new Object[var20_27];
                            for (var15_22 = 0; var15_22 < var20_27; ++var15_22) {
                                var16_23 = var5_12.getType(var15_22);
                                if (var16_23 != 0) {
                                    if (var16_23 != var10_17) {
                                        if (var16_23 != var13_20) {
                                            var14_21 = 3;
                                            if (var16_23 != var14_21) {
                                                var14_21 = 4;
                                                if (var16_23 != var14_21) {
                                                    var8_15 = "Unknown column type";
                                                    var23_31 = new RemoteException(var8_15);
                                                    throw var23_31;
                                                }
                                                var12_19[var15_22] = var17_24 = (Object)var5_12.getBlob(var15_22);
                                                continue;
                                            }
                                            var12_19[var15_22] = var17_24 = var5_12.getString(var15_22);
                                            continue;
                                        }
                                        var24_33 = var5_12.getDouble(var15_22);
                                        var12_19[var15_22] = var17_24 = Double.valueOf(var24_33);
                                        continue;
                                    }
                                    var26_34 = var5_12.getLong(var15_22);
                                    var12_19[var15_22] = var17_24 = Long.valueOf(var26_34);
                                    continue;
                                }
                                var12_19[var15_22] = null;
                            }
                            var9_16.addRow(var12_19);
                        }
                        try {
                            var5_12.close();
                        }
                        catch (Throwable var1_8) {}
                        {
                            var0.release();
                        }
                        if (var9_16 != null) {
                            block48: {
                                var28_35 = var9_16.moveToFirst();
                                if (var28_35 == 0) break block47;
                                var28_35 = var9_16.getInt(0);
                                if (var28_35 <= 0) break block48;
                                var5_12 = DynamiteModule.class;
                                ** synchronized (var5_12)
lbl-1000:
                                // 1 sources

                                {
                                    DynamiteModule.zzc = var1_7 = var9_16.getString(var13_20);
                                    var1_7 = "loaderVersion";
                                    var13_20 = var9_16.getColumnIndex((String)var1_7);
                                    if (var13_20 >= 0) {
                                        DynamiteModule.zze = var13_20 = var9_16.getInt(var13_20);
                                    }
                                    if ((var13_20 = var9_16.getColumnIndex((String)(var1_7 = "disableStandaloneDynamiteLoader2"))) >= 0) {
                                        if ((var13_20 = var9_16.getInt(var13_20)) == 0) {
                                            var10_17 = 0;
                                        }
                                        DynamiteModule.zzd = var10_17;
                                        var2_9 = var10_17;
                                    }
                                }
                                var13_20 = (int)DynamiteModule.zze((Cursor)var9_16);
                                if (var13_20 == 0) break block48;
                                var9_16 = null;
                            }
                            if (var3_10 && var2_9 != 0) {
                                var1_7 = "forcing fallback to container DynamiteLoader impl";
                                var0 = new DynamiteModule$LoadingException((String)var1_7, null);
                                throw var0;
                            }
                            if (var9_16 == null) return var28_35;
                            var9_16.close();
                            return var28_35;
                        }
                    }
                    var1_7 = "Failed to connect to dynamite module ContentResolver.";
                    var0 = new DynamiteModule$LoadingException((String)var1_7, null);
                    throw var0;
                    catch (RemoteException v0) {}
                    ** finally { 
                }
lbl-1000:
                // 1 sources

                {
                    var0.release();
                    throw var1_8;
                }
                {
                    catch (Throwable var0_3) {}
                    {
                        throw var0_3;
                    }
                }
                catch (Throwable var0_4) {}
                catch (Exception var0_5) {}
                {
                    ** finally { 
                }
lbl150:
                // 1 sources

                var4_11 = var9_16;
                break block44;
            }
            var13_20 = var0 instanceof DynamiteModule$LoadingException;
            if (var13_20 == 0) ** GOTO lbl156
            {
                throw (Throwable)var0;
lbl156:
                // 1 sources

                var11_18 = var0.getMessage();
                var29_36 = new StringBuilder();
                var5_12 = "V2 version check failed: ";
                var29_36.append((String)var5_12);
                var29_36.append(var11_18);
                var11_18 = var29_36.toString();
                var1_7 = new DynamiteModule$LoadingException(var11_18, (Throwable)var0, null);
                throw var1_7;
            }
        }
        if (var4_11 == null) throw var0_6;
        var4_11.close();
        throw var0_6;
    }

    private static DynamiteModule zzc(Context context, String object) {
        object = String.valueOf(object);
        "Selected local version of ".concat((String)object);
        object = new DynamiteModule(context);
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zzd(ClassLoader iBinder) {
        void var0_6;
        Object object;
        block9: {
            block8: {
                object = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2";
                try {
                    iBinder = iBinder.loadClass((String)object);
                    iBinder = iBinder.getConstructor(null);
                    iBinder = iBinder.newInstance(null);
                    iBinder = iBinder;
                    if (iBinder == null) {
                        object = null;
                        break block8;
                    }
                    object = "com.google.android.gms.dynamite.IDynamiteLoaderV2";
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    break block9;
                }
                catch (InvocationTargetException invocationTargetException) {
                    break block9;
                }
                catch (InstantiationException instantiationException) {
                    break block9;
                }
                catch (IllegalAccessException illegalAccessException) {
                    break block9;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    break block9;
                }
                boolean bl2 = (object = iBinder.queryLocalInterface((String)object)) instanceof zzq;
                object = bl2 ? (zzq)object : new zzq(iBinder);
            }
            zzl = object;
            return;
        }
        object = new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", (Throwable)var0_6, null);
        throw object;
    }

    private static boolean zze(Cursor cursor) {
        Cursor cursor2;
        zzm zzm2 = (zzm)zzg.get();
        if (zzm2 != null && (cursor2 = zzm2.zza) == null) {
            zzm2.zza = cursor;
            return true;
        }
        return false;
    }

    private static boolean zzf(Context object) {
        Boolean bl2 = Boolean.TRUE;
        Boolean bl3 = null;
        boolean bl4 = bl2.equals(null);
        int n3 = 1;
        if (bl4) {
            return n3 != 0;
        }
        bl3 = zzf;
        boolean bl5 = bl2.equals(bl3);
        if (bl5) {
            return n3 != 0;
        }
        bl2 = zzf;
        bl4 = false;
        bl3 = null;
        if (bl2 == null) {
            Object object2;
            bl2 = object.getPackageManager();
            int n4 = PlatformVersion.isAtLeastQ();
            if (n3 != n4) {
                n4 = 0;
                object2 = null;
            } else {
                n4 = 0x10000000;
            }
            String string2 = "com.google.android.gms.chimera";
            bl2 = bl2.resolveContentProvider(string2, n4);
            object2 = GoogleApiAvailabilityLight.getInstance();
            int n7 = 10000000;
            int n8 = ((GoogleApiAvailabilityLight)object2).isGooglePlayServicesAvailable((Context)object, n7);
            if (n8 == 0 && bl2 != null && (n8 = (int)(((String)(object = "com.google.android.gms")).equals(object2 = ((ProviderInfo)bl2).packageName) ? 1 : 0)) != 0) {
                bl4 = true;
            }
            object = bl4;
            zzf = object;
            if (bl4 && (object = ((ProviderInfo)bl2).applicationInfo) != null && (n8 = ((ApplicationInfo)object).flags & 0x81) == 0) {
                zzd = n3;
            }
        }
        return bl4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzp zzg(Context object) {
        Class<DynamiteModule> clazz = DynamiteModule.class;
        synchronized (clazz) {
            Throwable throwable2;
            block11: {
                Exception exception2;
                block10: {
                    int n3;
                    Object object2;
                    try {
                        zzp zzp2 = zzk;
                        if (zzp2 != null) {
                            return zzp2;
                        }
                        zzp2 = null;
                        object2 = "com.google.android.gms";
                        n3 = 3;
                        try {
                            object = object.createPackageContext((String)object2, n3);
                            object = object.getClassLoader();
                            object2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl";
                            object = object.loadClass((String)object2);
                            object = object.newInstance();
                            object = (IBinder)object;
                            if (object == null) {
                                return null;
                            }
                            object2 = "com.google.android.gms.dynamite.IDynamiteLoader";
                        }
                        catch (Exception exception2) {
                            break block10;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    n3 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzp;
                    object2 = n3 != 0 ? (zzp)object2 : new zzp((IBinder)object);
                    if (object2 == null) return null;
                    zzk = object2;
                    return object2;
                }
                exception2.getMessage();
                return null;
            }
            throw throwable2;
        }
    }

    public Context getModuleContext() {
        return this.zzj;
    }

    /*
     * WARNING - void declaration
     */
    public IBinder instantiate(String string2) {
        void var2_6;
        Object object = this.zzj;
        object = object.getClassLoader();
        object = object.loadClass(string2);
        object = object.newInstance();
        try {
            return (IBinder)object;
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        string2 = String.valueOf(string2);
        string2 = "Failed to instantiate module class: ".concat(string2);
        DynamiteModule$LoadingException dynamiteModule$LoadingException = new DynamiteModule$LoadingException(string2, (Throwable)var2_6, null);
        throw dynamiteModule$LoadingException;
    }
}

