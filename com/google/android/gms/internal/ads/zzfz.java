/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfy;
import java.util.ArrayList;
import java.util.List;

final class zzfz
implements zzfb {
    private static final List zza;
    private final Handler zzb;

    static {
        ArrayList arrayList;
        zza = arrayList = new ArrayList(50);
    }

    public zzfz(Handler handler) {
        this.zzb = handler;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ void zzl(zzfy zzfy2) {
        List list = zza;
        synchronized (list) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        int n3 = list.size();
                        int n4 = 50;
                        if (n3 >= n4) break block3;
                        list.add(zzfy2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
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
    private static zzfy zzm() {
        List list = zza;
        synchronized (list) {
            Throwable throwable2;
            block4: {
                int n3;
                try {
                    n3 = list.isEmpty();
                    if (n3 != 0) {
                        return new zzfy(null);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                n3 = list.size() + -1;
                return list.remove(n3);
            }
            throw throwable2;
        }
    }

    public final Looper zza() {
        return this.zzb.getLooper();
    }

    public final zzfa zzb(int n3) {
        Handler handler = this.zzb;
        zzfy zzfy2 = zzfz.zzm();
        Message message = handler.obtainMessage(n3);
        zzfy2.zzb(message, this);
        return zzfy2;
    }

    public final zzfa zzc(int n3, Object object) {
        Handler handler = this.zzb;
        zzfy zzfy2 = zzfz.zzm();
        Message message = handler.obtainMessage(n3, object);
        zzfy2.zzb(message, this);
        return zzfy2;
    }

    public final zzfa zzd(int n3, int n4, int n7) {
        Handler handler = this.zzb;
        zzfy zzfy2 = zzfz.zzm();
        handler = handler.obtainMessage(1, n4, n7);
        zzfy2.zzb((Message)handler, this);
        return zzfy2;
    }

    public final void zze(Object object) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    public final void zzf(int n3) {
        this.zzb.removeMessages(n3);
    }

    public final boolean zzg(int n3) {
        return this.zzb.hasMessages(0);
    }

    public final boolean zzh(Runnable runnable2) {
        return this.zzb.post(runnable2);
    }

    public final boolean zzi(int n3) {
        return this.zzb.sendEmptyMessage(n3);
    }

    public final boolean zzj(int n3, long l2) {
        return this.zzb.sendEmptyMessageAtTime(2, l2);
    }

    public final boolean zzk(zzfa zzfa2) {
        zzfa2 = (zzfy)zzfa2;
        Handler handler = this.zzb;
        return ((zzfy)zzfa2).zzc(handler);
    }
}

