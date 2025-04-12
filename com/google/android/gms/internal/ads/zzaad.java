/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  android.os.Trace
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.internal.ads.zzaaa;
import com.google.android.gms.internal.ads.zzaac;
import com.google.android.gms.internal.ads.zzaae;
import com.google.android.gms.internal.ads.zzaah;
import com.google.android.gms.internal.ads.zzaai;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

final class zzaad
extends Handler
implements Runnable {
    final /* synthetic */ zzaai zza;
    private final zzaae zzb;
    private final long zzc;
    private zzaaa zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    public zzaad(zzaai zzaai2, Looper looper, zzaae zzaae2, zzaaa zzaaa2, int n3, long l2) {
        this.zza = zzaai2;
        super(looper);
        this.zzb = zzaae2;
        this.zzd = zzaaa2;
        this.zzc = l2;
    }

    private final void zzd() {
        this.zze = null;
        Object object = this.zza;
        ExecutorService executorService = zzaai.zzd((zzaai)object);
        object = zzaai.zzc((zzaai)object);
        object.getClass();
        executorService.execute((Runnable)object);
    }

    public final void handleMessage(Message object) {
        block15: {
            zzaae zzaae2;
            zzaaa zzaaa2;
            long l2;
            long l3;
            Object object2;
            block16: {
                block14: {
                    int n3 = this.zzi;
                    if (n3 != 0) break block14;
                    n3 = object.what;
                    if (n3 == 0) {
                        this.zzd();
                        return;
                    }
                    int n4 = 3;
                    if (n3 == n4) break block15;
                    object2 = this.zza;
                    int n7 = 0;
                    zzaai.zze((zzaai)object2, null);
                    long l4 = this.zzc;
                    l3 = SystemClock.elapsedRealtime();
                    l2 = l3 - l4;
                    zzaaa2 = this.zzd;
                    zzaaa2.getClass();
                    n3 = (int)(this.zzh ? 1 : 0);
                    if (n3 != 0) {
                        zzaae zzaae3 = this.zzb;
                        zzaaa2.zzJ(zzaae3, l3, l2, false);
                        return;
                    }
                    n3 = object.what;
                    n7 = 1;
                    if (n3 == n7) break block16;
                    int n8 = 2;
                    if (n3 == n8) {
                        int n10;
                        Object object3 = object = object.obj;
                        object3 = (IOException)object;
                        this.zze = object3;
                        int n14 = this.zzf;
                        this.zzf = n10 = n14 + 1;
                        zzaae zzaae4 = this.zzb;
                        object = zzaaa2.zzu(zzaae4, l3, l2, (IOException)object3, n10);
                        n3 = zzaac.zza((zzaac)object);
                        if (n3 == n4) {
                            object = this.zza;
                            object2 = this.zze;
                            zzaai.zzf((zzaai)object, (IOException)object2);
                            return;
                        }
                        n3 = zzaac.zza((zzaac)object);
                        if (n3 != n8) {
                            long l7;
                            long l8;
                            long l12;
                            n3 = zzaac.zza((zzaac)object);
                            if (n3 == n7) {
                                this.zzf = n7;
                            }
                            if ((l12 = (l8 = (l7 = zzaac.zzb((zzaac)object)) - (l4 = -9223372036854775807L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) {
                                l7 = zzaac.zzb((zzaac)object);
                            } else {
                                n14 = (this.zzf + -1) * 1000;
                                n3 = 5000;
                                n14 = Math.min(n14, n3);
                                l7 = n14;
                            }
                            this.zzc(l7);
                        }
                    }
                }
                return;
            }
            try {
                zzaae2 = this.zzb;
            }
            catch (RuntimeException runtimeException) {
                zzfk.zzd("LoadTask", "Unexpected exception handling load completed", runtimeException);
                object2 = this.zza;
                zzaah zzaah2 = new zzaah(runtimeException);
                zzaai.zzf((zzaai)object2, zzaah2);
                return;
            }
            zzaaa2.zzK(zzaae2, l3, l2);
            return;
        }
        throw (Error)object.obj;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        IOException iOException22;
        boolean bl2;
        int n3;
        block24: {
            Exception exception22;
            Object object;
            block23: {
                OutOfMemoryError outOfMemoryError22;
                block22: {
                    Thread thread2;
                    Object object2 = "load:";
                    n3 = 2;
                    bl2 = this.zzh;
                    int n4 = 1;
                    this.zzg = thread2 = Thread.currentThread();
                    // MONITOREXIT : this
                    if (bl2 ^= n4) {
                        object = this.zzb;
                        object = object.getClass();
                        object = ((Class)object).getSimpleName();
                        object2 = ((String)object2).concat((String)object);
                        Trace.beginSection((String)object2);
                        object2 = this.zzb;
                        object2.zzh();
                        {
                            catch (Throwable throwable) {
                                Trace.endSection();
                                throw throwable;
                            }
                        }
                        Trace.endSection();
                        // MONITORENTER : this
                    }
                    boolean bl3 = false;
                    object2 = null;
                    this.zzg = null;
                    Thread.interrupted();
                    // MONITOREXIT : this
                    try {
                        bl3 = this.zzi;
                        if (bl3) return;
                        this.sendEmptyMessage(n4);
                        return;
                    }
                    catch (Error error) {
                    }
                    catch (OutOfMemoryError outOfMemoryError22) {
                        break block22;
                    }
                    catch (Exception exception22) {
                        break block23;
                    }
                    catch (IOException iOException22) {
                        break block24;
                    }
                    n3 = (int)(this.zzi ? 1 : 0);
                    if (n3 != 0) throw error;
                    object = "Unexpected error loading stream";
                    zzfk.zzd("LoadTask", (String)object, error);
                    n3 = 3;
                    Message message = this.obtainMessage(n3, error);
                    message.sendToTarget();
                    throw error;
                }
                bl2 = this.zzi;
                if (bl2) return;
                zzfk.zzd("LoadTask", "OutOfMemory error loading stream", outOfMemoryError22);
                object = new zzaah(outOfMemoryError22);
                this.obtainMessage(n3, object).sendToTarget();
                return;
            }
            bl2 = this.zzi;
            if (bl2) return;
            zzfk.zzd("LoadTask", "Unexpected exception loading stream", exception22);
            object = new zzaah(exception22);
            this.obtainMessage(n3, object).sendToTarget();
            return;
        }
        bl2 = this.zzi;
        if (bl2) return;
        Message message = this.obtainMessage(n3, iOException22);
        message.sendToTarget();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zza(boolean bl2) {
        this.zzi = bl2;
        this.zze = null;
        Object object = null;
        boolean bl3 = this.hasMessages(0);
        int n3 = 1;
        if (bl3) {
            this.zzh = n3;
            this.removeMessages(0);
            if (!bl2) {
                this.sendEmptyMessage(n3);
            }
        } else {
            // MONITORENTER : this
            this.zzh = n3;
            object = this.zzb;
            object.zzg();
            object = this.zzg;
            if (object != null) {
                ((Thread)object).interrupt();
            }
        }
        if (!bl2) return;
        zzaai zzaai2 = this.zza;
        zzaai.zze(zzaai2, null);
        long l2 = SystemClock.elapsedRealtime();
        object = this.zzd;
        object.getClass();
        zzaae zzaae2 = this.zzb;
        long l3 = this.zzc;
        l3 = l2 - l3;
        boolean bl4 = true;
        object.zzJ(zzaae2, l2, l3, bl4);
        this.zzd = null;
    }

    public final void zzb(int n3) {
        int n4;
        IOException iOException = this.zze;
        if (iOException != null && (n4 = this.zzf) > n3) {
            throw iOException;
        }
    }

    public final void zzc(long l2) {
        int n3;
        Object object = zzaai.zzc(this.zza);
        if (object == null) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        zzeq.zzf(n3 != 0);
        object = this.zza;
        zzaai.zze((zzaai)object, this);
        long l3 = 0L;
        n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (n3 > 0) {
            this.sendEmptyMessageDelayed(0, l2);
            return;
        }
        this.zzd();
    }
}

