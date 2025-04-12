/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ServiceConnection
 */
package com.google.android.gms.internal.ads;

import android.content.ServiceConnection;
import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzfww;
import com.google.android.gms.internal.ads.zzfxg;
import java.util.concurrent.atomic.AtomicInteger;

final class zzfxa
extends zzfww {
    final /* synthetic */ zzfxg zza;

    public zzfxa(zzfxg zzfxg2) {
        this.zza = zzfxg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = zzfxg.zzg(this.zza);
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                Object[] objectArray;
                Object object3;
                block5: {
                    try {
                        object3 = this.zza;
                        object3 = zzfxg.zzi((zzfxg)object3);
                        int n3 = ((AtomicInteger)object3).get();
                        objectArray = null;
                        if (n3 <= 0) break block5;
                        object3 = this.zza;
                        n3 = ((AtomicInteger)(object3 = zzfxg.zzi((zzfxg)object3))).decrementAndGet();
                        if (n3 > 0) {
                            object3 = this.zza;
                            object3 = zzfxg.zzf((zzfxg)object3);
                            String string2 = "Leaving the connection open for other ongoing calls.";
                            objectArray = new Object[]{};
                            ((zzfwv)object3).zzc(string2, objectArray);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if ((object2 = zzfxg.zzd((zzfxg)(object3 = this.zza))) != null) {
                    object3 = zzfxg.zzf((zzfxg)object3);
                    object2 = "Unbind from service.";
                    Object[] objectArray2 = new Object[]{};
                    ((zzfwv)object3).zzc((String)object2, objectArray2);
                    object3 = this.zza;
                    object2 = zzfxg.zza((zzfxg)object3);
                    object3 = zzfxg.zzb((zzfxg)object3);
                    object2.unbindService((ServiceConnection)object3);
                    object3 = this.zza;
                    zzfxg.zzl((zzfxg)object3, false);
                    object3 = this.zza;
                    objectArray = null;
                    zzfxg.zzm((zzfxg)object3, null);
                    object3 = this.zza;
                    zzfxg.zzk((zzfxg)object3, null);
                }
                object3 = this.zza;
                zzfxg.zzo((zzfxg)object3);
                return;
            }
            throw throwable2;
        }
    }
}

