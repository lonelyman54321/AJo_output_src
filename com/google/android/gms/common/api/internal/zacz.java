/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zacp;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zau;

final class zacz
extends zau {
    final /* synthetic */ zada zaa;

    public zacz(zada zada2, Looper looper) {
        this.zaa = zada2;
        super(looper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleMessage(Message object) {
        int n3 = ((Message)object).what;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return;
            }
            object = (RuntimeException)((Message)object).obj;
            String string2 = String.valueOf(((Throwable)object).getMessage());
            "Runtime exception on the transformation worker thread: ".concat(string2);
            throw object;
        }
        object = (PendingResult)((Message)object).obj;
        Object object2 = zada.zad(this.zaa);
        synchronized (object2) {
            Throwable throwable2;
            block8: {
                block7: {
                    Object object3;
                    block9: {
                        block6: {
                            try {
                                object3 = this.zaa;
                                object3 = zada.zac((zada)object3);
                                object3 = Preconditions.checkNotNull(object3);
                                object3 = (zada)object3;
                                if (object != null) break block6;
                                String string3 = "Transform returned null";
                                int n7 = 13;
                                object = new Status(n7, string3);
                                zada.zag((zada)object3, (Status)object);
                                break block7;
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        boolean bl2 = object instanceof zacp;
                        if (!bl2) break block9;
                        object = (zacp)object;
                        object = ((zacp)object).zaa();
                        zada.zag((zada)object3, (Status)object);
                        break block7;
                    }
                    ((zada)object3).zai((PendingResult)object);
                }
                return;
            }
            throw throwable2;
        }
    }
}

