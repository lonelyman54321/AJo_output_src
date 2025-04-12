/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzavh;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzfrm;

final class zzayc
implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzaye zzb;

    public zzayc(zzaye zzaye2, int n3, boolean bl2) {
        this.zza = n3;
        this.zzb = zzaye2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        long l2;
        long l3;
        long l4;
        boolean bl2;
        boolean bl3;
        String string2;
        boolean bl4;
        boolean bl5;
        Object object;
        long l7;
        int n3 = this.zza;
        Object object2 = this.zzb;
        if (n3 > 0) {
            l7 = n3 *= 1000;
            try {
                Thread.sleep(l7);
            }
            catch (InterruptedException interruptedException) {}
        }
        try {
            object = ((zzaye)object2).zza;
            object = object.getPackageManager();
            Context context = ((zzaye)object2).zza;
            String string3 = context.getPackageName();
            object = object.getPackageInfo(string3, 0);
            object2 = ((zzaye)object2).zza;
            String string4 = object2.getPackageName();
            n3 = ((PackageInfo)object).versionCode;
            object = Integer.toString(n3);
            object = zzfrm.zza((Context)object2, string4, (String)object);
        }
        catch (Throwable throwable) {
            n3 = 0;
            object = null;
        }
        object2 = this.zzb;
        zzaye.zzm((zzaye)object2, (zzaus)object);
        int n4 = this.zza;
        int n7 = 4;
        if (n4 >= n7) return;
        if (object != null && (bl5 = ((zzaus)object).zzar()) && !(bl4 = ((String)(object2 = ((zzaus)object).zzi())).equals(string2 = "0000000000000000000000000000000000000000000000000000000000000000")) && (bl3 = ((zzaus)object).zzas()) && (bl2 = ((zzavh)(object2 = ((zzaus)object).zzg())).zze()) && (l4 = (l3 = (l2 = ((zzavh)(object = ((zzaus)object).zzg())).zza()) - (l7 = (long)-2)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            return;
        }
        object = this.zzb;
        int n8 = this.zza;
        int n10 = 1;
        int n14 = n8 + n10;
        ((zzaye)object).zzo(n14, n10 != 0);
    }
}

