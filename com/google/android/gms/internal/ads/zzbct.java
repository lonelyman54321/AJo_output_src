/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbcx;

final class zzbct
implements BaseGmsClient$BaseOnConnectionFailedListener {
    final /* synthetic */ zzbcu zza;

    public zzbct(zzbcu zzbcu2) {
        this.zza = zzbcu2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConnectionFailed(ConnectionResult object) {
        object = zzbcu.zze(this.zza);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        object2 = this.zza;
                        zzbcu.zzk((zzbcu)object2, null);
                        object2 = this.zza;
                        zzbcx zzbcx2 = zzbcu.zzc((zzbcu)object2);
                        if (zzbcx2 == null) break block3;
                        zzbcu.zzf((zzbcu)object2, null);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = this.zza;
                object2 = zzbcu.zze((zzbcu)object2);
                object2.notifyAll();
                return;
            }
            throw throwable2;
        }
    }
}

