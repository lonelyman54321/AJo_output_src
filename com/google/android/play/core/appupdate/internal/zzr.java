/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ServiceConnection
 */
package com.google.android.play.core.appupdate.internal;

import android.content.ServiceConnection;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzn;
import com.google.android.play.core.appupdate.internal.zzx;
import java.util.concurrent.atomic.AtomicInteger;

final class zzr
extends zzn {
    final /* synthetic */ zzx zza;

    public zzr(zzx zzx2) {
        this.zza = zzx2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = zzx.zzg(this.zza);
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                Object[] objectArray;
                Object object3;
                block5: {
                    try {
                        object3 = this.zza;
                        object3 = zzx.zzi((zzx)object3);
                        int n3 = ((AtomicInteger)object3).get();
                        objectArray = null;
                        if (n3 <= 0) break block5;
                        object3 = this.zza;
                        n3 = ((AtomicInteger)(object3 = zzx.zzi((zzx)object3))).decrementAndGet();
                        if (n3 > 0) {
                            object3 = this.zza;
                            object3 = zzx.zzf((zzx)object3);
                            String string2 = "Leaving the connection open for other ongoing calls.";
                            objectArray = new Object[]{};
                            ((zzm)object3).zzd(string2, objectArray);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if ((object2 = zzx.zzd((zzx)(object3 = this.zza))) != null) {
                    object3 = zzx.zzf((zzx)object3);
                    object2 = "Unbind from service.";
                    Object[] objectArray2 = new Object[]{};
                    ((zzm)object3).zzd((String)object2, objectArray2);
                    object3 = this.zza;
                    object2 = zzx.zza((zzx)object3);
                    object3 = zzx.zzb((zzx)object3);
                    object2.unbindService((ServiceConnection)object3);
                    object3 = this.zza;
                    zzx.zzl((zzx)object3, false);
                    object3 = this.zza;
                    objectArray = null;
                    zzx.zzm((zzx)object3, null);
                    object3 = this.zza;
                    zzx.zzk((zzx)object3, null);
                }
                object3 = this.zza;
                zzx.zzo((zzx)object3);
                return;
            }
            throw throwable2;
        }
    }
}

