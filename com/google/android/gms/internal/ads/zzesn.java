/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.BatteryManager
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzesm;
import com.google.android.gms.internal.ads.zzeso;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzesn
implements zzexw {
    private final zzgge zza;
    private final Context zzb;

    public zzesn(zzgge zzgge2, Context context) {
        this.zza = zzgge2;
        this.zzb = context;
    }

    private final Intent zzd() {
        int n3;
        int n4;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Object object = zzbep.zzkW;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean n42 = (Boolean)object;
        if (n42 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 33)) {
            object = this.zzb;
            intentFilter = bk3_1.a((Context)object, intentFilter);
        } else {
            object = this.zzb;
            n3 = 0;
            zzben2 = null;
            intentFilter = object.registerReceiver(null, intentFilter);
        }
        return intentFilter;
    }

    private static final boolean zze(Intent intent) {
        if (intent != null) {
            int n3;
            String string2 = "status";
            int n4 = -1;
            int n7 = intent.getIntExtra(string2, n4);
            return n7 == (n3 = 2) || n7 == (n3 = 5);
            {
            }
        }
        return false;
    }

    public final int zza() {
        return 14;
    }

    public final ListenableFuture zzb() {
        zzesm zzesm2 = new zzesm(this);
        return this.zza.zzb(zzesm2);
    }

    /*
     * WARNING - void declaration
     */
    public final /* synthetic */ zzeso zzc() {
        void var3_8;
        Object object;
        Object object2 = zzbep.zzlX;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean n3 = (Boolean)object2;
        double d2 = -1.0;
        if (n3) {
            int n4;
            int n7;
            object2 = this.zzb;
            object = "batterymanager";
            if ((object2 = (BatteryManager)object2.getSystemService((String)object)) != null) {
                int n8 = object2.getIntProperty(4);
                d2 = n8;
                double d5 = 100.0;
                d2 /= d5;
            }
            if ((n7 = Build.VERSION.SDK_INT) >= (n4 = 23) && object2 != null) {
                boolean bl2 = bc3_0.b((BatteryManager)object2);
            } else {
                object2 = this.zzd();
                boolean bl3 = zzesn.zze((Intent)object2);
            }
        } else {
            object2 = this.zzd();
            boolean bl4 = zzesn.zze((Intent)object2);
            if (object2 != null) {
                object3 = "level";
                int n10 = -1;
                int n14 = object2.getIntExtra((String)object3, n10);
                String string2 = "scale";
                int n15 = object2.getIntExtra(string2, n10);
                d2 = n14;
                double d7 = n15;
                d2 /= d7;
            }
            boolean bl5 = bl4;
        }
        object = new zzeso(d2, (boolean)var3_8);
        return object;
    }
}

