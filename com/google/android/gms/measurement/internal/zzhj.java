/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzou;

public final class zzhj {
    final zzic zza;

    public zzhj(zzou zzjh2) {
        zzjh2 = zzjh2.zzk();
        this.zza = zzjh2;
    }

    public final Bundle zza(String object, zzbz object2) {
        Exception exception2;
        block8: {
            block7: {
                this.zza.zzl().zzv();
                if (object2 == null) {
                    this.zza.zzj().zzr().zza("Attempting to use Install Referrer Service while it is not initialized");
                    return null;
                }
                String string2 = "package_name";
                object = E1.a(string2, (String)object);
                try {
                    object = object2.zza((Bundle)object);
                    if (object != null) break block7;
                }
                catch (Exception exception2) {}
                object = this.zza;
                object = ((zzic)object).zzj();
                object = ((zzgo)object).zzg();
                object2 = "Install Referrer Service returned a null response";
                ((zzgq)object).zza((String)object2);
                return null;
                break block8;
            }
            return object;
        }
        object2 = this.zza.zzj().zzg();
        String string3 = exception2.getMessage();
        ((zzgq)object2).zza("Exception occurred while retrieving the Install Referrer", string3);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zza() {
        Exception exception2;
        block3: {
            Object object;
            boolean bl2 = false;
            try {
                object = this.zza;
                object = ((zzic)object).zza();
                object = Wrappers.packageManager((Context)object);
                if (object == null) {
                    object = this.zza;
                    object = ((zzic)object).zzj();
                    object = ((zzgo)object).zzq();
                    String string2 = "Failed to get PackageManager for Install Referrer Play Store compatibility check";
                    ((zzgq)object).zza(string2);
                    return false;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            String string3 = "com.android.vending";
            int n3 = 128;
            object = ((PackageManagerWrapper)object).getPackageInfo(string3, n3);
            int n4 = ((PackageInfo)object).versionCode;
            int n7 = 80837300;
            if (n4 < n7) return bl2;
            return true;
        }
        this.zza.zzj().zzq().zza("Failed to retrieve Play Store version for Install Referrer", exception2);
        return false;
    }
}

