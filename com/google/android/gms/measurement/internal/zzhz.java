/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzia;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;

final class zzhz
extends Thread {
    private final Object zza;
    private final BlockingQueue zzb;
    private boolean zzc = false;
    private final /* synthetic */ zzhv zzd;

    public zzhz(zzhv object, String string2, BlockingQueue blockingQueue) {
        this.zzd = object;
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(blockingQueue);
        this.zza = object = new Object();
        this.zzb = blockingQueue;
        this.setName(string2);
    }

    private final void zza(InterruptedException interruptedException) {
        zzgq zzgq2 = this.zzd.zzj().zzr();
        String string2 = this.getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" was interrupted");
        string2 = stringBuilder.toString();
        zzgq2.zza(string2, interruptedException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzb() {
        Object object = zzhv.zzc(this.zzd);
        synchronized (object) {
            Throwable throwable2;
            block9: {
                block6: {
                    boolean bl2;
                    block7: {
                        String string2;
                        Object object2;
                        block8: {
                            try {
                                bl2 = this.zzc;
                                if (bl2) break block6;
                                object2 = this.zzd;
                                object2 = zzhv.zzd((zzhv)object2);
                                ((Semaphore)object2).release();
                                object2 = this.zzd;
                                object2 = zzhv.zzc((zzhv)object2);
                                object2.notifyAll();
                                object2 = this.zzd;
                                object2 = zzhv.zzb((zzhv)object2);
                                string2 = null;
                                if (this == object2) {
                                    object2 = this.zzd;
                                    zzhv.zzb((zzhv)object2, null);
                                    break block7;
                                }
                                object2 = this.zzd;
                                if (this != (object2 = zzhv.zza((zzhv)object2))) break block8;
                                object2 = this.zzd;
                                zzhv.zza((zzhv)object2, null);
                                break block7;
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        object2 = this.zzd;
                        object2 = ((zzhv)object2).zzj();
                        object2 = ((zzgo)object2).zzg();
                        string2 = "Current scheduler thread is neither worker nor network";
                        ((zzgq)object2).zza(string2);
                    }
                    this.zzc = bl2 = true;
                }
                return;
            }
            throw throwable2;
        }
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
        int n3;
        Object object;
        int n4 = 0;
        Object var2_2 = null;
        while (n4 == 0) {
            try {
                object = this.zzd;
                object = zzhv.zzd((zzhv)object);
                ((Semaphore)object).acquire();
                n4 = 1;
            }
            catch (InterruptedException interruptedException) {
                this.zza(interruptedException);
            }
        }
        try {
            n4 = Process.myTid();
            n4 = Process.getThreadPriority((int)n4);
            while (true) {
                object = this.zzb;
                object = object.poll();
                if ((object = (zzia)object) != null) {
                    n3 = ((zzia)object).zza;
                    n3 = n3 != 0 ? n4 : 10;
                    Process.setThreadPriority((int)n3);
                    ((FutureTask)object).run();
                    continue;
                }
                object = this.zza;
                // MONITORENTER : object
                break;
            }
        }
        catch (Throwable throwable) {}
        {
            Object object2;
            block19: {
                object2 = this.zzb;
                object2 = object2.peek();
                if (object2 != null || (n3 = (int)(zzhv.zze((zzhv)(object2 = this.zzd)) ? 1 : 0)) != 0) break block19;
                object2 = this.zza;
                long l2 = 30000L;
                object2.wait(l2);
                break block19;
                catch (InterruptedException interruptedException) {
                    this.zza(interruptedException);
                }
            }
            // MONITOREXIT : object
            object = this.zzd;
            object = zzhv.zzc((zzhv)object);
            // MONITORENTER : object
            object2 = this.zzb;
            object2 = object2.peek();
            if (object2 == null) {
                this.zzb();
                // MONITOREXIT : object
                this.zzb();
                return;
            }
            // MONITOREXIT : object
            continue;
        }
        catch (Throwable throwable) {}
        throw throwable;
        this.zzb();
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zza;
        synchronized (object) {
            Object object2 = this.zza;
            object2.notifyAll();
            return;
        }
    }
}

