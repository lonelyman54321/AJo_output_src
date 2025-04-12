/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfyu;
import com.google.android.gms.internal.ads.zzgdn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

public final class zzfsk {
    public static boolean zza(zzazw zzazw2) {
        int n3;
        int n4;
        int n7 = zzazw2.ordinal();
        if (n7 != (n4 = 1) && n7 != (n3 = 2) && n7 != (n3 = 3) && n7 != (n3 = 4) && n7 != (n3 = 5)) {
            return false;
        }
        return n4 != 0;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final zzazw zzb(Context object, zzfre zzfre2) {
        Object object2;
        block25: {
            block29: {
                int n3;
                Object object3;
                block31: {
                    block30: {
                        block28: {
                            block23: {
                                Object object4;
                                block27: {
                                    block24: {
                                        Throwable throwable222222;
                                        IOException iOException222222;
                                        block22: {
                                            block15: {
                                                block16: {
                                                    block17: {
                                                        block18: {
                                                            block19: {
                                                                block20: {
                                                                    block21: {
                                                                        String string2;
                                                                        block26: {
                                                                            string2 = object.getApplicationInfo().dataDir;
                                                                            object3 = new File(string2);
                                                                            string2 = "lib";
                                                                            object2 = new File((File)object3, string2);
                                                                            n3 = ((File)object2).exists();
                                                                            object4 = 5017;
                                                                            if (n3 != 0) break block26;
                                                                            zzfre2.zzb((int)object4, "No lib/");
                                                                            object2 = zzazw.zzg;
                                                                            break block23;
                                                                        }
                                                                        Object object5 = 2;
                                                                        Object object6 = Pattern.compile(".*\\.so$", object5);
                                                                        object3 = new zzgdn((Pattern)object6);
                                                                        if ((object2 = ((File)object2).listFiles((FilenameFilter)object3)) == null || (n3 = ((File[])object2).length) == 0) break block27;
                                                                        object4 = 0;
                                                                        string2 = null;
                                                                        object2 = object2[0];
                                                                        object3 = new FileInputStream((File)object2);
                                                                        int n4 = 20;
                                                                        {
                                                                            catch (IOException iOException222222) {}
                                                                        }
                                                                        try {
                                                                            object6 = new byte[n4];
                                                                            int n7 = ((FileInputStream)object3).read((byte[])object6);
                                                                            if (n7 != n4) break block15;
                                                                            object2 = new byte[object5];
                                                                            object2[0] = (File)false;
                                                                            n7 = 1;
                                                                            object2[n7] = false;
                                                                            Object object7 = 5;
                                                                            if ((object7 = (Object)object6[object7]) == object5) {
                                                                                zzfsk.zzd((byte[])object6, null, object, zzfre2);
                                                                                object2 = zzazw.zza;
                                                                                break block16;
                                                                            }
                                                                            object5 = 19;
                                                                            object5 = object6[object5];
                                                                            object2[0] = object5;
                                                                            object4 = 18;
                                                                            object4 = object6[object4];
                                                                            object2[n7] = object4;
                                                                            n4 = ((ByteBuffer)(object2 = ByteBuffer.wrap((byte[])object2))).getShort();
                                                                            if (n4 == (object4 = 3)) break block17;
                                                                            object4 = 40;
                                                                            if (n4 == object4) break block18;
                                                                            object4 = 62;
                                                                            if (n4 == object4) break block19;
                                                                            object4 = 183;
                                                                            if (n4 == object4) break block20;
                                                                            object4 = 243;
                                                                            if (n4 == object4) break block21;
                                                                            zzfsk.zzd((byte[])object6, null, object, zzfre2);
                                                                            object2 = zzazw.zza;
                                                                            break block16;
                                                                        }
                                                                        catch (Throwable throwable222222) {
                                                                            break block22;
                                                                        }
                                                                    }
                                                                    object2 = zzazw.zzf;
                                                                    break block16;
                                                                }
                                                                object2 = zzazw.zzd;
                                                                break block16;
                                                            }
                                                            object2 = zzazw.zze;
                                                            break block16;
                                                        }
                                                        object2 = zzazw.zzb;
                                                        break block16;
                                                    }
                                                    object2 = zzazw.zzc;
                                                }
                                                ((FileInputStream)object3).close();
                                                break block23;
                                            }
                                            ((FileInputStream)object3).close();
                                            break block24;
                                        }
                                        try {
                                            ((FileInputStream)object3).close();
                                            throw throwable222222;
                                        }
                                        catch (Throwable throwable3) {
                                            throwable222222.addSuppressed(throwable3);
                                            throw throwable222222;
                                        }
                                        object2 = ((Object)iOException222222).toString();
                                        zzfsk.zzd(null, (String)object2, object, zzfre2);
                                    }
                                    object2 = zzazw.zza;
                                    break block23;
                                }
                                zzfre2.zzb((int)object4, "No .so");
                                object2 = zzazw.zzg;
                            }
                            object3 = zzazw.zzg;
                            if (object2 != object3) break block25;
                            object2 = zzfsk.zzc(object, zzfre2);
                            n3 = TextUtils.isEmpty((CharSequence)object2);
                            if (n3 == 0) break block28;
                            zzfsk.zzd(null, "Empty dev arch", object, zzfre2);
                            object2 = zzazw.zza;
                            break block25;
                        }
                        object3 = "i686";
                        n3 = (int)(((String)object2).equalsIgnoreCase((String)object3) ? 1 : 0);
                        if (n3 != 0 || (n3 = (int)(((String)object2).equalsIgnoreCase((String)(object3 = "x86")) ? 1 : 0)) != 0) break block29;
                        object3 = "x86_64";
                        n3 = (int)(((String)object2).equalsIgnoreCase((String)object3) ? 1 : 0);
                        if (n3 == 0) break block30;
                        object2 = zzazw.zze;
                        break block25;
                    }
                    object3 = "arm64-v8a";
                    n3 = (int)(((String)object2).equalsIgnoreCase((String)object3) ? 1 : 0);
                    if (n3 == 0) break block31;
                    object2 = zzazw.zzd;
                    break block25;
                }
                object3 = "armeabi-v7a";
                n3 = (int)(((String)object2).equalsIgnoreCase((String)object3) ? 1 : 0);
                if (n3 == 0 && (n3 = (int)(((String)object2).equalsIgnoreCase((String)(object3 = "armv71")) ? 1 : 0)) == 0) {
                    object3 = "riscv64";
                    n3 = (int)(((String)object2).equalsIgnoreCase((String)object3) ? 1 : 0);
                    if (n3 != 0) {
                        object2 = zzazw.zzf;
                        break block25;
                    } else {
                        zzfsk.zzd(null, (String)object2, object, zzfre2);
                        object2 = zzazw.zza;
                    }
                    break block25;
                } else {
                    object2 = zzazw.zzb;
                }
                break block25;
            }
            object2 = zzazw.zzc;
        }
        object = ((Enum)object2).name();
        zzfre2.zzb(5018, (String)object);
        return object2;
    }

    private static final String zzc(Context object, zzfre zzfre2) {
        block9: {
            NoSuchFieldException noSuchFieldException2;
            long l2;
            int n3;
            block11: {
                String string2 = "i686";
                Object object2 = Arrays.asList(string2, "armv71");
                object = new HashSet(object2);
                object2 = zzfyu.zzu.zza();
                boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl2 && (n3 = ((HashSet)object).contains(object2)) != 0) {
                    return object2;
                }
                l2 = 0L;
                n3 = 2024;
                String[] stringArray = Build.class;
                String string3 = "SUPPORTED_ABIS";
                stringArray = stringArray.getField(string3);
                int n4 = 0;
                string3 = null;
                stringArray = stringArray.get(null);
                stringArray = stringArray;
                if (stringArray == null) break block9;
                n4 = stringArray.length;
                if (n4 <= 0) break block9;
                n4 = 0;
                string3 = null;
                try {
                    return stringArray[0];
                }
                catch (IllegalAccessException illegalAccessException) {
                }
                catch (NoSuchFieldException noSuchFieldException2) {
                    break block11;
                }
                zzfre2.zzc(n3, l2, illegalAccessException);
                break block9;
            }
            zzfre2.zzc(n3, l2, noSuchFieldException2);
        }
        if ((object = Build.CPU_ABI) != null) {
            return object;
        }
        return Build.CPU_ABI2;
    }

