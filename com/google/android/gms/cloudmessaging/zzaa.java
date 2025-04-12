/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 */
package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

public final class zzaa
implements Continuation {
    public static final /* synthetic */ zzaa zza;

    static {
        zzaa zzaa2;
        zza = zzaa2 = new zzaa();
    }

    private /* synthetic */ zzaa() {
    }

    public final Object then(Task object) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            return (Bundle)((Task)object).getResult();
        }
        Object object2 = "Rpc";
        int n3 = 3;
        bl2 = Log.isLoggable((String)object2, (int)n3);
        if (bl2) {
            object2 = String.valueOf(((Task)object).getException());
            String string2 = "Error making request: ";
            string2.concat((String)object2);
        }
        object = ((Task)object).getException();
        object2 = new IOException("SERVICE_NOT_AVAILABLE", (Throwable)object);
        throw object2;
    }
}

