/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class ConnectionTracker {
    private static final Object zzb;
    private static volatile ConnectionTracker zzc;
    public final ConcurrentHashMap zza;

    static {
        Object object;
        zzb = object = new Object();
    }

    private ConnectionTracker() {
        ConcurrentHashMap concurrentHashMap;
        this.zza = concurrentHashMap = new ConcurrentHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConnectionTracker getInstance() {
        Object object;
        block6: {
            object = zzc;
            if (object == null) {
                object = zzb;
                synchronized (object) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                ConnectionTracker connectionTracker = zzc;
                                if (connectionTracker != null) break block4;
                                zzc = connectionTracker = new ConnectionTracker();
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        object = zzc;
        Preconditions.checkNotNull(object);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void zzb(Context context, ServiceConnection serviceConnection2) {
        try {
            context.unbindService(serviceConnection2);
            return;
        }
        catch (IllegalArgumentException | IllegalStateException | NoSuchElementException runtimeException) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final boolean zzc(Context context, String string2, Intent intent, ServiceConnection serviceConnection2, int n3, boolean bl2, Executor executor) {
        boolean bl3;
        block10: {
            void var7_11;
            int n4;
            Object[] objectArray;
            Object object = intent.getComponent();
            if (object != null) {
                object = object.getPackageName();
                objectArray = "com.google.android.gms";
                objectArray.equals(object);
                try {
                    objectArray = Wrappers.packageManager(context);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                object = objectArray.getApplicationInfo((String)object, 0);
                int n7 = object.flags;
                n4 = 0x200000;
                int n8 = n7 & n4;
                if (n8 != 0) {
                    return false;
                }
            }
            boolean bl4 = ConnectionTracker.zzd(serviceConnection2);
            if (bl4) {
                object = this.zza.putIfAbsent(serviceConnection2, serviceConnection2);
                if (object != null && serviceConnection2 != object) {
                    object = intent.getAction();
                    n4 = 3;
                    objectArray = new Object[n4];
                    objectArray[0] = serviceConnection2;
                    int n10 = 1;
                    objectArray[n10] = string2;
                    int n14 = 2;
                    objectArray[n14] = object;
                    string2 = "Duplicate binding with the same ServiceConnection: %s, %s, %s.";
                    String.format(string2, objectArray);
                }
                try {
                    bl3 = ConnectionTracker.zze(context, intent, serviceConnection2, n3, (Executor)var7_11);
                    if (bl3) break block10;
                    this.zza.remove(serviceConnection2, serviceConnection2);
                }
                catch (Throwable throwable) {
                    this.zza.remove(serviceConnection2, serviceConnection2);
                    throw throwable;
                }
                return false;
            }
            bl3 = ConnectionTracker.zze(context, intent, serviceConnection2, n3, (Executor)var7_11);
        }
        return bl3;
    }

    private static boolean zzd(ServiceConnection serviceConnection2) {
        boolean bl2 = serviceConnection2 instanceof zzt;
        return !bl2;
    }

    private static final boolean zze(Context context, Intent intent, ServiceConnection serviceConnection2, int n3, Executor executor) {
        boolean bl2;
        if (executor == null) {
            executor = null;
        }
        if ((bl2 = PlatformVersion.isAtLeastQ()) && executor != null) {
            return g50_0.a(context, intent, serviceConnection2, n3, executor);
        }
        return context.bindService(intent, serviceConnection2, n3);
    }

    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection2, int n3) {
        String string2 = context.getClass().getName();
        return this.zzc(context, string2, intent, serviceConnection2, n3, true, null);
    }

    public void unbindService(Context context, ServiceConnection serviceConnection2) {
        ConcurrentHashMap concurrentHashMap;
        boolean bl2 = ConnectionTracker.zzd(serviceConnection2);
        if (bl2 && (bl2 = (concurrentHashMap = this.zza).containsKey(serviceConnection2))) {
            try {
                concurrentHashMap = this.zza;
                concurrentHashMap = concurrentHashMap.get(serviceConnection2);
                concurrentHashMap = (ServiceConnection)concurrentHashMap;
                ConnectionTracker.zzb(context, (ServiceConnection)concurrentHashMap);
                return;
            }
            finally {
                this.zza.remove(serviceConnection2);
            }
        }
        ConnectionTracker.zzb(context, serviceConnection2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void unbindServiceSafe(Context context, ServiceConnection serviceConnection2) {
        try {
            this.unbindService(context, serviceConnection2);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public final boolean zza(Context context, String string2, Intent intent, ServiceConnection serviceConnection2, int n3, Executor executor) {
        return this.zzc(context, string2, intent, serviceConnection2, 4225, true, executor);
    }
}

