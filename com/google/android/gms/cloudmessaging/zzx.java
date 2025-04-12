/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

public final class zzx
implements SuccessContinuation {
    public static final /* synthetic */ zzx zza;

    static {
        zzx zzx2;
        zza = zzx2 = new zzx();
    }

    private /* synthetic */ zzx() {
    }

    public final Task then(Object object) {
        return Rpc.zza((Bundle)object);
    }
}

