/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.zze;
import com.google.android.gms.common.zzf;
import com.google.android.gms.common.zzg;
import com.google.android.gms.common.zzh;
import com.google.android.gms.common.zzi;
import com.google.android.gms.common.zzj;
import com.google.android.gms.common.zzl;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzs;
import com.google.android.gms.common.zzu;
import com.google.android.gms.common.zzw;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy;
import java.util.concurrent.Callable;

final class zzn {
    static final zzl zza;
    static final zzl zzb;
    static final zzl zzc;
    static final zzl zzd;
    private static volatile zzag zze;
    private static final Object zzf;
    private static Context zzg;

    static {
        byte[] byArray = zzj.zze("0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bs\u00f9/\u008eQ\u00ed");
        Object object = new zzf(byArray);
        zza = object;
        byArray = zzj.zze("0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0003\u00a3\u00b2\u00ad\u00d7\u00e1r\u00cak\u00ec");
        object = new zzg(byArray);
        zzb = object;
        byArray = zzj.zze("0\u0082\u0004C0\u0082\u0003+\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0");
        object = new zzh(byArray);
        zzc = object;
        byArray = zzj.zze("0\u0082\u0004\u00a80\u0082\u0003\u0090\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085\u00b8l}\u00d3N\u00f50");
        object = new zzi(byArray);
        zzd = object;
        zzf = object = new Object();
    }

    public static zzw zza(String object, zzj zzj2, boolean bl2, boolean bl3) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        try {
            object = zzn.zzh((String)object, zzj2, bl2, bl3);
            return object;
        }
        finally {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
    }

    public static zzw zzb(String string2, boolean bl2, boolean bl3, boolean bl4) {
        return zzn.zzi(string2, bl2, false, false, true);
    }

    public static zzw zzc(String string2, boolean bl2, boolean bl3, boolean bl4) {
        return zzn.zzi(string2, bl2, false, false, false);
    }

