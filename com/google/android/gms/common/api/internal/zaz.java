/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaa;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.common.api.internal.zaca;
import com.google.android.gms.common.api.internal.zay;

final class zaz
implements zabz {
    final /* synthetic */ zaaa zaa;

    public /* synthetic */ zaz(zaaa zaaa2, zay zay2) {
        this.zaa = zaaa2;
    }

    public final void zaa(ConnectionResult object) {
        Object object2 = zaaa.zaj(this.zaa);
        object2.lock();
        try {
            object2 = this.zaa;
            zaaa.zal((zaaa)object2, (ConnectionResult)object);
            object = this.zaa;
            zaaa.zap((zaaa)object);
            return;
        }
        finally {
            zaaa.zaj(this.zaa).unlock();
        }
    }

    public final void zab(Bundle object) {
        object = zaaa.zaj(this.zaa);
        object.lock();
        try {
            object = this.zaa;
            ConnectionResult connectionResult = ConnectionResult.RESULT_SUCCESS;
            zaaa.zal((zaaa)object, connectionResult);
            object = this.zaa;
            zaaa.zap((zaaa)object);
            return;
        }
        finally {
            zaaa.zaj(this.zaa).unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zac(int n3, boolean bl2) {
        Throwable throwable2;
        block4: {
            block3: {
                Object object;
                block2: {
                    object = zaaa.zaj(this.zaa);
                    object.lock();
                    try {
                        object = this.zaa;
                        boolean bl3 = zaaa.zav((zaaa)object);
                        if (!bl3) break block2;
                        bl3 = false;
                        zaaa.zam((zaaa)object, false);
                        object = this.zaa;
                        zaaa.zan((zaaa)object, n3, bl2);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                bl2 = true;
                zaaa.zam((zaaa)object, bl2);
                zaca zaca2 = this.zaa;
                zaca2 = zaaa.zah((zaaa)zaca2);
                ((zabi)zaca2).onConnectionSuspended(n3);
            }
            zaaa.zaj(this.zaa).unlock();
            return;
        }
        zaaa.zaj(this.zaa).unlock();
        throw throwable2;
    }
}

