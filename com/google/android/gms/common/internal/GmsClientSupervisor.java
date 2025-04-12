/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzs;
import java.util.concurrent.Executor;

public abstract class GmsClientSupervisor {
    static HandlerThread zza;
    private static final Object zzb;
    private static int zzc = 9;
    private static zzs zzd;
    private static Executor zze;
    private static boolean zzf = false;

    static {
        Object object;
        zzb = object = new Object();
    }

    public static int getDefaultBindFlags() {
        return 4225;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static GmsClientSupervisor getInstance(Context context) {
        Object object = zzb;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block3: {
                    Context context2;
                    zzs zzs2;
                    block5: {
                        block4: {
                            try {
                                zzs2 = zzd;
                                if (zzs2 != null) break block3;
                                context2 = context.getApplicationContext();
                                boolean bl2 = zzf;
                                if (!bl2) break block4;
                                context = GmsClientSupervisor.getOrStartHandlerThread();
                                context = context.getLooper();
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        context = context.getMainLooper();
                    }
                    Executor executor = zze;
                    zzd = zzs2 = new zzs(context2, (Looper)context, executor);
                }
                return zzd;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HandlerThread getOrStartHandlerThread() {
        Object object = zzb;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                HandlerThread handlerThread;
                try {
                    handlerThread = zza;
                    if (handlerThread != null) {
                        return handlerThread;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                String string2 = "GoogleApiHandler";
                int n3 = zzc;
                zza = handlerThread = new HandlerThread(string2, n3);
                handlerThread.start();
                return zza;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HandlerThread getOrStartHandlerThread(int n3) {
        Object object = zzb;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                HandlerThread handlerThread;
                try {
                    handlerThread = zza;
                    if (handlerThread != null) {
                        return handlerThread;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                String string2 = "GoogleApiHandler";
                zza = handlerThread = new HandlerThread(string2, n3);
                handlerThread.start();
                return zza;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void setDefaultBindExecutor(Executor executor) {
        Object object = zzb;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        zzs zzs2 = zzd;
                        if (zzs2 == null) break block3;
                        zzs2.zzi(executor);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                zze = executor;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int n3) {
        Object object = zzb;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    HandlerThread handlerThread = zza;
                    if (handlerThread == null) {
                        zzc = n3;
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void setUseHandlerThreadForCallbacks() {
        Object object = zzb;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                boolean bl2;
                block3: {
                    try {
                        boolean bl3;
                        zzs zzs2 = zzd;
                        if (zzs2 == null || (bl3 = zzf)) break block3;
                        HandlerThread handlerThread = GmsClientSupervisor.getOrStartHandlerThread();
                        handlerThread = handlerThread.getLooper();
                        zzs2.zzj((Looper)handlerThread);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                zzf = bl2 = true;
                return;
            }
            throw throwable2;
        }
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection2, String string2) {
        zzo zzo2 = new zzo(componentName, 4225);
        return this.zza(zzo2, serviceConnection2, string2, null).isSuccess();
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection2, String string2, Executor executor) {
        zzo zzo2 = new zzo(componentName, 4225);
        return this.zza(zzo2, serviceConnection2, string2, executor).isSuccess();
    }

    public boolean bindService(String string2, ServiceConnection serviceConnection2, String string3) {
        zzo zzo2 = new zzo(string2, 4225, false);
        return this.zza(zzo2, serviceConnection2, string3, null).isSuccess();
    }

    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection2, String string2) {
        zzo zzo2 = new zzo(componentName, 4225);
        this.zzb(zzo2, serviceConnection2, string2);
    }

    public void unbindService(String string2, ServiceConnection serviceConnection2, String string3) {
        zzo zzo2 = new zzo(string2, 4225, false);
        this.zzb(zzo2, serviceConnection2, string3);
    }

    public abstract ConnectionResult zza(zzo var1, ServiceConnection var2, String var3, Executor var4);

    public abstract void zzb(zzo var1, ServiceConnection var2, String var3);

    public final void zzc(String string2, String string3, int n3, ServiceConnection serviceConnection2, String string4, boolean bl2) {
        zzo zzo2 = new zzo(string2, string3, 4225, bl2);
        this.zzb(zzo2, serviceConnection2, string4);
    }
}

