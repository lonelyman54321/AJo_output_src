/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.zza;

public class SplitInstallException
extends ApiException {
    public SplitInstallException(int n3) {
        Object object = n3;
        String string2 = zza.zzb(n3);
        int n4 = 2;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object;
        int n7 = 1;
        objectArray[n7] = string2;
        object = String.format("Split Install Error(%d): %s", objectArray);
        Status status = new Status(n3, (String)object);
        super(status);
        if (n3 != 0) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("errorCode should not be 0.");
        throw illegalArgumentException;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}

