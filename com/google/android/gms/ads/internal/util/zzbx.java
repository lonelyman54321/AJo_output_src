/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzfuv;

public final class zzbx {
    private HandlerThread zza = null;
    private Handler zzb = null;
    private int zzc = 0;
    private final Object zzd;

    public zzbx() {
        Object object;
        this.zzd = object = new Object();
    }

    public final Handler zza() {
        return this.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Looper zzb() {
        Object object = this.zzd;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                int n3;
                block5: {
                    block3: {
                        block4: {
                            try {
                                n3 = this.zzc;
                                if (n3 != 0) break block3;
                                object2 = this.zza;
                                if (object2 != null) break block4;
                                object2 = "Starting the looper thread.";
                                zze.zza((String)object2);
                                String string2 = "LooperProvider";
                                this.zza = object2 = new HandlerThread(string2);
                                object2.start();
                                string2 = this.zza;
                                string2 = string2.getLooper();
                                object2 = new zzfuv((Looper)string2);
                                this.zzb = object2;
                                object2 = "Looper thread started.";
                                zze.zza((String)object2);
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        object2 = "Resuming the looper thread";
                        zze.zza((String)object2);
                        object2 = this.zzd;
                        object2.notifyAll();
                        break block5;
                    }
                    object2 = this.zza;
                    String string3 = "Invalid state: handlerThread should already been initialized.";
                    Preconditions.checkNotNull(object2, string3);
                }
                this.zzc = n3 = this.zzc + 1;
                object2 = this.zza;
                return object2.getLooper();
            }
            throw throwable2;
        }
    }
}

