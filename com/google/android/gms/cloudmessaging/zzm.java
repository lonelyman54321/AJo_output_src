/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.Log
 *  android.util.SparseArray
 */
package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzp;
import com.google.android.gms.cloudmessaging.zzs;
import com.google.android.gms.cloudmessaging.zzt;

public final class zzm
implements Handler.Callback {
    public final /* synthetic */ zzp zza;

    public /* synthetic */ zzm(zzp zzp2) {
        this.zza = zzp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean handleMessage(Message object) {
        int n3 = ((Message)object).arg1;
        int n4 = 3;
        Log.isLoggable((String)"MessengerIpcClient", (int)n4);
        Object object3 = this.zza;
        // MONITORENTER : object3
        Object object2 = ((zzp)object3).zze;
        object2 = object2.get(n3);
        object2 = (zzs)object2;
        if (object2 == null) {
            // MONITOREXIT : object3
            return true;
        }
        SparseArray sparseArray = ((zzp)object3).zze;
        sparseArray.remove(n3);
        ((zzp)object3).zzf();
        // MONITOREXIT : object3
        object = object.getData();
        object3 = "unsupported";
        n3 = 0;
        boolean bl2 = object.getBoolean((String)object3, false);
        if (bl2) {
            object = "Not supported by GmsCore";
            n3 = 4;
            sparseArray = null;
            object3 = new zzt(n3, (String)object, null);
            ((zzs)object2).zzc((zzt)object3);
            return true;
        }
        ((zzs)object2).zza((Bundle)object);
        return true;
    }
}

