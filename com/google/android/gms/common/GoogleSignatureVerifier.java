/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.Signature
 */
package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.zzj;
import com.google.android.gms.common.zzk;
import com.google.android.gms.common.zzm;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzw;
import java.util.Set;

public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile Set zzb;
    private static volatile Set zzc;
    private final Context zzd;
    private volatile String zze;

    public GoogleSignatureVerifier(Context context) {
        this.zzd = context = context.getApplicationContext();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        Class<GoogleSignatureVerifier> clazz = GoogleSignatureVerifier.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        GoogleSignatureVerifier googleSignatureVerifier = zza;
                        if (googleSignatureVerifier != null) break block3;
                        zzn.zze(context);
                        zza = googleSignatureVerifier = new GoogleSignatureVerifier(context);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return zza;
            }
            throw throwable2;
        }
    }

    public static final zzj zza(PackageInfo object, zzj ... zzjArray) {
        Object object2 = ((PackageInfo)object).signatures;
        if (object2 != null) {
            int n3;
            int n4 = ((Signature[])object2).length;
            int n7 = 1;
            if (n4 != n7) {
                return null;
            }
            object = ((PackageInfo)object).signatures;
            object = object[0].toByteArray();
            object2 = new zzk((byte[])object);
            for (n7 = 0; n7 < (n3 = zzjArray.length); ++n7) {
                object = zzjArray[n7];
                n3 = (int)(((zzj)object).equals(object2) ? 1 : 0);
                if (n3 == 0) continue;
                return zzjArray[n7];
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean zzb(PackageInfo var0, boolean var1_1) {
        var2_2 = true;
        if (!var1_1) ** GOTO lbl16
        if (var0 /* !! */  != null) {
            var3_3 = "com.android.vending";
            var4_4 = var0 /* !! */ .packageName;
            var5_5 = var3_3.equals(var4_4);
            if (var5_5 || (var5_5 = (var4_4 = "com.google.android.gms").equals(var3_3 = var0 /* !! */ .packageName))) {
                var6_7 = var0 /* !! */ .applicationInfo;
                if (var6_7 == null) {
                    while (true) {
                        var1_1 = false;
                        var6_7 = null;
                        break;
                    }
                } else {
                    if (!(var1_1 = var6_7.flags & 129)) ** continue;
                    var1_1 = true;
                }
            }
lbl16:
            // 5 sources

            var3_3 = var0 /* !! */ ;
        } else {
            var5_6 = false;
            var3_3 = null;
        }
        if (var0 /* !! */  != null && (var0 /* !! */  = var3_3.signatures) != null) {
            if (var1_1) {
                var0 /* !! */  = zzm.zza;
                var0 /* !! */  = GoogleSignatureVerifier.zza((PackageInfo)var3_3, (zzj[])var0 /* !! */ );
            } else {
                var0 /* !! */  = zzm.zza[0];
                var6_7 = new zzj[var2_2];
                var6_7[0] = var0 /* !! */ ;
                var0 /* !! */  = GoogleSignatureVerifier.zza((PackageInfo)var3_3, var6_7);
            }
            if (var0 /* !! */  != null) {
                return var2_2;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final zzw zzc(String var1_1, boolean var2_2, boolean var3_3) {
        block8: {
            block10: {
                block12: {
                    block11: {
                        block9: {
                            var4_4 /* !! */  = "null pkg";
                            if (var1_1 == null) {
                                return zzw.zzc((String)var4_4 /* !! */ );
                            }
                            var5_6 = this.zze;
                            var3_3 = var1_1.equals(var5_6);
                            if (var3_3) break block8;
                            var3_3 = zzn.zzg();
                            if (!var3_3) break block9;
                            var2_2 = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd);
                            var4_4 /* !! */  = zzn.zzb(var1_1, var2_2, false, false);
                            break block10;
                        }
                        try {
                            var5_6 = this.zzd;
                        }
                        catch (PackageManager.NameNotFoundException var4_5) {
                            return zzw.zzd("no pkg ".concat(var1_1), var4_5);
                        }
                        var5_6 = var5_6.getPackageManager();
                        var6_7 = 64 != 0;
                        var5_6 = var5_6.getPackageInfo(var1_1, (int)var6_7);
                        var7_8 /* !! */  = this.zzd;
                        var6_7 = GooglePlayServicesUtilLight.honorsDebugCertificates(var7_8 /* !! */ );
                        if (var5_6 != null) break block11;
                        var4_4 /* !! */  = zzw.zzc((String)var4_4 /* !! */ );
                        break block10;
                    }
                    var4_4 /* !! */  = var5_6.signatures;
                    if (var4_4 /* !! */  == null || (var2_2 = ((Signature[])var4_4 /* !! */ ).length) != (var8_9 = true)) break block12;
                    var9_10 /* !! */  = var5_6.signatures[0].toByteArray();
                    var4_4 /* !! */  = new zzk(var9_10 /* !! */ );
                    var9_10 /* !! */  = (byte[])var5_6.packageName;
                    var7_8 /* !! */  = zzn.zza((String)var9_10 /* !! */ , (zzj)var4_4 /* !! */ , var6_7, false);
                    var10_11 = var7_8 /* !! */ .zza;
                    if (!var10_11 || (var5_6 = var5_6.applicationInfo) == null || !(var3_3 = var5_6.flags & 2)) ** GOTO lbl-1000
                    var4_4 /* !! */  = zzn.zza((String)var9_10 /* !! */ , (zzj)var4_4 /* !! */ , false, var8_9);
                    var2_2 = var4_4 /* !! */ .zza;
                    if (var2_2) {
                        var4_4 /* !! */  = zzw.zzc("debuggable release cert app rejected");
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_4 /* !! */  = var7_8 /* !! */ ;
                    }
                    break block10;
                }
                var4_4 /* !! */  = zzw.zzc("single cert required");
            }
            var3_3 = var4_4 /* !! */ .zza;
            if (var3_3) {
                this.zze = var1_1;
            }
            return var4_4 /* !! */ ;
        }
        return zzw.zzb();
    }

    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        boolean bl2 = GoogleSignatureVerifier.zzb(packageInfo, false);
        boolean bl3 = true;
        if (bl2) {
            return bl3;
        }
        boolean bl4 = GoogleSignatureVerifier.zzb(packageInfo, bl3);
        if (bl4 && (bl4 = GooglePlayServicesUtilLight.honorsDebugCertificates((Context)(packageInfo = this.zzd)))) {
            return bl3;
        }
        return false;
    }

    public boolean isPackageGoogleSigned(String object) {
        object = this.zzc((String)object, false, false);
        ((zzw)object).zze();
        return ((zzw)object).zza;
    }

    public boolean isUidGoogleSigned(int n3) {
        Object object;
        block4: {
            int n4;
            PackageManager packageManager = this.zzd.getPackageManager();
            Object object2 = packageManager.getPackagesForUid(n3);
            if (object2 != null && (n4 = ((String[])object2).length) != 0) {
                object = null;
                for (int i3 = 0; i3 < n4; ++i3) {
                    object = object2[i3];
                    object = this.zzc((String)object, false, false);
                    boolean bl2 = ((zzw)object).zza;
                    if (!bl2) {
                        continue;
                    }
                    break block4;
                }
                Preconditions.checkNotNull(object);
            } else {
                object2 = "no pkgs";
                object = zzw.zzc((String)object2);
            }
        }
        ((zzw)object).zze();
        return ((zzw)object).zza;
    }
}

