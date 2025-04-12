/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
package com.google.android.gms.internal.ads;

import android.os.Process;
import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzaqp;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzarq;
import com.google.android.gms.internal.ads.zzarr;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public final class zzaqq
extends Thread {
    private static final boolean zza = zzarq.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaqo zzd;
    private volatile boolean zze = false;
    private final zzarr zzf;
    private final zzaqv zzg;

    public zzaqq(BlockingQueue object, BlockingQueue blockingQueue, zzaqo zzaqo2, zzaqv zzaqv2) {
        this.zzb = object;
        this.zzc = blockingQueue;
        this.zzd = zzaqo2;
        this.zzg = zzaqv2;
        this.zzf = object = new zzarr(this, blockingQueue, zzaqv2);
    }

    public static /* bridge */ /* synthetic */ BlockingQueue zza(zzaqq zzaqq2) {
        return zzaqq2.zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void zzc() {
        Throwable throwable2;
        int n3;
        zzare zzare2;
        block15: {
            block14: {
                String string2;
                Object object;
                boolean bl2;
                Object object2;
                block13: {
                    zzare2 = (zzare)this.zzb.take();
                    object2 = "cache-queue-take";
                    zzare2.zzm((String)object2);
                    bl2 = true;
                    zzare2.zzt((int)(bl2 ? 1 : 0));
                    n3 = 2;
                    try {
                        zzare2.zzw();
                        object = this.zzd;
                        string2 = zzare2.zzj();
                        object = object.zza(string2);
                        if (object != null) break block13;
                        object2 = "cache-miss";
                        zzare2.zzm((String)object2);
                        object2 = this.zzf;
                        bl2 = ((zzarr)object2).zzc(zzare2);
                        if (!bl2) {
                            object2 = this.zzc;
                            object2.put(zzare2);
                        }
                        break block14;
                    }
                    catch (Throwable throwable2) {
                        break block15;
                    }
                }
                long l2 = System.currentTimeMillis();
                boolean bl3 = ((zzaqn)object).zza(l2);
                if (bl3) {
                    object2 = "cache-hit-expired";
                    zzare2.zzm((String)object2);
                    zzare2.zze((zzaqn)object);
                    object2 = this.zzf;
                    bl2 = ((zzarr)object2).zzc(zzare2);
                    if (!bl2) {
                        object2 = this.zzc;
                        object2.put(zzare2);
                    }
                } else {
                    Object object3 = "cache-hit";
                    zzare2.zzm((String)object3);
                    Object object4 = ((zzaqn)object).zza;
                    Map map2 = ((zzaqn)object).zzg;
                    object3 = new zzara((byte[])object4, map2);
                    object3 = zzare2.zzh((zzara)object3);
                    object4 = "cache-hit-parsed";
                    zzare2.zzm((String)object4);
                    Object object5 = ((zzark)object3).zzc();
                    map2 = null;
                    if (object5 == 0) {
                        object = "cache-parsing-failed";
                        zzare2.zzm((String)object);
                        object = this.zzd;
                        string2 = zzare2.zzj();
                        object.zzc(string2, bl2);
                        zzare2.zze(null);
                        object2 = this.zzf;
                        bl2 = ((zzarr)object2).zzc(zzare2);
                        if (!bl2) {
                            object2 = this.zzc;
                            object2.put(zzare2);
                        }
                    } else {
                        long l3 = ((zzaqn)object).zzf;
                        long l4 = l3 - l2;
                        object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (object5 < 0) {
                            string2 = "cache-hit-refresh-needed";
                            zzare2.zzm(string2);
                            zzare2.zze((zzaqn)object);
                            ((zzark)object3).zzd = bl2;
                            object2 = this.zzf;
                            bl2 = ((zzarr)object2).zzc(zzare2);
                            if (!bl2) {
                                object2 = this.zzg;
                                object = new zzaqp(this, zzare2);
                                ((zzaqv)object2).zzb(zzare2, (zzark)object3, (Runnable)object);
                            } else {
                                object2 = this.zzg;
                                ((zzaqv)object2).zzb(zzare2, (zzark)object3, null);
                            }
                        } else {
                            object2 = this.zzg;
                            ((zzaqv)object2).zzb(zzare2, (zzark)object3, null);
                        }
                    }
                }
            }
            zzare2.zzt(n3);
            return;
        }
        zzare2.zzt(n3);
        throw throwable2;
    }

    public final void run() {
        String string2;
        Object object;
        int n3 = zza;
        if (n3 != 0) {
            object = new Object[]{};
            string2 = "start new dispatcher";
            zzarq.zzd(string2, (Object[])object);
        }
        n3 = 10;
        Process.setThreadPriority((int)n3);
        object = this.zzd;
        object.zzb();
        while (true) {
            try {
                while (true) {
                    this.zzc();
                }
            }
            catch (InterruptedException interruptedException) {
                n3 = (int)(this.zze ? 1 : 0);
                if (n3 != 0) {
                    Thread.currentThread().interrupt();
                    return;
                }
                object = new Object[]{};
                string2 = "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it";
                zzarq.zzb(string2, (Object[])object);
                continue;
            }
            break;
        }
    }

    public final void zzb() {
        this.zze = true;
        this.interrupt();
    }
}

