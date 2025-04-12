/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.internal.ads.zzfsj;
import com.google.android.gms.internal.ads.zzfsn;
import com.google.android.gms.internal.ads.zzfsp;

final class zzfrq
implements BaseGmsClient$BaseConnectionCallbacks,
BaseGmsClient$BaseOnConnectionFailedListener {
    private final zzfsp zza;
    private final zzfsj zzb;
    private final Object zzc;
    private boolean zzd;
    private boolean zze;

    public zzfrq(Context context, Looper looper, zzfsj object) {
        Object object2;
        this.zzc = object2 = new Object();
        this.zzd = false;
        this.zze = false;
        this.zzb = object;
        this.zza = object = new zzfsp(context, looper, this, this, 12800000);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzb() {
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    zzfsp zzfsp2;
                    try {
                        zzfsp2 = this.zza;
                        boolean bl2 = zzfsp2.isConnected();
                        if (!bl2 && !(bl2 = (zzfsp2 = this.zza).isConnecting())) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    zzfsp2 = this.zza;
                    zzfsp2.disconnect();
                }
                Binder.flushPendingCommands();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConnected(Bundle var1_1) {
        var1_1 /* !! */  = this.zzc;
        synchronized (var1_1 /* !! */ ) {
            try {
                var2_2 = this.zze;
                if (var2_2) {
                    return;
                }
                this.zze = var2_2 = true;
            }
lbl8:
            // 2 sources

            catch (Throwable var3_3) {}
            var3_4 = this.zza;
            var3_4 = var3_4.zzp();
            var5_7 = this.zzb;
            var5_7 = var5_7.zzaV();
            var4_6 = new zzfsn((byte[])var5_7);
            var3_4.zzg(var4_6);
            ** GOTO lbl21
            {
                catch (Throwable var3_5) {
                    this.zzb();
                    throw var3_5;
                }
                catch (Exception v0) {}
lbl21:
                // 2 sources

                ** try [egrp 2[TRYBLOCK] [17 : 71->90)] { 
lbl22:
                // 1 sources

                this.zzb();
                return;
            }
            throw var3_3;
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    public final void onConnectionSuspended(int n3) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zzc;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        boolean bl2 = this.zzd;
                        if (bl2) break block3;
                        this.zzd = bl2 = true;
                        zzfsp zzfsp2 = this.zza;
                        zzfsp2.checkAvailabilityAndConnect();
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
}