    private static final void zzd(byte[] object, String string2, Context object2, zzfre zzfre2) {
        Object object3;
        String string3;
        block9: {
            object2 = new StringBuilder("os.arch:");
            string3 = zzfyu.zzu.zza();
            ((StringBuilder)object2).append(string3);
            string3 = ";";
            ((StringBuilder)object2).append(string3);
            object3 = Build.class;
            String string4 = "SUPPORTED_ABIS";
            object3 = object3.getField(string4);
            string4 = null;
            object3 = object3.get(null);
            object3 = object3;
            if (object3 == null) break block9;
            string4 = "supported_abis:";
            ((StringBuilder)object2).append(string4);
            object3 = Arrays.toString(object3);
            ((StringBuilder)object2).append((String)object3);
            try {
                ((StringBuilder)object2).append(string3);
            }
            catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {}
        }
        ((StringBuilder)object2).append("CPU_ABI:");
        object3 = Build.CPU_ABI;
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(";CPU_ABI2:");
        object3 = Build.CPU_ABI2;
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(string3);
        if (object != null) {
            object3 = "ELF:";
            ((StringBuilder)object2).append((String)object3);
            object = Arrays.toString(object);
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(string3);
        }
        if (string2 != null) {
            object = "dbg:";
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(string3);
        }
        string2 = ((StringBuilder)object2).toString();
        zzfre2.zzb(4007, string2);
    }
}

