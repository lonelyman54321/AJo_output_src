/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package com.google.android.gms.common.util;

import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.common.zzab;
import com.google.android.gms.internal.common.zzac;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class ProcessUtils {
    private static String zza;
    private static int zzb;
    private static Boolean zzc;

    private ProcessUtils() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String getMyProcessName() {
        block17: {
            block18: {
                var0 = "/proc/";
                var1_5 = ProcessUtils.zza;
                if (var1_5 != null) return ProcessUtils.zza;
                var2_6 = Build.VERSION.SDK_INT;
                var3_7 = 28;
                if (var2_6 >= var3_7) {
                    ProcessUtils.zza = var0 = hy_2.a();
                    return ProcessUtils.zza;
                }
                var2_6 = ProcessUtils.zzb;
                if (var2_6 == 0) {
                    ProcessUtils.zzb = var2_6 = Process.myPid();
                }
                var3_7 = 0;
                var4_8 = null;
                if (var2_6 > 0) {
                    var5_9 = new StringBuilder(var0);
                    var5_9.append(var2_6);
                    var0 = "/cmdline";
                    var5_9.append(var0);
                    var0 = var5_9.toString();
                    var1_5 = StrictMode.allowThreadDiskReads();
                    var6_10 = new FileReader(var0);
                    var5_9 = new BufferedReader(var6_10);
                } else lbl-1000:
                // 2 sources

                {
                    while (true) {
                        ProcessUtils.zza = var4_8;
                        return ProcessUtils.zza;
                    }
                }
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var1_5);
                ** try [egrp 3[TRYBLOCK] [19, 18 : 127->142)] { 
lbl34:
                // 1 sources

                break block18;
lbl35:
                // 1 sources

                catch (IOException v0) {}
lbl36:
                // 2 sources

                while (true) {
                    IOUtils.closeQuietly((Closeable)var5_9);
                    ** continue;
                    break;
                }
                {
                    catch (Throwable var0_2) {}
                    catch (Throwable var0_3) {}
                    ** try [egrp 4[TRYBLOCK] [25, 24 : 165->171)] { 
lbl42:
                    // 1 sources

                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var1_5);
                    throw var0_3;
lbl44:
                    // 3 sources

                    catch (IOException v1) {
                        var5_9 = null;
                        return var5_9;
                    }
lbl47:
                    // 1 sources

                    finally {
                        break block17;
                    }
                }
            }
            var0 = var5_9.readLine();
            Preconditions.checkNotNull(var0);
            var4_8 = var0.trim();
            ** while (true)
lbl55:
            // 1 sources

            catch (Throwable var0_1) {
                var4_8 = var5_9;
            }
        }
        IOUtils.closeQuietly(var4_8);
        throw var0_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zza() {
        Object object = zzc;
        if (object == null) {
            boolean bl2 = PlatformVersion.isAtLeastP();
            if (bl2) {
                bl2 = gy_2.b();
                object = bl2;
            } else {
                object = Process.class;
                String string2 = "isIsolated";
                String string3 = null;
                try {
                    zzj[] zzjArray = new zzj[]{};
                    object = zzl.zza((Class)object, string2, zzjArray);
                    Object[] objectArray = new Object[]{};
                    string3 = "expected a non-null reference";
                    if (object == null) {
                        String string4 = zzab.zza(string3, objectArray);
                        object = new zzac(string4);
                        throw object;
                    }
                    object = (Boolean)object;
                }
                catch (ReflectiveOperationException reflectiveOperationException) {}
                object = Boolean.FALSE;
            }
            zzc = object;
        }
        return (Boolean)object;
    }
}

