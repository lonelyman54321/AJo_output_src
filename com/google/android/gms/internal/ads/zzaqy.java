/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 *  android.os.Process
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzarn;
import com.google.android.gms.internal.ads.zzarq;
import java.util.concurrent.BlockingQueue;

public final class zzaqy
extends Thread {
    private final BlockingQueue zza;
    private final zzaqx zzb;
    private final zzaqo zzc;
    private volatile boolean zzd = false;
    private final zzaqv zze;

    public zzaqy(BlockingQueue blockingQueue, zzaqx zzaqx2, zzaqo zzaqo2, zzaqv zzaqv2) {
        this.zza = blockingQueue;
        this.zzb = zzaqx2;
        this.zzc = zzaqo2;
        this.zze = zzaqv2;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    private void zzb() {
        Throwable throwable2;
        int n3;
        zzare zzare2;
        block8: {
            block7: {
                zzarn zzarn22;
                block10: {
                    Exception exception2;
                    block9: {
                        String string2;
                        Object object;
                        Object object2;
                        block11: {
                            zzare2 = (zzare)this.zza.take();
                            SystemClock.elapsedRealtime();
                            zzare2.zzt(3);
                            n3 = 4;
                            object2 = "network-queue-take";
                            zzare2.zzm((String)object2);
                            zzare2.zzw();
                            int n4 = zzare2.zzc();
                            TrafficStats.setThreadStatsTag((int)n4);
                            object2 = this.zzb;
                            object2 = object2.zza(zzare2);
                            object = "network-http-complete";
                            zzare2.zzm((String)object);
                            boolean bl2 = ((zzara)object2).zze;
                            if (bl2 && (bl2 = zzare2.zzv())) {
                                object2 = "not-modified";
                                zzare2.zzp((String)object2);
                                zzare2.zzr();
                                break block7;
                            }
                            break block11;
                            catch (Throwable throwable2) {
                                break block8;
                            }
                            catch (Exception exception2) {
                                break block9;
                            }
                            catch (zzarn zzarn22) {
                                break block10;
                            }
                        }
                        object2 = zzare2.zzh((zzara)object2);
                        object = "network-parse-complete";
                        zzare2.zzm((String)object);
                        object = ((zzark)object2).zzb;
                        if (object != null) {
                            object = this.zzc;
                            string2 = zzare2.zzj();
                            zzaqn zzaqn2 = ((zzark)object2).zzb;
                            object.zzd(string2, zzaqn2);
                            object = "network-cache-written";
                            zzare2.zzm((String)object);
                        }
                        zzare2.zzq();
                        object = this.zze;
                        string2 = null;
                        ((zzaqv)object).zzb(zzare2, (zzark)object2, null);
                        zzare2.zzs((zzark)object2);
                        break block7;
                    }
                    Object object = "Unhandled exception %s";
                    String string3 = ((Object)exception2).toString();
                    int n7 = 1;
                    Object[] objectArray = new Object[n7];
                    objectArray[0] = string3;
                    zzarq.zzc(exception2, (String)object, objectArray);
                    object = new zzarn(exception2);
                    SystemClock.elapsedRealtime();
                    zzaqv zzaqv2 = this.zze;
                    zzaqv2.zza(zzare2, (zzarn)object);
                    zzare2.zzr();
                    break block7;
                }
                SystemClock.elapsedRealtime();
                zzaqv zzaqv3 = this.zze;
                zzaqv3.zza(zzare2, zzarn22);
                zzare2.zzr();
            }
            zzare2.zzt(n3);
            return;
        }
        zzare2.zzt(n3);
        throw throwable2;
    }

    public final void run() {
        int n3 = 10;
        Process.setThreadPriority((int)n3);
        while (true) {
            try {
                while (true) {
                    this.zzb();
                }
            }
            catch (InterruptedException interruptedException) {
                n3 = (int)(this.zzd ? 1 : 0);
                if (n3 != 0) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n3 = 0;
                Object[] objectArray = new Object[]{};
                String string2 = "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it";
                zzarq.zzb(string2, objectArray);
                continue;
            }
            break;
        }
    }

    public final void zza() {
        this.zzd = true;
        this.interrupt();
    }
}

