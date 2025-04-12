/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.DeadObjectException
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbcx;
import com.google.android.gms.internal.ads.zzbda;

final class zzbcs
implements BaseGmsClient$BaseConnectionCallbacks {
    final /* synthetic */ zzbcu zza;

    public zzbcs(zzbcu zzbcu2) {
        this.zza = zzbcu2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConnected(Bundle object) {
        object = zzbcu.zze(this.zza);
        synchronized (object) {
            Throwable throwable2;
            block7: {
                Object object2;
                try {
                    try {
                        object2 = this.zza;
                        Object object3 = zzbcu.zzc((zzbcu)object2);
                        if (object3 != null) {
                            object3 = zzbcu.zzc((zzbcu)object2);
                            object3 = ((zzbcx)object3).zzq();
                            zzbcu.zzk((zzbcu)object2, (zzbda)object3);
                        }
                    }
                    catch (DeadObjectException deadObjectException) {
                        String string2 = "Unable to obtain a cache service instance.";
                        zzm.zzh(string2, deadObjectException);
                        object2 = this.zza;
                        zzbcu.zzh((zzbcu)object2);
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                object2 = this.zza;
                object2 = zzbcu.zze((zzbcu)object2);
                object2.notifyAll();
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
    public final void onConnectionSuspended(int n3) {
        Object object = zzbcu.zze(this.zza);
        synchronized (object) {
            Object object2 = this.zza;
            zzbcu.zzk((zzbcu)object2, null);
            object2 = this.zza;
            object2 = zzbcu.zze((zzbcu)object2);
            object2.notifyAll();
            return;
        }
    }
}

