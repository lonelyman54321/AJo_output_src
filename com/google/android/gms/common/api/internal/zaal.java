/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

final class zaal
implements BaseGmsClient$ConnectionProgressReportCallbacks {
    private final WeakReference zaa;
    private final Api zab;
    private final boolean zac;

    public zaal(zaaw zaaw2, Api api, boolean bl2) {
        WeakReference<zaaw> weakReference;
        this.zaa = weakReference = new WeakReference<zaaw>(zaaw2);
        this.zab = api;
        this.zac = bl2;
    }

    public static /* bridge */ /* synthetic */ boolean zaa(zaal zaal2) {
        return zaal2.zac;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        Throwable throwable2;
        zaaw zaaw2;
        block8: {
            block6: {
                boolean bl2;
                block7: {
                    boolean bl3;
                    Object object;
                    zaaw2 = (zaaw)this.zaa.get();
                    if (zaaw2 == null) {
                        return;
                    }
                    Object object2 = Looper.myLooper();
                    if (object2 == (object = zaaw.zak((zaaw)zaaw2).zag.getLooper())) {
                        bl3 = true;
                    } else {
                        bl3 = false;
                        object2 = null;
                    }
                    object = "onReportServiceBinding must be called on the GoogleApiClient handler thread";
                    Preconditions.checkState(bl3, object);
                    object2 = zaaw.zap(zaaw2);
                    object2.lock();
                    try {
                        bl3 = zaaw.zaw(zaaw2, 0);
                        if (!bl3) break block6;
                        bl3 = connectionResult.isSuccess();
                        if (bl3) break block7;
                        object2 = this.zab;
                        boolean bl4 = this.zac;
                        zaaw.zat(zaaw2, connectionResult, (Api)object2, bl4);
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                if (bl2 = zaaw.zax(zaaw2)) {
                    zaaw.zau(zaaw2);
                }
            }
            zaaw.zap(zaaw2).unlock();
            return;
        }
        zaaw.zap(zaaw2).unlock();
        throw throwable2;
    }
}

