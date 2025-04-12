/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.os.SystemClock
 */
package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.ads.identifier.zza;
import com.google.android.gms.ads.identifier.zzb;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient {
    BlockingServiceConnection zza;
    zzf zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzg;

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public AdvertisingIdClient(Context context, long l2, boolean bl2, boolean bl3) {
        Context context2;
        Object object;
        this.zzd = object = new Object();
        Preconditions.checkNotNull(context);
        if (bl2 && (context2 = context.getApplicationContext()) != null) {
            context = context2;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = l2;
    }

    public static AdvertisingIdClient$Info getAdvertisingIdInfo(Context object) {
        long l2;
        boolean bl2;
        String string2;
        int n3;
        long l3;
        boolean bl3 = true;
        long l4 = -1;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient((Context)object, l4, bl3, false);
        try {
            l3 = SystemClock.elapsedRealtime();
            n3 = 0;
            object = null;
        }
        catch (Throwable throwable) {
            string2 = "";
            bl2 = true;
            l2 = -1;
            try {
                advertisingIdClient.zzc(null, bl2, 0.0f, l2, string2, throwable);
                throw throwable;
            }
            catch (Throwable throwable2) {
                advertisingIdClient.zza();
                throw throwable2;
            }
        }
        advertisingIdClient.zzb(false);
        n3 = -1;
        object = advertisingIdClient.zzd(n3);
        l4 = SystemClock.elapsedRealtime();
        l2 = l4 - l3;
        string2 = "";
        bl2 = true;
        advertisingIdClient.zzc((AdvertisingIdClient$Info)object, bl2, 0.0f, l2, string2, null);
        advertisingIdClient.zza();
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean getIsAdIdFakeForDebugLogging(Context var0) {
        block20: {
            var2_6 = -1;
            var4_7 = var1_5;
            var5_8 /* !! */  = var0;
            var1_5 = new AdvertisingIdClient((Context)var0, var2_6, false, false);
            var6_9 = false;
            var0 = null;
            try {
                var1_5.zzb(false);
                var4_7 = "Calling this from your main thread can lead to deadlock";
                Preconditions.checkNotMainThread((String)var4_7);
                synchronized (var1_5) {
                }
            }
            catch (Throwable var0_4) {
                break block20;
            }
            {
                var7_10 = var1_5.zzc;
                if (!var7_10) {
                    var4_7 = var1_5.zzd;
                    synchronized (var4_7) {
                    }
                }
                ** GOTO lbl48
                {
                    catch (Throwable var0_1) {
                        ** GOTO lbl-1000
                    }
                    {
                        block21: {
                            block22: {
                                try {
                                    var5_8 /* !! */  = var1_5.zze;
                                    if (var5_8 /* !! */  != null && (var8_11 = var5_8 /* !! */ .zzb)) {
                                        // MONITOREXIT @DISABLED, blocks:[17, 18, 2, 11, 12] lbl26 : MonitorExitStatement: MONITOREXIT : var4_7
                                    }
                                    ** GOTO lbl-1000
                                }
                                catch (Throwable var0_3) {
                                    break block22;
                                }
                                try {
                                    var1_5.zzb(false);
                                    var6_9 = var1_5.zzc;
                                    if (var6_9) break block21;
                                    var4_7 = "AdvertisingIdClient cannot reconnect.";
                                    var0 = new IOException((String)var4_7);
                                    throw var0;
                                }
                                catch (Exception var0_2) {
                                    var5_8 /* !! */  = "AdvertisingIdClient cannot reconnect.";
                                    var4_7 = new IOException((String)var5_8 /* !! */ , var0_2);
                                    throw var4_7;
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var5_8 /* !! */  = "AdvertisingIdClient is not connected.";
                                    var0 = new IOException((String)var5_8 /* !! */ );
                                    throw var0;
                                }
                            }
                            throw var0_3;
                        }
                        var0 = var1_5.zza;
                        Preconditions.checkNotNull(var0);
                        var0 = var1_5.zzb;
                        Preconditions.checkNotNull(var0);
                        try {
                            var0 = var1_5.zzb;
                            var6_9 = var0.zzd();
                        }
                        catch (RemoteException v0) {}
                        // MONITOREXIT @DISABLED, blocks:[17, 11] lbl55 : MonitorExitStatement: MONITOREXIT : var1_5
                        {
                            var1_5.zze();
                            var1_5.zza();
                            return var6_9;
                        }
                        {
                            var4_7 = "Remote exception";
                            var0 = new IOException((String)var4_7);
                            throw var0;
                        }
                    }
                }
lbl-1000:
                // 1 sources

                {
                    throw var0_1;
                }
            }
        }
        var1_5.zza();
        throw var0_4;
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean bl2) {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final AdvertisingIdClient$Info zzd(int var1_1) {
        var2_2 = "Calling this from your main thread can lead to deadlock";
        Preconditions.checkNotMainThread((String)var2_2);
        synchronized (this) {
            block17: {
                var1_1 = (int)this.zzc;
                if (var1_1 == 0) {
                    var2_2 = this.zzd;
                    synchronized (var2_2) {
                    }
                }
                ** GOTO lbl41
                {
                    catch (Throwable var2_3) {
                        break block17;
                    }
                    {
                        block19: {
                            block18: {
                                try {
                                    var3_5 = this.zze;
                                    if (var3_5 != null && (var4_7 = var3_5.zzb)) {
                                        // MONITOREXIT @DISABLED, blocks:[1, 8, 9, 13, 15] lbl15 : MonitorExitStatement: MONITOREXIT : var2_2
                                        var1_1 = 0;
                                        var2_2 = null;
                                    }
                                    ** GOTO lbl-1000
                                }
                                catch (Throwable var3_6) {
                                    break block18;
                                }
                                try {
                                    this.zzb(false);
                                }
                                catch (Exception var2_4) {
                                    var5_8 = "AdvertisingIdClient cannot reconnect.";
                                    var3_5 = new IOException(var5_8, var2_4);
                                    throw var3_5;
                                }
                                var1_1 = (int)this.zzc;
                                if (var1_1 == 0) {
                                    var3_5 = "AdvertisingIdClient cannot reconnect.";
                                    var2_2 = new IOException((String)var3_5);
                                    throw var2_2;
                                }
                                break block19;
lbl-1000:
                                // 1 sources

                                {
                                    var5_9 = "AdvertisingIdClient is not connected.";
                                    var3_5 = new IOException(var5_9);
                                    throw var3_5;
                                }
                            }
                            throw var3_6;
                        }
                        var2_2 = this.zza;
                        Preconditions.checkNotNull(var2_2);
                        var2_2 = this.zzb;
                        Preconditions.checkNotNull(var2_2);
                        try {
                            var3_5 = this.zzb;
                            var3_5 = var3_5.zzc();
                            var5_10 = this.zzb;
                            var6_11 = true;
                            var7_12 = var5_10.zze(var6_11);
                            var2_2 = new AdvertisingIdClient$Info((String)var3_5, var7_12);
                            // MONITOREXIT @DISABLED, blocks:[6, 8, 13] lbl52 : MonitorExitStatement: MONITOREXIT : this
                            this.zze();
                            return var2_2;
                        }
                        catch (RemoteException v0) {}
                        {
                            var3_5 = "Remote exception";
                            var2_2 = new IOException((String)var3_5);
                            throw var2_2;
                        }
                    }
                }
            }
            throw var2_3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zze() {
        Object object = this.zzd;
        synchronized (object) {
            try {
                long l2;
                long l3;
                long l4;
                long l7;
                Object object2 = this.zze;
                if (object2 != null) {
                    object2 = ((zzb)object2).zza;
                    ((CountDownLatch)object2).countDown();
                    try {
                        object2 = this.zze;
                        ((Thread)object2).join();
                    }
                    catch (InterruptedException interruptedException) {}
                }
                if ((l7 = (l4 = (l3 = this.zzf) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                    zzb zzb2;
                    this.zze = zzb2 = new zzb(this, l3);
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    public final void finalize() {
        this.zza();
        super.finalize();
    }

    public AdvertisingIdClient$Info getInfo() {
        return this.zzd(-1);
    }

    public void start() {
        this.zzb(true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        var1_1 = "Calling this from your main thread can lead to deadlock";
        Preconditions.checkNotMainThread((String)var1_1);
        synchronized (this) {
            block9: {
                block10: {
                    block8: {
                        try {
                            var1_1 = this.zzg;
                            if (var1_1 != null && (var1_1 = this.zza) != null) break block8;
                            break block9;
                        }
                        catch (Throwable var1_2) {
                            break block10;
                        }
                    }
                    try {
                        var2_3 = this.zzc;
                        if (var2_3) {
                            var1_1 = ConnectionTracker.getInstance();
                            var3_4 = this.zzg;
                            var4_5 = this.zza;
                            var1_1.unbindService(var3_4, var4_5);
                        }
lbl18:
                        // 4 sources

                        while (true) {
                            var2_3 = false;
                            var1_1 = null;
                            this.zzc = false;
                            var2_3 = false;
                            var1_1 = null;
                            this.zzb = null;
                            this.zza = null;
                            break;
                        }
                    }
                    catch (Throwable v0) {
                        ** continue;
                    }
                    return;
                }
                throw var1_2;
            }
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(boolean bl2) {
        Object object = "Calling this from your main thread can lead to deadlock";
        Preconditions.checkNotMainThread((String)object);
        synchronized (this) {
            Throwable throwable2;
            int n3;
            block16: {
                block15: {
                    Object object2;
                    String string2;
                    Object object3;
                    try {
                        n3 = this.zzc;
                        if (n3 != 0) {
                            this.zza();
                        }
                        object = this.zzg;
                        object3 = object.getPackageManager();
                        string2 = "com.android.vending";
                        object2 = null;
                        object3.getPackageInfo(string2, 0);
                        object3 = GoogleApiAvailabilityLight.getInstance();
                        int n4 = 12451000;
                        int n7 = ((GoogleApiAvailabilityLight)object3).isGooglePlayServicesAvailable((Context)object, n4);
                        if (n7 != 0 && n7 != (n4 = 2)) {
                            object = "Google Play services not available";
                            IOException iOException = new IOException((String)object);
                            throw iOException;
                        }
                        object3 = new BlockingServiceConnection();
                        object2 = "com.google.android.gms.ads.identifier.service.START";
                        string2 = new Intent((String)object2);
                        object2 = "com.google.android.gms";
                        string2.setPackage((String)object2);
                    }
                    catch (Throwable throwable2) {}
                    object2 = ConnectionTracker.getInstance();
                    int n8 = 1;
                    n3 = (int)(((ConnectionTracker)object2).bindService((Context)object, (Intent)string2, (ServiceConnection)object3, n8) ? 1 : 0);
                    if (n3 == 0) break block15;
                    this.zza = object3;
                    object = TimeUnit.MILLISECONDS;
                    long l2 = 10000L;
                    object = ((BlockingServiceConnection)object3).getServiceWithTimeout(l2, (TimeUnit)((Object)object));
                    object = com.google.android.gms.internal.ads_identifier.zze.zza((IBinder)object);
                    this.zzb = object;
                    this.zzc = n8;
                    if (bl2) {
                        this.zze();
                    }
                    return;
                    break block16;
                    catch (Throwable throwable3) {
                        object = new IOException(throwable3);
                        throw object;
                    }
                }
                object = "Connection failure";
                IOException iOException = new IOException((String)object);
                throw iOException;
                catch (Throwable throwable4) {
                    object = new IOException(throwable4);
                    throw object;
                }
            }
            throw throwable2;
            catch (InterruptedException interruptedException) {}
            object = "Interrupted exception";
            IOException iOException = new IOException((String)object);
            throw iOException;
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            n3 = 9;
            GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException = new GooglePlayServicesNotAvailableException(n3);
            throw googlePlayServicesNotAvailableException;
        }
    }

    public final boolean zzc(AdvertisingIdClient$Info object, boolean bl2, float f5, long l2, String string2, Throwable throwable) {
        double d2;
        double d5 = Math.random();
        double d7 = d5 - (d2 = 0.0);
        Object object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object2 <= 0) {
            String string3 = "1";
            HashMap hashMap = p3.a("app_context", string3);
            object2 = true;
            if (object != null) {
                boolean bl3 = ((AdvertisingIdClient$Info)object).isLimitAdTrackingEnabled();
                if (object2 != bl3) {
                    string3 = "0";
                }
                String string4 = "limit_ad_tracking";
                hashMap.put(string4, string3);
                object = ((AdvertisingIdClient$Info)object).getId();
                if (object != null) {
                    int n3 = ((String)object).length();
                    object = Integer.toString(n3);
                    string3 = "ad_id_size";
                    hashMap.put(string3, object);
                }
            }
            if (throwable != null) {
                object = throwable.getClass().getName();
                string3 = "error";
                hashMap.put(string3, object);
            }
            hashMap.put("tag", "AdvertisingIdClient");
            string3 = Long.toString(l2);
            hashMap.put("time_spent", string3);
            object = new zza(this, hashMap);
            ((Thread)object).start();
            return (boolean)object2;
        }
        return false;
    }
}

