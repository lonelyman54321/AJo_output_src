/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzfxi;
import java.util.ArrayList;

public final class zzfxj {
    private static final zzfwv zza;

    static {
        zzfwv zzfwv2;
        zza = zzfwv2 = new zzfwv("PhoneskyVerificationUtils");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zza(Context object) {
        Object object3;
        Object object4;
        block9: {
            int n4;
            Object object2;
            block8: {
                object4 = "Play Store package is not found.";
                object3 = "com.android.vending";
                try {
                    object2 = object.getPackageManager();
                    object2 = object2.getApplicationInfo((String)object3, 0);
                    n4 = object2.enabled;
                    if (n4 != 0) break block8;
                    object = zza;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    object = zza;
                    object3 = new Object[]{};
                    ((zzfwv)object).zzd((String)object4, (Object[])object3);
                    return false;
                }
                object4 = new Object[]{};
                object3 = "Play Store package is disabled.";
                ((zzfwv)object).zzd((String)object3, (Object[])object4);
                return false;
            }
            try {
                object = object.getPackageManager();
                n4 = 64;
                object = object.getPackageInfo((String)object3, n4);
                object = ((PackageInfo)object).signatures;
                if (object == null) break block9;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object = zza;
                object3 = new Object[]{};
                ((zzfwv)object).zzd((String)object4, (Object[])object3);
                return false;
            }
            int n3 = ((Object)object).length;
            if (n3 != 0) {
                object3 = new ArrayList();
                object2 = null;
                for (n4 = 0; n4 < n3; ++n4) {
                    String string3 = zzfxi.zza(object[n4].toByteArray());
                    ((ArrayList)object3).add(string3);
                    String string4 = "8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M";
                    boolean bl4 = string4.equals(string3);
                    if (bl4) return true;
                    string4 = Build.TAGS;
                    String string2 = "dev-keys";
                    boolean bl3 = string4.contains(string2);
                    if (!bl3 && !(bl4 = string4.contains(string2 = "test-keys"))) continue;
                    string4 = "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA";
                    boolean bl2 = string4.equals(string3);
                    if (bl2) return true;
                }
                object = zza;
                object4 = new StringBuilder();
                n4 = (int)((object3 = ((ArrayList)object3).iterator()).hasNext() ? 1 : 0);
                if (n4 != 0) {
                    while (true) {
                        object2 = (CharSequence)object3.next();
                        ((StringBuilder)object4).append((CharSequence)object2);
                        n4 = (int)(object3.hasNext() ? 1 : 0);
                        if (n4 == 0) break;
                        object2 = ", ";
                        ((StringBuilder)object4).append((CharSequence)object2);
                    }
                }
                object4 = ((StringBuilder)object4).toString();
                object2 = "].";
                object4 = cP.a("Play Store package certs are not valid. Found these sha256 certs: [", (String)object4, (String)object2);
                object3 = new Object[]{};
                ((zzfwv)object).zzd((String)object4, (Object[])object3);
                return false;
            }
        }
        object = zza;
        object4 = new Object[]{};
        object3 = "Play Store package is not signed -- possibly self-built package. Could not verify.";
        ((zzfwv)object).zzd((String)object3, (Object[])object4);
        return false;
    }
}

