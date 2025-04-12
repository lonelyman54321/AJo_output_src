/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.StrictMode
 *  android.os.StrictMode$VmPolicy
 */
package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaj;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzs;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.zzc;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

final class zzp
implements ServiceConnection,
zzt {
    final /* synthetic */ zzs zza;
    private final Map zzb;
    private int zzc;
    private boolean zzd;
    private IBinder zze;
    private final zzo zzf;
    private ComponentName zzg;

    public zzp(zzs hashMap, zzo zzo2) {
        this.zza = hashMap;
        this.zzf = zzo2;
        this.zzb = hashMap = new HashMap();
        this.zzc = 2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ ConnectionResult zzd(zzp var0, String var1_2, Executor var2_3) {
        block10: {
            block9: {
                var3_4 = var0.zzf;
                var4_5 = var0.zza;
                var4_5 = zzs.zze(var4_5);
                var5_6 = var3_4.zzb((Context)var4_5);
                var0.zzc = var6_7 = 3;
                var3_4 = com.google.android.gms.common.util.zzc.zza();
                try {
                    var4_5 = var0.zza;
                    var7_8 = zzs.zzg(var4_5);
                    var8_9 = zzs.zze(var4_5);
                    var9_10 = 4225;
                    var0.zzd = var10_11 = var7_8.zza(var8_9, (String)var1_2, var5_6, (ServiceConnection)var0, var9_10, (Executor)var2_3);
                    if (var10_11 == 0) break block9;
                    var1_2 = var0.zza;
                    var1_2 = zzs.zzf((zzs)var1_2);
                    var2_3 = var0.zzf;
                    var11_12 = 1;
                    var1_2 = var1_2.obtainMessage(var11_12, var2_3);
                    var2_3 = var0.zza;
                    var2_3 = zzs.zzf((zzs)var2_3);
                    var0 = var0.zza;
                    var12_13 = zzs.zzd((zzs)var0);
                    var2_3.sendMessageDelayed((Message)var1_2, var12_13);
                    var0 = ConnectionResult.RESULT_SUCCESS;
                }
                catch (Throwable var0_1) {
                    break block10;
                }
lbl27:
                // 2 sources

                while (true) {
                    StrictMode.setVmPolicy((StrictMode.VmPolicy)var3_4);
                    return var0;
                }
            }
            var10_11 = 2;
            {
                block11: {
                    var0.zzc = var10_11;
                    try {}
                    catch (IllegalArgumentException v0) {}
                    break block11;
lbl38:
                    // 2 sources

                    while (true) {
                        var10_11 = 16;
                        var0 = new ConnectionResult(var10_11);
                        ** continue;
                        break;
                    }
                    catch (zzaj v1) {
                        return v1.zza;
                    }
                }
                var1_2 = var0.zza;
                var2_3 = zzs.zzg((zzs)var1_2);
                var1_2 = zzs.zze((zzs)var1_2);
                var2_3.unbindService((Context)var1_2, (ServiceConnection)var0);
                ** continue;
            }
        }
        StrictMode.setVmPolicy((StrictMode.VmPolicy)var3_4);
        throw var0_1;
    }

    public final void onBindingDied(ComponentName componentName) {
        this.onServiceDisconnected(componentName);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap = zzs.zzh(this.zza);
        synchronized (hashMap) {
            try {
                Object object = this.zza;
                object = zzs.zzf((zzs)object);
                zzo zzo2 = this.zzf;
                int n3 = 1;
                object.removeMessages(n3, (Object)zzo2);
                this.zze = iBinder;
                this.zzg = componentName;
                object = this.zzb;
                object = object.values();
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        this.zzc = n3;
                        return;
                    }
                    zzo2 = object.next();
                    zzo2 = (ServiceConnection)zzo2;
                    zzo2.onServiceConnected(componentName, iBinder);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap = zzs.zzh(this.zza);
        synchronized (hashMap) {
            try {
                Object object = this.zza;
                object = zzs.zzf((zzs)object);
                zzo zzo2 = this.zzf;
                int n3 = 1;
                object.removeMessages(n3, (Object)zzo2);
                object = null;
                this.zze = null;
                this.zzg = componentName;
                object = this.zzb;
                object = object.values();
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        int n4;
                        this.zzc = n4 = 2;
                        return;
                    }
                    zzo2 = object.next();
                    zzo2 = (ServiceConnection)zzo2;
                    zzo2.onServiceDisconnected(componentName);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final ComponentName zzb() {
        return this.zzg;
    }

    public final IBinder zzc() {
        return this.zze;
    }

    public final void zze(ServiceConnection serviceConnection2, ServiceConnection serviceConnection3, String string2) {
        this.zzb.put(serviceConnection2, serviceConnection3);
    }

    public final void zzf(ServiceConnection serviceConnection2, String string2) {
        this.zzb.remove(serviceConnection2);
    }

    public final void zzg(String object) {
        object = this.zzf;
        zzs.zzf(this.zza).removeMessages(1, object);
        object = this.zza;
        ConnectionTracker connectionTracker = zzs.zzg((zzs)object);
        object = zzs.zze((zzs)object);
        connectionTracker.unbindService((Context)object, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final boolean zzh(ServiceConnection serviceConnection2) {
        return this.zzb.containsKey(serviceConnection2);
    }

    public final boolean zzi() {
        return this.zzb.isEmpty();
    }

    public final boolean zzj() {
        return this.zzd;
    }
}

