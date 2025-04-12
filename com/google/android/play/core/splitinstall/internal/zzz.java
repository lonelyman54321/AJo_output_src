/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ServiceConnection
 */
package com.google.android.play.core.splitinstall.internal;

import android.content.ServiceConnection;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.internal.zzv;
import java.util.concurrent.atomic.AtomicInteger;

final class zzz
extends zzv {
    final /* synthetic */ zzaf zza;

    public zzz(zzaf zzaf2) {
        this.zza = zzaf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        Object object = zzaf.zzg(this.zza);
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                Object[] objectArray;
                Object object3;
                block5: {
                    try {
                        object3 = this.zza;
                        object3 = zzaf.zzi((zzaf)object3);
                        int n3 = ((AtomicInteger)object3).get();
                        objectArray = null;
                        if (n3 <= 0) break block5;
                        object3 = this.zza;
                        n3 = ((AtomicInteger)(object3 = zzaf.zzi((zzaf)object3))).decrementAndGet();
                        if (n3 > 0) {
                            object3 = this.zza;
                            object3 = zzaf.zzf((zzaf)object3);
                            String string2 = "Leaving the connection open for other ongoing calls.";
                            objectArray = new Object[]{};
                            ((zzu)object3).zzd(string2, objectArray);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if ((object2 = zzaf.zzd((zzaf)(object3 = this.zza))) != null) {
                    object3 = zzaf.zzf((zzaf)object3);
                    object2 = "Unbind from service.";
                    Object[] objectArray2 = new Object[]{};
                    ((zzu)object3).zzd((String)object2, objectArray2);
                    object3 = this.zza;
                    object2 = zzaf.zza((zzaf)object3);
                    object3 = zzaf.zzb((zzaf)object3);
                    object2.unbindService((ServiceConnection)object3);
                    object3 = this.zza;
                    zzaf.zzl((zzaf)object3, false);
                    object3 = this.zza;
                    objectArray = null;
                    zzaf.zzm((zzaf)object3, null);
                    object3 = this.zza;
                    zzaf.zzk((zzaf)object3, null);
                }
                object3 = this.zza;
                zzaf.zzo((zzaf)object3);
                return;
            }
            throw throwable2;
        }
    }
}

