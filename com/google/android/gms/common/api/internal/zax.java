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
import com.google.android.gms.common.api.internal.zaw;

final class zax
implements zabz {
    final /* synthetic */ zaaa zaa;

    public /* synthetic */ zax(zaaa zaaa2, zaw zaw2) {
        this.zaa = zaaa2;
    }

    public final void zaa(ConnectionResult object) {
        Object object2 = zaaa.zaj(this.zaa);
        object2.lock();
        try {
            object2 = this.zaa;
            zaaa.zak((zaaa)object2, (ConnectionResult)object);
            object = this.zaa;
            zaaa.zap((zaaa)object);
            return;
        }
        finally {
            zaaa.zaj(this.zaa).unlock();
        }
    }

    public final void zab(Bundle object) {
        Object object2 = zaaa.zaj(this.zaa);
        object2.lock();
        try {
            object2 = this.zaa;
            zaaa.zao((zaaa)object2, object);
            object = this.zaa;
            object2 = ConnectionResult.RESULT_SUCCESS;
            zaaa.zak((zaaa)object, (ConnectionResult)object2);
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
                ConnectionResult connectionResult;
                boolean bl3;
                Object object;
                block2: {
                    object = zaaa.zaj(this.zaa);
                    object.lock();
                    try {
                        boolean bl4;
                        object = this.zaa;
                        bl3 = zaaa.zav((zaaa)object);
                        if (bl3 || (connectionResult = zaaa.zaa((zaaa)object)) == null || !(bl4 = ((ConnectionResult)(object = zaaa.zaa((zaaa)object))).isSuccess())) break block2;
                        zaca zaca2 = this.zaa;
                        bl4 = true;
                        zaaa.zam((zaaa)zaca2, bl4);
                        zaca2 = this.zaa;
                        zaca2 = zaaa.zai((zaaa)zaca2);
                        ((zabi)zaca2).onConnectionSuspended(n3);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = this.zaa;
                bl3 = false;
                connectionResult = null;
                zaaa.zam((zaaa)object, false);
                object = this.zaa;
                zaaa.zan((zaaa)object, n3, bl2);
            }
            zaaa.zaj(this.zaa).unlock();
            return;
        }
        zaaa.zaj(this.zaa).unlock();
        throw throwable2;
    }
}

