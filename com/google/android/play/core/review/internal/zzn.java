/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ServiceConnection
 */
package com.google.android.play.core.review.internal;

import android.content.ServiceConnection;
import com.google.android.play.core.review.internal.zzi;
import com.google.android.play.core.review.internal.zzj;
import com.google.android.play.core.review.internal.zzt;
import java.util.concurrent.atomic.AtomicInteger;

final class zzn
extends zzj {
    final /* synthetic */ zzt zza;

    public zzn(zzt zzt2) {
        this.zza = zzt2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = zzt.zzg(this.zza);
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                Object[] objectArray;
                Object object3;
                block5: {
                    try {
                        object3 = this.zza;
                        object3 = zzt.zzi((zzt)object3);
                        int n3 = ((AtomicInteger)object3).get();
                        objectArray = null;
                        if (n3 <= 0) break block5;
                        object3 = this.zza;
                        n3 = ((AtomicInteger)(object3 = zzt.zzi((zzt)object3))).decrementAndGet();
                        if (n3 > 0) {
                            object3 = this.zza;
                            object3 = zzt.zzf((zzt)object3);
                            String string2 = "Leaving the connection open for other ongoing calls.";
                            objectArray = new Object[]{};
                            ((zzi)object3).zzc(string2, objectArray);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if ((object2 = zzt.zzd((zzt)(object3 = this.zza))) != null) {
                    object3 = zzt.zzf((zzt)object3);
                    object2 = "Unbind from service.";
                    Object[] objectArray2 = new Object[]{};
                    ((zzi)object3).zzc((String)object2, objectArray2);
                    object3 = this.zza;
                    object2 = zzt.zza((zzt)object3);
                    object3 = zzt.zzb((zzt)object3);
                    object2.unbindService((ServiceConnection)object3);
                    object3 = this.zza;
                    zzt.zzl((zzt)object3, false);
                    object3 = this.zza;
                    objectArray = null;
                    zzt.zzm((zzt)object3, null);
                    object3 = this.zza;
                    zzt.zzk((zzt)object3, null);
                }
                object3 = this.zza;
                zzt.zzo((zzt)object3);
                return;
            }
            throw throwable2;
        }
    }
}

