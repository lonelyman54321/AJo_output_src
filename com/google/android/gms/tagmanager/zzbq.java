/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfr;
import java.io.File;

final class zzbq {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zza(String string2) {
        int n3;
        Object object;
        try {
            object = Build.VERSION.SDK;
            int n4 = Integer.parseInt((String)object);
            n3 = 9;
            if (n4 < n3) {
                return false;
            }
        }
        catch (NumberFormatException numberFormatException) {
            string2 = String.valueOf(Build.VERSION.SDK);
            String string3 = "Invalid version number: ";
            string3.concat(string2);
            return false;
        }
        zzfm.zza();
        n3 = zzfr.zza;
        object = new File(string2);
        ((File)object).setReadable(false, false);
        ((File)object).setWritable(false, false);
        boolean bl2 = true;
        ((File)object).setReadable(bl2, bl2);
        ((File)object).setWritable(bl2, bl2);
        return bl2;
    }
}