    /*
     * Unable to fully structure code
     */
    public static /* synthetic */ String zzd(boolean var0, String var1_1, zzj var2_2) {
        if (var0) ** GOTO lbl-1000
        var3_3 = null;
        var4_4 = zzn.zzh(var1_1, (zzj)var2_2, true, false);
        var5_5 = var4_4.zza;
        if (var5_5) {
            var4_4 = "debug cert rejected";
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = "not allowed";
        }
        var3_3 = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(var3_3);
        var2_2 = var2_2.zzf();
        var2_2 = Hex.bytesToStringLowercase(var3_3.digest((byte[])var2_2));
        var3_3 = new StringBuilder();
        var3_3.append((String)var4_4);
        var3_3.append(": pkg=");
        var3_3.append(var1_1);
        var3_3.append(", sha256=");
        var3_3.append((String)var2_2);
        var3_3.append(", atk=");
        var3_3.append(var0);
        var3_3.append(", ver=12451000.false");
        return var3_3.toString();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zze(Context context) {
        Class<zzn> clazz = zzn.class;
        synchronized (clazz) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        Context context2 = zzg;
                        if (context2 != null) break block5;
                        if (context != null) {
                            zzg = context = context.getApplicationContext();
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public static boolean zzf() {
        boolean bl2;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        zzn.zzj();
        zzag zzag2 = zze;
        try {
            bl2 = zzag2.zzg();
        }
        catch (Throwable throwable) {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            throw throwable;
        }
        catch (RemoteException | DynamiteModule$LoadingException throwable) {
            bl2 = false;
            zzag2 = null;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        return bl2;
    }

    public static boolean zzg() {
        boolean bl2;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        zzn.zzj();
        zzag zzag2 = zze;
        try {
            bl2 = zzag2.zzi();
        }
        catch (Throwable throwable) {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            throw throwable;
        }
        catch (RemoteException | DynamiteModule$LoadingException throwable) {
            bl2 = false;
            zzag2 = null;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzw zzh(String object, zzj object2, boolean bl2, boolean bl3) {
        Object object3;
        block4: {
            try {
                zzn.zzj();
            }
            catch (DynamiteModule$LoadingException dynamiteModule$LoadingException) {
                object2 = String.valueOf(dynamiteModule$LoadingException.getMessage());
                return zzw.zzd("module init: ".concat((String)object2), dynamiteModule$LoadingException);
            }
            Preconditions.checkNotNull(zzg);
            zzs zzs2 = new zzs((String)object, (zzj)object2, bl2, bl3);
            try {
                object3 = zze;
                Object object4 = zzg;
                object4 = object4.getPackageManager();
                object4 = ObjectWrapper.wrap(object4);
                bl3 = object3.zzh(zzs2, (IObjectWrapper)object4);
                if (!bl3) break block4;
                return zzw.zzb();
            }
            catch (RemoteException remoteException) {
                return zzw.zzd("module call", remoteException);
            }
        }
        object3 = new zze(bl2, (String)object, (zzj)object2);
        return new zzu((Callable)object3, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    private static zzw zzi(String var0, boolean var1_4, boolean var2_5, boolean var3_6, boolean var4_7) {
        block9: {
            block12: {
                block10: {
                    block11: {
                        block13: {
                            var5_8 = StrictMode.allowThreadDiskReads();
                            var6_9 /* !! */  = zzn.zzg;
                            Preconditions.checkNotNull(var6_9 /* !! */ );
                            zzn.zzj();
                            var7_10 = zzn.zzg;
                            var8_11 = ObjectWrapper.wrap(var7_10);
                            var9_12 = true;
                            var7_10 = var6_9 /* !! */ ;
                            var6_9 /* !! */  = new zzo((String)var0, var1_4, false, (IBinder)var8_11, false, var9_12);
                            if (!var4_7) ** GOTO lbl22
                            var0 = zzn.zze;
                            var0 = var0.zze((zzo)var6_9 /* !! */ );
                            break block13;
                            catch (Throwable var0_1) {
                                break block9;
                            }
                            catch (RemoteException var0_2) {}
                            break block10;
lbl22:
                            // 1 sources

                            var0 = zzn.zze;
                            var0 = var0.zzf((zzo)var6_9 /* !! */ );
                        }
                        var1_4 = var0.zzb();
                        if (!var1_4) break block11;
                        var10_13 = var0.zzc();
                        var0 = zzw.zzf(var10_13);
                        break block12;
                    }
                    var11_15 = var0.zza();
                    var3_6 = var0.zzd();
                    if (var3_6 == (var4_7 = 4)) {
                        var6_9 /* !! */  = new PackageManager.NameNotFoundException();
                    } else {
                        var3_6 = false;
                        var6_9 /* !! */  = null;
                    }
                    var12_18 = "error checking package certificate";
                    if (var11_15 == null) {
                        var11_15 = var12_18;
                    }
                    var4_7 = var0.zzc();
                    var10_14 = var0.zzd();
                    var0 = zzw.zzg((int)var4_7, var10_14, var11_15, (Throwable)var6_9 /* !! */ );
                    break block12;
                }
                var11_16 = "module call";
                var0 = zzw.zzd(var11_16, var0_2);
                break block12;
                catch (DynamiteModule$LoadingException var0_3) {
                    var11_17 = var0_3.getMessage();
                    var6_9 /* !! */  = "module init: ";
                    var11_17 = String.valueOf(var11_17);
                    var11_17 = var6_9 /* !! */ .concat(var11_17);
                    var0 = zzw.zzd(var11_17, var0_3);
                }
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var5_8);
            return var0;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var5_8);
        throw var0_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zzj() {
        Object object = zze;
        if (object != null) {
            return;
        }
        Preconditions.checkNotNull(zzg);
        object = zzf;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object2 = zze;
                        if (object2 != null) break block4;
                        object2 = zzg;
                        Object object3 = DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING;
                        String string2 = "com.google.android.gms.googlecertificates";
                        object2 = DynamiteModule.load((Context)object2, (DynamiteModule$VersionPolicy)object3, string2);
                        object3 = "com.google.android.gms.common.GoogleCertificatesImpl";
                        object2 = ((DynamiteModule)object2).instantiate((String)object3);
                        zze = object2 = zzaf.zzb((IBinder)object2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

