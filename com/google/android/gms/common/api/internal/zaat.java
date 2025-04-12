/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.api.internal.zaas;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;

final class zaat
implements GoogleApiClient$ConnectionCallbacks,
GoogleApiClient$OnConnectionFailedListener {
    final /* synthetic */ zaaw zaa;

    public /* synthetic */ zaat(zaaw zaaw2, zaas zaas2) {
        this.zaa = zaaw2;
    }

    public final void onConnected(Bundle object) {
        object = (ClientSettings)Preconditions.checkNotNull(zaaw.zal(this.zaa));
        object = (zae)Preconditions.checkNotNull(zaaw.zan(this.zaa));
        zaaw zaaw2 = this.zaa;
        zaar zaar2 = new zaar(zaaw2);
        object.zad(zaar2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConnectionFailed(ConnectionResult object) {
        Throwable throwable2;
        block4: {
            block3: {
                Object object2;
                block2: {
                    object2 = zaaw.zap(this.zaa);
                    object2.lock();
                    try {
                        object2 = this.zaa;
                        boolean bl2 = zaaw.zay((zaaw)object2, (ConnectionResult)object);
                        if (!bl2) break block2;
                        object = this.zaa;
                        zaaw.zaq((zaaw)object);
                        object = this.zaa;
                        zaaw.zau((zaaw)object);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = this.zaa;
                zaaw.zas((zaaw)object2, (ConnectionResult)object);
            }
            zaaw.zap(this.zaa).unlock();
            return;
        }
        zaaw.zap(this.zaa).unlock();
        throw throwable2;
    }

    public final void onConnectionSuspended(int n3) {
    }
}

