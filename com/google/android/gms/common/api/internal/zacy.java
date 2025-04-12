/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 */
package com.google.android.gms.common.api.internal;

import android.os.Message;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.zacz;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.internal.Preconditions;

final class zacy
implements Runnable {
    final /* synthetic */ Result zaa;
    final /* synthetic */ zada zab;

    public zacy(zada zada2, Result result2) {
        this.zab = zada2;
        this.zaa = result2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        block5: {
            Object object;
            Object object2;
            block6: {
                object2 = BasePendingResult.zaa;
                object = Boolean.TRUE;
                ((ThreadLocal)object2).set(object);
                object = this.zab;
                object = zada.zaa((zada)object);
                object = Preconditions.checkNotNull(object);
                object = (ResultTransform)object;
                Object object3 = this.zaa;
                object = ((ResultTransform)object).onSuccess((Result)object3);
                object3 = this.zab;
                zacz zacz2 = zada.zab((zada)object3);
                object3 = zada.zab((zada)object3);
                object = object3.obtainMessage(0, object);
                zacz2.sendMessage((Message)object);
                object = Boolean.FALSE;
                {
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    catch (RuntimeException runtimeException) {}
                    {
                        object = this.zab;
                        zacz zacz3 = zada.zab((zada)object);
                        object = zada.zab((zada)object);
                        int n3 = 1;
                        object2 = object.obtainMessage(n3, (Object)runtimeException);
                        zacz3.sendMessage((Message)object2);
                        object2 = BasePendingResult.zaa;
                        object = Boolean.FALSE;
                        ((ThreadLocal)object2).set(object);
                        object2 = this.zab;
                        object = this.zaa;
                    }
                    zada.zaf((zada)object2, (Result)object);
                    object2 = (GoogleApiClient)zada.zae(this.zab).get();
                    if (object2 == null) return;
                    break block6;
                }
                ((ThreadLocal)object2).set(object);
                object2 = this.zab;
                object = this.zaa;
                zada.zaf((zada)object2, (Result)object);
                object2 = (GoogleApiClient)zada.zae(this.zab).get();
                if (object2 == null) return;
            }
            object = this.zab;
            ((GoogleApiClient)object2).zap((zada)object);
            return;
        }
        Object object = BasePendingResult.zaa;
        Object object4 = Boolean.FALSE;
        ((ThreadLocal)object).set(object4);
        object = this.zab;
        object4 = this.zaa;
        zada.zaf((zada)object, (Result)object4);
        object = (GoogleApiClient)zada.zae(this.zab).get();
        if (object == null) {
            throw throwable2;
        }
        object4 = this.zab;
        ((GoogleApiClient)object).zap((zada)object4);
        throw throwable2;
    }
}

