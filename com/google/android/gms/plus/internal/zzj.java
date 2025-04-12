/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.internal.zza;
import com.google.android.gms.plus.internal.zzi;

final class zzj
extends zza {
    private final BaseImplementation$ResultHolder zzv;

    public zzj(BaseImplementation$ResultHolder baseImplementation$ResultHolder) {
        this.zzv = baseImplementation$ResultHolder;
    }

    public final void zza(DataHolder dataHolder, String string2) {
        boolean bl2;
        Object object;
        Object object2 = dataHolder.getMetadata();
        zzi zzi2 = null;
        if (object2 != null) {
            object2 = dataHolder.getMetadata();
            object = "pendingIntent";
            object2 = (PendingIntent)object2.getParcelable((String)object);
        } else {
            bl2 = false;
            object2 = null;
        }
        int n3 = dataHolder.getStatusCode();
        object = new Status(n3, null, (PendingIntent)object2);
        bl2 = ((Status)object).isSuccess();
        if (!bl2) {
            bl2 = dataHolder.isClosed();
            if (!bl2) {
                dataHolder.close();
            }
            dataHolder = null;
        }
        object2 = this.zzv;
        zzi2 = new zzi((Status)object, dataHolder, string2);
        object2.setResult(zzi2);
    }
}

